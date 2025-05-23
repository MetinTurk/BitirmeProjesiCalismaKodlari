package com.example.popupmenuolusturma

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.annotation.BinderThread
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.popupmenuolusturma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonMenuAc.setOnClickListener {

            val popup = PopupMenu(this@MainActivity , binding.buttonMenuAc)

            popup.menuInflater.inflate(R.menu.popup_menu, popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when(item.itemId){
                    R.id.action_sil -> {
                        Toast.makeText(application, "Sil seçildi" , Toast.LENGTH_SHORT).show()
                        true
                    }


                    R.id.action_duzenle -> {
                        Toast.makeText(application, "Düzenle seçildi" , Toast.LENGTH_SHORT).show()
                        true
                    }

                    else ->  false
                }

            }

            popup.show()
        }

    }
}