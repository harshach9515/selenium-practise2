package com.programs;

public class StringProgram {


    public static void main(String[] args) {

        StringProgram obj = new StringProgram();

        obj.printString("Hello");
    }

    public void printString(String text) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(text);
        }
    }

}