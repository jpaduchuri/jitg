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
public class Represents extends Employee {

    public static void main(String args[]) {

        Represents r1 = new Represents();
       r1.in("jagan",24);
        r1.inint(101, 10000, 2014, "HJK55K");
        r1.display();
        r1.display2();
    }
}
