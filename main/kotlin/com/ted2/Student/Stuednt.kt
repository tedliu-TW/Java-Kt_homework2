package com.ted2.Student
import  java.util.*

fun main() {
    val scanner =Scanner(System.`in`)
    print("Please enger student name")
    var name = scanner.next()
    print("Please enger student english")
    var english = scanner.nextInt()
    print("Please enger student math")
    var math = scanner.nextInt()






    val stu = Stuednt(name,english,math)
    stu.print()


}
class Stuednt( var name:String,var english:Int,var math:Int){
    fun print(){
        println(name+"\t"+english+"\t"+math+"\t"+(math+english)/2)
    }
}

