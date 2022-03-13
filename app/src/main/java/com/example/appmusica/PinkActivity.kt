package com.example.appmusica

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class PinkActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pinklayout)
        var albumes:ArrayList<Album>
        albumes=ArrayList()
        var texto=findViewById<TextView>(R.id.textView)

        texto.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        albumes.add(Album("The Wall",R.drawable.thewall))
        albumes.add(Album("Dark Side of The Moon",R.drawable.darkside))
        albumes.add((Album("Animals",R.drawable.animals)))
        albumes.add((Album("Wish You Were Here",R.drawable.wish)))

        var grid=findViewById<GridView>(R.id.grid)
        val adaptador=AdaptadorAlbum(this,albumes)
        grid.adapter=adaptador
        grid.onItemClickListener= AdapterView.OnItemClickListener{ parent, view, position, id->

            var intent= Intent(this, Texto::class.java)
            startActivity(intent)
        }

    }}