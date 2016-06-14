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
public class Calendar {
    
    public static void main(String[] args) {
        
        System.out.println("1.january\n");
        System.out.println("2.February\n");
        System.out.println("3.March\n");
        System.out.println("4.April\n");
        System.out.println("5.May\n");
        System.out.println("6.June\n");
        System.out.println("7.July\n");
        System.out.println("8. August\n");
        System.out.println("9. September\n");
        System.out.println("10. October\n");
        System.out.println("11. november\n");
        System.out.println("12. December\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your choice:");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("31");break;
            case 2:
                int y=sc.nextInt();
                if(y%4==0)
                {
                    System.out.println("29");}
                    else
                    {
                            System.out.println("28");
                            }
            break;
            case 3:
                    System.out.println("31");break;
                case 4:
                    System.out.println("30");break;
                    case 5:
                    System.out.println("31");break;
                        case 6:
                    System.out.println("31");break;
                            case 7:
                    System.out.println("31");break;
                                case 8:
                    System.out.println("31");break;
                                    case 9:
                    System.out.println("31");break;
                                        case 10:
                    System.out.println("31");break;
    case 11:
                    System.out.println("31");break;
           case 12:
                    System.out.println("31");break;     
           default:
               System.out.println("invalid choice.");
     
   
        }
}
}



