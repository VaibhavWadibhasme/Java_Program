/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Random;

/*compile time polymorphism
a) generate psuedorandom number(any)
b) generate 6 digit psuedorandom number.
 */
class RandomNumber{
    Random ran=new Random();
    public int getRandomnum(){
        int num= ran.nextInt();
            return num;
    }
    public int getRandomnum(int bound){
        int num= ran.nextInt(bound)+100000;          // bound is equal to last digit till we want
            return num;
        
    }
}
public class PsuedorandomNumber {
    public static void main(String args[]){
        RandomNumber ob=new RandomNumber();
        System.out.println("Any Random Number: "+ob.getRandomnum());
        System.out.println("Any Random Number: "+ob.getRandomnum(899999));
    }
}
