package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.widget.SearchView

class MainActivity  : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val data = listOf(
            "A棟", "B棟", "C棟", "E棟"
        )




        val list = findViewById<ListView>(R.id.list)
        list.adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            data
        )





        list.setOnItemClickListener{ adapterView, view, position, id->

            val text = data[position]
            val CLtower2 = intent.getStringExtra("CLtower")


            val intent = Intent(this@MainActivity, SubActivity::class.java)
            intent.putExtra("tower",text)
            intent.putExtra("CLtower2",CLtower2)

            startActivity(intent)


        }

        list.isTextFilterEnabled = true

        findViewById<SearchView>(R.id.search).setOnQueryTextListener(
            object : SearchView.OnQueryTextListener {
                override fun onQueryTextChange(p0: String?): Boolean {
                    if (p0.isNullOrBlank()) {
                        list.clearTextFilter()
                    } else {
                        list.setFilterText(p0)
                    }
                    return false
                }

                override fun onQueryTextSubmit(p0: String?): Boolean {
                    return false
                }
            }
        )
    }
}