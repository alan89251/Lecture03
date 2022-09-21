package com.alan.lecture03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addNumbers(v: View) {
        val editTextFirstNumber : EditText = findViewById(R.id.editText_firstNumber)
        val editTextSecondNumber : EditText = findViewById(R.id.editText_secondNumber)
        var result : Int = editTextFirstNumber.text.toString().toInt() +
                editTextSecondNumber.text.toString().toInt()
        val textViewResult : TextView = findViewById(R.id.textView_Result)
        var strResult : CharSequence = result.toString()
        textViewResult.text = strResult
    }
}