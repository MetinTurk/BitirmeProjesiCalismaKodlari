package com.example.snacbarcalismasi

import android.graphics.Color
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.snacbarcalismasi.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener {view ->

            Snackbar.make(view , "Merhaba" , Snackbar.LENGTH_SHORT).show()  //Snackbar hangi nesne onu çalıştırıcaksa onun nesnesini parametre olarak istiyor.

        }

        binding.buttonGeriDonus.setOnClickListener {view ->

            Snackbar.make(view , "Mesaj Silinsin Mi" , Snackbar.LENGTH_SHORT)
                .setAction("EVET") { y ->

                    Snackbar.make(y ,"Mesaj Silindi" , Snackbar.LENGTH_SHORT).show()
                }
                .show()

        }

        binding.buttonOzel.setOnClickListener { z ->

            val sb = Snackbar.make(z, "İnternet Bağlantısı Yok!" , Snackbar.LENGTH_SHORT)

            sb.setAction("Tekrar Dene") {

            }

            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)

            sb.show()
        }

        binding.buttonNormalMod.setOnClickListener {
            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
        }

        binding.buttonKaranlikMod.setOnClickListener {
            delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
        }

    }
}