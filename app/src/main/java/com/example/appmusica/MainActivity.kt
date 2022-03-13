package com.example.appmusica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_login)
        var email="correo@correo.com"
        var pass="12345"

        val bLogin=findViewById<Button>(R.id.bLogin)
        val txtEmail=findViewById<EditText>(R.id.txtEmail)
        val txtContra=findViewById<EditText>(R.id.txtContra)
                val txt1=findViewById<TextView>(R.id.txt0)
        val txt3=findViewById<TextView>(R.id.txtRegistro)
        val txt2=findViewById<TextView>(R.id.txt1)
        txt1.typeface = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        txt2.typeface = ResourcesCompat.getFont(this, R.font.poppin_light)
        txtEmail.typeface = ResourcesCompat.getFont(this, R.font.poppins_regular)
        txtContra.typeface = ResourcesCompat.getFont(this, R.font.poppins_regular)
        bLogin.typeface =ResourcesCompat.getFont(this, R.font.poppins_regular)
        txt3.typeface =ResourcesCompat.getFont(this, R.font.poppins_extral)

        bLogin.setOnClickListener{

            if(txtEmail.text.toString()==email && txtContra.text.toString()==pass){
                var intent= Intent(this, Login::class.java)
                intent.putExtra("mensaje", "Sesión iniciada con éxito")
                startActivity(intent)

            }
            else{
                Toast.makeText(this,"Los datos son incorrectos", Toast.LENGTH_SHORT).show()
            }
        }





    }

}