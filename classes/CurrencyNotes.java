/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.Scanner;

/*A cashier has currency notes of denominations 10, 50 and
100. If the amount to be withdrawn is input through the
keyboard in hundreds, find the total number of currency notes
of each denomination the cashier will have to give to the
withdrawer.
 */
class NoOfNotes{
    int amount;
    public void setAmount(int a){
        amount=a;
    }
    public void getNoOfNotes(){
        int hundredNotes=amount/100;
        int fiftyNotes=(amount%100)/50;
        int tenNotes=((amount%100)%50)/10;
        System.out.println("No of Hundred Notes: "+hundredNotes);
        System.out.println("No of Fifty Notes: "+fiftyNotes);
        System.out.println("No of Ten Notes: "+tenNotes);
    }
}
public class CurrencyNotes {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Amount: ");
        int amount=sc.nextInt();
        NoOfNotes ob=new NoOfNotes();
        ob.setAmount(amount);
        ob.getNoOfNotes();
    }
}
