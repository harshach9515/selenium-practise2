package com.programs;

public class EvenAndOdd {
    public static void main(String[] args){
        EvenAndOdd obj = new EvenAndOdd();
        obj.evenOrOdd(9);
    }
    public void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
