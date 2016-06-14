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
public class SumOfEven {
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        int n,i=0,sum=0;
        System.out.println("enter n value to print n even numbers:");
        n=s.nextInt();
        while(i<=n)
        {
            System.out.println(i+"\n");
            sum+=i;
            i+=2;
           
            
        }
        System.out.println("sum of n even numbers is:"+sum);
   
    }
    
}
