package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResultC3Activity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c3)

        val btn3 = findViewById<Button>(R.id.BackBtnC3)
        btn3.setOnClickListener(this)

        val btn4 = findViewById<Button>(R.id.BackSearchC3)
        btn4.setOnClickListener(this)


    }


    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, ResultB1C3Activity::class.java)
        val intent2 = Intent(applicationContext, CurrentLoActivity::class.java)

        when (id) {
            R.id.BackBtnC3 -> startActivity(intent)
            R.id.BackSearchC3 -> startActivity(intent2)
        }


    }
}