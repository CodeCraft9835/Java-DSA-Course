package com.Lecture3_Lopps_Conditional;

import java.util.Scanner;
public class Factorial{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int num;
        int fact=1;
        System.out.println("Enter an number :");
        num = sc.nextInt();
        for(int i=1;i<=num;i++){
          fact*=i;
        }
        System.out.println("Factorial value :"+fact);
    }
}