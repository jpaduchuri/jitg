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
public class Biggest {
    public static void main(String[] args) {
         int n,rem=0,big=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value:");
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            if(rem>big)
            {
                big=rem;
            }
            n=n/10;
        }
        //System.out.println("big digit is:"+big);
        if(big==rem)
        {
            System.out.println("all digits are equal.");
        }
        else
        {
            System.out.println("big digit is:"+big);
        }

    }
    
}
