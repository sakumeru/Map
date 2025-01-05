package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ResultE2Activity: AppCompatActivity(),View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e2)

        val btn = findViewById<Button>(R.id.returnbtnE)
        btn.setOnClickListener(this)

        val btn4 = findViewById<Button>(R.id.nextbtnE)
        btn4.setOnClickListener(this)


    }


    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, ResultC3E2Activity::class.java)
        val intent2 = Intent(applicationContext, CurrentLoActivity::class.java)

        when (id) {
            R.id.nextbtnE -> startActivity(intent)
            R.id.returnbtnE -> startActivity(intent2)
        }


    }
}