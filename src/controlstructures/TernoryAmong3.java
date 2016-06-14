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
public class TernoryAmong3 {
    public static void main(String[] args) {
        
        int a,b,c;
                Scanner s = new Scanner(System.in);
                System.out.println("Enter  numbers ");
                a=s.nextInt();
                b=s.nextInt();
                c=s.nextInt();
        int val=c>(a>b?a:b)?c:(a>b?a:b);
        System.out.println("max value is:"+val);
   
    }
    
}
