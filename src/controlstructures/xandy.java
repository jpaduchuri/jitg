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
public class xandy {
    public static void main(String[] args) {
        int x,y;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values");
        x=s.nextInt();
        y=s.nextInt();
        if(x>0 && y==0)
        {
            System.out.println("Entered values in x-axis ");
        }else if(x==0 && y >0) 
            System.out.println("Entered values in y-axis");
        else
           System.out.println("Entered values in origin ");
        
        
    }
    
}
