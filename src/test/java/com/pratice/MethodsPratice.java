package com.pratice;

public class MethodsPratice {
    public static void main(String[] args) {
        MethodsPratice obj = new MethodsPratice();
        int result = obj.add(10, 10);
        System.out.println("Added" + result);
        String nam=obj.name("vamsi");
        System.out.println(nam);
        obj.printNumbers(20);
        System.out.println();
        obj.printNumbers(50);
    }
    public int add(int a, int b) {
        int c=a+b;
        return c;
    }
    public String name(String name){
        return name;

    }
    public void printNumbers(int length){
        for (int i=1; i<=length; i++){
            System.out.print(i+ ",");
        }
        System.out.print(".");
    }
}
