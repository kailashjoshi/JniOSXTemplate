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

* Execute [build_jni](https://github.com/kailashjoshi/JniOSXTemplate/blob/master/build_jni) file :arrow_down:
```sh
$  git clone https://github.com/kailashjoshi/JniOSXTemplate.git
$  cd JniOSXTemplate
$  ./build_jni
```
* Go to target folder and extract **jnijava-distro.tar.gz** file :arrow_down:
```sh
$  cd target
$  tar xzvf jnijava-distro.tar.gz
$  cd jnijava
```
* **jnijava** folder contents **bin** folder (Script for executing program),**lib** (All dependencies of program),**shared**(Compiled c++ program) and **jnijava.jar** project jar
```bash
├── bin
│   └── jnirunner
├── jnijava.jar
├── lib
│   ├── log4j-1.2.17.jar
│   ├── slf4j-api-1.7.22.jar
│   └── slf4j-log4j12-1.7.22.jar
└── shared
    └── jninative.jnilib
 ```
 
##Run the Program (Step 4)
* Execute **jnirunner** script to print hello world :arrow_down:
```sh
$  bin/jnirunner
```
* Output of program :arrow_down:
```bash
2017-01-08 22:01:11 INFO  HelloJni:17 - Hello from JAVA!
2017-01-08 22:01:11 INFO  HelloJni:18 - Hello World C++!
```
Done :+1:

