/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/*===============MULTILEVEL INHERITANCE==================
 */
class Box3 {
    double width;
    double height;
    double depth;
    // construct clone of an object
    Box3(Box3 ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    // constructor used when all dimensions specified
    Box3(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor used when no dimensions specified;
    Box3() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
    // constructor used when cube is created
    Box3(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double getvolume() {
        return width * height * depth;
    }
}
    // Here, Box is extended to include weight.
class BoxWeight3 extends Box3 {
    double weight; // weight of box
    // constructor for BoxWeight
    
    BoxWeight3(BoxWeight3 ob1) { // pass object to constructor
        super(ob1);
        weight=ob1.weight;
    }
    // constructor used when all dimensions specified
    BoxWeight3(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }
    // constructor used when no dimensions specified;
    BoxWeight3() {
        super();
        weight=-1;
    }
    // constructor used when cube is created
    BoxWeight3(double len,double w) {
        super(len);
        weight=w;
    }
}
class Shipment extends BoxWeight3{
    double cost;
    Shipment(Shipment ob){
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w, double h,double d,double wt,double c){
        super(w,h,d,wt);
        cost=c;
    }
    Shipment (double len, double w,double c){
        super (len,w);
        cost=c;
    }
    Shipment(){
        cost=-1;
    }
}
public class DemoBoxWeight3 {
    public static void main(String args[]){
        Shipment shipment1=new Shipment(10,20,30,50.45,500);
        Shipment shipment2=new Shipment(shipment1);
        Shipment shipment3=new Shipment(60,50.85,900);
        Shipment shipment4=new Shipment();

        double volume;
        volume=shipment1.getvolume();
        System.out.println("Volume of shipment1 is " + volume);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Cost of shipment1 is " + shipment1.cost);
        System.out.println();
        
        volume=shipment2.getvolume();
        System.out.println("Volume of shipment2 is " + volume);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Cost of shipment2 is " + shipment2.cost);
        System.out.println();

        volume=shipment3.getvolume();
        System.out.println("Volume of shipment3 is " + volume);
        System.out.println("Weight of shipment3 is " + shipment3.weight);
        System.out.println("Cost of shipment3 is " + shipment3.cost);
        System.out.println();

        volume=shipment4.getvolume();
        System.out.println("Volume of shipment4 is " + volume);
        System.out.println("Weight of shipment4 is " + shipment4.weight);
        System.out.println("Cost of shipment4 is " + shipment4.cost);
        System.out.println();
    }
}
