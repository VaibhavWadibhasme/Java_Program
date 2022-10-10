/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author softpoint
 */
class Student{
    int s1,s2,s3,s4,s5,rollno;
    String name;
    void setDetails(int rolln, String nam ){
        rollno=rolln;
        name=nam;
    }
    void setMarks(int m1,int m2,int m3,int m4,int m5){
        s1=m1;
        s2=m2;
        s3=m3;
        s4=m4;
        s5=m5;
    }
}
class Result extends Student{
    void getResult(){
        int totalMark=s1+s2+s3+s4+s5;
        double per=totalMark/5;
        System.out.println("Name:   "+name);
        System.out.println("Roll no:"+rollno);
        System.out.println("============================");
        System.out.println("Subject Name\tMarks");
        System.out.println("\tS1\t"+s1);
        System.out.println("\tS2\t"+s2);
        System.out.println("\tS3\t"+s3);
        System.out.println("\tS4\t"+s4);
        System.out.println("\tS5\t"+s5);
        System.out.println("============================");
        System.out.println("Total Marks\t"+totalMark);
        System.out.println("Percentege\t"+per);
        
    }
}
public class StudentResult {
    public static void main(String args[]){
        Result result=new Result();
        result.setDetails(1, "Vaibhav Wadibhasme");
        result.setMarks(76, 85, 79, 56, 89);
        result.getResult();
    }
}
