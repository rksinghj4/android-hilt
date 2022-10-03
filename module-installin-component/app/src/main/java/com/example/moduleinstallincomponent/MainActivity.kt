package com.example.moduleinstallincomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Named("Firebase")
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