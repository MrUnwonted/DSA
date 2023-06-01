package com.recursion;

import java.util.Scanner;

public class FactorialR {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        System.out.println(factorial(num));
    }


    //Recursion in 3 steps
     static int factorial(int n) {
        //base condition/case
        if (n < 1) {
            return 1;
        }
        return n * factorial(n-1); //recursive method/case
//         Using stack method to run everytime.
//         n * factorial(n-1) = 4 * 3
    }
}
