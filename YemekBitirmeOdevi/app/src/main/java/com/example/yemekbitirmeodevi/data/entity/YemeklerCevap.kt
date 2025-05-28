package com.example.yemekbitirmeodevi.data.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class YemeklerCevap (
    @SerializedName("yemekler")
    @Expose var yemekler: List<Yemekler>,
    @SerializedName("success")
    @Expose var success: Int
) {
}