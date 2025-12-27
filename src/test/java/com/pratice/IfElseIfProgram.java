package com.pratice;

public class IfElseIfProgram {
    public static void main(String[] args){
        int marks = 25;

        if (marks <= 15) {
            System.out.println("Grade A");
        } else if (marks <= 8) {
            System.out.println("Grade B");
        } else if (marks >= 98) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

    }
}
