/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

class Volume{
    public double getVolume(double a){
        return a*a*a;
    }
    public double getVolume(float r){
        return 4*3.14*r*r*r/3;
    }
    public double getVolume(double r, double h){
        return 3.14*r*r*h;
    }
    public double getVolume(double b, float h){
        return b*h/3;
    }
    public double getVolume(double l,double w,double h){
        return l*w*h;
    }
}
public class VolumeOfShapes {
    public static void main(String args[]){
        Volume ob=new Volume();
        System.out.println("Volume of Cube: "+ob.getVolume(5.0));
        System.out.println("Volume of Cube: "+ob.getVolume(5.0f));
        System.out.println("Volume of Cylinder: "+ob.getVolume(5.0,8.0));
        System.out.println("Volume of Pyramid: "+ob.getVolume(5.0,8.0f));
        System.out.println("Volume of Rectangular Solid: "+ob.getVolume(5.0, 6.0, 7.0));
    }
}
