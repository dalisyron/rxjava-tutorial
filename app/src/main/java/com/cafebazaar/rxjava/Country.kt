package com.cafebazaar.rxjava

data class Country(
    val altSpellings: List<String?>?,
    val area: Double?,
    val borders: List<Any?>?,
    val callingCode: List<String?>?,
    val capital: List<String?>?,
    val cca2: String?,
    val cca3: String?,
    val ccn3: String?,
    val cioc: String?,
    val currency: List<String?>?,
    val demonym: String?,
    val flag: String?,
    val independent: Boolean?,
    val landlocked: Boolean?,
    val languages: Languages?,
    val latlng: List<Double?>?,
    val name: Name?,
    val region: String?,
    val status: String?,
    val subregion: String?,
    val tld: List<String?>?
)

data class Languages(
    val nld: String?,
    val pap: String?
)

data class Nld(
    val common: String?,
    val official: String?
)

data class Name(
    val common: String?,
    val native: Native?,
    val official: String?
)

data class Native(
    val nld: Nld?,
    val pap: Pap?
)

data class Pap(
    val common: String?,
    val official: String?
)