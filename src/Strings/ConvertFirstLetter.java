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
public class ConvertFirstLetter {
   public static String First(String s)
   {
       char a[]=s.toCharArray();
       a[0]=Character.toUpperCase(a[0]);
       return new String(a);
       
   
       }
    public static void main(String[] args) {
        String s="jagannadh";
        String s1=First(s);
        System.out.println(s1);
        
    }
}