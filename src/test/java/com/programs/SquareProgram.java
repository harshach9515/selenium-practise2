package com.programs;

public class SquareProgram {
    public static void main(String[] args) {

        SquareProgram obj = new SquareProgram();

        int result = obj.square(5);
        System.out.println("Square: " + result);
    }
    public int square(int num) {
        int square = num * num;
        return square;
    }
}
