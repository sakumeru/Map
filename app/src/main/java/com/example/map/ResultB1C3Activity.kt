package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ResultB1C3Activity : AppCompatActivity(), View.OnClickListener {
   @SuppressLint("MissingInflatedId")
   override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_result_b1_c3)

          val btnC3 = findViewById<Button>(R.id.buttonC3)
          btnC3.setOnClickListener(this)
      }

      override fun onClick(view: View){
          val intent = Intent(applicationContext, ResultC3Activity::class.java)
          startActivity(intent)
      }
}