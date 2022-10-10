/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

class Student1{
    int s1,s2,s3,rollno;
    String name;
    
    Student1(String name,int rollno,int s1,int s2,int s3){
        this.name=name;
        this.rollno=rollno;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
}
class Sport extends Student1{
    int smark,totalmark;
    double per;
    String result;
    Sport(String name,int rollno,int s1,int s2,int s3,int smark){
        super(name,rollno,s1,s2,s3);
        this.smark=smark;
    }
    public void calculateResult(){
        if(s1<=100&&s2<=100&&s3<=100){
            if(s1>40&&s2>40&s3>40){
                result="Pass";
                totalmark=s1+s2+s3+smark;
                per=totalmark/3.1;
            }    
            else{
                result="Failed";
                totalmark=s1+s2+s3+smark;
                per=totalmark/3;
            }
        }
        else
            System.out.println("Check Marks");
    }
}
class Result1 extends Sport{
    Result1(String name,int rollno,int s1,int s2,int s3,int smark){
        super(name,rollno,s1,s2,s3,smark);
    }
    public void getResult(){
        System.out.println("===========================================");
        System.out.println(" Name    : "+name);
        System.out.println(" Roll no : "+rollno);
        System.out.println("-------------------------------------------");
        System.out.println("Subject Name\tTotal Marks  Obtained Mark");
        System.out.println("   S1  \t\t    100\t\t"+s1);
        System.out.println("   S2  \t\t    100\t\t"+s2);
        System.out.println("   S3  \t\t    100\t\t"+s3);
        System.out.println(" Sports\t\t    10\t\t"+smark);
        System.out.println("-------------------------------------------");
        System.out.println("Total\t\t   310\t\t"+totalmark);
        System.out.println("Percentege\t\t\t"+per+"%");
        System.out.println("Result\t\t\t\t"+result);
        System.out.println("============================================");
    }
}
public class StudentResult1 {
    public static void main(String args[]){
        Result1 ob=new Result1("Vaibhav Wadibhasme",01,40,80,80,8);
        ob.calculateResult();
        ob.getResult();
    }
}
