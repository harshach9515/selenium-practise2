package com.programs;

public class SumTwoNumber {
    public static void main(String[] args) {

        SumTwoNumber obj = new SumTwoNumber();

        int result = obj.add(10, 20);
        System.out.println("Sum: " + result);
    }
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
