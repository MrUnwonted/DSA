package com.recursion;

import java.util.Scanner;

public class SumR {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        System.out.println(Summ(num));
    }

    static int Summ(int num){
        if (num<=0){
            return 0;
        }
        return num + Summ(num -1);
    }
}
