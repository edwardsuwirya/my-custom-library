package com.enigmacamp.mycustomlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.enigmacamp.mylibrary.SayHi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sayHi = SayHi()
        println(sayHi.hi("ssss"))
    }
}