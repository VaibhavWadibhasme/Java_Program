/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*If the total selling price of 15 items and the total profit earned
on them is input through the keyboard, write a program to
find the cost price of one item.
 */
class PriceCalculator{
    float sellprice;
    float totprofit;
    public void setPrice(float sp, float tp){
        sellprice=sp;
        totprofit=tp;
    }
    public void getCostPrice(){
        System.out.println("Cost Price of 1 item: "+((sellprice-totprofit)/15));
    }
}
public class CostPrice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Selling price of 15 items: ");
        float sp=sc.nextFloat();
        System.out.println("Enter Total Profit on 15 items: ");
        float tp=sc.nextFloat();
        PriceCalculator ob=new PriceCalculator();
        ob.setPrice(sp, tp);
        ob.getCostPrice();
    }
}
