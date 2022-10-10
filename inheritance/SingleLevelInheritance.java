/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author softpoint
 */
class A{
    int i,j;
    void showij(){
        System.out.println("i and j:"+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: "+k);
    }
    void sum(){
        System.out.println("i+j+k: "+(i+j+k));
    }
}
public class SingleLevelInheritance {
    public static void main(String args[]){
        B subOb=new B();
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Content of subOb:");
        subOb.showij();
        subOb.showk();
        System.out.println();
        
        System.out.println("Sum of i, j,and k in subOb:");
        subOb.sum();
    }
}
