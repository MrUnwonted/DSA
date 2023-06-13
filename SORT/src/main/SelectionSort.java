package main;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {3,4, 2, 1, 6, 7};

        for (int i = 0; i < arr.length ; i++) {
            int small = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[small]>arr[j]){
                    small = j;
                }
                int temp = arr[i];
                arr[i] = arr[small];
                arr[small] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
