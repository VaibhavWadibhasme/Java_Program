/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*A five-digit number is entered through the keyboard. Write a
program to obtain the reversed number and to determine
whether the original and reversed numbers are equal or not.
 */

class Compair{
    int num;
    int onum;
    int rnum=0;
    public void setNumber(int n){
        num=n;
        onum=num;
    }
    public void getReverse(){
        for(int i=0;i<5;i++)
        {
            int rem=num%10;
            rnum=rnum*10+rem;
            num=num/10;
        }
    }
    public void getComparison(){
        if(onum==rnum)
            System.out.println("Reversed Number is equal with original");
        else
            System.out.println("Reversed Number is not equal with original");
    }
}
public class ReverseOriginalCompair {
    public static void main(String args[]){
        Compair ob=new Compair();
        ob.setNumber(12321);
        ob.getReverse();
        ob.getComparison();
    }
}
