package com.example.pruebadatepicker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private lateinit var botonFecha: Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        botonFecha = findViewById(R.id.button)

        botonFecha.setOnClickListener {
            intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)
        }

    }
}