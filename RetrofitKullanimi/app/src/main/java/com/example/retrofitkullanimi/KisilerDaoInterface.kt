package com.example.retrofitkullanimi

import retrofit2.Call
import retrofit2.Callback
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface KisilerDaoInterface {

    @POST("kisiler/delete_kisiler.php")
    @FormUrlEncoded
    fun kisiSil(@Field("kisi_id") kisi_id: Int): Call<CRUDCevap>

    @POST("kisiler/insert_kisiler.php")
    @FormUrlEncoded
    fun kisiEkle(@Field("kisi_ad") kisi_ad: String , @Field("kisi_tel") kisi_tel: String): Call<CRUDCevap>

    @GET("kisiler/tum_kisiler.php")
    fun tumKisiler(): Call<KisilerCevap>
}