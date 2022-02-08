package com.zahideaksak.retrofitkotlin.model

import com.google.gson.annotations.SerializedName

data class CryptoModel(
    //bir tane deger gelecek, parametresi currency olacak onu al buradaki currency isimli degiskene ata demek
    //@SerializedName("currency")
    val currency : String,
    //@SerializedName("price")
    val price : String
    )