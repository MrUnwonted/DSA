package com.recursion;

import java.util.Scanner;

public class PowerR {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int base = s.nextInt();
        System.out.println("Enter the power:");
        int exp = s.nextInt();
        int result = Power(base,exp);
        System.out.println(result);
    }

    static int Power(int base, int exp) {
        if ( exp < 0){
            return -1;
        }
        if (exp == 0 || exp == 1){
            return base;
        }
    return base * Power(base,exp -1);
    }
}
