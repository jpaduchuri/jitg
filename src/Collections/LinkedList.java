/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.Scanner;

import java.util.Iterator;

/**
 *
 * @author miracle
 */
public class LinkedList {
        public static void main(String[] args) {
         int n=6;
        LinkedList l1=new LinkedList();
        BankEmployee b1=new BankEmployee();
        Address add1=new Address();
        add1.init(121,"gandhi","vzm","vzm");
        b1.init("santosh",5001, add1, "12345678");
        BankEmployee b2=new BankEmployee();
        Address add2=new Address();
        add2.init(122,"nehru","vzm","vzm");
        b2.init("sumanth",5002, add2, "9876543");
        BankEmployee b3=new BankEmployee();
        Address add3=new Address();
        add3.init(123,"vivekanadha","vzm","vzm");
        b3.init("naidu",5003, add3, "8976543");
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
          Iterator itr5=l1.iterator();
                   while(itr5.hasNext())
                   {
                     BankEmployee obj=(BankEmployee)itr5.next();
                    obj.Display();
            
                    }
                     
        do{
        System.out.println("enter the value");
        System.out.println("1.add employee");
        System.out.println("2.delete employee");
        System.out.println("3.search employee");
        System.out.println("4.repalce employee");
        System.out.println("5.view employee");
        System.out.println("6.exit");
        
        Scanner s=new Scanner(System.in);
        int ch= s.nextInt();
        
        
            switch(ch)
            {
                case 1:
                     BankEmployee b4=new BankEmployee();
                     Address add4=new Address();
                     add4.init(124,"patel","vzm","vzm");
                     b4.init("vinay",5004, add4, "8976543123");
                     l1.add(b4);
                     break;
                     
                case 2:
                    System.out.println("enter the position to delete");
                    int d=s.nextInt();
                    l1.remove(d-1);
                    System.out.println("given customer is deleted");
                    break;
                    
                case 3:
                    
                     Iterator itr2=l1.iterator();
                  while(itr2.hasNext())
               {
                BankEmployee  obj=(BankEmployee)itr2.next();
               Scanner sc1=new Scanner(System.in);
               System.out.println("Enter accno to search employee");
               int eid=sc1.nextInt();
               if(eid==obj.getEid())
             {
                System.out.println(obj.getEid()+"Customer is Existed..");
                break;
             }
                    
             }break;
                case 4:
                   
               
                 l1.set(1,b3);
             
                System.out.println("employee replaced");
                
              
                    
                break;
                case 5:
                    Iterator itr4=l1.iterator();
                   while(itr4.hasNext())
                   {
                     BankEmployee obj=(BankEmployee)itr4.next();
                    obj.Display();
            
                    }
                     break;
                case 6 :
                        break;
            }
        }while(n>0);
            
                    

   
    
}

    private Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}    