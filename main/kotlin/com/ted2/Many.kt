package com.ted2

fun main(args: Array<String>) {
    val list= listOf(5,1,2,7)
    println(list)
    val scores = listOf(68,88,77,90,50)
    //kt no foreach
    for(score in scores){
        println(score)
    }
    println(list.get(2))
    //kt list MutableList<Int>  can use add function
    var mutableList = mutableListOf(5,12,4,5,6)
    mutableList.add(6)
    println(mutableList)


    //kt  list can't change
    //kt  can use get  list.get








}