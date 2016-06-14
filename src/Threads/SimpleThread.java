/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author miracle
 */
public class SimpleThread  extends Thread{
    
    public void run()
    {
        System.out.println("Thread is running....");
    }
    public static void main(String[] args) {
        SimpleThread s1=new SimpleThread();
        s1.start();
    }
}
