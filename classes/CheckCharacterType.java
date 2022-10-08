/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*Any character is entered through the keyboard, write a
program to determine whether the character entered is a
capital letter, a small case letter, a digit or a special symbol. 

Characters          ASCII Values
A – Z               65 – 90
a – z               97 – 122
0 – 9               48 – 57
special symbols     0 - 47, 58 - 64, 91 - 96, 123 - 127
 */

class CheckCharacter{
    char ch;
    public void setCharacter(char c){
        ch=c;
    }
    public void checkCharacterType(){
        if(ch>=65&&ch<=90)
            System.out.println(ch+ " is a Capital case latter.");
        else if(ch>=97&&ch<=122)
            System.out.println(ch+ " is a Small case latter.");
        else if(ch>=48&&ch<=57)
            System.out.println(ch+ " is a Digit.");
        else if((ch>=0&&ch<=47)||(ch>=58&&ch<=64)||(ch>=91&&ch<=96)||(ch>=123&&ch<=127))
            System.out.println(ch+ " is a Special synmol.");

    }
}
public class CheckCharacterType {
    public static void main(String args[]){
        CheckCharacter ob= new CheckCharacter();
        ob.setCharacter('1');
        ob.checkCharacterType();
    }
}
