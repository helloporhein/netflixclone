package com.example.netflixclone

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

open class MyApplication : Application() {
    override fun onCreate() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        super.onCreate()

        //try {
            //YoutubeDL.getInstance().init(this)
        //} catch (e: YoutubeDLException) {
        //}
    }
}
