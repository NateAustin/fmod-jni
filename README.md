# fmod-jni
Java JNI wrapper for the FMOD audio library. Experimental and Incomplete. Apache 2 License.

The goal of this project is to make the FMOD Studio audio engine available to Java code. This project is in support of my indie game, Legacy (http://yonderinglands.blogspot.com/) but you are welcome to use it for whatever, or suggest improvements. Legacy is under active development and I expect this API to expand and harden over time to meet the audio needs of the game.

The intention is to support the FMOD Studio workflow where an audio designer works on a project in FMOD studio, and a game programmer works in Java, loading banks, calling events, setting parameters etc. for the FMOD project to consume. So the portion of the API that's concerned with that workflow will be my top priority.

##About FMOD
FMOD Studio is a 3D audio engine and designer tool for games.

http://www.fmod.org/

* It is not free (but it does have a free license for individuals and small projects) 
* This repo does not include FMOD Studio itself, just the JNI bindings to it.
* I am not affiliated with FMOD or Firelight Technologies.

To use FMOD with this project you will need to download the FMOD Studio API version 1.08.04.

##Approach
The goal of this project is to be an idiomatic Java implementation of the FMOD Studio and Low Level API. The Java API defines the same classes and functions that the C++ api defines. We want the integration to be as "turnkey" as possible, so we're binding all of the fmod native libraries into our jar and loading them at runtime. In this way consumers need only link the fmod-jni-jar.jar file and call FMOD.loadNatives() in order to use fmod. (However because we don't include FMOD Studio in this repo, you must download it yourself and build the jar before you can use it.) 

### Omissions
The first version is going to be missing some things:
* The DSP api for defining your own DSP. Just do it in C if you need it.
* The Callback apis (These are definitely possible to implement, but are low priority for me)
* The loadFromMemory apis (you need these for your java game?)

### Deviations
The main (only real) difference is that I've elected not to return FMOD_RESULT from every api call, instead I'm returning objects and values directly. Since Java can't easily return values via function arguments, this is much cleaner. The FMOD_RESULT is accessible via a getLastResult call on each API Object, and you can optionally define a callback to handle them inline. So no functionality is lost.

### SWIG
Under the hood, I'm using SWIG (http://www.swig.org/) to generate Java JNI bindings around the FMOD C (not C++) api. I chose the C api for maximum portability(?), and hey, they're functionally identical so it shouldn't matter. Then on the Java side, I've stubbed out the API classes and am in the process of filling in an idiomatic Java API to FMOD.

A lot of the code SWIG generates is pretty ugly, and the current setup puts several layers between the application and FMOD. I'm not terribly happy with that but it seems like the fastest path forward for now. A more mature implementation might write more JNI code by hand in order to reduce overhead.

The bindings here were generated with Swig 3.0.9

##Status
HIGHLY INCOMPLETE - Some of FMOD::Studio::System is implemented, and just enough of FMOD::Studio::EventDescription and FMOD::Studio::EventInstance to run the SimpleEvent demo.

Right now the sample will run and play a sound, though!

The majority of the final API is not present. However the raw SWIG wrapper is maybe at 80%, so a lot of stuff is present that I just need to expose in a nice Java friendly way. After that, the last 20% of the SWIG wrapper looks like it will take 80% of the work, so we'll see how far we get.

There's a lot I don't know about using SWIG properly, AND a lot I don't know about using FMOD properly. On top of that, JNI is just complicated. So if you see something you think should be different, please tell me. I need the advice.

### Platforms
I'm testing on windows but I don't think there's any reason it won't work on Mac or Linux. FMOD supports both those platforms and so does SWIG (to the extent that matters..?) and it should be straightforward to generate the dynamic libraries you need. If you do this, send me a pull request with your setup so I can incorporate it.

##Usage
To play sound using FMOD from Java, you will need to build the fmod-jni-jar.jar file:
* You will need to download the FMOD Studio api for your platform.
* You will need to build the fomd-jni dynamic libs for your platform. I've included the debug logging dlls for 32 and 64 bit windows, but other platforms are up to you for now. Generating the DLL is fairly simple, you should read the SWIG documentation to get an idea of what it's all about. There's a visual studio express project to reference as well.
* put the FMOD dynamic libs in the fmod_runtimes directory. The windows dlls I created bind to the logging version of the FMOD dlls, so for windows you will put these files in the runtimes folder:
  * fmodL.dll
  * fmodL64.dll
  * fmodstudioL.dll
  * fmodstudioL64.dl.
* Build the fmod-jni-jar jar. There's an ant build file in the folder, it was generated by IntelliJ and it should work for building the jar. The jar wraps all of the native dlls and will extract and load them at runtime, so you don't need to manage that. The code is written to be cross platform but is only tested on win64, and of course you will need to supply all the dynamic libs for your target platform and build them into the jar.
 
From your code:
* depend on fmod-jni-jar.jar
* Call FMOD.loadNatives() first. This will return true if it can load the dynamic libraries.
* Call FMOD apis, starting with e.g. FmodStudioSystem.create()

TODO: Right now the API you will use is spread between the generated source and the api source. In the future it would be good to create a clear distinction so that Java users don't have to worry about the jni internals, for example.


##Building, Contributing
* If you wish to rebuild the SWIG bindings (i.e. you're contributing to this project, THANKS!) then you need to place the contents of the /FMOD Studio API/api folder in the fmod_api folder in this project.
* swig.exe must be in your PATH.
* see the runswig.bat file for the swig command line I'm using. Feel free to make a more cross-platform script if it pleases you. SWIG will generate /c_jni_wrapper/fmod_wrap.c and a whole bunch of java files in fmod-jni-jar/java_generated_src
* The SWIG source file is fmodjni.i, in the project root. SWIG can do a bunch of complicated stuff, and I am a NOOB at it.
* once you've run swig you'll need to regenerate the dynamic libs for your OS(es). I don't have any kind of build system for this yet, I've just been pressing rebuild in Visual Studio and manually copying files around. Honestly I really don't know the right way to do it so I'd appreciate some advice. What kind of build script do people use when working on cross platform c++ and java?

## License
Copyright 2015 Nate Austin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
