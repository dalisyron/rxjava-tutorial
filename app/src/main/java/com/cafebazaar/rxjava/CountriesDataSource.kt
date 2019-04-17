package com.cafebazaar.rxjava

import io.reactivex.Observable

object CountriesDataSource {

    fun all(): Observable<Country> {
        val text = RxJavaApp.instance.resources.openRawResource(R.raw.countries)
            .bufferedReader()
            .use {
                it.readText()
            }
    }
}