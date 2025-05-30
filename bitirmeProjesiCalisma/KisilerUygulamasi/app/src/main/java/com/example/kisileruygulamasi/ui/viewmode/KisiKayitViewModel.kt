package com.example.kisileruygulamasi.ui.viewmode

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.kisileruygulamasi.data.repo.KisilerDaoRepository

class KisiKayitViewModel: ViewModel() {
    val krepo = KisilerDaoRepository()

    
    fun kayit(kisi_ad: String, kisi_tel: String){
        krepo.kisiKayit(kisi_ad,kisi_tel)
    }
}