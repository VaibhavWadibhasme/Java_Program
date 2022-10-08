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
class Area{
    public double getAreaRectangle(double length,double breadth){
        double area=length*breadth;
        return area;
    }
    public double getAreaTriangle(double base,double height){
        double area=(base*height)/2;
        return area;
    }
}
public class AreaRectangleTriangle {
    public static void main(String args[]){
        Area ob=new Area();
        double rec=ob.getAreaRectangle(3.0, 4.0);
        double triangle=ob.getAreaTriangle(4.0, 5);
        System.out.println("Area of Rectangle: "+rec);
        System.out.println("Area of Triangle: "+triangle);
    }
}
