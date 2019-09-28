package com.ted2

import java.io.File

fun main(args: Array<String>) {
//    File("output.txt").writeText("abc123")
     //kt write file
//      File("output.txt").printWriter().use {
//          it.println("1st line")
//          it.println("2st line")
//          it.println("3st line")
//
//      }
//    writeTest()
        File("data.txt").bufferedReader().lines().forEach {
            println(it)

        }







}

private fun writeTest() {
    File("output.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2st line\n")
        it.write("3st line\n")

    }
}