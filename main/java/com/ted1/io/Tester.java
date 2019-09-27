package com.ted1.io;

import java.io.*;

public class Tester {
    public static void main(String[] args) {
        //inputeream();
        //filereader();
        try {
            BufferedReader br =new BufferedReader(new FileReader("data.txt"));
            try {
                String line = br.readLine();
                while(line!=null){
                    System.out.println(line);
                    line=br.readLine();
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        };

    }

    private static void filereader() {
        try {
            FileReader fr = new FileReader("data.txt");
            try {
                int n  = fr.read();
                while(n!=-1){
                    System.out.print((char)n);
                    n=fr.read();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void inputeream() {
        File file = new File("data.txt");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        //InputStream top io
        try {
            InputStream is = new FileInputStream(file);
            int n = is.read();
            while(n!=-1){
                System.out.println((char)n);
                n = is.read();
            }



//            System.out.println(n);
//            System.out.println(is.read());
//            System.out.println(is.read());
//            System.out.println(is.read());
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");

        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("File open success");
    }

}
