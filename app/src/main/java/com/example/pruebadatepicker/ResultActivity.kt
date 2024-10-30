package com.example.pruebadatepicker

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class ResultActivity : AppCompatActivity() {
    private lateinit var botonSelect: Button
    private lateinit var fechaStr: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        fechaStr = findViewById(R.id.textView)
        botonSelect = findViewById(R.id.button2)

        botonSelect.setOnClickListener {
            showDatePickerDialog()
        }

    }
    fun showDatePickerDialog() {
        // Crear una instancia del calendario para obtener la fecha actual
        val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        // Crear el DatePickerDialog y definir el comportamiento al seleccionar una fecha
        val datePickerDialog = DatePickerDialog(this, { _, selectedYear, selectedMonth, selectedDay ->
            // Formatear la fecha seleccionada y mostrarla en el TextView
            val date = "$selectedDay/${selectedMonth + 1}/$selectedYear"
            fechaStr.text = "Fecha: $date"
        }, year, month, day)

        datePickerDialog.show()
    }
}