package com.example.kisileruygulamasi.ui.viewmode

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerDaoRepository

class KisiDetayViewModel: ViewModel() {
    val krepo = KisilerDaoRepository()

    fun guncelle(kisi_id : Int,kisi_ad: String, kisi_tel: String){
        krepo.kisiGuncelle(kisi_id,kisi_ad,kisi_tel)
    }
}