package com.example.sayitahminetmeuygulamasi

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sayitahminetmeuygulamasi.databinding.ActivityMainBinding
import com.example.sayitahminetmeuygulamasi.databinding.ActivitySonucBinding

class SonucActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySonucBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySonucBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sonuc = intent.getBooleanExtra("sonuc" , false)

        if(sonuc){
            binding.textViewSonuc.text = "KAZANDINIZ"
            binding.imageViewSonuc.setImageResource(R.drawable.mutlu_resim)
        }else{
            binding.textViewSonuc.text = "KAYBETTİNİZ"
            binding.imageViewSonuc.setImageResource(R.drawable.uzgun_resim)
        }

        binding.buttonTekrar.setOnClickListener {
            val intent = Intent(this@SonucActivity, MainActivity::class.java)

            finish()

            startActivity(intent)
        }

    }
}