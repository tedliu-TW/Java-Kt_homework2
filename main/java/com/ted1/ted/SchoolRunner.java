package com.ted1.ted;


import com.ted2.Student.Stuednt;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
    //    userInput();
        Student.pass=50;


        Student stu = new Student("ted",97,10);
        Student stu2 = new Student("tom",60,40);
        Student stu3 = new Student("hank",30,55);

        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("Heigh score"+stu.highest());

    }

    private static void userInput() {
        System.out.println("please enter student's name");
        Scanner scanner =new Scanner(System.in); //user import value
        String name=scanner.next();
        System.out.println("please enter student's english");
        int english =scanner.nextInt();
        System.out.println("please enter student's math");
        int math =scanner.nextInt();

        Student stu = new Student(name,english,math);
        stu.print();
        System.out.println("High score:"+stu.highest());
    }
}
