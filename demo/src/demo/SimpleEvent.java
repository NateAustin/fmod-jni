package demo;

import org.fmod.FMODLoader;
import org.fmod.jni.FMOD_STUDIO_STOP_MODE;
import org.fmod.studio.Bank;
import org.fmod.studio.EventDescription;
import org.fmod.studio.EventInstance;
import org.fmod.studio.FmodStudioSystem;

import java.io.IOException;

import static org.fmod.jni.FMODConstants.*;

/**
 * Loosely based on the FMOD Studio simple_event example.
 * 
 * Must use /demo/working as working directory.
 * 
 * Author: Nate
 * Date: 5/1/2015
 */
public class SimpleEvent {

	public static void main(String[] args) {

		boolean didLoad = FMODLoader.loadNatives();

		if(didLoad) {
			System.out.println("Sweet.");
		}

		FmodStudioSystem studioSystem = FmodStudioSystem.create();
		//TODO: set low-level output format to 5.1 as per the example? Does it matter?
		studioSystem.initialize(32, FMOD_STUDIO_INIT_NORMAL, FMOD_INIT_NORMAL, null);

		//load banks
		String mediaFolder = "fmod_example_media/";
		Bank masterBank = studioSystem.loadBankFile(mediaFolder + "Master Bank.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		Bank stringsBank = studioSystem.loadBankFile(mediaFolder + "Master Bank.strings.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		Bank ambienceBank = studioSystem.loadBankFile(mediaFolder + "Surround_Ambience.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		Bank menuBank = studioSystem.loadBankFile(mediaFolder + "UI_Menu.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);
		Bank weaponsBank = studioSystem.loadBankFile(mediaFolder + "Weapons.bank", FMOD_STUDIO_LOAD_BANK_NORMAL);

		//get the events:
		EventDescription loopingAmbienceDescription = studioSystem.getEvent("event:/Ambience/Country");
		EventInstance loopingAmbience = loopingAmbienceDescription.createInstance();

		EventDescription cancelDescription = studioSystem.getEvent("event:/UI/Cancel");
		EventInstance cancel = cancelDescription.createInstance();

		EventDescription explosionDescription = studioSystem.getEvent("event:/Explosions/Single Explosion");
    	// Start loading explosion sample data and keep it in memory
		explosionDescription.loadSampleData();

		System.out.println("Press 1 to fire and forget the explosion");
		System.out.println("Press 2 to start the looping ambiance");
		System.out.println("Press 3 to stop the looping ambiance");
		System.out.println("Press 4 to start/restart the cancel sound");
		System.out.println("Press Q to quit");

		//loop, update, play sound
		boolean done = false;
		while(!done) {
			int input = 0;
			try {
				if (System.in.available() > 0) {
					input = System.in.read();
				}
			}catch (IOException e) {
				e.printStackTrace();
				break;
			}

			switch (input) {
				case (int)'1':
					EventInstance explosion = explosionDescription.createInstance();
					explosion.start();
					explosion.release();
					break;
				case (int)'2':
					loopingAmbience.start();
					break;
				case (int)'3':
					loopingAmbience.stop(FMOD_STUDIO_STOP_MODE.FMOD_STUDIO_STOP_IMMEDIATE);
					break;
				case (int)'4':
					cancel.start();
					break;
				case 0x1B: //ESC
				case (int)'Q':
					done = true;
					break;
			}

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
}
