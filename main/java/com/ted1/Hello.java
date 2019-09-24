package com.ted1;


import com.ted2.Stuednt;

public class Hello {
    public static void main(String[] args) {
        Stuednt stu = new Stuednt("tom",1,5);



        String s ="abcdefg";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1,3));



    Person p =new Person(66.5f,1.7f);
    p.hello();;
    p.weight=66.5f;
    p.height=1.7f;
    System.out.println(p.bmi());

    }
}
