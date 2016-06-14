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
public class Multiplication {
    
    public static void main(String[] args) {
        int n,i;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter ur value");
        n=s.nextInt();
        for(i=1;i<=10;i++)
        {  
           
            System.out.println(n+"*"+i+"="+(n*i));
        }    
        
    }
}
