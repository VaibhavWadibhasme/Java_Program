/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*Two numbers are input through the keyboard into two
locations C and D. Write a program to interchange the
contents of C and D. 
 */

class Swap{
    int cval;
    int dval;
    public void setValue(int c,int d){
        cval=c;
        dval=d;
    }
    public void swapValue(){
        int temp=cval;
        cval=dval;
        dval=temp;
        
        System.out.println("Value of C: "+cval);
        System.out.println("Value of D: "+dval);
    }
}
public class Interchange {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of C: ");
        int c=sc.nextInt();
        System.out.println("Enter the value of D: ");
        int d=sc.nextInt();
        Swap ob=new Swap();
        ob.setValue(c, d);
        ob.swapValue();
    }
}
