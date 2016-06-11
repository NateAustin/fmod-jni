## Native SWIG Wrappers for FMOD

This folder contains the swig source file `fmodjni.i` and a collection of platform-specific native projects to build the wrapper libraries that we ship with the FMOD binaries.

The wrappers that SWIG generates act as a C-side interface between the FMOD dlls and the generated Java source code.

If you are using the fmod-jni project, you don't necessarily need to build these yourself, you can use the provided native libs, combine them with the ones from the FMOD Studio API you downloaded, and build the fmod-jni jar.

You only need to mess around in here if you want to add support for another platform, or, you want to change or extend the swig wrapper.


* If you wish to rebuild the SWIG bindings then you need to place the contents of the `/FMOD Studio API/api` folder in the `fmod_api` folder in this project.
* swig.exe must be in your PATH.
* The SWIG source file is `fmodjni.i`, in the project root. SWIG can do a bunch of complicated stuff, and I am a NOOB at it.
* see the `runswig.bat` file for the swig command line I'm using. Feel free to make a more cross-platform script if it pleases you. SWIG will generate `/c_jni_wrapper/fmod_wrap.c` and a whole bunch of java files in `fmod-jni-jar/java_generated_src`
* once you've run swig you'll need to regenerate the dynamic libs for your OS(es). I don't have any kind of build system for this yet, I've just been pressing rebuild in Visual Studio and copying files around. Honestly I really don't know the right way to do it so I'd appreciate some advice. What kind of build script do people use when working on cross platform c++ and java?