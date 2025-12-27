package com.programs;

public class SumProgram {
    public static void main(String[] args){
        SumProgram obj = new SumProgram();
        int result=obj.SumNumber();
        System.out.println("sum=" +result);
    }
    public int SumNumber() {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        return sum;
    }
}
