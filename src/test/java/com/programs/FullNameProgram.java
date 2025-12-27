package com.programs;

public class FullNameProgram {
    public static void main(String[] args) {

        FullNameProgram obj = new FullNameProgram();

        String fullName = obj.name("Vamsi", "Sumanth");
        System.out.println("FullName: " + fullName);
    }

    public String name(String firstName, String lastName) {

        String name = firstName + " " + lastName;
        return name;
    }
}
