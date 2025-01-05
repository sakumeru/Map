package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class SubActivity : AppCompatActivity(), View.OnClickListener  {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val back_btn2 = findViewById<Button>(R.id.backbtn2)
        back_btn2.setOnClickListener(this)


        val data2 = listOf(
            "1階", "2階", "3階", "4階"
        )

        val list2 = findViewById<ListView>(R.id.list2)
        list2.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data2
        )

        val towerName = intent.getStringExtra("tower")

        val text2 = findViewById<TextView>(R.id.text2)

        text2.text = towerName


        val CLName = intent.getStringExtra("CLtower2")


        list2.setOnItemClickListener { adapterView, view, position, id ->
            if (text2.text == "A棟" && data2[position] == "2階" && CLName == "B3") {
                val intent = Intent(applicationContext, Result1Activity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onClick(v: View?) {
        val intent = Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}
