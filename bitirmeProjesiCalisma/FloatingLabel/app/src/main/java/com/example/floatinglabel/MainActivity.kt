package com.example.floatinglabel

import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.floatinglabel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonYap.setOnClickListener {
            val ad = binding.edittextAd.text.toString().trim()
            val tel = binding.edittextTel.text.toString().trim()//önünde ve sonundaki boşlukları siler.

            if(TextUtils.isEmpty(ad)){
                Toast.makeText(applicationContext , "Ad Boş", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(TextUtils.isEmpty(tel)){
                Toast.makeText(applicationContext , "Tel Boş", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if(tel.length < 6){
                Toast.makeText(applicationContext , "Tel en az 6 hane olmalıdır.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(applicationContext , "$ad - $tel", Toast.LENGTH_SHORT).show()
        }

    }
}