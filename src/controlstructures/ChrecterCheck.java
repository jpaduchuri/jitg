/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author miracle
 */
public class ChrecterCheck {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("enter ur value");

        char a = (char) br.read();
        if (a >= 65 && a <= 90) 
            System.out.println("The entered number is in Upper case");
         else if (a >= 97 && a <= 122) 
            System.out.println("The entered number is Lowercasae");
         else if (a >= 48 && a <= 57) 
            System.out.println("the entered number is digit");
         else 
            System.out.println("the entered number is special charecter");
        
    }
}
