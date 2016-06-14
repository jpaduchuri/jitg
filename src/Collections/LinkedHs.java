/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedHashSet;
/**
 *
 * @author miracle
 */
public class LinkedHs {
    
   
    public static void main(String[] args) {
        
        LinkedHashSet lhs=new LinkedHashSet();
        CEO c1=new CEO();
        c1.initCEO(101,"PrasadLokam",45000,"Miracle");
        CEO c2=new CEO();
        c2.initCEO(102,"GuruNani",100000000,"TechMahindra");
        CEO c3=new CEO();
        c3.initCEO(103,"Abhi",130000000,"Wipro");
        
        CEO c4=new CEO();
        c4.initCEO(104,"Naresh",20000000,"Symbiosys");      
       lhs.add(c1);
       lhs.add(c2);
       lhs.add(c3);
       lhs.add(c4);
       lhs.add(c1);
       Iterator lr=lhs.iterator();
         while(lr.hasNext())
       {
           CEO c=(CEO)lr.next();
           c.display();
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter barcode of"+c.getCompanyName()+"CEO");
          int id=sc.nextInt();
          if(id==c.getId())
          {
              System.out.println("you can allow to meeting");
          }else
          {
              System.out.println("you are not ceo of "+ c.getCname());
          }

    }

 }
}

    /*private Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    */

   







   



