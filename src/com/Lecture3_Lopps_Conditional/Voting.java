package com.Lecture3_Lopps_Conditional;

import java.util.*;
public class Voting{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter your age :");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible to vote in 2026");
        }
        else {
            int d=18-age;
            System.out.println("Not Eligible to vote , wait for more "+d+" years.");
        }
    }
}