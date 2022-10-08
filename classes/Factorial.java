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
class Fact{
    int num;
    public void setNumber(int num){
        this.num=num;
    }
    public long getFactorial(){
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
public class Factorial {
    public static void main(String args[]){
        Fact ob=new Fact();
        int num=5;
        ob.setNumber(num);
        long fact;
        fact = ob.getFactorial();
        System.out.println("Factrioal of "+num+" is "+fact);
    }
}
