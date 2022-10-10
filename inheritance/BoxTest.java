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
class Box1{
    double width;
    double height;
    double depth;
    Box1(double w, double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    Box1() {
    }
    public double getVolume(){
        return width*height*depth;
    }
}
class BoxWeigth extends Box1{
    double weight;
    BoxWeigth(double w, double h, double d, double m) {
    width = w;
    height = h;
    depth = d;
    weight = m;
    }
    
   
}
public class BoxTest {
    public static void main(String args[]){
        BoxWeigth ob=new BoxWeigth(10,20,30,12.5);
        double vol=ob.getVolume();
        System.out.println("Volume: "+vol);
        System.out.println("Weight: "+ob.weight);
    }
}
