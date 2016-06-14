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
public class Employee extends Person {

    int eid;
    double salary;
    int year;
    String ins;

    public void inint(int eid, double salary, int year, String ins) {

        this.eid = eid;
        this.salary = salary;
        this.year = year;
        this.ins = ins;
    }

    public void display2() {

        System.out.print(eid+"\t");
        System.out.print(salary+"\t");
        System.out.print(year+"\t");
        System.out.print(ins+"\t");

    }

}
