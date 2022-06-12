package com.example.practica1android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onClick(View: View?){
        try {
            val Nombre = findViewById<EditText>(R.id.txtnombre);
            val RBGroup = findViewById<RadioGroup>(R.id.rbgroup);
            val selectBtn:Int = RBGroup!!.checkedRadioButtonId;
            val Genero = findViewById<RadioButton>(selectBtn);
            val FechaNac = findViewById<EditText>(R.id.txtfecha);
            val Telefono = findViewById<EditText>(R.id.txtphone);

            val intent = Intent(this, MainActivity2::class.java);

            val bun = Bundle()
            if (Nombre != null && Genero != null && FechaNac != null && Telefono != null)
            {
                bun.putString("Nombre", Nombre.text.toString());
                bun.putString("Genero", Genero.text.toString());
                bun.putString("FechaNac", FechaNac.text.toString());
                bun.putString("Telefono", Telefono.text.toString());

                intent.putExtras(bun);
                startActivity(intent);

                }else{
                Toast.makeText(applicationContext, "Faltan datos por llenar", Toast.LENGTH_SHORT).show();
            }

        }
        catch (e: Exception){
            Toast.makeText(applicationContext, "Error: "+ e.message, Toast.LENGTH_SHORT).show();
        }
    }
}