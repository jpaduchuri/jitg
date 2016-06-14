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
public class DynamicTwo {
    public static void main(String[] args) {
        
    Scanner s=new Scanner(System.in);
    int docter[][]=new int[3][3];
    String dname[][]=new String[3][3];
    float dsal[][]=new float[3][3];
    for(int i=0;i<docter.length;i++)
    {
        for(int j=0;j<dname.length;j++)
        {
            System.out.println("enter the id name and sal");
         docter[i][j]=s.nextInt();
        dname[i][j]=s.next();
        dsal[i][j]=s.nextFloat();
        }
    
    }
    System.out.println("docter\t\tdname\t\tdsal\t");
    for(int i=0;i<docter.length;i++)
    {
        for(int j=0;j<dname.length;j++)
        {
            System.out.println(docter[i][j]+"\t"+dname[i][j]+"\t"+dsal[i][j]+"\t");
        }
    }
    }
    
}
