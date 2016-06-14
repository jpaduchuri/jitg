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
public class Data {
    
    public String name;
    public int age;
    public char c;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }

    public Data() {
    }

    public Data(String name, int age, char c) {
        this.name = name;
        this.age = age;
        this.c = c;
    }
   
}
