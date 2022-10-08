/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*Can we create an object outside of method but inside a class if yes then can
we use that class in any method in any class
 */
class ClassTest1{
    
    void m1(){
        System.out.println("M1");
    }
    void m2(){
        ClassTest1 ob=new ClassTest1();
        System.out.println("M2");
        ob.m1();
    }
}
public class ClassTest {
    
    public static void main(String args[]){
        ClassTest1 ob1=new ClassTest1();
        ob1.m2();
    }
}
