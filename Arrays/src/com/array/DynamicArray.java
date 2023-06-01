package com.array;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(1);arrayList.add(2);arrayList.add('3');arrayList.add(5);
        arrayList.add('s');


        for (Object a : arrayList) {
            System.out.println(a);
        }
    }
}
