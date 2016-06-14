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
public class Alternative {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number ");
        n=s.nextInt();
        int temp,r,r1,i=0;
        temp=0;
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            temp=temp*10+r;
            
        }
        while(temp!=0)
        {
            r1=temp%10;
            temp=temp/10;
            i++;
            if(i%2==1)
            {
                System.out.println(r1);
            }
        }
        
    }
    
}
