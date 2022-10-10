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
class Box2 {
    double width;
    double height;
    double depth;
    // construct clone of an object
    Box2(Box2 ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Box2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified;
    Box2() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box2(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
    // Here, Box is extended to include weight.
class BoxWeight2 extends Box2 {
    double weight; // weight of box
    // constructor for BoxWeight
    
    BoxWeight2(BoxWeight2 ob1) { // pass object to constructor
        super(ob1);
        weight=ob1.weight;
    }
    // constructor used when all dimensions specified
    BoxWeight2(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    // constructor used when no dimensions specified;
    BoxWeight2() {
        super();
        weight=-1;
    }
    // constructor used when cube is created
    BoxWeight2(double len,double w) {
        super(len);
        weight=w;
    }
}

public class DemoBoxWeight2 {
    public static void main(String args[]) {
    BoxWeight2 mybox1 = new BoxWeight2(10, 20, 15, 34.3);
    BoxWeight2 mybox2 = new BoxWeight2(mybox1);
    BoxWeight2 mybox3 = new BoxWeight2();
    BoxWeight2 mybox4 = new BoxWeight2(20,50.5);
    double vol;
    vol = mybox1.volume();
    System.out.println("Volume of mybox1 is " + vol);
    System.out.println("Weight of mybox1 is " + mybox1.weight);
    System.out.println();
    vol = mybox2.volume();
    System.out.println("Volume of mybox2 is " + vol);
    System.out.println("Weight of mybox2 is " + mybox2.weight);
    System.out.println();
    vol = mybox3.volume();
    System.out.println("Volume of mybox3 is " + vol);
    System.out.println("Weight of mybox3 is " + mybox3.weight);
    System.out.println();
    vol = mybox4.volume();
    System.out.println("Volume of mybox4 is " + vol);
    System.out.println("Weight of mybox4 is " + mybox4.weight);
    System.out.println();
    }
}
