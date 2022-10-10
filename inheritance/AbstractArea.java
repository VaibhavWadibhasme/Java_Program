/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author softpoint
 */
abstract class Figure1{
    double dim1;
    double dim2;
    Figure1(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    abstract double area();
    
}
class Rectangle1 extends Figure1{
    Rectangle1(double a,double b){
        super(a,b);
    }
    @Override
    double area(){
        System.out.println("Area of rectangle:");
        return dim1*dim2;
    }
    public void display(){
        System.out.println("Rectangle Drawn.");
    }
}
class Triangle1 extends Rectangle1{
    Triangle1(double a, double b){
        super(a,b);
    }
    @Override
    double area(){
        System.out.println("Area of triangle:");
        return dim1*dim2/2;
    }
    @Override
    public void display(){
        System.out.println("Triangle Drawn.");
    }
}
public class AbstractArea {
    public static void main(String args[]){
        Rectangle1 ob1=new Rectangle1(12,45);
        Triangle1 ob2=new Triangle1(13,12);
        Figure1 figref;
        
        figref=ob1;
        System.out.println("Area is "+figref.area());
        ob1.display();
        System.out.println();
        figref=ob2;
        System.out.println("Area is "+figref.area());
        ob2.display();
    }
}
