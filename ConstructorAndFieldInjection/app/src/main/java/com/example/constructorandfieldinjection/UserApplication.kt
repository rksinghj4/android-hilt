package com.example.constructorandfieldinjection

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class UserApplication: Application() {
    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreate() {
        //Once super.onCreate() will be called
        // required dependencies will be injected
        super.onCreate()
        userRepository.saveUser("test@abc.com", "1111",  "UserApplication")
    }
}