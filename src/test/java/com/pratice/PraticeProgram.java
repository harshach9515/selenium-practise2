package com.pratice;

public class PraticeProgram {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String st = "Hello";
        String st1 = "Hi";

        PraticeProgram obj = new PraticeProgram();
        obj.numbers(a, b);
        obj.names(st, st1);
    }
    public void numbers(int a,int b) {
        if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a not equal to b");
        }
    }
    public void names(String st,String st1){

        if (st.equals(st1)) {
            System.out.println("String are equal");
        }
            else
            {
                System.out.println("String is not equal");
            }
        }
    }
;
