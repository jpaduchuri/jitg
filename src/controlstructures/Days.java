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
public class Days {
    

    public static void main(String  args[]) {
            
        System.out.println("Enter Your value to obtain number of days in a month you wanna know");
        System.out.println("1 : Jan");
        System.out.println("2 : feb");
        System.out.println("3 : mar");
        System.out.println("4 : apr");
        System.out.println("5 : may");
        System.out.println("6 : Jun");
        System.out.println("7 : Jul");
        System.out.println("8 : aug");
        System.out.println("9 : sep");
        System.out.println("10 : oct");
        System.out.println("11 : nov");
        System.out.println("12 : dec");
        Scanner sc = new Scanner(System.in);
              System.out.println("enter ur choice");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("jan has 31");
                break;
            case 3:
                System.out.println("march has 31 days");
                break;
            case 5:
                System.out.println("may has 31 days");
                break;
            case 7:
                System.out.println(" july 31 days");
                break;
            case 8:
                System.out.println("aug has 31 days");
                break;
            case 10:
                System.out.println("oct has 31 days");
                break;
            case 12:
                System.out.println("dec has 31 days");
                break;

            case 4:
                System.out.println("april has 30 days");
                break;
            case 6:
                System.out.println("june has 30 days");
                break;
            case 9:
                System.out.println(" sep30 days");
                break;
            case 11:
                System.out.println("nov has 30 days");
                break;
            case 2:
                System.out.println("feb has 28");
                break;
            default:
                System.out.println("entered invalid");
        }

    }
}

    
