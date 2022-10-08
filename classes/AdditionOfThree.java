/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/**
 *
 * @author softpoint
 */
class Addition{
    int num1;
    int num2;
    int num3;   
    
    public void setValue(int n1,int n2, int n3){
        num1=n1;
        num2=n2;
        num3=n3;
    }
    public void getAddition(){
        int sum;
        sum=num1+num2+num3;
        System.out.println("Sum of three Number: "+sum);
    }
}
public class AdditionOfThree {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        
        Addition ob=new Addition();
        ob.setValue(num1, num2, num3);
        ob.getAddition();
    }
}
