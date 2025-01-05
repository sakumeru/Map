package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class BtoLibrary2Activity: AppCompatActivity(),View.OnClickListener{

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_btolibrary2)

        val btn = findViewById<Button>(R.id.returnbtn2)
        btn.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, BtoLibraryActivity::class.java)
        val intent2 = Intent(applicationContext, BtoLibraryActivity::class.java)

        when (id) {
            R.id.nextbtn2 -> startActivity(intent)
            R.id.returnbtn2 -> startActivity(intent2)
        }


    }


}