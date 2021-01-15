package com.example.lib

class NativeClass {
    companion object {
        init {
            System.loadLibrary("demo-lib")
        }
    }
    external fun getString(): String
}