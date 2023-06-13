package com.array;
//Insertt elem into post at given index
public class InsertionC {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,10};
        int pos = 3;
        int value = 6;

//         insert(pos,value);
        for (int i = 0; i < arr.length; i++){
            if(pos == i){
                int temp = arr[i];
                arr[i] = value;
                arr[i+1] = temp;
            }
        }

//        Print
        for (int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

//    private static void insert(int pos, int value) {
//        for (i=0;i,arr.length)
//    }


}
