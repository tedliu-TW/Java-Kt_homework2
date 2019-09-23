package com.ted2.Student

import student.Student
import  java.util.*

fun main() {
   // userInput()
    Stuednt.pass=50
    val stu = Stuednt("Hank",60,99)
    val stu1 = Stuednt("Han",44,68)
    val stu2 = Stuednt("ank",30,49)
    val gstu = GraduateStudent("jack",55,65,60)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()

    val test=123
    println("test is : $test")
    println("High score: ${stu.highest()}")



}
//kt
class GraduateStudent(name: String?,english: Int,math: Int,var thesis:Int) : Stuednt(name,english,math){  //kt super father function
    companion object{
        var pass=70
    }

    //ovrride
    override fun print() {
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }

    override fun passOrFailed()=if(getAverage()>=pass) "PASS" else "FAILED"
}




open class Stuednt( var name:String?,var english:Int,var math:Int){  //open = java public  no open = private
    //kt static companion object
    companion object{
        @JvmStatic //for java use
        var pass = 60
        fun  test(){
            println("testing")
        }
    }
    open fun print(){
       println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}")
    }
    fun grading()=when(getAverage()){
        in 90..100 ->'A'
        in 80..89 ->'B'
        in 70..70 ->'C'
        in 60..60 ->'D'
        else ->'F'

    }

    open fun passOrFailed()=
        if(getAverage()>=pass) "PASS" else "FAILED"

    fun getAverage() =(english+math)/2
    fun highest()=if(english>math){
        print("english")
        english
    }else{
        println("math")
        math
    }











}
private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enger student name")
//    var name = scanner.next()
    var name = null


    print("Please enger student english")
    var english = scanner.nextInt()
    print("Please enger student math")
    var math = scanner.nextInt()
    val stu = Stuednt(name, english, math)
    stu.print()
}





