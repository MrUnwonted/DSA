package com.recursion;

import java.util.Scanner;

public class FibonacciR {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        System.out.println(fibonacci(num));
    }

    static int fibonacci(int num) {
        if (num < 0){
            return -1;
        }
//        if n == 0 - 0 will return or n == 1 - 1 will return
        if (num == 0 || num == 1){
            return num;
        }
//        Base condition
        return  fibonacci(num-1) + fibonacci(num-2);
    }
}
