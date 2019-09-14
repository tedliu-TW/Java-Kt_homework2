package com.tom

import com.ted1.Person
import com.ted2.Human
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class PersonTest1{
    @Test
    fun bmiTest(){
        val human =Human(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())

    }
    @Test
    fun personbmiTest(){
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }

}
