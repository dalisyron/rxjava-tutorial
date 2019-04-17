package com.cafebazaar.rxjava

import android.app.Application

class RxJavaApp : Application() {

    override fun onCreate() {
        super.onCreate()

        instance = this
    }

    companion object {
        lateinit var instance: RxJavaApp
    }
}