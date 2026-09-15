package com.example.ciclodevidademo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity_Logs"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate - HashCode: ${this.hashCode()}")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart - HashCode: ${this.hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume - HashCode: ${this.hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause - HashCode: ${this.hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop - HashCode: ${this.hashCode()}")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart - HashCode: ${this.hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy - HashCode: ${this.hashCode()}")
    }
}