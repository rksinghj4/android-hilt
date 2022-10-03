package com.example.moduleinstallincomponent

import javax.inject.Inject
import javax.inject.Singleton

@Singleton //Now only single object will be used whereever we inject it.
class UserRepository @Inject constructor(val loggerService: LoggerService){
    fun saveUser(email: String, password: String, from: String) {
        loggerService.log("From $from User saved in DB")
    }
}