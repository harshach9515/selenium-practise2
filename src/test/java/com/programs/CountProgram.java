package com.programs;

public class CountProgram {
    public static void main(String[] args) {

        CountProgram obj = new CountProgram();

        int count = obj.count("Java");
        System.out.println("Number: " + count);
    }
    public int count(String text) {

        int length = text.length();
        return length;

    }
}