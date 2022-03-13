package com.example.appmusica

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var bandas: ArrayList<Banda>
        bandas = ArrayList()
        bandas.add(Banda("The Beatles", R.drawable.beatles, R.drawable.flecha))
        bandas.add(Banda("AC/DC", R.drawable.acdc, R.drawable.flecha))

        bandas.add(Banda("Kiss", R.drawable.kiss, R.drawable.flecha))

        bandas.add(Banda("Gorillaz", R.drawable.gorillaz, R.drawable.flecha))

        bandas.add(Banda("Pink Floyd", R.drawable.pinkfloyd, R.drawable.flecha))

        var textView=findViewById<TextView>(R.id.textView)
        var textView1=findViewById<TextView>(R.id.textView1)
        var textView2=findViewById<TextView>(R.id.ver)
        textView.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        textView1.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        textView2.typeface = ResourcesCompat.getFont(this, R.font.poppin_light)



        val list = findViewById<ListView>(R.id.List)
        val adaptador = AdaptadorBandas(this, bandas)
        val cv=findViewById<CardView>(R.id.gradientecv)
        cv.setBackgroundResource(R.drawable.gradient)
        list.adapter = adaptador

        list.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            when (bandas.get(position).nombre) {
                "The Beatles" -> ActivityUtil.showActivity(this,BeatlesActivity::class.java)
                "AC/DC" -> ActivityUtil.showActivity(this,ACDCActivity::class.java)
                "Kiss" -> ActivityUtil.showActivity(this,KissActivity::class.java)
                "Gorillaz" -> ActivityUtil.showActivity(this,GorillazActivity::class.java)
                "Pink Floyd" -> ActivityUtil.showActivity(this,PinkActivity::class.java)
            }

        }



    }

    object ActivityUtil {
        fun showActivity(from: Activity, to: Class<*>?) {
            val intent = Intent(from, to)
            from.startActivity(intent)

        }


    }
}