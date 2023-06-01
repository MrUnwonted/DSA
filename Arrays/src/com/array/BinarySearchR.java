package com.array;



public class BinarySearchR {

    public static int binarySearch(int arr[], int value, int start, int end){
        if (start>end){
            return -1;
        }
        int mid = (start+end)/2;
        if (arr[mid] == value){
            return mid;
        } else if (value < arr[mid]) {
            return binarySearch(arr,value,start,mid-1);
        }else {
            return binarySearch(arr,value,mid+1,end);
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int value = 16;

        int result = binarySearch(arr, value, 0, arr.length - 1);

        if (result == -1) {
            System.out.println("Target not found");
        } else {
            System.out.println("Target found at index " + result);
        }
    }
}
