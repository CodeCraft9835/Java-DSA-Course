package com.Lecture3_Lopps_Conditional;

import java.util.Scanner;
public class ASCII{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch=sc.next().trim().charAt(0);
        int n= (int)(ch);
        if(n>=65 && n<=90){
            System.out.println("Uppercase");
        }
        else if(n>=96 && n<=122){
            System.out.println("Lowercase");
        }
        else if(n>=48 && n<=57){
            System.out.println("Numbers");
        }
        else{
            System.out.println("Special characters.");
        }
    }
}