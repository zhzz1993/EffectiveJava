package com.io;

import java.io.*;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-05-05 11:59
 */
public class IOBug {
    public static void main(String[] args)
            throws Exception {
        DataOutputStream out =
                new DataOutputStream(
                        new BufferedOutputStream(
                                new FileOutputStream("Data.txt")));
        out.writeDouble(3.14159);
        out.writeBytes("That was the value of pi\n");
        out.writeBytes("This is pi/2:\n");
        out.writeDouble(3.14159 / 2);
        out.close();
        DataInputStream in =
                new DataInputStream(
                        new BufferedInputStream(
                                new FileInputStream("Data.txt")));
        BufferedReader inbr =
                new BufferedReader(
                        new InputStreamReader(in));
        // The doubles written BEFORE the line of text
        // read back correctly:
        System.out.println(in.readDouble());
        // Read the lines of text:
        System.out.println(in.readDouble());
        System.out.println(in.readDouble());
        System.out.println(in.readDouble());
        System.out.println(inbr.readLine());
        System.out.println(inbr.readLine());
        // Trying to read the doubles after the line
        // produces an end-of-file exception:
    }
}
