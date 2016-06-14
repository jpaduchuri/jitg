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
public class DeleteCharecter {
    public static void main(String[] args) {
        
        StringBuffer bf = new StringBuffer("miracle software");
        System.out.println(" the given Charecter is " + bf);
        bf.delete( 8, 16);
        System.out.println(" After deleting the Charecter is  " + bf);
    }
}
