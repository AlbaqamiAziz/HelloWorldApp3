package com.example.helloworldapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var btn:Button
    lateinit var tex:TextView
    lateinit var textBox:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button2)
        tex = findViewById(R.id.enterName)
        textBox = findViewById(R.id.editTextTextPersonName)

        printMsg()


    }

    fun printMsg(){
        btn.setOnClickListener{
            Toast.makeText(this,"Button is clicked", Toast.LENGTH_LONG).show()
            tex.setText("Hi " + textBox.text.toString())
        }
    }
}