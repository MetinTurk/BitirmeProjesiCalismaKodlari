package com.example.mvvmkullanimi

import androidx.lifecycle.MutableLiveData

class MatematikRepository {
    var matematikselSonuc = MutableLiveData<String>()

    init {
        matematikselSonuc = MutableLiveData<String>("0")
    }

    fun matematikselSonucGetir(): MutableLiveData<String>{
        return matematikselSonuc
    }

    fun topla(alinanSayi1: String,alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val toplam = sayi1 + sayi2
        matematikselSonuc.value = toplam.toString()
    }
    fun carp(alinanSayi1: String,alinanSayi2: String){
        val sayi1 = alinanSayi1.toInt()
        val sayi2 = alinanSayi2.toInt()

        val carpma = sayi1 * sayi2
        matematikselSonuc.value = carpma.toString()
    }
}