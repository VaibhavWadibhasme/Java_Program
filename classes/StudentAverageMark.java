/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

class Student1{
    int roll;
    int totalmarks;
    Student1(int roll, int totalmarks){
        this.roll=roll;
        this.totalmarks=totalmarks;
    }
    public int getAverage(Student1 s){
        return (totalmarks+s.totalmarks)/2;
    }
}
public class StudentAverageMark {
    public static void main(String args[]){
        Student1 s1=new Student1(1,450);
        Student1 s2=new Student1(2,400);
        
        System.out.println("Average of total Marks: "+s1.getAverage(s2));
    }
}
