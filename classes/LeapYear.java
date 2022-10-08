/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*Any year is entered through the keyboard, write a program to
determine whether the year is leap or not. Use the logical
operators && and ||. 
 */
class CheckLeapYear{
    int year;
    public void setYear(int y){
        year=y;
    }
    public void getLeapYearOrNot(){
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(year+" is a leap Year.");
        }else{
            System.out.println(year+" is not a leap Year.");
        }
    }
}
public class LeapYear {
    public static void main(String args[]){
        CheckLeapYear ob=new CheckLeapYear();
        ob.setYear(1920);
        ob.getLeapYearOrNot();
    }
}
