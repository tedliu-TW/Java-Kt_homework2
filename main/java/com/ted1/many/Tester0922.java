package com.ted1.many;

import java.util.*;

public class Tester0922 {
    public static void main(String[] args) {
        //Map
        HashMap<String,String> stocks =
                new HashMap<>();

            stocks.put("2330","TSMC");
            System.out.println( stocks.get("2330"));
            System.out.println(stocks);
            for (String key : stocks.keySet()){
                System.out.println(stocks.get(key));

        }







        // set();
        // List();
        // arrayTest();
    }

    private static void set() {
        //set
        HashSet<Integer> set = new HashSet<>();
        set.add(6);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(5);
        System.out.println(set);
        for (int n :set) {
            System.out.println(n);
        }
    }

    private static void List() {
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
