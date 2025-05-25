package com.example.radiobuttoncheckboxkullanimi

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.radiobuttoncheckboxkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val javaDurum = binding.checkBoxJava.isChecked
            val kotlinDurum = binding.checkBoxKotlin.isChecked
            val barcelonaDurum = binding.radioButtonBarcelona.isChecked
            val realMadridDurum = binding.radioButtonRealMadrid.isChecked

            Log.e("Durum Java",javaDurum.toString())
            Log.e("Durum Kotlin",kotlinDurum.toString())
            Log.e("Durum Radio Barcelona",barcelonaDurum.toString())
            Log.e("Durum Radio Real Madrid",realMadridDurum.toString())
        }

        binding.radioButtonBarcelona.setOnCheckedChangeListener { componentName, b->
            if(b){
                Toast.makeText(applicationContext,"Tebrikler :) ", Toast.LENGTH_SHORT).show()
            }
        }

    }
}