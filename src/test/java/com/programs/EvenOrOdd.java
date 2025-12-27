package com.programs;

public class EvenOrOdd {
    public static void main(String[] args) {

        EvenOrOdd obj = new EvenOrOdd();

        String result = obj.number(7);
        System.out.println(result);
    }
    public String number(int num) {

        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }

    }
}
