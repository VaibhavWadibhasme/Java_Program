/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

/**
 *
 * @author softpoint
 */
class Area1{
    public double getArea(double r){
        return 3.14*r*r;
    }
    public double getArea(double l,double b){
        return l*b;
    }
    public double getArea(double b,int h){
        return b*h/2;
    }
    public double getArea(int l){
        return l*l;
    }
    public double getArea(float r, double s){
        return 3.14*r*s;
    }
}
public class AreaByOverloding {
    public static void main(String args[]){
        Area1 ob=new Area1();
        System.out.println("Area of circle: "+ob.getArea(5.0));
        System.out.println("Area of rectangle: "+ ob.getArea(5.0, 6.0));
        System.out.println("Area of Triangle: "+ob.getArea(4.0, 5));
        System.out.println("Area of Square: "+ob.getArea(6));
        System.out.println("Area of Cone: "+ob.getArea(8.0f, 5.0));
    }
}
