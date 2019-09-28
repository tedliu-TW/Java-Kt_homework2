package com.ted2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    //kt Thread
    Thread({
        for (i in 1..10){
            println("Thread:${i}")
            Thread.sleep(50)
        }

    }).start()

    // always use thread
    thread{
        for (i in 1..10){
            println("thread() ${i}")
            Thread.sleep(50)
        }
    }

    //kt Thread
    GlobalScope.launch {
        for (i in 1..10){
            println("Coroutines: ${i}")
            delay(50L)
        }




    }


}
