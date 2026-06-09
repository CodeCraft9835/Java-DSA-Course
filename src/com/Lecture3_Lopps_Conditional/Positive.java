package com.Lecture3_Lopps_Conditional;

import java.util.*;
public class Positive{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int num;
        System.out.println("Enter an number : ");
        num = sc.nextInt();
        if( num > 0){
            System.out.println("Positive number");
        }
        else if( num < 0){
            System.out.println("Negative number");
        }
        else{
            System.out.println("Zero");
        }
    }
}