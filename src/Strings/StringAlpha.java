/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class StringAlpha {
    
    
    public static void main(String args[]) throws Exception
{
    
     String temp;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    int n=sc.nextInt();
    String str[]=new String[n];
    
    for(int i=0;i<n;i++)
    {
     for(int j=0;j<n;j++)
     {
         if(str[i].compareTo(str[j])>0)
         {
                
             temp=str[i];
             str[i]=str[j];
             str[j]=temp;
         }
     }
    }
}

}
    
    

