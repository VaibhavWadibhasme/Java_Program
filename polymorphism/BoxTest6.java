/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

class Box6{
    double width;
    double height;
    double depth;
    Box6(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    Box6(double len){
        width=height=depth=len;
    }
    Box6(){
        //empty constructor set default value zero
    }
    Box6(Box6 ob){//object clonning
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    public double getVolume(){
        return width*height*depth;
    }
} 
public class BoxTest6 {
    public static void main(String args[]){
        Box6 box=new Box6(7.0,6.5,5.0);
        System.out.println("Volume of box: "+box.getVolume());
        Box6 box1=new Box6(5.0);
        System.out.println("Volume of box1: "+box1.getVolume());
        Box6 box2=new Box6();
        System.out.println("Volume of box2: "+box2.getVolume());
        Box6 box3=new Box6(box);
        System.out.println("Volume of box3: "+box3.getVolume());
    } 
}
