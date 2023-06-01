package com.basics;

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        System.out.println(isArmstrong(a));
    }

    static boolean isArmstrong(int n) {
        int num = n;
        int sum = 0;
        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += Math.pow(rem, digits);
        }

        return (sum == num);
    }
}
