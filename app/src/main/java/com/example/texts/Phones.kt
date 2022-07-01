package com.example.texts

import java.util.*
import kotlin.concurrent.schedule

fun main(){

    val userInput = readLine()
    if(userInput == "Call"){
        call()
    }
}

fun call(){
    val userPhoneClass = UserPhone()
    val callRequestPerson = readLine()
    val phone = userPhoneClass.getUserPhone()
    val model = userPhoneClass.getUserPhoneModel()
    PhoneActives(phone!!).SamsungPhone(model!!).call(callRequestPerson!!)
}

class UserPhone(){
    fun getUserPhone(): String? {
        return userPhone().brand
    }
    fun getUserPhoneModel(): String? {
        return userPhone().model
    }

    private fun userPhone(): Phones.SamsungPhone {
       return Phones().SamsungPhone(null, "Samsung", "A31")
    }

    fun addPhone(phone: String){

    }

}


class PhoneActives(private val phone: String){

    inner class SamsungPhone(private val samsungTypePhone: String){
        fun call(nameCalled: String){
            val randomValues = Random().nextBoolean()
            println("Calling $phone ${samsungTypePhone}...")
            if(!randomValues){
                declinedCall(nameCalled)
            }
            if(randomValues){
                answeredCall(nameCalled)
            }
        }

        private fun answeredCall(nameCalled: String) {
            Timer().schedule(5000){
                println("Answered: $nameCalled")
            }
        }
        private fun declinedCall(nameCalled: String){
            Timer().schedule(5000){
                println("Declined")
                println("1.Call Again")
                println("2.Log out")
                val option = readLine()
                if(option == "1") callAgainSamePerson(nameCalled) else call()
            }


        }


    }

    private fun callAgainSamePerson(nameCalled: String) {
        val userPhoneClass = UserPhone()
        val phone = userPhoneClass.getUserPhone()
        val model = userPhoneClass.getUserPhoneModel()
        PhoneActives(phone!!).SamsungPhone(model!!).call(nameCalled)
    }


}


class Phones (){

    inner class SamsungPhone( val osName: String? = null,
                              var brand: String? = null,
                              val model: String? = null){



    }
}