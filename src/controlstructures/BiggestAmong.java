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
public class BiggestAmong {
    public static void main(String args[]){
        int a,b;
               Scanner s = new Scanner(System.in);
               System.out.println("Enter values");
               a=s.nextInt();
               b=s.nextInt();
        if (a>b){
            System.out.println("a is biggest number");
        }else
        {
        System.out.println("b isbiggest number");
    }
    
}
}
