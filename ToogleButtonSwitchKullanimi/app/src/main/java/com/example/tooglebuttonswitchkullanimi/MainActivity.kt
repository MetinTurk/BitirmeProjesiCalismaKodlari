package com.example.tooglebuttonswitchkullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tooglebuttonswitchkullanimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.switch1.setOnCheckedChangeListener { componentName, b->
            if(b){
                Log.e("Switch" , "ON")
            }else{
                Log.e("Switch" , "OFF")
            }
        }

        binding.toggleButton.setOnCheckedChangeListener { componentName , b->
            if(b){
                Log.e("Toggle Button" , "ON")
            }else{
                Log.e("Toggle Button" , "OFF")
            }
        }
        binding.button.setOnClickListener {
            val switchDurum = binding.switch1.isChecked
            val toggleDurum = binding.toggleButton.isChecked

            Log.e("Switch Durum" , switchDurum.toString())
            Log.e("Toggle Button Durum" , toggleDurum.toString())
        }

    }
}