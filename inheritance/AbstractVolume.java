/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

abstract class Figure2{
    double length;
    double base;
    double height;
    Figure2 (double length, double base,double height){
        this.length=length;
        this.base=base;
        this.height=height;
    }
    abstract double volume();
}
class Rectangle2 extends Figure2{
    Rectangle2(double length, double base,double height){
        super(length,base,height);
    }

    @Override
    double volume() {
        System.out.println("volume of Rectangle:");
        return length*base*height;
    }
    
}
class Triangle2 extends Figure2{

    Triangle2(double length, double base, double height) {
        super(length, base, height);
    }

    @Override
    double volume() {
        System.out.println("volume of Triangle:");
        return 0.5*length*base*height;
    }
    
}
public class AbstractVolume {
    public static void main(String args[]){
        Rectangle2 ob1=new Rectangle2(13,4,5);
        Triangle2 ob2=new Triangle2(13,4,5);
        
        Figure2 figref;
        figref=ob1;
        System.out.println("volume is "+figref.volume());
        figref=ob2;
        System.out.println("volume is "+figref.volume());
    }
}