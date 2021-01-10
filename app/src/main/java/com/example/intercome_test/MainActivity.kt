package com.example.intercome_test

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val vibrator = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator

        val but_vib : Button = findViewById(R.id.but_vib)
        but_vib.setOnClickListener {
            vibrator.vibrate(VibrationEffect.createOneShot(1000, 50))
        }

    }
}