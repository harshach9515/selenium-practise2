package com.pratice;

public class StringIfIntProgram {
    public static void main(String[] args) {

        String name = "Vamsi";
        int age = 22;

        if (name.equals("Vamsi") && age >= 18) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        String username = "vamsi";
        String password = "java123";
        int attempts = 3;

        if (username.equals("vamsi") && password.equals("java123") && attempts > 0) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }
}
