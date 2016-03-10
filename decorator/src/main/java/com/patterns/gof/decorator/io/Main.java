package com.patterns.gof.decorator.io;

import java.io.*;

/**
 * Created by anni0913 on 10.03.2016.
 */
public class Main {
    public static void main(String args[]) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("decorator/src/main/resources/test.txt")));

        while ((c = in.read()) >= 0) {
            System.out.print((char)c);
        }
        in.close();
    }
}
