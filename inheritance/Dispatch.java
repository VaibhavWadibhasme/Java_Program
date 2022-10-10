/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/*================HERACHICAL INHERITANCE==================

----------USEING DYNAMIC DISPATCH METOD===================
 */
class A2{
    void callMe(){
        System.out.println("Inside A2");
    }
}
class B2 extends A2{
    void callMe(){
        System.out.println("Inside B2");
    }
}
class C2 extends A2{
    void callMe(){
        System.out.println("Inside C2");
    }
}
public class Dispatch {
    public static void main(String args[]){
        A2 a=new A2();
        B2 b=new B2();
        C2 c=new C2();
        A2 ref; // obtain a reference of type A2
        ref=a;
        ref.callMe();
        ref=b;
        ref.callMe();
        ref=c;
        ref.callMe();
    }
    
}
