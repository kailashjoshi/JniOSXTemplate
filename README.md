# JniOSXTemplate
JNI Template project for MAC OSX. All it does is print hello world from Java and C++.
##Prerequisites (Step 1)
Following items must be installed in your system before building the project

1.  JDK 
2.  MAVEN
3.  GCC

##Edit MAKEFILE (Step 2)

* Edit line 2 and line 7 in Makefile to reflect your devlopment environment
* Line 2 is  absolute path of folder where jni.h file can be found

##Build the project (Step 3)

* Execute [build_jni](https://github.com/kailashjoshi/JniOSXTemplate/blob/master/build_jni) file 
```bash
source build_jni
```
* Go to target folder and extract **jnijava-distro.tar.gz** file
```bash
cd target
tar xzvf jnijava-distro.tar.gz
cd jnijava
```
* **jnijava** folder contents **bin** folder (Script for executing program),**lib** (All dependencies of program),**shared**(Compiled c++ program) and **jnijava.jar** project jar
* Finally run the program to print hello world
```bash
bin/jnirunner
```
* Output of program
```bash
2017-01-08 22:01:11 INFO  HelloJni:17 - Hello from JAVA!
2017-01-08 22:01:11 INFO  HelloJni:18 - Hello World C++!
```
Done :+1:

