# fmod-jni
Java JNI wrapper for the FMOD audio library. Experimental and Incomplete.

The goal of this project is to make the FMOD Studio audio engine available to Java code. This project is in support of my indie game, Legacy (http://yonderinglands.blogspot.com/) but you are welcome to use it for whatever, or suggest improvements. Legacy is under active development and I expect this API to expand and harden over time to meet the audio needs of the game.

##About FMOD
FMOD Studio is a 3D audio engine and designer tool for games.

http://www.fmod.org/

* It is not free (but it does have a free license for individuals and small projects) 
* This repo does not include FMOD Studio itself, just the JNI bindings to it.
* I am not affiliated with FMOD or Firelight Technologies.

To use FMOD with this project you will need to download the FMOD Studio API version 1.0.6.01.

##Approach
The goal of this project is to be an idiomatic Java implementation of the FMOD Studio and Low Level API. The Java API defines the same classes and functions that the C++ api defines. The only real difference is that I've elected not to return FMOD_RESULT from every api call, instead I'm returning objects and values directly. Since Java can't easily return values via function arguments, this is much cleaner. The FMOD_RESULT is accessible via a getLastResult call on each API Object, and you can optionally define a callback to handle them inline. So no functionality is lost.

Under the hood, I'm using SWIG (http://www.swig.org/) to generate Java JNI bindings around the FMOD C (not C++) api. I chose the C api for maximum portability(?), and hey, they're functionally identical so it shouldn't matter. Then on the Java side, I've stubbed out the API classes and am in the process of filling in an idiomatic Java API to FMOD.


##Status
HIGHLY INCOMPLETE

Right now the sample will run and play a sound, though!

The majority of the fianl API is not present. However the raw SWIG wrapper is maybe at 80%, so a lot of stuff is present that I just need to expose in a nice Java friendly way. After that, the last 20% of the SWIG wrapper looks like it will take 80% of the work, so we'll see how far we get.

There's a lot I don't know about using SWIG properly, AND a lot I don't know about using FMOD properly. On top of that, JNI is just complicated. So if you see something you think should be different, please tell me. I need the advice.

### Platforms
I'm testing on windows but I don't think there's any reason it won't work on Mac or Linux. FMOD supports both those platforms and so does SWIG (to the extent that matters..?) and it should be straightforward to generate the dynamic libraries you need. If you do this, send me a pull request with your setup so I can incorporate it.

##Usage
To play sound using FMOD from Java:
 * You will need the FMOD
 * You will need to build the dynamic libs for your platform, and you will need the fmod dynamic libs as well. I've included the dlls for 32 and 64 bit windows, but other platforms are up to you for now. Generating the DLL is fairly simple, you should read the SWIG documentation to get an idea of what it's all about. There's a visual studio express project to reference as well.
 * put all the dynamic libs in the working directory, or otherwise ensure that your OS can find them.
 * I don't really have any kind of "publish" step defined the java code, so for now you're on your own. Let me know what you want. Some kind of "jar" file, perhaps?

##Building
* If you wish to rebuild the SWIG bindings (i.e. you're contributing to this project, THANKS!) then you need to place the contents of the /FMOD Studio API/api folder in the fmod_api folder in this project.
* swig.exe must be in your PATH.
* see the runswig.bat file for the swig command line I'm using. Feel free to make a more cross platform script if it pleases you.
* once you've run swig you'll need to regenerate the dynamic libs for your OS(es). I don't have any kind of build system for this yet, I've just been pressing rebuild in Visual Studio and manually copying files around. Honestly I really don't know the right way to do it so I'd appreciate some advice. What kind of build script to people use when working on cross platform c++ and java?

