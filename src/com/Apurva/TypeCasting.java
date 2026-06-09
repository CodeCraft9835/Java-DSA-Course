package com.Apurva;
import java.util.*;

public class TypeCasting{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        /*  Casting : Converting one data type into another data type
        * Types : i) Automatic or widening casting : Here we store smaller data type value in bigger data type .
        Eg : float a=65;
        * ii) Manual or Narrowing Casting : Here we try to store bigger data type value in smaller data type variable forcelly.
        * Eg: int a= (int)(45.78f);
        *  */
        int a= (int)56.45f; //Forcefully cast value
        System.out.println(a);
        double d= 78;// Automatic
        System.out.println(d);

        int c= 'A'; // Automatic conversion from char to int value
        System.out.println(c);
        //Java works on Unicode rules

    }
}