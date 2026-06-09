package com.Apurva;

import java.util.Scanner;
public class ScannerMethod{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in); // Constructor creation
        System.out.println("Enter an number :");
        int n;
        float b;
        double c;
        String str;
        str=input.nextLine();
        n=input.nextInt();
        b=input.nextFloat();
        c=input.nextDouble();

        System.out.println("Number inputed :"+n);
        System.out.println("Float Number inputed :"+b);
        System.out.println("Double Number inputed :"+c);
        System.out.println("String inputed :"+str);

    }
}