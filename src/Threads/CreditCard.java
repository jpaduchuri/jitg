/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import java.util.logging.Level;
//import java.util.logging.Logger;

/**
 *
 * @author miracle
 */
public class CreditCard extends Thread {
    
    int bal=10000;
    int amount;
    public void  setAmount(int amount){
        this.amount=amount;
    }
    
   
synchronized public void run()
    {
        /*synchronized(this)*/
                {
        System.out.println("The available balance is " +bal);
        
        
    
    if(bal>=amount)
    {
         String name =Thread.currentThread().getName();
        
                 
        try {
            Thread.sleep(200);
            bal=bal-amount;
             System.out.println(bal+" is withdraw by " + name);
        } catch (InterruptedException ex) {
            System.out.println(ex);
           // Logger.getLogger(CreditCard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
                
    else{
        System.out.println("not available");
    }
    }
    }
    public static void main(String[] args) {
        CreditCard cr =new CreditCard();
       cr.setAmount(11000);
        Thread t1 = new Thread(cr);
        t1.setName("husband");
        t1.start();
         Thread t2= new Thread(cr);
        t2.setName("wife");
        t2.start();
    }
    
   
}   


