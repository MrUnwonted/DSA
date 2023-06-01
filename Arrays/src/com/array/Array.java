package com.array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String arr[] = {"a","b","c"};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

        System.out.println("For loop");
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("Search");
        for (int i =0; i<arr.length; i++){
            if (arr[i] == "b"){
                System.out.println("Search found at" + " " + (i+1));
            }
        }
    }
}
