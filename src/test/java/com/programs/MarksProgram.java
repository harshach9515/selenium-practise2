package com.programs;

public class MarksProgram {
    public static void main(String[] args) {

        MarksProgram obj = new MarksProgram();
        obj.passOrFail(70);
        obj.failOrPass(30);
    }

    public void passOrFail(int marks) {
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
    public void failOrPass(int mark){
        if (mark <40){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }
        }
    }

