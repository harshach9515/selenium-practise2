package com.strings;

import java.util.Scanner;

public class PolindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        boolean result = isPalindrome(word);
        System.out.println("Palindrome: " + result);
    }

    public static boolean isPalindrome(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

}
