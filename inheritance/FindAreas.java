/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

class Figure{
    double dim1;
    double dim2;
    Figure(double dim1,double dim2){
        this.dim1=dim1;
        this.dim2=dim2;
    }
    double area(){
        System.out.println("Area is Undefined:");
        return 0;
    }
}
class Rectangle extends Figure{
    Rectangle(double a,double b){
        super(a,b);
    }
    @Override
    double area(){
        System.out.println("Area of rectangle:");
        return dim1*dim2;
    }
}
class Triangle extends Rectangle{
    Triangle(double a, double b){
        super(a,b);
    }
    @Override
    double area(){
        System.out.println("Area of triangle:");
        return dim1*dim2/2;
    }
}
public class FindAreas {
    public static void main(String args[]){
        Figure ob1=new Figure(10,10);
        Rectangle ob2=new Rectangle(9,5);
        Triangle ob3=new Triangle(10,8);
        Figure figref;
        figref=ob1;
        System.out.println("Area is "+figref.area());
        figref=ob2;
        System.out.println("Area is "+figref.area());
        figref=ob3;
        System.out.println("Area is "+figref.area());
    }
}
