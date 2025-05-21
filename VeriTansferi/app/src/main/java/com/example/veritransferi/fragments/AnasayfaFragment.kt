package com.example.veritransferi.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.veritransferi.R
import com.example.veritransferi.data.Kisiler
import com.example.veritransferi.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim  : FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)
        tasarim.buttonBasla.setOnClickListener {
            val kisi = Kisiler(1 , "Sila")
            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis(kisi , "Metin" , 19 , 1.86f , false)

            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}