package com.example.constructorandfieldinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        //Once super.onCreate() will be called
        // required dependencies will be injected
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        userRepository.saveUser("test@abc.com", "1111", "MainActivity")
    }
}