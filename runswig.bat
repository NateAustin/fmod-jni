mkdir fmod-jni-jar
mkdir fmod-jni-jar\java_generated_src
mkdir fmod-jni-jar\java_generated_src\org
mkdir fmod-jni-jar\java_generated_src\org\fmod
mkdir fmod-jni-jar\java_generated_src\org\fmod\jni

mkdir c_jni_wrapper

swig -java -outdir fmod-jni-jar/java_generated_src/org/fmod/jni -package org.fmod.jni -o "c_jni_wrapper/fmod_wrap.c" fmodjni.i