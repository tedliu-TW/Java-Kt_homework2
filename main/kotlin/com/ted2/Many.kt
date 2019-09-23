package com.ted2

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String,Car?>()

    var enter = LocalDateTime.of(2018,12,25,8,0,0)
    var car:Car?  = Car("AAA-0001",enter)
    parkingLot.put(car!!.id,car)

    car= Car("BBB-0002",enter.plusMinutes(15))
    parkingLot.put(car.id,car)
    //car1 Leaving
    var leave    = LocalDateTime.of(2018,12,25,9,0,0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    //car2 Leaving
    car = parkingLot.get("BBB-0002")
    car?.leave=leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)








//    val list= listOf(5,1,2,7)
//    println(list)
//    val scores = listOf(68,88,77,90,50)
//    //kt no foreach
//    for(score in scores){
//        println(score)
//    }
//    println(list.get(2))
//    //kt list MutableList<Int>  can use add function
//    var mutableList = mutableListOf(5,12,4,5,6)
//    mutableList.add(6)
//    println(mutableList)


    //kt  list can't change
    //kt  can use get  list.get








}


