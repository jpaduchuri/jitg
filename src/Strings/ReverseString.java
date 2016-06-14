/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author miracle
 */
public class ReverseString {
    public static void main(String[] args) {
      
        
        int i;
         String str="jagannadh";
        String reverse="";
        for(i=str.length()-1;i>=0;i--)
            {
            reverse+=str.charAt(i);
             }
        System.out.println("reverse string is\t"+reverse);
   
        
        
    }
    
    
}
