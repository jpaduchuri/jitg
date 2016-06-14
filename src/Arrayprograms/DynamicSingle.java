/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrayprograms;

import java.util.Scanner;

/**
 * 
 *
 * @author miracle
 */
public class DynamicSingle{
    
    public static void main(String[] args) {
        
    Scanner s=new Scanner(System.in);
    System.out.println("enter the number of elments");
    int ncr=s.nextInt();
    int docter[]=new int[ncr];
    String dname[]=new String[ncr];
    float dsal[]=new float[ncr];
    for(int i=0;i<docter.length;i++)
    {
            System.out.println("enter the id name and sal");
         docter[i]=s.nextInt();
        dname[i]=s.next();
        dsal[i]=s.nextFloat();
        
    
    }
    System.out.println("docter\t\tdname\t\tdsal\t");
    for(int i=0;i<docter.length;i++)
    {
       
            System.out.println(dsal[i]+ "\t" +docter[i]+ "\t" +dname[i]+ "\t" );
        }

        
        
        
}
}
