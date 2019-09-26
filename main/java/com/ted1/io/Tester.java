package com.ted1.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Tester {
    public static void main(String[] args) {
        File file = new File("data.text");
        System.out.println(file.exists());
        System.out.println(file.getAbsolutePath());
        //InputStream top io
        try {
            InputStream is = new FileInputStream(file);
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("message");

        }



    }

}
