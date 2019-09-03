package com.ted1.ted;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) { //alt+ Ins
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print(){
        System.out.println(name + "\t"+english +"\t"+math+"\t"+(math+english)/2);
    }




}
