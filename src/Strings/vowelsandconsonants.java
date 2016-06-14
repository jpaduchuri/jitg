/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class vowelsandconsonants {
    public static void main(String[] args) {
          int vowels=0,consonants=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the string");
        String str=sc.nextLine();
        str= str.toLowerCase();
         for(int i=0;i<str.length();i++)   
         {
             char ch=str.charAt(i);
             if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
             {
                 vowels++;
             }
             else
             {
                 consonants++;
         
             }
         }
                      System.out.println("vowels:"+vowels);
             System.out.println("consonants:"+consonants);

         
         

        
        
        
    }
    
    
    
}
