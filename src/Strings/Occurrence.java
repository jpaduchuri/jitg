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
public class Occurrence {
    public static void main(String[] args) {
        int acount=0,bcount=0;
        String str="abba";
       
        for(int i=0;i<str.length();i++)
        {
         char ch=str.charAt(i);
        switch(ch)
        {
            case 'a':acount++;
                      break;
           case 'b':bcount++;
                     break;
            default:System.out.println("not a character");
        }
        System.out.println(acount);
    }

    }
    
    
    
    
}
