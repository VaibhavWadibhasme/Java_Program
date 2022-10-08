/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*In a town, the percentage of men is 52. The percentage of
total literacy is 48. If total percentage of literate men is 35 of
the total population, write a program to find the total numberof illiterate
men and women if the population of the town is 80,000. 
 */
class IlliterateCalculation{
    double tp;
   
    public void setValue(double tpn){
        tp=tpn;
    }
    
    public void calculation(){
        double tm=0.52*tp;
        double tw=0.48*tp;
        double tlm=0.35*tp;
        double tlw=0.13*tp;
        double tillm;
        double tillw;
        tillm=tm-tlm;
        tillw=tw-tlw;
        System.out.println("Total illiterate men are "+tillm);
        System.out.println("Total illiterate women are "+tillw);
    }
}
public class Population {
    public static void main(String args[]){
        IlliterateCalculation ob=new IlliterateCalculation();
        ob.setValue(80000.0);
        ob.calculation();
    }
}
