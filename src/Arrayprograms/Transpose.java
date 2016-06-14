/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrayprograms;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class Transpose {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter total rows and columns: ");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        int array[][] = new int[r][c];
        System.out.println("Enter matrix:");
        for (i = 0; i < r; i++) {
                       for (j = 0; j < c; j++) {
                array[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("The above matrix after Transpose is ");
        for (i = 0; i < c; i++) {
            for (j = 0; j < r; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println(" ");
        }
    }
    
}

