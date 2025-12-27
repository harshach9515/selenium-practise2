package com.programs;

public class PrintNumbersN {
    public static void main(String[] args) {

        PrintNumbersN obj = new PrintNumbersN();
        obj.printNumbers(10);
    }

    public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }
    }
}