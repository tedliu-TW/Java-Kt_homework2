package com.ted1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    public void bmiTest(){
        Person a = new Person(66.5f,1.7f);
        Assertions.assertEquals(66.5f/(1.7f*1.8f),a.bmi());
    }



}
