package com.method;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: zhuzz
 * @date: 2019-05-30 19:51
 */
public class ShowMethods {
    static final String usage =
            "usage: \n" +
                    "ShowMethods qualified.class.name\n" +
                    "To show all methods in class or: \n" +
                    "ShowMethods qualified.class.name word\n" +
                    "To search for methods involving 'word'";

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println(usage);
            System.exit(0);
        }
        try {
            Class c = Class.forName(args[0]);
            Method[] m = c.getMethods();
            Constructor[] ctor = c.getConstructors();
            if (args.length == 1) {
                for (Method aM : m) {
                    System.out.println(aM.toString());
                }
                for (Constructor aCtor : ctor) {
                    System.out.println(aCtor.toString());
                }
            } else {
                for (Method aM : m) {
                    if (aM.toString().contains(args[1])) {
                        System.out.println(aM.toString());
                    }
                }
                for (Constructor aCtor : ctor) {
                    if (aCtor.toString().contains(args[1])) {
                        System.out.println(aCtor.toString());
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
    }
}
