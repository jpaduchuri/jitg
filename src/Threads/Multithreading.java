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
public class Multithreading extends Thread {
     int num1;
     int num2;
     public static void add(int num1,int num2)
     {
            int add= num1+num2;
         System.out.println("addition is"+ add);
     }
    public static void sub(int num1,int num2)
    {
     
      int sub=num1-num2;
        System.out.println("sub is"+ sub);  
    }
    public static  void mul(int num1,int num2)
    {
         int mul=num1*num2;
         System.out.println("multiplication is" + mul );
         
    }
    public void div(int num1,int num2)
    {
    int  div=num1/num2;
        System.out.println("division is"+div);
        
    }    
     public void run()
     {
         String name = Thread.currentThread().getName();
         if(name.equals("first Thread"))
         { 
             add(5,3);
         }else if(name.equals("second thread")){
             sub(9,4);
         }else if(name.equals("third thread"))
         {
            mul(4,3);    
         
     }else if(name.equals("fourth thread"))
     {
        div(12,4);
    }
     }
}
    
