/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*If a four-digit number is input through the keyboard, write a
program to obtain the sum of the first and last digit of this
number
 */
class FirstLastDigitSum{
    int num;
    int first;
    int last;
    public void setValue(int n){
        num=n;
    }
    public void getSum(){
        first=num/1000;
        last=num%10;
        System.out.println("Sum of First and Last Digit: "+(first+last));
    }
}
public class FourDigitNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Four digit number: ");
        int num=sc.nextInt();
        FirstLastDigitSum ob=new FirstLastDigitSum();
        ob.setValue(num);
        ob.getSum();
    }
}
