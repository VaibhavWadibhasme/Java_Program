/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

class Loan{
    double emi;
    
    public double getEMI(double p,double r,double n) {
        emi=(p*(r/12/100)*Math.pow(1+(r/12/100), n))/(Math.pow(1+(r/12/100), n)-1);
        return emi;
    }
}
public class EMICalculator {
    public static void main(String main[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("\tWELCOME TO EMI CALCULATOR");
        System.out.println("======================================");
        System.out.println();
        System.out.println("Press 1: Home Loan\nPress 2: Gold Loan\nPress 3: Personal Loan");
        int num=sc.nextInt();
        Loan l=new Loan();
        switch(num){
            case 1:{
                
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the Rate of Interest per Annum:");
                double r=sc.nextDouble();
                System.out.println("Enter No. of installment:");
                double n=sc.nextDouble();
                double emi=l.getEMI(p, r, n);
                System.out.println("EMI :"+emi);
                System.out.println("Intrest Payble is "+((emi*n)-p));
                System.out.println("Total Amount Payble is "+(emi*n));
                break;
            }
            case 2:{
                
                System.out.println("Net Weight of gold: ");
                double g=sc.nextDouble();
                double el=(g*3734.25);
                System.out.println("Total value of Gold: "+(g*4979));
                System.out.println("Eligible loan Amount : "+el);
                System.out.println("Enter the Principle Amount:");               
                double p=sc.nextDouble();
                if(p<=el){                                        
                    System.out.println("Enter the Rate of Interest per Annum:");
                    double r=sc.nextDouble();
                    System.out.println("Enter No. of installment:");
                    double n=sc.nextDouble();
                    double emi=l.getEMI(p, r, n);
                    System.out.println("EMI :"+emi);
                    System.out.println("Intrest Payble is "+((emi*n)-p));
                    System.out.println("Total Amount Payble is "+(emi*n));
                }
                else
                    System.out.println("Please Enter valid amount.");
                break;
            }
            case 3:{
                
                System.out.println("Enter the Principle Amount:");
                double p=sc.nextDouble();
                System.out.println("Enter the Rate of Interest per Annum:");
                double r=sc.nextDouble();
                System.out.println("Enter No. of installment:");
                double n=sc.nextDouble();
                double emi=l.getEMI(p, r, n);
                System.out.println("EMI :"+emi);
                System.out.println("Intrest Payble is "+((emi*n)-p));
                System.out.println("Total Amount Payble is "+(emi*n));
                break;
            }
        }
    }
}
