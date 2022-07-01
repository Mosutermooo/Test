package com.example.texts

fun main(){

    var Person: Person = Person("denis", "penjuta")
    var Person2: Person = Person("Martin", "Slezenkovski")

    Person.speak("nice jacket")
    Person.Work("Programing", false)

    Person2.speak("nice mom")
    Person2.Work("Doing ur mom", true)

}

class Person(var name:String, var Lastname: String){

    init {
        println("$name is born")
    }

    fun speak(word: String): String{
        val speak = println("$name is speaking $word")
        return speak.toString()
    }

    fun Work(work: String, isWorking: Boolean){
        if(isWorking){
            println("$name is working $work")
        }
        else{
            println("$name is not working")
        }
    }




}