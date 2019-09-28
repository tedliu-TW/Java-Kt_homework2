package com.ted1.io;

import java.io.FileWriter;
import java.io.IOException;

public class WriterTester {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("G:\\TestProject\\output.txt");
        fw.write("abc");
        fw.flush();
        fw.close();
    }


}
