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
// This program uses inheritance to extend Box.
class Box {
    double width;
    double height;
    double depth;
    // construct clone of an object
    Box(Box ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified;
    Box() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}
    // Here, Box is extended to include weight.
class BoxWeight extends Box {
    double weight; // weight of box
    // constructor for BoxWeight
    
    BoxWeight(BoxWeight ob1) { // pass object to constructor
        width = ob1.width;
        height = ob1.height;
        depth = ob1.depth;
        weight=ob1.weight;
    }
    // constructor used when all dimensions specified
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
    // constructor used when no dimensions specified;
    BoxWeight() {
        weight=-1;
    }
    // constructor used when cube is created
    BoxWeight(double len,double w) {
        width = height = depth = len;
        weight=w;
    }
}

public class DemoBoxWeight {
    public static void main(String args[]) {
    BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
    BoxWeight mybox2 = new BoxWeight(mybox1);
    BoxWeight mybox3 = new BoxWeight();
    BoxWeight mybox4 = new BoxWeight(20,50.5);
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
