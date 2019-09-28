package com.ted1.Thread;

public class Tester {
    public static void main(String[] args) {
        //10.for +tab
        //thread
        for (int i = 0; i < 10; i++) {
            System.out.println("main:"+i);
        }
        //ctrl+ o ovrride run fun
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread:"+i);
                    try {
                        sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        thread.start();
        //myThread
        MyThread myThread = new MyThread();
        myThread.start();
        //Runnable
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Runnable:"+i);
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };


        Thread r =new Thread(runnable);
        r.start();
        //Runanble-Lambda
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("Runnable lambda:"+i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();





        System.out.println("main end");



    }
}

class  MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+":"+i);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
