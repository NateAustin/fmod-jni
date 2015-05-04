mkdir java_generated_src
mkdir java_generated_src\org
mkdir java_generated_src\org\fmod
mkdir java_generated_src\org\fmod\jni

mkdir c_jni_wrapper

swig -java -outdir java_generated_src/org/fmod/jni -package org.fmod.jni -o "c_jni_wrapper/fmod_wrap.c" fmodjni.i