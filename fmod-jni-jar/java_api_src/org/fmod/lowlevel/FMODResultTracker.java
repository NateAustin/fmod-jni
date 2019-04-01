package org.fmod.lowlevel;

import org.fmod.jni.FMOD_RESULT;

/**
 * Base class for FMOD api classes that return FMOD_RESULT.
 *
 * This class allows you to retrieve FMOD_RESULTs from individual api objects,
 * and also allows you to define a callback handler for FMOD_RESULTs.
 *
 * NOTE! this is not particularly thread safe, in that, if you have multiple threads making FMOD calls
 * to the same object, the "last result" might well be from a call on another thread. Is this a problem?
 * I DON'T KNOW. Why do you have multiple threads making audio calls? that seems weird to me :-)
 *
 * Maybe some other mechanism for result tracking will present itself? Suggestions welcome.
 * 
 * 
 *
 * Author: Nate
 * Date: 5/3/2015
 */
public class FMODResultTracker {

	private FMOD_RESULT lastResult = null;

	/**
	 * You can set this static default handler to your own implementation,
	 * and all FMOD api objects, will use it.
	 */
	public static IResultHandler defaultHandler = new DefaultResultHandler();

	/**
	 * Handler to call with FMOD_RESULTs
	 * <p>
	 * Set this to your own implementation in order to respond to results as they happen
	 * OR you can simply check getLastResult() as needed.
	 */
	public IResultHandler resultHandler = defaultHandler;

	/**
	 * Internal use: when the API calls an FMOD method, the result is sent here so it can be
	 * processed by the application.
	 */
	protected synchronized void processApiResult(FMOD_RESULT fmod_result, String apiName) {
		lastResult = fmod_result;

		if (resultHandler != null) {
			if (lastResult != FMOD_RESULT.FMOD_OK) {
				resultHandler.handleNotOk(fmod_result, apiName);
			} else {
				resultHandler.handleOk(apiName);
			}
		}
	}

	/**
	 * return the result of the last FMOD api call, or null if no call has been made.
	 * NOTE: if you are using FMOD from multiple threads (why?) then this won't be reliable,
	 * and uh, send me a pull request when you figure out what you want instead.
	 */
	public synchronized FMOD_RESULT getLastResult() {
		return lastResult;
	}

	/**
	 * Override this to customize handling of FMOD results.
	 * This honestly seems less than great, but.. shrug.
	 */
	public interface IResultHandler {
		void handleNotOk(FMOD_RESULT result, String apiName);

		void handleOk(String apiName);
	}

	private static final class DefaultResultHandler implements IResultHandler {
		@Override
		public void handleNotOk(FMOD_RESULT result, String apiName) {
			java.lang.System.out.println("unexpected FMOD Result " + result.toString() + " for call to " + apiName);
			java.lang.System.out.println(getTrace(5));
		}

		@Override
		public void handleOk(String apiName) {
			//don't care.
		}
	}


	private static String getTrace(int numToSkip) {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		return toStringSkipN(stackTrace, numToSkip);
	}


	private static String toStringSkipN(Object[] a, int nToSkip) {
		if (a == null)
			return "null";

		int iMax = a.length - 1;
		if (iMax < nToSkip)
			return "empty";

		StringBuilder b = new StringBuilder();

		for (int i = nToSkip; ; i++) {
			b.append(a[i]);
			if (i == iMax)
				return b.toString();
			b.append("\n");
		}
	}

}
