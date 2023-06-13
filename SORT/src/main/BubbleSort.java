package main;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        int[] arr= {3,4, 2, 1, 6, 7};

        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
             if (arr[i]>arr[j]) {
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;
             }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
