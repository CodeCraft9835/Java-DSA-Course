package com.Lecture3_Lopps_Conditional;

import java.util.Scanner;
public class Fibanacci {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);


        System.out.println(0);
        System.out.println(1);
        int a= 0;
        int b=1;
        for(int i=1;i<=5;i++)
        {

            int sum = a+b ;
            System.out.println(sum );
            a=b;
            b=sum;
        }
    }
}