/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;


/**
 *
 * @author miracle
 */
   class VoterValid extends Data{
        
          static void ageCalculation(int age) throws Exception {
              if(age<18) {
                  throw new Exception();
              }else{
                  System.out.println("you are eligible to vote");
              }
              
       }
       
   
    public static void main(String[] args) {
        
        VoterValid v=new VoterValid();
         v.setAge(18);
         v.setC('f');
        v.setName(" Jagan");
               
        try
        {
            ageCalculation(v.getAge());         
        }  
        catch(Exception e){
        System.out.println("your not eligible to vote");
        }   
        System.out.println("name is " + v.getName());
            System.out.println("age is " + v.getAge());
            System.out.println("gender is " + v.getC());
    }
    
    }

