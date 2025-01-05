package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BtoLibraryActivity: AppCompatActivity(),View.OnClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btolibrary)

        val btn = findViewById<Button>(R.id.returnbtn)
        btn.setOnClickListener(this)

        val btn2 = findViewById<Button>(R.id.nextbtn)
        btn2.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, BtoLibrary2Activity::class.java)
        val intent2 = Intent(applicationContext, CurrentLoActivity::class.java)

        when (id) {
            R.id.nextbtn -> startActivity(intent)
            R.id.returnbtn -> startActivity(intent2)
        }


    }


}