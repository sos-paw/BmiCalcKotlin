package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wzrost = wzrostNumber.text
        val waga = wagaNumber.text

        val person = Person()


        LICZ_Button.setOnClickListener{
            if(wzrost.toString()=="" || waga.toString()==""){
                wynik.setText("Musisz podac wzrost i wage")
            }
            else{

            wynik.setText(person.licz(waga.toString().toDouble(),wzrost.toString().toDouble()))

            if(wynik.text.toString().toDouble()>18.5 && wynik.text.toString().toDouble()<24.9) {
                prawidlowa.isVisible=true
                nadwaga.isVisible=false
                stopienI.isVisible=false
                stopienII.isVisible=false
                stopienIII.isVisible=false
                niedowaga.isVisible=false
            }
            else if(wynik.text.toString().toDouble()>25.0 && wynik.text.toString().toDouble()<29.9){
                prawidlowa.isVisible=false
                nadwaga.isVisible=true
                stopienI.isVisible=false
                stopienII.isVisible=false
                stopienIII.isVisible=false
                niedowaga.isVisible=false
            }
            else if(wynik.text.toString().toDouble()>30.0 && wynik.text.toString().toDouble()<34.9){
                prawidlowa.isVisible=false
                nadwaga.isVisible=false
                stopienI.isVisible=true
                stopienII.isVisible=false
                stopienIII.isVisible=false
                niedowaga.isVisible=false
            }
            else if(wynik.text.toString().toDouble()>35.0 && wynik.text.toString().toDouble()<39.9){
                prawidlowa.isVisible=false
                nadwaga.isVisible=false
                stopienI.isVisible=false
                stopienII.isVisible=true
                stopienIII.isVisible=false
                niedowaga.isVisible=false
            }
            else if(wynik.text.toString().toDouble()>40.0){
                prawidlowa.isVisible=false
                nadwaga.isVisible=false
                stopienI.isVisible=false
                stopienII.isVisible=false
                stopienIII.isVisible=true
                niedowaga.isVisible=false
            }
            else if(wynik.text.toString().toDouble()<18.50){
                prawidlowa.isVisible=false
                nadwaga.isVisible=false
                stopienI.isVisible=false
                stopienII.isVisible=false
                stopienIII.isVisible=false
                niedowaga.isVisible=true
            }
            else{
                prawidlowa.isVisible=false
                nadwaga.isVisible=false
                stopienI.isVisible=false
                stopienII.isVisible=false
                stopienIII.isVisible=false
                niedowaga.isVisible=false
            }
        }}

        
    }


}



