package com.ted2

import java.util.*

fun main() {
    val secret = Random().nextInt(10)+1
    println(secret)

    val scanner=Scanner(System.`in`);
    var number =0
    while (number !=secret) {
        println("please enter number");
//        var number = scanner.nextInt()
        number = readLine()!!.toInt()

        if(number > secret){
            println("lower")
        }else if(number<secret)
        {
            println("higher")
        }else{
            println("Great, the number is $number")

        }

    }


}
