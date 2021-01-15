package com.example.ndk20210115

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.lib.NativeClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val native = NativeClass()
        findViewById<TextView>(R.id.tv).text = native.getString()
    }
}