package com.example.mvvmkullanimi

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mvvmkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewModel : MainActivityViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.mainActivityNesnesi = this



        viewModel.sonuc.observe(this, { s ->
            binding.hesaplamaSonucu = s
        })

    }

    fun buttonToplamaTikla(alinanSayi1: String,alinanSayi2: String){
        viewModel.toplamaYap(alinanSayi1,alinanSayi2)

    }

    fun buttonCarpmaTikla(alinanSayi1: String,alinanSayi2: String){
        viewModel.carpmaYap(alinanSayi1,alinanSayi2)

    }
}