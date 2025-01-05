package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResultC3E2Activity:AppCompatActivity(),View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c3e2)

        val btnE2 = findViewById<Button>(R.id.buttonE2)
        btnE2.setOnClickListener(this)
    }

    override fun onClick(view: View){
        val intent = Intent(applicationContext, E2Activity::class.java)
        startActivity(intent)
    }
}