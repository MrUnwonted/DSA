package main;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {4,5,1,2,9,3};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion(int[] arr) {
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i + 1 ; j > 0; j--) {
                    if (arr[j]<arr[j-1]){
//                        swap(arr,j,j-1);
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]= temp;
                }
                    else
                        break;
            }

        }
    }

    static void swap(int[] arr,int num,int swapNum){
        int temp = arr[num];
        arr[num] = arr[swapNum];
        arr[swapNum] = temp;
    }
}
