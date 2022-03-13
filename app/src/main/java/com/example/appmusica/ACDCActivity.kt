package com.example.appmusica

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class ACDCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acdclayout)
        var albumes: ArrayList<Album>
        albumes = ArrayList()
        var texto = findViewById<TextView>(R.id.textView)

        texto.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)

        albumes.add(Album("The Razors Edge", R.drawable.razorz))
        albumes.add(Album("Back in Black", R.drawable.backinblack))
        albumes.add((Album("Highway To Hell", R.drawable.highway)))
        albumes.add((Album("Rock or Bust", R.drawable.rockorbust)))

        var grid = findViewById<GridView>(R.id.grid)
        val adaptador = AdaptadorAlbum(this, albumes)
        grid.adapter = adaptador
        grid.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            var intent = Intent(this, Texto::class.java)
            startActivity(intent)
        }

    }
}