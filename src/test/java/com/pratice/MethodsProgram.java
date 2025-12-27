package com.pratice;

public class MethodsProgram {
    public static void main(String[] args) {

        MethodsProgram obj = new MethodsProgram();

        obj.sayHello();

        int sum = obj.add(5, 10);
        System.out.println("Sum: "+sum);

        boolean age = obj.isAge(18);
        System.out.println("age: "+age);
        String name=obj.name("vamsi");
    }

    public void sayHello() {
        System.out.println("Hello Java");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean isAge(int age) {
        return age >= 18;
    }

    public String name(String st){
       System.out.println(st);
       return st;
    }

}


