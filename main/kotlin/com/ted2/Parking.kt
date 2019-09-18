package com.ted2

import java.time.LocalDateTime
import java.time.Duration

fun main(args: Array<String>) {
    val enter:LocalDateTime= LocalDateTime.of(
        2019,1,1,9,0,0
    )
    val leave :LocalDateTime= LocalDateTime.of(
        2019,1,1,12,8,0
    )
    var car = Car("AAA-99991",enter)
    car.leave = leave

    println(car.duration())
    val hours =Math.ceil(car.duration()/60.0) .toLong()
    println(hours)



}

class Car(val id:String,val enter:LocalDateTime){
    var leave:LocalDateTime?=null;
//    set(value){
//        if(enter.isBefore(value)){
//            field =value;
//        }
//    }
    fun duration ()=Duration.between(enter,leave).toMinutes()







}