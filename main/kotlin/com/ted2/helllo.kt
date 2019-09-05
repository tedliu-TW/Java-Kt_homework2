package com.ted2

fun main(args: Array<String>){
    var s:String?="abcde"
    s=null
    println(s?.length) //!!
    println(s?.get(3))
    println(s?.substring(3))



    val h = Human(weight = 66.5f,height = 1.7f)
    println(h.bmi())



}

class Human(var weight: Float , var height:Float){
    fun hello(){
        println("hello kotlin")
    }
    fun bmi():Float{
        val bmi =weight/(height*height)
        return  bmi

    }





}