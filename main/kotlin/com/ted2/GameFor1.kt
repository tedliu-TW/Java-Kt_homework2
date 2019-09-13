package com.ted2

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)

    val scanner = Scanner(System.`in`)
    for(i in 1..5){
        println("Please enter a number(${i}/4)")
        var number = scanner.nextInt()
        println("第${i}次 $number")
        if(number>secret){
            println("lower")
        }else if(number<secret){
            println("higter")
        }else{
            println("Great nubmer is ="+number)
            break;
        }



    }


}