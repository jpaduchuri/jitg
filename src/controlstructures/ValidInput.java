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
public class ValidInput {
    public static void main(String[] args) {
          int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n val:");
        n=sc.nextInt();
        if(n>0 && n<10)
        {
            System.out.println("you entered number"+" "+n);  
        }
        else
        {
            System.out.println("invalid number.");
        }

    }
}
