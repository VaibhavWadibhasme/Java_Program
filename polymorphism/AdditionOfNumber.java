/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

class Addition1{
    public int getAddition(int a,int b){
        return a+b;
    }
    public int getAddition(int a,int b,int c){
        return a+b+c;
    }
    public int getAddition(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public int getAddition(int a,int b,int c,int d,int e){
        return a+b+c+d+e;
    }
}
public class AdditionOfNumber {
    public static void main(String args[]){
        Addition1 ob=new Addition1();
        System.out.println("Addition of two number: "+ob.getAddition(5, 6));
        System.out.println("Addition of three number: "+ob.getAddition(2, 3, 5));
        System.out.println("Addition of four number: "+ob.getAddition(4, 5, 6, 7));
        System.out.println("Addition of five number: "+ob.getAddition(5, 6, 7, 8, 9));
    }
}
