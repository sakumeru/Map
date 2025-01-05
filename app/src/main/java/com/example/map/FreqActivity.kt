package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FreqActivity:AppCompatActivity(),View.OnClickListener{
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_freq)

        val btnLib = findViewById<Button>(R.id.returnLib)
        btnLib.setOnClickListener(this)

        val btnStu = findViewById<Button>(R.id.returnStu)
        btnStu.setOnClickListener(this)

        val btnHealth = findViewById<Button>(R.id.returnHealth)
        btnHealth.setOnClickListener(this)

        val btnHealth2 = findViewById<Button>(R.id.returnHealth2)
        btnHealth2.setOnClickListener(this)
    }


    override fun onClick(view: View) {
        val id = view.id
        val intent = Intent(applicationContext, BtoLibraryActivity::class.java)
        val intent2 = Intent(applicationContext, ResultE2Activity::class.java)
        val intent3 = Intent(applicationContext, HealthRoomActivity::class.java)
        val intent4 = Intent(applicationContext, HealthRoom2Activity::class.java)


        when (id) {
            R.id.returnLib -> startActivity(intent)
            R.id.returnStu -> startActivity(intent2)
            R.id.returnHealth -> startActivity(intent3)
            R.id.returnHealth2 -> startActivity(intent4)

        }


    }

}