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
public class DrivenCal {
    
    public static void main(String[] args) {
        int a,choice,b;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter ur values");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("Enter ur choice");
        choice=s.nextInt();
      switch(choice)
      {
          case 1:
            double sum=a+b;
              System.out.println("the sum of the two numbers"+ sum);
          case 2:
            double mul =a*b;
              System.out.println("The mul of the two numbers " +mul);
          case 3:
              double div =a%b;
              System.out.println("the div of two numbers is"+div);
          case 4:
              double sub=a-b;
              System.out.println("the sub of two numbers is "+sub);
          default:
              System.out.println("invalid choice%");
      }
        
    }
}
