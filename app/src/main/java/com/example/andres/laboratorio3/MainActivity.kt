package com.example.andres.laboratorio3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addNewContactButton= findViewById<Button>(R.id.addContactButton)
        addNewContactButton.setOnClickListener{
            launchAddNewContactActivity()
        }



    }
//addContactButton
    fun launchAddNewContactActivity(){
        val myintent = Intent(this,newContactActivity::class.java)
        startActivity(myintent)
        //metodo que debe ser llamado al presionar el boton de agregar contacto.
    }

    fun loadSelectedContact(){

    }
}
