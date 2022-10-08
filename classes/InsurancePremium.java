/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

/*An Insurance company follows following rules to calculate
premium.
(1) If a person’s health is excellent and the person is between
25 and 35 years of age and lives in a city and is a male
then the premium is Rs. 4 per thousand and his policy
amount cannot exceed Rs. 2 lakhs.
(2) If a person satisfies all the above conditions except that
the sex is female then the premium is Rs. 3 per thousand
and her policy amount cannot exceed Rs. 1 lakh.
(3) If a person’s health is poor and the person is between 25
and 35 years of age and lives in a village and is a male 
then the premium is Rs. 6 per thousand and his policy
cannot exceed Rs. 10,000.
(4) In all other cases the person is not insured.
Write a program to output whether the person should be
insured or not, his/her premium rate and maximum amount
for which he/she can be insured. 
 */
class PremiumCalculator{
    char health;
    int age;
    char loc;
    char gender;
    int amount;
    public void setHealth(char h){
        health=h;
    }
    public void setAge(int a){
        age=a;
    }
    public void setLocation(char l){
        loc=l;
    }
    public void setGender(char g){
        gender=g;
    }
    public void setPolicyAmount(int a){
        amount=a;
    }
    public void getPremium(){
        if((health=='E'||health=='e')&&(age>=25&&age<=35)&&(loc=='C'||loc=='c')&&(gender=='M'||gender=='m'))
        {
            if(amount<=200000)
            {
                float premium=amount*4/1000;
                System.out.println("Your premium is Rs "+premium+" for Amount "+amount);
            }else
                System.out.println("Please Enter the amount less than 200000");
        }else if((health=='E'||health=='e')&&(age>=25&&age<=35)&&(loc=='C'||loc=='c')&&(gender=='F'||gender=='f'))
        {
            if(amount<=100000)
            {
                float premium=amount*3/1000;
                System.out.println("Your premium is Rs "+premium+" for Amount "+amount);
            }else
                System.out.println("Please Enter the amount less than 100000");
        }else if((health=='P'||health=='p')&&(age>=25&&age<=35)&&(loc=='V'||loc=='v')&&(gender=='M'||gender=='m'))
        {
            if(amount<=10000)
            {
                float premium=amount*6/1000;
                System.out.println("Your premium is Rs "+premium+" for Amount "+amount);
            }else
                System.out.println("Please Enter the amount less than 10000");
        }else
            System.out.println("Sorry! The person is not insured");
    }
}
public class InsurancePremium {
    public static void main(String args[]){
        PremiumCalculator ob=new PremiumCalculator();
        ob.setAge(26);
        ob.setGender('m');          //for male (m/M)  for female(f/F)
        ob.setHealth('p');          //for poor health(P/p) for Excellent health(E/e)
        ob.setLocation('v');        //for city(C/c) for villege(v/V)
        ob.setPolicyAmount(7000);
        ob.getPremium();
    }
}
