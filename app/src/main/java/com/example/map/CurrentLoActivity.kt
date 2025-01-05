package com.example.map

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

import com.google.android.material.textfield.TextInputEditText

class CurrentLoActivity:AppCompatActivity(){
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currentlo)


        val buttonlo = findViewById<Button>(R.id.btnCl)
        val editText2 = findViewById<TextInputEditText>(R.id.edit_text2)

        val buttonfreq = findViewById<Button>(R.id.btnRank)



        buttonfreq.setOnClickListener {
           val intent = Intent(this@CurrentLoActivity, FreqActivity::class.java)
            startActivity(intent)

        }

        buttonlo.setOnClickListener{

            val textDtn = editText2.text.toString()



            if ( textDtn == "A2") {
                val intent = Intent(this@CurrentLoActivity, Result1Activity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( textDtn == "C3") {
                val intent = Intent(this@CurrentLoActivity, ResultB1C3Activity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( textDtn == "図書館") {
                val intent = Intent(this@CurrentLoActivity, BtoLibraryActivity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( (textDtn == "学生課" || textDtn == "就職課")) {
                val intent = Intent(this@CurrentLoActivity, ResultE2Activity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( textDtn == "ものづくり演習室" ){
                val intent = Intent(this@CurrentLoActivity, ManufacturingActivity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( textDtn == "保健室" ){
                val intent = Intent(this@CurrentLoActivity, HealthRoomActivity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
            else if( textDtn == "学生相談室" ){
                val intent = Intent(this@CurrentLoActivity, HealthRoom2Activity::class.java)

                intent.putExtra("roomDtn",textDtn)
                startActivity(intent)
            }
        }
    }





}