package com.Lecture3_Lopps_Conditional;

import java.util.Scanner;
public class Even {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("Enter an number :");
        n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number");
        }
    }
}