package com.example.marinapera.sensorkids

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_profile -> {
                nameProfile.setText(R.string.nameTitle)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_ecg -> {
                nameProfile.setText(R.string.navigation_title_ecg)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_temp -> {
                nameProfile.setText(R.string.navigation_title_temp)
                setContentView(R.layout.profile)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_settings -> {
                nameProfile.setText(R.string.navigation_title_settings)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
