/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*Temperature of a city in Fahrenheit degrees is input through
the keyboard. Write a program to convert this temperature
into Centigrade degrees.
 */
class Centigrade{
       double feh;
    public void setTemp(double f){
        feh=f;
    }
    public void convertToCentigrade(){
        double centi=(feh-32)*5/9;
        System.out.println("Temperature in centigrade: "+centi);
    }
}
public class TemperatureConverter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double feh=sc.nextDouble();
        Centigrade ob=new Centigrade();
        ob.setTemp(feh);
        ob.convertToCentigrade();
        
    }
}
