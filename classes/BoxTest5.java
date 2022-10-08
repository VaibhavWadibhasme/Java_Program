/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

class Box5{
    double width;
    double height;
    double depth;
    Box5(double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double getVolume(){
        return width*height*depth;
    }
}
public class BoxTest5 {
    public static void main(String args[]){
        Box5 box=new Box5(7.0,6.5,5.0);
        System.out.println("Volume of Box: "+box.getVolume());
    }
}
