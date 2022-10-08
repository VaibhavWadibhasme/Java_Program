/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*If a five-digit number is input through the keyboard, write a
program to print a new number by adding one to each of its
digits. For example if the number that is input is 12391 then
the output should be displayed as 23402. 
 */
class AddOne{
    int num;
    int newnum=0;
    public void setNumber(int n){
        num=n;
    }
    public void getAddOne(){
        int[] a=new int[5];
        for(int i=0; i<5;i++){
            a[i]=((num%10)+1)%10;
            num=num/10;
        }
        for(int i=4;i>=0;i--){
            newnum=(newnum*10)+a[i];
        }
        System.out.println("New Number after adding one to each digit: "+newnum);
    }
}
public class NewNumberAddOne {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any five digit number:");
        int num=sc.nextInt();
        AddOne ob=new AddOne();
        ob.setNumber(num);
        ob.getAddOne();
        
    }
}
