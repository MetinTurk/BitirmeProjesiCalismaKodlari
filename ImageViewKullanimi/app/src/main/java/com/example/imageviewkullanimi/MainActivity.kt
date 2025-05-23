package com.example.imageviewkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.imageviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonResim1.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.resim1)
        }
        binding.buttonResim2.setOnClickListener {
            //binding.imageView.setImageResource(R.drawable.guvercin)

            binding.imageView.setImageResource(resources.getIdentifier("guvercin" , "drawable" , packageName))//veri tabanından resim çekme işleminde kullanılır.
        }

    }
}