/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrayprograms;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class linearsearch {
    public static void main(String[] args) {
        int n,i,search;
        Scanner  s = new Scanner(System.in);
        System.out.println("enter number of values");
        n=s.nextInt();
        System.out.println(" Enter "+ n + " values");
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
                  
        }
        System.out.println("Enter value for search");
        search=s.nextInt();
        for(i=0;i<n;i++)
        
            if(a[i]==search)
            {                System.out.println(search +" values in preset at at "+ i + "position");
                break;
            }             
            else if(i==n)
                    {
                        System.out.println("entered number not in list");
        }
            
        }
    
}
