/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

/**
 *
 * @author softpoint
 */
class Overload{
    void test(){
        System.out.println("No parametere");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a, int b){
        System.out.println("Value of a and b "+a+" "+b);
    }
    void test(double a){
        System.out.println("Value of Double a:"+a);
        
    }
}
public class Overloding {
    public static void main(String args[]){
        Overload ob=new Overload();
        ob.test();
        ob.test(5);
        ob.test(5, 6);
        ob.test(5.0);
        
    }
}
