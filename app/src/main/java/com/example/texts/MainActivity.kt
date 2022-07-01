package com.example.texts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonCacl = findViewById<Button>(R.id.button)
        val Value = findViewById<EditText>(R.id.Value)
        val RESULT = findViewById<TextView>(R.id.RESULT)
        var result = RESULT.text.toString()
        val numValue = Value.toString()
        buttonCacl.setOnClickListener {
            val area = area_ofa_circle()
            area.calculateAreaofaCircle(numValue.toInt())

        }



    }






}