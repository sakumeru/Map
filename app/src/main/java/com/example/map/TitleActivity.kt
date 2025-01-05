package com.example.map

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TitleActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        val btn1 = findViewById<Button>(R.id.button)
        btn1.setOnClickListener(this)
     }

    override fun onClick(view: View){
        val intent = Intent(applicationContext, CurrentLoActivity::class.java)
        startActivity(intent)
    }
}