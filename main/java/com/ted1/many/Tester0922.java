package com.ted1.many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester0922 {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list);
        int n1 = list.get(0);
        int n2 = list.get(1);
        System.out.println(list.size());
        List<Integer> scores = Arrays.asList(68,88,77,99,50);
        for (int n :scores) {
            System.out.println(scores);
        }







        //      arrayTest();
    }
    private static void arrayTest() {
        int[] numbers =new int[5];
        numbers[0]=5;
        numbers[1]=1;
        // numbers[5]=7;
        int[] scores={68,88,77,99,50};
        System.out.println(scores);
        for (int i =0;i<5;i++){
            System.out.println(scores[i]);
        }
        //foreach
        for (int n:scores) {
            System.out.println(n);
        }
    }
}
