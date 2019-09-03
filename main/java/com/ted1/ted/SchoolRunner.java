package com.ted1.ted;


import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        System.out.println("please enter student's name");
        Scanner scanner =new Scanner(System.in); //user import value
        String name=scanner.next();
        System.out.println("please enter student's english");
        int english =scanner.nextInt();
        System.out.println("please enter student's math");
        int math =scanner.nextInt();

        Student stu = new Student(name,english,math);
        stu.print();




    }
}
