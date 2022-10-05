package com.example.mvvmretrofitcoroutine.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmretrofitcoroutine.db.FakerDB
import com.example.mvvmretrofitcoroutine.models.Product
import com.example.mvvmretrofitcoroutine.retrofit.FakerAPI
import javax.inject.Inject

class ProductRepository @Inject constructor(private val fakerAPI: FakerAPI, private val fakerDB: FakerDB) {

    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>>
        get() = _products

    suspend fun getProducts(){
        val result = fakerAPI.getProducts()
        if(result.isSuccessful && result.body() != null){
            fakerDB.getFakerDAO().addProducts(result.body()!!)//Save in db first
            _products.postValue(result.body()) //Then post data to livedata
        }
    }

}