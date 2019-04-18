package com.cafebazaar.rxjava

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class MainActivity : AppCompatActivity() {

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CountriesDataSource.all()
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())
            .flatMapIterable { country -> country.currency!! }
            .distinct()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    println(it)
                }, {
                    println(it)
                }
            )
    }
}
