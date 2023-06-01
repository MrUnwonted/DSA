package com.recursion;

public class BeforeRecursion {
    public static void main(String[] args) {
        System.out.println("Starting...");
        firstMethod();

    }

    static void firstMethod() {
        secondMethod();
        System.out.println("I am the first Method");
    }

    static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second Method");
    }

    static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third Method");
    }

    static void fourthMethod() {
        System.out.println("I am the forth Method");
    }
}
