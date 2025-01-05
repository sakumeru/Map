package com.example.map

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.widget.*

class ProtoResultActivity: AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_protoresult)

        val relativeLayout = RelativeLayout(this).also{




            val image = ImageView(this)
            image.setImageResource(R.drawable.map_a2)
            val params1 = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT)
            params1.addRule(RelativeLayout.CENTER_IN_PARENT)
            image.layoutParams = params1


            val textView = TextView(this)
            textView.text = "B棟3階からの場合"
            val params2 = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT)
            params2.addRule(RelativeLayout.ABOVE, image.id)
            textView.layoutParams = params2



            val textView2 = TextView(this)
            textView2.text = "直通の渡り廊下を通って行く事が出来る。"
            val params3 = RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT)
            params3.addRule(RelativeLayout.BELOW, image.id)
            textView2.layoutParams = params3


            it.addView(image)
            it.addView(textView)

            it.addView(textView2)
        }

        setContentView(relativeLayout)


    }

}
