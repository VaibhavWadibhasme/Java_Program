/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*If a five-digit number is input through the keyboard, write a
program to calculate the sum of its digits & write a program to reverse 
the number.
(Hint: Use the modulus operator ‘%’)
 */
class NumAction{
    int num;
    int rev=0;
    int sum;
    public void setValue(int n){
        num=n;
    }
    public void reverseNum(){
        System.out.println("Number Before: "+num);
        int rem;
        int num1=num;
        for(int i=0; i<5; i++){
            rem=num1%10;
            rev=(rev*10)+rem;
            num1=num1/10;
        }
        System.out.println("Number After: "+rev);
    }
    public void sumDigit(){
        int rem1;
        int num2=num;
        for(int i=0;i<5;i++){
            rem1=num2%10;
            sum=sum+rem1;
            num2=num2/10;
        }
        System.out.println("Number Sum: "+sum);
    }
}
public class FiveDigitNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Five digit Number:");
        int num=sc.nextInt();
        NumAction ob=new NumAction();
        ob.setValue(num);
        ob.sumDigit();
        ob.reverseNum();
    }
        
}
