package com.cafebazaar.rxjava

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import io.reactivex.Observable

object CountriesDataSource {

    fun all(): Observable<Country> {
        return Observable.create { emitter ->
            val countryList = readFromResources()
            countryList.forEach {
                emitter.onNext(it)
            }
            emitter.onComplete()
        }
    }

    private fun readFromResources(): List<Country> {
        val rawCountries = MyApp.instance.resources.openRawResource(R.raw.countries)
            .bufferedReader()
            .use {
                it.readText()
            }
        val listType = object : TypeToken<List<Country>>() {}.type
        return Gson().fromJson<List<Country>>(rawCountries, listType)
    }
}