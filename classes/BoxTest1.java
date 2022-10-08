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
public class BoxTest1 {
    double width;
    double hight;
    double depth;
    
    public static void main(String args[]){
        BoxTest1 box=new BoxTest1();
        box.width=12.5;
        box.hight=7.5;
        box.depth=6.5;
        
        double vol=box.width*box.hight*box.depth;
        System.out.println("Volume of box: "+vol);  
    }
    
}
