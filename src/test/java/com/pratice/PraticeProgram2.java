package com.pratice;

public class PraticeProgram2 {
    int a = 10;
    int b = 20;
    String st = "Hello";
    String st1 = "Hi";

    public static void main(String[] args) {

        PraticeProgram2 obj = new PraticeProgram2();

        obj.numbers();
        obj.names();
    }

    public void numbers() {
        if (a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a not equal to b");
        }
    }

    public void names() {
        if (st.equals(st1)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String is not equal");
        }
    }
}
