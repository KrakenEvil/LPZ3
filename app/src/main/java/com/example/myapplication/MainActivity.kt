package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        var imageButton: ImageButton = findViewById(R.id.imageButton2)
        var editText: EditText = findViewById(R.id.editTextTextPersonName)
        imageButton.setOnClickListener{
            if (editText.text.isEmpty()) {
                textView.text = "Hello, friend!";
            }
            else
            {
                textView.text = "Hello, " + editText.text
            }
        }
    }
}