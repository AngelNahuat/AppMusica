package com.example.appmusica

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class GorillazActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gorillazlayout)
        var albumes:ArrayList<Album>
        albumes=ArrayList()
        var texto=findViewById<TextView>(R.id.textView)

        texto.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        albumes.add(Album("Demon Days",R.drawable.demondays))
        albumes.add(Album("Plastic Beach",R.drawable.plastic))
        albumes.add((Album("Humanz",R.drawable.humanz)))
        albumes.add((Album("Song Machine",R.drawable.machine)))

        var grid=findViewById<GridView>(R.id.grid)
        val adaptador=AdaptadorAlbum(this,albumes)
        grid.adapter=adaptador
        grid.onItemClickListener= AdapterView.OnItemClickListener{ parent, view, position, id->

            var intent= Intent(this, Texto::class.java)
            startActivity(intent)
        }

    }}