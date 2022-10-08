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
class Facto{
    int fact(int n){
        if(n==1||n==0){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
}
public class RecursionFact {
    public static void main(String args[]){
        Facto ob=new Facto();
        
        System.out.println("Factorial of 5: "+ob.fact(5));
    }
}
