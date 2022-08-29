/*
Amari
8/26/22
Exercise 2.1
Calculate Volume of a Cylinder */

/**
 *
 * @author 142037
 */

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the radius and length of a cylinger!");
        
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        double area = radius * radius * 3.141592;
        double volume = area * length;
        
        System.out.println( "The area is " + area);
        System.out.println( "The volume is " + volume);
    }
}
