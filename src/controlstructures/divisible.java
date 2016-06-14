/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class divisible {
   public static void main(String args[]){
       int n;
       Scanner s;
       s = new Scanner(System.in);
       System.out.println("enter the value");
       n=s.nextInt();
       if(n%3==0 && n%5==0) {
           System.out.println("the given number is divisible by both 3&5 ");
           } else 
             {
              System.out.println("the given number is not divisible byboth 3&5 ");
            }
       
       
   }
       

           
       }
   

    

