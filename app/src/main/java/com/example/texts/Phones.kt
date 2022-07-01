package com.example.texts

fun main(){

    val SamsungPhone = Phones("Android", "Samsung", "A40")



}

open class Phones (osName: String, brand:String, model: String){

    init {
        println(osName)
        println(brand)
        println(model)
    }

    fun ring(){
        println("the phone is ringing")
    }

    open fun call(){
        var nameCalled: String? = null
        println("calling $nameCalled")
    }
}