package com.array;

import java.util.Arrays;

public class Majority {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int result = findMajo(arr);

        System.out.println(result);

    }

    static int findMajo(int[] arr) {
        int count = 0;
        int result = 0;
        int index = 0;
        for (int i = 0; i <arr.length ; i++) {
             count =0;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count ++;

                }
            }
            if (count>result){
                result= count;
                index =i;
            }
        }

        return  arr[index];
    }
}
