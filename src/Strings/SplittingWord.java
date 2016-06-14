/*
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
public class SplittingWord {
    public static void main(String[] args) {
        StringTokenizer sr =new StringTokenizer("my name is jagan");
        while(sr.hasMoreTokens())
        {
            
             String s1=sr.nextToken();
           
            System.out.println(s1);
        }
    }
    
}
