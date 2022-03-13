package com.example.appmusica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class Texto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.textlayout)
        var texto=findViewById<TextView>(R.id.textView5)

        texto.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        var texto1=findViewById<TextView>(R.id.textView6)

        texto1.typeface = ResourcesCompat.getFont(this, R.font.poppins_medium)
        var texto2=findViewById<TextView>(R.id.textView7)

        texto2.typeface = ResourcesCompat.getFont(this, R.font.poppins_medium)
    }
}