package com.ted2


import java.util.*

//data class
data class Tieckt(val origin:Int,val destination:Int,val price:Int)
//kt Extensions


fun main(args: Array<String>) {
    var tieckt=Tieckt(20,51,420)
    val s = "abcdefg"
    println(s.validate())
    println((1..10).random())
    val r = Random().nextInt(10)+1



}
//kt Extensions function
fun String.validate():Boolean{
    return  this.length>=6
}
//kt Extensions function
fun IntRange.random():Int{
    val r= Random().nextInt(endInclusive-start)+start
    return r
}
