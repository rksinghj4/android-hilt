package com.example.moduleinstallincomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

/**
 * If you annotate an Android class with @AndroidEntryPoint,
 * then you also must annotate Android classes that depend on it(MainActivity).
 */
@AndroidEntryPoint
class MainFragment : Fragment() {
    //Once dependent activity's super.onCreate() will be called
    // required dependencies will be injected
    @SQLQualifier
    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        userRepository.saveUser("test@abc.com", "1111", "MainFragment")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
}