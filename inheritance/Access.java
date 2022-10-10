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
class A1{
    int i;
    private int j;
    void setij(int x,int y){
        i=x;
        j=y;
    
    }
    int getj(){
        return j;
    }
}
class B1 extends A1{
    int total;
    void sum(){
        total=i+getj();
    }

}
public class Access {
    public static void main(String args[]){
       B1 subOb=new B1(); 
       subOb.setij(10, 12);
       subOb.sum();
       System.out.println("Total is "+subOb.total);
    }
}
