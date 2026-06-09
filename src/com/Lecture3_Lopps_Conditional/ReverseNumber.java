package com.Lecture3_Lopps_Conditional;

public class ReverseNumber {
    public static void main(String[] args){
        int num =12345;
        int num2=0;
        while(num > 0){
            int a= num %10;
            num2=num2*10+a;
            num=num/10;

        }
        System.out.println(num2);
    }
}