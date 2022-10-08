/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*If the marks obtained by a student in five different subjects
are input through the keyboard, find out the aggregate marks
and percentage marks obtained by the student. Assume that
the maximum marks that can be obtained by a student in each
subject is 100.*/
import java.util.Scanner;

class CalculateMarks{
    int[] mark;
    public void setMarks(int[] m){
        mark=m;
    }
    
    public void aggregateMarks(){
        int aggmark=0;
        for(int i=0;i<mark.length;i++){
            aggmark=aggmark+mark[i];
        }
        
        System.out.println("Aggregate Marks: "+aggmark);
        System.out.println("Percentage : "+aggmark/mark.length);
    }
}
public class Precentage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[] marks=new int[5];
        System.out.println("Enter marks for Five Subject out of 100:");
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        CalculateMarks ob=new CalculateMarks();
        ob.setMarks(marks);
        ob.aggregateMarks();
    }
}
