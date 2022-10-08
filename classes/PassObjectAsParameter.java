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
class Test{
    int a;
    int b;
    Test(int a,int b){
        this.a=a;
        this.b=b;
    }
    boolean equals(Test ob){
        if(a==ob.a&&b==ob.b){
            return true;
        }else{
            return false;
        }
    }
}
public class PassObjectAsParameter {
    public static void main(String args[]){
        Test ob1=new Test(100,22);
        Test ob2=new Test(100,22);
        Test ob3=new Test(-1,-1);
        
        System.out.println("ob1==ob2: "+ob1.equals(ob2));
        System.out.println("ob1==ob3: "+ob1.equals(ob3));
    }
}
