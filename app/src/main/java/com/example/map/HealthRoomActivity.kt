package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HealthRoomActivity:AppCompatActivity(),View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_healthroom)

        val btn = findViewById<Button>(R.id.searchbtn)
        btn.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, CurrentLoActivity::class.java)

        when (id) {

            R.id.searchbtn -> startActivity(intent)
        }


    }



}