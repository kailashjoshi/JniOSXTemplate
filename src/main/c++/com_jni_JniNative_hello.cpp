#include <jni.h>
#include "com_jni_JniNative.h"

JNIEXPORT jstring JNICALL Java_com_jni_JniNative_hello(JNIEnv *env, jobject obj) {
 	return env->NewStringUTF("Hello World C++!");
}