package com.ted1.ted.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret  = random.nextInt(10)+1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        int number =0;

        while (number!=secret){
            System.out.print("please enter a number");
            number =scanner.nextInt();
            if(number<secret){
                System.out.println("heighter");
            }else if (number>secret){
                System.out.println("lower");
            }
            else{
                System.out.println("Great, The number is "+number);
            }

        }



    }
}
