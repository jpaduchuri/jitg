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
public class perfect {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n values");
        n=s.nextInt();
        int sum=0,i;
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum+=i;
        }
    }
    if(sum==n)
    {
        System.out.println("perfect number");
    }
    else
    {
        System.out.println("not perfect number.");
    }

    }
    
}
