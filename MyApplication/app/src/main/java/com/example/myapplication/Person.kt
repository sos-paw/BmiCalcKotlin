package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.function.DoublePredicate

class Person {


        fun licz(waga :Double,wzrost :Double): String {
            val wynikbmii=(waga/(wzrost*wzrost)).toString()
            return wynikbmii
        }

}