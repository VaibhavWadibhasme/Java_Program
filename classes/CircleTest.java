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
class Circle{
    double redius;
    
    public void setDim(double r){
        redius=r;
    }
    
    public void getArea(){
        double area;
        area=3.14*redius*redius;
        System.out.println("Area of Circle: "+area);
    }
    
    public void getCircumfurance(){
        double circum;
        circum=2*3.14*redius;
        System.out.println("Circumfurance of Circle: "+circum);
    }
}
public class CircleTest {
    public static void main(String args[]){
        Circle ob=new Circle();
        ob.setDim(3.5);
        ob.getArea();
        ob.getCircumfurance();
    }
}
