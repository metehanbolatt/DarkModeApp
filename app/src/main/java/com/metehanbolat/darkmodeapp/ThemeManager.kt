package com.metehanbolat.darkmodeapp

import androidx.appcompat.app.AppCompatDelegate
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ThemeManager @Inject constructor() {

    fun setUITheme(isLight: Boolean) {
        if (isLight) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }
}