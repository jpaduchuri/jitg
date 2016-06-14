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
public class NumberOfDigits {
    public static void main(String[] args) {
           int n,r,rev=0,c=0;
           Scanner s = new Scanner(System.in);
           System.out.println("Enter n value");
           n=s.nextInt();
           
        int d=n;
        while(n>0)
        {
            r=n%10;
            rev=rev+r;
            n=n/10;
            c++;
        }
        System.out.println("the number of digits in "+" "+d+" "+"are"+" "+c);
    }

    }
    
