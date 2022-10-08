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
class FindDay{
    int year;
    public void setYear(int y){
        year=y;
    }
    public void getDay(){
        int totaldays,day;
        totaldays=((year-1)*365)+((year-1)/4)-((year-1)/100)+((year-1)/400)+1;
        day=totaldays%7;
        switch(day)
        {
            case 0:{
                System.out.println("The Day is Sunday.");
                break;
            }
            case 1:{
                System.out.println("The Day is Monday.");
                break;
            }
            case 2:{
                System.out.println("The Day is Tuesday.");
                break;
            }
            case 3:{
                System.out.println("The Day is Wednesday.");
                break;
            }
            case 4:{
                System.out.println("The Day is Thursday.");
                break;
            }
            case 5:{
                System.out.println("The Day is Friday.");
                break;
            }
            case 6:{
                System.out.println("The Day is Saturday.");
                break;
            }
            
        }
    }
}
public class GregorianCalander {
    public static void main(String args[]){
        FindDay ob=new FindDay();
        ob.setYear(2022);
        ob.getDay();
    }
}
