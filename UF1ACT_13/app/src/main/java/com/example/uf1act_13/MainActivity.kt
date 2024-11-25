package com.example.uf1act_13

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button5)
        btn.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity2:: class.java)
            startActivity(intent)
        }

        val btn2: Button = findViewById(R.id.button6)
        btn2.setOnClickListener {
            val intent: Intent= Intent(this, MainActivity3:: class.java)
            startActivity(intent)
        }
    }
}