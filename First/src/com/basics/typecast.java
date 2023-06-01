package com.basics;

import java.util.Scanner;

public class typecast {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

//        int a = s.nextInt();
//        float f = s.nextFloat();
//
//        String ss = s.nextLine();
//
//
//        System.out.println(a);
//        System.out.println(f);
//        System.out.println(ss);

//    Cannot do this tyoe of conversion because String to int
//    String ss = (int)("snfjdanf");
//        System.out.println(ss);

        //Implicit type  casting
//        int a = 257;
//        byte b = (byte) a;
//
//        System.out.println(b); //1 is o/p (257 % 256 = 1)

        //Complete type is in it
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.56f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " " +(i/c) + " " +  (d*s));
        System.out.println(result);

    }
}
