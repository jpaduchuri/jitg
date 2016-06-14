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
public class primeOne {
    public static void main(String[] args) {
         int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n val:");
        n=sc.nextInt();
        for(int i=1;i<n;i++)
        { 
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                   break;
                }
            
            }
            if(flag)
            {
                System.out.println(i+" "+"is prime.");
            } 
            
        }
        

    }
    
}
