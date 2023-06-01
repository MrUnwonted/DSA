package com.recursion;

import java.util.Scanner;

public class FirstRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        recursiveMethod(n);
    }

//    Stack memory holds the next to take place
    static void recursiveMethod(int n) {
        if (n<1){
            System.out.println("n is less than  1");
        }
        else {
            recursiveMethod(n - 1);
            System.out.println(n);
        }
    }
}
