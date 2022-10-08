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

/*The distance between two cities (in km.) is input through the
keyboard. Write a program to convert and print this distance
in meters, feet, inches and centimeters*/
import java.util.Scanner;

class Converter{
    float kilometer;
    public void setDistance(float km){
        kilometer=km;
    }
    
    public void convert(){
        float m=1000*kilometer;
        float cm=m*100;
        double inch=cm/2.5;
        double feet=inch/12;
        System.out.println("Meter:"+m);
        System.out.println("Centimeter:"+cm);
        System.out.println("Inch:"+inch);
        System.out.println("Feet:"+feet);
    }
}
public class DistanceConverter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in km: ");
        float km=sc.nextFloat();
        Converter ob=new Converter();
        ob.setDistance(km);
        ob.convert();
    }
}
