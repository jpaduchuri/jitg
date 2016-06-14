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
public class fibano {
    public static void main(String[] args) {
        
  
        int n,t,p=0,nxt=1;
        System.out.println("enter for series to be printed");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println(p);
        System.out.println(nxt);
        while(n>0)
        {
     t=p;
     p=nxt;
     nxt=t+p;
     System.out.println(nxt);
     n--;
            
        }
        
    }

    }
    
