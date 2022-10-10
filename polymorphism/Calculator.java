/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

/*========================COMPILE TIME POLYMORPHISM(METHOD OVERLOADING)======================
 */
class Calculate{
    public double getCalculation(int a, double b){
        return a+b;
    }
    public double getCalculation(double a,int b){
        return a-b;
    }
    public double getCalculation(float a, double b){
        return a*b;
    }
    public double getCalculation(double a, double b){
        return a/b;
    }
}
public class Calculator {
    public static void main(String args[]){
        Calculate ob= new Calculate();
        System.out.println("Addition of two: "+ob.getCalculation(5, 6.0));
        System.out.println("Addition of two: "+ob.getCalculation(6.0, 5));
        System.out.println("Addition of two: "+ob.getCalculation(5.0f, 6.0));
        System.out.println("Addition of two: "+ob.getCalculation(5.0, 6.0));

    }
}
