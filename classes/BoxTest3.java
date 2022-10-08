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
class Box3{
    double width;
    double hight;
    double depth;
    
    public void setDim(double w, double h,double d){
        width=w;
        hight=h;
        depth=d;
    }
    
    public void getVolume(){
        double vol;
        vol=width*hight*depth;
        System.out.println("Volume of box: "+vol);
    }
}
public class BoxTest3 {
    public static void main(String args[]){
        Box3 ob=new Box3();
        ob.setDim(12.5, 7.5, 6.5);
        ob.getVolume();
    }
}
