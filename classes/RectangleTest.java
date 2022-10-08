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
class Rectangle{
    double length;
    double breadth;
    
    public void setDim(double l,double b){
        length=l;
        breadth=b;
    }
    
    public void getArea(){
        double area;
        area=length*breadth;
        System.out.println("Area of Rectangle :"+area);
    }
    
    public void getCircumfurance(){
        double circum;
        circum =2*(length+breadth);
        System.out.println("Circumfurance of Rectangle: "+circum);
    }
}
public class RectangleTest {
    public static void main(String args[]){
        Rectangle ob=new Rectangle();
        ob.setDim(12.3, 11.5);
        ob.getArea();
        ob.getCircumfurance();
    }
}
