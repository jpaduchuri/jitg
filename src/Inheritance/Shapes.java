/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author miracle
 */
public abstract class Shapes{
    abstract void numofsides();  
}
class Triangle extends Shapes{
    int side=4;
    void numofsides(){
        System.out.println(side);
    }
}

class Hexa extends Shapes{
    int side1=6;
          void numofsides(){
              System.out.println(side1);
          }
}

class Trapz extends Shapes{
    int side1=5;
          void numofsides(){
              System.out.println(side1);
          }
    public static void main(String[] args) {
        Trapz z=new  Trapz();
        Hexa h=new Hexa();
        Triangle t=new Triangle();
        z.numofsides();
        h.numofsides();
        t.numofsides();
     }
}
        

