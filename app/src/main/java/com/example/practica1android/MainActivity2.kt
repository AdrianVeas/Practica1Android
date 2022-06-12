package com.example.practica1android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        try {
            val bun = intent.extras
            val Nombre = findViewById<TextView>(R.id.txtnombre2)
            val Genero = findViewById<TextView>(R.id.txtgenero2)
            val FechaNac = findViewById<TextView>(R.id.txtfecha2)
            val Telefono = findViewById<TextView>(R.id.txttelefono2)

            Nombre.setText("Nombre: " + bun?.getString("Nombre"))
            Genero.setText("Género: " + bun?.getString("Genero"))
            FechaNac.setText("Fecha Nac: "+bun?.getString("FechaNac"))
            Telefono.setText("Telefono: "+bun?.getString("Telefono"))



        }
        catch (e: Exception){
            Toast.makeText(applicationContext, "Error: "+ e.message, Toast.LENGTH_SHORT).show()
        }
    }
    override fun onClick (View: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}