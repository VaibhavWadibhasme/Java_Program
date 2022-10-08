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

class Complex{
    double real;
    double imga;
    Complex(double real, double imga){
        this.real=real;
        this.imga=imga;
    }
    Complex getAddition(Complex c){
        Complex temp= new Complex(0.0,0.0);
        temp.real=real+c.real;
        temp.imga=imga+c.imga;
        return temp;
    }
    Complex getSubstraction(Complex c){
        double r=real-c.real;
        double im=imga-c.imga;
        Complex temp= new Complex(r,im);
        return temp;
    }
    Complex getMultiplication(Complex c){
        Complex temp= new Complex(0.0,0.0);
        temp.real=real*c.real;
        temp.imga=imga*c.imga;
        return temp;
    }
    
}
public class ReturnValueAsObject {
    public static void main(String args[]){
        Complex c1=new Complex(2.0,3.0);
        Complex c2=new Complex(5.0,2.0);
        
        Complex c3;
        Complex c4;
        Complex c5;
        c3=c1.getAddition(c2);
        System.out.println("Addition C3:"+c3.real+"+j"+c3.imga);
        c4=c1.getSubstraction(c2);
        System.out.println("Substraction C4:"+c4.real+"+j"+c4.imga);
        c5=c1.getMultiplication(c2);
        System.out.println("Multiplication C5:"+c5.real+"+j"+c5.imga);
    }
}
