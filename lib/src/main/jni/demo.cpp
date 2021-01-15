//
// Created by IDEA on 2021/1/15.
//
#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_com_example_lib_NativeClass_getString(JNIEnv *env, jobject thiz) {
    std::string hello = "Hello from lib Native Class C++";
    return env->NewStringUTF(hello.c_str());
}