package com.ted1.ted.guess;

import java.util.Random;
import java.util.Scanner;

public class gamefor {
    public static void main(String[] args) {
//        int sum = 0;
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }
//        System.out.println(sum);


//        for (int i=1;i<=3;i++){
//            System.out.println(i);
//        }

        int secret =new Random().nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=4; i++){
            System.out.println("Please enter number:("+i+"/4)");
            int number =scanner.nextInt();
            System.out.println("It"+i+"times"+number);

            if(number>secret){
                System.out.println("lower");
            }else if(number<secret){
                System.out.println("higher");
            }else{
                System.out.println("Great the number is = "+number);
                break;
            }
        }
        System.out.println("game over");
    }


}
