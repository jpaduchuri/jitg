package controlstructures;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miracle
 */
public class LeapYear {
    public static void main(String args[]){
        int i;  Scanner sc =new Scanner(System.in);
         System.out.println("Enter i value");
         i=sc.nextInt();
         if(i%4==0){
             System.out.println("the entered year is leap year");
         }
         else{
             System.out.println("the entered year in not a leap year");
         }
    }
}
