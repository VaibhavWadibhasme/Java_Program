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
class Triangle{
    double base;
    double hight;
    
    public void setDim(double b, double h){
        base=b;
        hight=h;
    }
    
    public void getArea(){
        double area;
        area =0.5*base*hight;
        System.out.println("Area of Triangle: "+area);
    }
}
public class TriangleTest {
    public static void main(String args[]){
        Triangle ob=new Triangle();
        ob.setDim(5.0, 3.5);
        ob.getArea();
    }
}
