/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrayprograms;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class InsertElement {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int n,i,pos,x;
                Scanner s=new Scanner(System.in);
        System.out.println("Enter number of elements");
       
       n=s.nextInt();
       
       int a[] =new int[n];
    
       for(i=0;i<a.length;i++);
       {
           a[i]=s.nextInt();
       }
        System.out.println("Enter the position where you want to insert element");
        {
            pos =s.nextInt();
        }
        System.out.println("Enter the element you want to insert");
        x=s.nextInt();
       for(i=n;i>pos;i--)
       {
         a[i+1]=a[i];
       }
       a[pos]=x;
        System.out.println("after inserting");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
}}

