/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class StudentRecord {

    public static void main(String args[]) {
        double a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter student obtained marks");
        a = s.nextInt();
        if (a <= 35) {
            System.out.println("studetn secured C grade.");
        } else if (a >= 35 && a <= 60) {
            System.out.println("Student secured B ");
        } else {
            System.out.println("Student secured A");
        }
}
                
                

}
