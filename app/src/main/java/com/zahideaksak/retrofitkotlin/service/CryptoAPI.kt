package com.zahideaksak.retrofitkotlin.service

import com.zahideaksak.retrofitkotlin.model.CryptoModel
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET, POST, UPDATE, DELETE

    //https://github.com/
    // atilsamancioglu/K21-JSONDataSet/blob/master/crypto.json

    //https://api.nomics.com/v1/
    //prices?key=180fdc8f6a9fab1ce69e0bc2668388cd314f8567

    //Bana su adresten bir GET islemi yap, bu islemde getData adinda bir fonk tanımlıyoruz,
    // bu getData cagirildiginda bir Call islemi yapilacak ve geri donen sey CryptoModel olacak ve liste halinde gelecek.
    @GET("prices?key=180fdc8f6a9fab1ce69e0bc2668388cd314f8567")
    fun getData() : Call<List<CryptoModel>>

}