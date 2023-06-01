package com.array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {8,9,19,28,34,20,22,43};

        int start = 0;
        int end = arr.length-1;
        int value = 28;
        int middle = (start+end)/2;

        while (arr[middle]!=value && start<=end){
                if (value<arr[middle]){
                    end = middle - 1;
                }else {
                    start = middle + 1;
                }
                middle = (start+end)/2;
        }

        if (arr[middle] == value){
            System.out.println("The element is found at index:" + " " +(middle+1));
        }else {
            System.out.println("The element not found");
        }

    }
}
