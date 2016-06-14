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
public class Armstrong {
    public static void main(String[] args) {
        
        int n,a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value ");
        n=s.nextInt();
        int c=0,temp ;
        temp=n;
        while(n>0)
                {
                    a=n%10;
                    n=n/10;
                    c=c+(a*a*a);
                }
       if(temp==c){
           System.out.println("The entered number is Armstrong");
       }else{
           System.out.println("tne entered value is not a Armstrong");
       }
    }
    
}
