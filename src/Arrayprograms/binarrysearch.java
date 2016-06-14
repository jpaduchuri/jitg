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
public class binarrysearch {
    public static void main(String[] args) {
        int n,i,first,last,middle,search;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter n values");
        n=s.nextInt();
        int a[] = new int[n];
        
        System.out.println("enter " +n+ "values");
        for(i=0;i<n;i++)
          a[i]=s.nextInt();
        System.out.println("enter value to find");
        search=s.nextInt();
           first  = 0;
    last   = n - 1;
    middle = (first + last)/2;
 
    while( first <= last )
    {
      if ( a[middle] < search )
        first = middle + 1;    
      else if ( a[middle] == search ) 
      {
        System.out.println(search + " founuded at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
 
      middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }

        }
        
        

    
    

