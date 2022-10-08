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
class Box4{
    double width;
    double height;
    double depth;
    public void setDim(double width,double height,double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    public double getVolume(){
        double vol=width*height*depth;
        return vol;
    }
}
public class BoxTest4 {
    public static void main(String args[]){
        Box4 ob=new Box4();
        ob.setDim(7.0, 5.0, 6.0);
        double vol=ob.getVolume();
        System.out.println("Volume of Box: "+vol);
    }
}
