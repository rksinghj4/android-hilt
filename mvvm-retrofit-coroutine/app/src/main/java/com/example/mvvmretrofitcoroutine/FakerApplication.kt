package com.example.mvvmretrofitcoroutine

import android.app.Application

//import com.example.mvvmretrofitcoroutine.di.ApplicationComponent
//import com.example.mvvmretrofitcoroutine.di.DaggerApplicationComponent

import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class FakerApplication : Application() {

    //lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        //applicationComponent = DaggerApplicationComponent.factory().create(this)
    }
}