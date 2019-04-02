cmake_minimum_required(VERSION 3.13)
project(fmodJNI C)

set(CMAKE_C_STANDARD 99)



set(JAVA_HOME /usr/java/jdk1.8.0_201)
set(FMOD_API ../fmod_api)


include_directories(${JAVA_HOME}/include ${JAVA_HOME}/include/linux ${FMOD_API}/lowlevel/inc ${FMOD_API}/studio/inc)

add_library(fmodJNI SHARED ../c_jni_wrapper/fmod_wrap.c)

find_library(LIB_FMOD fmod PATHS ${FMOD_API}/lowlevel/lib/x86_64)
find_library(LIB_FMOD_STUDIO fmodstudio PATHS ${FMOD_API}/studio/lib/x86_64)

target_link_libraries(fmodJNI ${LIB_FMOD} ${LIB_FMOD_STUDIO})

set_target_properties( fmodJNI
        PROPERTIES
        LIBRARY_OUTPUT_DIRECTORY ../../../fmod_runtimes
        )