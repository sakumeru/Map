package com.example.map

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Result1Activity : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result1)

        val btn2 = findViewById<Button>(R.id.button2)
        btn2.setOnClickListener(this)
    }

    override fun onClick(view: View){
        val intent = Intent(applicationContext, Result2Activity::class.java)
        startActivity(intent)
    }
}