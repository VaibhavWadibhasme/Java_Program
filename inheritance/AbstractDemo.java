/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

abstract class A4{
    abstract void callMe();
    
    void callMeToo(){
        System.out.println("This is a concrete method.");
    }
}
class B4 extends A4{
    @Override
    void callMe(){
        System.out.println("B's implementation of callme.");
    }
}
public class AbstractDemo {
    public static void main(String args[]){
        B4 b=new B4();
        
        b.callMe();
        b.callMeToo();
    }
}
