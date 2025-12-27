package com.pratice;

public class IfElseStringProgram {
    public static void main(String[] args) {

        String name1 = "Vamsi";
        String name2 = "Vamsi";

        if (name1.equals(name2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
        String username = "vamsi";
        String password = "12345";

        if (username.equals("vamsi") && password.equals("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}

