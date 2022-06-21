package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ButtonClick(view:View){
        val name:EditText = findViewById(R.id.edit_text)
        val getName:TextView = findViewById(R.id.text_view)

        val str:String = name.text.toString()
        getName.setText(str)
    }

}