/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

/**
 *
 * @author miracle
 */
public class Amongthree {
    public static void main(String[] args) {
        int a=6,b=9,c=8 ,d;
        d=c>(a>b?a:b)?c:a>b?a:b;
        System.out.println("max is"+ d);
                }
    
}
