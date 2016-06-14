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
public class Person {

    String s;
    int age;

    public void in(String s, int age) {
        this.s = s;
        this.age = age;
    }

    public void display() {
        System.out.println(s);
        System.out.println(age);

    }

}
