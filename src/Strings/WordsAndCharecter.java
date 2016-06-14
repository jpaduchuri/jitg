/*(
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.StringTokenizer;

/**
 *
 * @author miracle
 */
public class WordsAndCharecter {
    
    public static void main(String[] args) {
       int numword=0;
       int numchar=0;
       String st = "jagannadh paduchuri";
        StringTokenizer str = new StringTokenizer(st);
     while (str.hasMoreTokens()) 
     {
         String stt=str.nextToken();
         numword=numword+1;
         int ln =stt.length();
         numchar=numchar + ln;
    }
        System.out.println("The number of words in a string is " + numword);
        System.out.println("The number of charecters in a string is " + numchar);
}
}
