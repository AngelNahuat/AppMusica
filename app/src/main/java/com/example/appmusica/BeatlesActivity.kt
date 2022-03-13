package com.example.appmusica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class BeatlesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.beatleslayout)
        var texto=findViewById<TextView>(R.id.textView)

        texto.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        var albumes:ArrayList<Album>
        albumes=ArrayList()

        albumes.add(Album("Abbey Road",R.drawable.abbey))
        albumes.add(Album("Revolver",R.drawable.revolver))
        albumes.add((Album("Rubber Soul",R.drawable.rubbersoul)))
        albumes.add((Album("Help",R.drawable.help)))

        var grid=findViewById<GridView>(R.id.grid)
        val adaptador=AdaptadorAlbum(this,albumes)
        grid.adapter=adaptador
        grid.onItemClickListener=AdapterView.OnItemClickListener{parent,view,position,id->

            var intent= Intent(this, Texto::class.java)
            startActivity(intent)
        }

    }
}