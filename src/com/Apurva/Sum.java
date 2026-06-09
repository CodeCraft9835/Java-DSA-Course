package com.Apurva;
import java.util.*;
public class Sum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float num1,num2 ,sum;
        System.out.println("Input two numbers :");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        sum = num1 + num2 ;
        System.out.println("Sum of two inputed numbers "+num1+" , "+num2+" are ,"+sum);

    }
}