package com.example.vibration

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

        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val pattern = longArrayOf(100, 200, 100, 200, 100, 200)
            vibrator.vibrate(pattern, -1)
        }

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val pattern = longArrayOf(100, 200, 100, 200, 100, 200)
            vibrator.vibrate(pattern, 0)
        }

        val btn3 = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            vibrator.cancel()
        }

        val btn4 = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            vibrator.vibrate(200)
        }

        val btn5 = findViewById<Button>(R.id.button5)
        btn5.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val effect = VibrationEffect.createOneShot(
                    200, VibrationEffect.DEFAULT_AMPLITUDE)
            vibrator.vibrate(effect)
        }

        val btn6 = findViewById<Button>(R.id.button6)
        btn6.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val timing = longArrayOf(100, 200, 100, 200, 100, 200)
            val effect = VibrationEffect.createWaveform(timing, -1)
            vibrator.vibrate(effect)
        }

        val btn7 = findViewById<Button>(R.id.button7)
        btn7.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val timing = longArrayOf(100, 200, 100, 200, 100, 200)
            val amp = intArrayOf(0, 50, 0, 100, 0, 200)
            val effect = VibrationEffect.createWaveform(timing, amp, -1)
            vibrator.vibrate(effect)
        }

        val btn8 = findViewById<Button>(R.id.button8)
        btn8.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val timing = longArrayOf(100, 200, 100, 200, 100, 200)
            val amp = intArrayOf(0, 50, 0, 100, 0, 200)
            val effect = VibrationEffect.createWaveform(timing, amp, 0)
            vibrator.vibrate(effect)
        }

        val btn9 = findViewById<Button>(R.id.button9)
        btn9.setOnClickListener {
            val vibrator = getSystemService(
                    Context.VIBRATOR_SERVICE) as Vibrator
            val timing = longArrayOf(100, 200, 100, 200, 100, 200)
            val amp = intArrayOf(0, 50, 0, 100, 0, 200)
            val effect = VibrationEffect.createWaveform(timing, amp, 4)
            vibrator.vibrate(effect)
        }
    }
}