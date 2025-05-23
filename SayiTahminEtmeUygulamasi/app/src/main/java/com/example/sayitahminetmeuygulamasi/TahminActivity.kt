package com.example.sayitahminetmeuygulamasi

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sayitahminetmeuygulamasi.databinding.ActivityMainBinding
import com.example.sayitahminetmeuygulamasi.databinding.ActivityTahminBinding
import kotlin.random.Random

class TahminActivity : AppCompatActivity() {
    private var rastgeleSayi = 0
    private var sayac = 5

    private lateinit var binding: ActivityTahminBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTahminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rastgeleSayi = Random.nextInt(101)
        Log.e("Rastgele Sayı" , rastgeleSayi.toString())

        binding.buttonSonuc.setOnClickListener {


            sayac = sayac-1

            val tahmin = binding.editTextText.text.toString().toInt()

            if(tahmin == rastgeleSayi){
                val intent = Intent(this@TahminActivity, SonucActivity::class.java)

                intent.putExtra("sonuc" , true)

                finish()

                startActivity(intent)

                return@setOnClickListener   //butonun çalışmasını engellemek istiyorsak bunu yaparız.
            }

            else if(tahmin > rastgeleSayi){
                binding.textViewYardim.text = "Azalt"
                binding.textViewKalanHak.text = "Kalan Hak: $sayac"
            }
            else if(tahmin < rastgeleSayi){
                binding.textViewYardim.text = "Arttır"
                binding.textViewKalanHak.text = "Kalan Hak: $sayac"
            }

            if(sayac == 0){
                val intent = Intent(this@TahminActivity, SonucActivity::class.java)

                intent.putExtra("sonuc" , false)

                finish()

                startActivity(intent)
            }

            binding.editTextText.setText("")

        }

    }
}