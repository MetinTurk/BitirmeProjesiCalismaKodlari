package com.example.timedatepickerkullanimi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.timedatepickerkullanimi.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editTextSaat.setOnClickListener {
            val calender = Calendar.getInstance()
            val saat = calender.get(Calendar.HOUR_OF_DAY)
            val dakika = calender.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(this@MainActivity, TimePickerDialog.OnTimeSetListener{timePicker, s , dk->
                binding.editTextSaat.setText("$s , $dk")
            },saat,dakika,true)

            timePicker.setTitle("Saat Seçiniz")
            timePicker.setButton (DialogInterface.BUTTON_POSITIVE, "AYARLA", timePicker)
            timePicker.setButton (DialogInterface.BUTTON_NEGATIVE, "İPTAL", timePicker)

            timePicker.show()
        }

        binding.editTextTarih.setOnClickListener {
            val calendar = Calendar.getInstance()
            val yil = calendar.get(Calendar.YEAR)
            val ay = calendar.get(Calendar.MONTH)
            val gun = calendar.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@MainActivity , DatePickerDialog.OnDateSetListener{datePicker, y, a , g ->
                binding.editTextTarih.setText("$g/${a+1}/$y")//sistem ayı bir eksik gösteriyor bu yüzden bir ekledik
            },yil , ay, gun)

            datePicker.setTitle("Tarih Seçiniz")
            datePicker.setButton (DialogInterface.BUTTON_POSITIVE, "AYARLA" , datePicker)
            datePicker.setButton (DialogInterface.BUTTON_NEGATIVE, "İPTAL" , datePicker)

            datePicker.show()
        }

    }
}