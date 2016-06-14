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
public class EvenOdd {
    public static void main(String args[]){
        int i;
        Scanner sc =new Scanner(System.in);
         System.out.println("Enter i value");
         i=sc.nextInt();
         if(i%2==0)
         {
             System.out.println("the number is even");
         }
         else
         {
             System.out.println("the entered number is odd");       
        
    }
    
}
}
