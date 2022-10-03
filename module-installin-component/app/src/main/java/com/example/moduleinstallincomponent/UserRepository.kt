package com.example.moduleinstallincomponent

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String, from: String)
}

@Singleton //Now only single object will be used where ever we inject it.
class SQLRepository @Inject constructor():  UserRepository {
    override fun saveUser(email: String, password: String, from: String) {
        Log.d(TAG, "From $from User saved in DB")
    }
}

class FirebaseRepository: UserRepository  {
    override fun saveUser(email: String, password: String, from: String) {
        Log.d(TAG, "From $from User saved in Firebase")
    }
}