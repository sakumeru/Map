package com.example.map


import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.SearchView


class ManufacturingActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manufacturing)

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