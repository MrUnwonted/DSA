package com.array;

public class PalindromeS {
    public static void main(String[] args) {
        String str1 = "level";
        String str2 = "hello";

        System.out.println(isPalindrome(str1)); // Output: true
        System.out.println(isPalindrome(str2)); // Output: false

    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() -1;

        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
