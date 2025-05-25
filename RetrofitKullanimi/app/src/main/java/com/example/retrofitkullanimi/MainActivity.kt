package com.example.retrofitkullanimi

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //kisiSil()
        //kisiEkle()
        tumKisiler()

    }

    fun kisiSil(){
        val kdi= ApiUtils.getKisilerDaoInteface()

        kdi.kisiSil(18905).enqueue(object : Callback<CRUDCevap>{
            override fun onResponse(call: Call<CRUDCevap?>, response: Response<CRUDCevap?>) {

                if(response != null){
                    Log.e("Başarı", response.body()!!.success.toString())
                    Log.e("Mesaj",response.body()!!.message)
                }

            }

            override fun onFailure(call: Call<CRUDCevap?>, t: Throwable) {

            }
        })
    }

    fun kisiEkle(){
        val kdi= ApiUtils.getKisilerDaoInteface()

        kdi.kisiEkle("ahmet" , "9999999").enqueue(object : Callback<CRUDCevap>{
            override fun onResponse(call: Call<CRUDCevap?>, response: Response<CRUDCevap?>) {

                if(response != null){
                    Log.e("Başarı", response.body()!!.success.toString())
                    Log.e("Mesaj",response.body()!!.message)
                }

            }

            override fun onFailure(call: Call<CRUDCevap?>, t: Throwable) {

            }
        })
    }

    fun tumKisiler(){
        val kdi = ApiUtils.getKisilerDaoInteface()

        kdi.tumKisiler().enqueue(object : Callback<KisilerCevap>{
            override fun onResponse(call: Call<KisilerCevap?>, response: Response<KisilerCevap?>) {
                if(response != null){

                    val kisilerListe = response.body()!!.kisiler

                    for(k in kisilerListe){
                        Log.e("Kişi id", k.kisiId.toString())
                        Log.e("Kişi ad", k.kisiAd.toString())
                        Log.e("Kişi tel", k.kisiTel.toString())
                    }


                }
            }

            override fun onFailure(call: Call<KisilerCevap?>, t: Throwable) {

            }
        })
    }
}