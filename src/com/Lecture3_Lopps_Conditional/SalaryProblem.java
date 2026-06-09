package com.Lecture3_Lopps_Conditional;

import java.util.Scanner;
 public class SalaryProblem{
     public static void main(String[]args){
         Scanner input = new Scanner(System.in);
         double basic, hra,da,gross;
         System.out.println("Enter your Basic Salary :");
         basic = input.nextDouble();
          /* Calculating HRA,DA,Gross  :
          *HRA (House Rent Allowance): 10% of the basic salary.
          *DA (Dearness Allowance): 5% of the basic salary.
          *Gross Salary: The sum of basic salary, HRA, and DA.
          * */
         if(basic > 25_000) {
             hra = (10 * basic) / 100;
             da = (5 * basic) /100 ;
             gross = basic + hra + da ;
              System.out.println("Gross salary :"+gross);
         }
         else {
             System.out.println("Salary alloted is not enough to maintain HRA charges.");
         }
     }
 }