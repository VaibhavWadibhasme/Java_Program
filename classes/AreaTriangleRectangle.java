/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

class AreaRT{
    double base;
    double height;
    
    AreaRT(double base, double height){
        this.base=base;
        this.height=height;
    }
    
    public double getAreaRectangle(){
        return base*height;
    }
    public double getAreaTriangle(){
        return base*height/2;
    }
}
public class AreaTriangleRectangle {
    public static void main(String args[]){
        AreaRT rectangle=new AreaRT(5.0,6.0);
        System.out.println("Area of Rectangle: "+rectangle.getAreaRectangle());
        AreaRT triangle=new AreaRT(4.0,9.0);
        System.out.println("Area of Triangle: "+triangle.getAreaTriangle());
    }
}
