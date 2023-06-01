package com.recursion;

import java.util.Scanner;

public class SumofPositiveR {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        System.out.println(SumR(num));
}

    static int SumR(int num) {
    if (num == 0 || num < 0){
        return 0;
    }
        return num%10 + SumR(num/10);
    }
    }
