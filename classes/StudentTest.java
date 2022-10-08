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

class Student{
    int rno;
    String name;
}
public class StudentTest {
    public static void main(String args[]){
        Student student=new Student();
        student.rno=101;
        student.name="john";
        System.out.println(" "+student);
        Student ob;
        ob=student;
        System.out.println("Student Roll No: "+ob.rno);
    }
}
