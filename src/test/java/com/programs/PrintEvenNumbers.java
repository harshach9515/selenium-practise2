package com.programs;

public class PrintEvenNumbers {
    public static void main(String[] args){
        PrintEvenNumbers obj = new PrintEvenNumbers();
        obj.printEvenNumbers();

    }
    public void printEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
