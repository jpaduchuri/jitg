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
public class prime {
 
    public static void main(String[] args) {
        
        int a,status;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the range u want ");
        a=s.nextInt();
        for(int i=2;i<=a;i++)
        {
            status =1;
            for (int j=2;j<i;j++)
        
            if(i%j==0)
            {
                status = 0;
                break;
    
            }
        
        if ( status == 1)
        
            System.out.println(i);
        }
    }
}
    

    