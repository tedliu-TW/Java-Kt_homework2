package com.ted1.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
    Set<Integer> number = new HashSet<>();
     int numberCount = 0 ;
     public abstract void generate();
     public boolean validate(){
         if(number.size()==numberCount)
         return  true;
         else
             return false;
     }



}
