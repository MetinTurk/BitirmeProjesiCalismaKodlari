package com.example.alertviewkullanimi

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alertviewkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonNormal.setOnClickListener {

            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam"){ dialog , which ->
                Toast.makeText(applicationContext, "Tamam Tıklanıldı" , Toast.LENGTH_SHORT).show()

            }

            ad.setNegativeButton("İptal"){dialog , which ->
                Toast.makeText(applicationContext, "İptal Tıklanıldı" , Toast.LENGTH_SHORT).show()

            }

            ad.create().show()

        }

        binding.buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim, null)

            val editTextAlert = tasarim.findViewById(R.id.editTextAlert) as EditText



            val ad = AlertDialog.Builder(this@MainActivity)

            ad.setView(tasarim)
            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Kaydet"){ dialog , which ->

                val alinanVeri = editTextAlert.text.toString()


                Toast.makeText(applicationContext, "Alınan Veri : $alinanVeri" , Toast.LENGTH_SHORT).show()

            }

            ad.setNegativeButton("İptal"){dialog , which ->
                Toast.makeText(applicationContext, "İptal Tıklanıldı" , Toast.LENGTH_SHORT).show()

            }

            ad.create().show()

        }

    }
}