package com.example.marinapera.sensorkids

import android.content.Context
import android.content.SharedPreferences

//
// Created by MARINA on 20/03/2019.
//
class Prefs (context: Context){
    val FIRST_TIME = "isFirstTime"
    val NAME_PROFILE_DEF = "nameProfileDefault"
    val prefs: SharedPreferences = context.getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

    var firstTimeState: Boolean
        get() = prefs.getBoolean(FIRST_TIME, true)
        set(value) = prefs.edit().putBoolean(FIRST_TIME, value).apply()

    var profile: String
        get() = prefs.getString(NAME_PROFILE_DEF, "Marina")
        set(value) = prefs.edit().putString(NAME_PROFILE_DEF,value).apply()
}