package com.example.toastmesajkullanimi

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.toastmesajkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonNormal.setOnClickListener {

            Toast.makeText(this , "Merhaba" , Toast.LENGTH_SHORT).show()

        }

        binding.buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim, null)

            val textViewMesaj = tasarim.findViewById(R.id.textViewMesaj) as TextView

            textViewMesaj.text = "Merhaba Özel Mesaj"

            val toastOzel = Toast(application)

            toastOzel.view = tasarim

            toastOzel.duration = Toast.LENGTH_LONG

            toastOzel.show()


        }

    }
}