package com.example.veritransferi.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.veritransferi.R
import com.example.veritransferi.databinding.FragmentOyunEkraniBinding


class OyunEkraniFragment : Fragment() {
    private lateinit var tasarim : FragmentOyunEkraniBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bundle: OyunEkraniFragmentArgs by navArgs()

        val gelenAd = bundle.ad
        val gelenYas = bundle.yas
        val gelenBoy = bundle.boy
        val gelenBekarMi = bundle.bekarMi
        val gelenNesne = bundle.nesne

        Log.e("Gelen Ad" , gelenAd)
        Log.e("Gelen Yas" , gelenYas.toString())
        Log.e("Gelen Boy" , gelenBoy.toString())
        Log.e("Gelen Bekar mı" , gelenBekarMi.toString())
        Log.e("Gelen Kisi no" , gelenNesne.kisi_no.toString())
        Log.e("Gelen Kisi ad" , gelenNesne.kisi_ad)

        val tasarim  = FragmentOyunEkraniBinding.inflate(inflater, container, false)
        tasarim.buttonBitir.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sonucEkraninaGecis)
        }

        return tasarim.root
    }

}