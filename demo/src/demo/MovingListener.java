package demo;

import org.fmod.FMODLoader;
import org.fmod.jni.FMOD_3D_ATTRIBUTES;
import org.fmod.jni.FMOD_VECTOR;
import org.fmod.studio.EventDescription;
import org.fmod.studio.EventInstance;
import org.fmod.studio.FmodStudioSystem;

import java.io.IOException;

import static org.fmod.jni.FMODConstants.*;

/**
 * 
 * Must use /demo/working as working directory.
 * 
 * Author: Nate
 * Date: 6/5/2016
 */
@SuppressWarnings("Duplicates")
public class MovingListener {


	private EventDescription shotDescription;
	private FmodStudioSystem studioSystem;

	public static void main(String[] args) {

		new MovingListener().run();

	}

	private void run() {
		boolean didLoad = FMODLoader.loadNatives();

		if (didLoad) {
			System.out.println("Sweet.");
		}

		studioSystem = FmodStudioSystem.create();
		//TODO: set low-level output format to 5.1 as per the example? Does it matter?
		studioSystem.initialize(32, FMOD_STUDIO_INIT_NORMAL, FMOD_INIT_NORMAL, null);

		//load banks
		String mediaFolder = "fmod_example_media/";
		studioSystem.loadBankFile(mediaFolder + "Master Bank.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		studioSystem.loadBankFile(mediaFolder + "Master Bank.strings.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		studioSystem.loadBankFile(mediaFolder + "SFX.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);

		//get the events:
		shotDescription = studioSystem.getEvent("event:/Weapons/Explosion");


		System.out.println("Press Q to quit");

		//loop, update, play sound
		boolean done = false;
		while (!done) {
			int input = 0;
			try {
				if (System.in.available() > 0) {
					input = System.in.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
				break;
			}

			switch (input) {
				case 0x1B: //ESC
				case (int) 'Q':
					done = true;
					break;
			}

			tick(50);
			
			//call update!
			studioSystem.update();
			

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
				done = true;
			}
		}

		//close:
		studioSystem.unloadAll();
		studioSystem.release();
	}

	
	
	private int accum = 0;
	private double time = 0;
	private void tick(int dtMs) {
		accum += dtMs;
		if (accum > 400) {
			accum = 0;
			EventInstance shot = shotDescription.createInstance();
			
			//put it at the origin
			final FMOD_3D_ATTRIBUTES fmod3DAttributes = shot.get3DAttributes();
			final FMOD_VECTOR position = fmod3DAttributes.getPosition();
			position.setX(0);
			position.setY(0);
			position.setZ(0);
			shot.set3DAttributes(fmod3DAttributes);
			
			shot.start();
			shot.release();
		}
		
		
		//move the ear in a sine pattern:
		time += dtMs;
		final double x = 50.0 * Math.sin(0.0005 * time);
		FMOD_3D_ATTRIBUTES attributes = studioSystem.getListenerAttributes(0);
		attributes.getPosition().setX((float) x);
		studioSystem.setListenerAttributes(0, attributes);
	}

}
