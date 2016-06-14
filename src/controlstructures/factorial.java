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
public class factorial {
   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int i, n,fact=1;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value");
        n=s.nextInt();
      
            for( i=1; i <= n;i++)
            {
         fact = fact*i;
                 
                 }
         System.out.println("Factorial of" + n+ "is"+ fact);
    
    
}
}
