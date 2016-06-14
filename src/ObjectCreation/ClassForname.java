/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectCreation;



public class ClassForname {
    int num;
    String s;
    public  void getdata(int num,String s)
    {   
        this.num=num;
       this.s=s;
    }
    
    public void display(){
        System.out.println("Number is " + num +"s is " + s);
    }
    public static void main(String[] args) {
        Class c=class.forname("ObjectCreatio n.ClassForname");
                
        
    }
    
}
