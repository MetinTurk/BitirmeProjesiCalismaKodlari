package com.example.kisileruygulamasi.ui.viewmode

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.entity.Kisiler
import com.example.kisileruygulamasi.data.repo.KisilerDaoRepository

class AnasayfaViewModel: ViewModel() {
    val krepo = KisilerDaoRepository()
    var kisilerListesi = MutableLiveData<List<Kisiler>>()

    init {
        kisileriYukle()
        kisilerListesi = krepo.kisileriGetir()
    }



    fun ara(aramaKelimesi: String){
        Log.e("Kişi Ara", aramaKelimesi)
    }

    fun sil(kisi_id: Int){
        krepo.kisiSil(kisi_id)
    }

    fun kisileriYukle(){
        krepo.tumKisileriAl()
    }

}