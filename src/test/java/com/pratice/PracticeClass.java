package com.pratice;

public class PracticeClass {
    public static void main(String[] args) {
        JavaProgram jp = new JavaProgram();
        PracticeClass pc=new PracticeClass();
        pc.simpleProgram1(jp.name);
        pc.simpleProgram2(jp.a);
        pc.simpleProgram3(jp.nme);
    }
    public void simpleProgram1(String name) {
        System.out.println(name);
    }
    public void simpleProgram2(int number) {
        System.out.println(number);
    }
    public void simpleProgram3(boolean value) {
        System.out.println(value);
    }
}
