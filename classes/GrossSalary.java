/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/**
 *
 * @author softpoint
 */
/*Ramesh’s basic salary is input through the keyboard. His
dearness allowance is 40% of basic salary, and house rent
allowance is 20% of basic salary. Write a program to calculate
his gross salary. */
import java.util.Scanner;

class Allowance{
    double basicSalary;
    public void setsalary(double bs){
        basicSalary=bs;
    }
    public void grossSalary(){
       double grossSalary;
       grossSalary=basicSalary+(0.4*basicSalary)+(0.2*basicSalary);
       System.out.println("Gross Salary : "+grossSalary);
       
    }
}
public class GrossSalary {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Basic Salary of Ramesh: ");
        double bs=sc.nextDouble();
        Allowance ob=new Allowance();
        ob.setsalary(bs);
        ob.grossSalary();
    }
}
