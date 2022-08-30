/*
 Amari Dunn
8/30/22
Rectangle Class
Calculates area and perimeter
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the width and height of a rectangle!");
                
        double width = input.nextDouble();
        double height = input.nextDouble();
               
        double area = width * height;
        double perimeter = height * 2 + width * 2;
        
        System.out.println("The area of the rectangle is " + area + ". and the perimeter is " + perimeter + "!");
    }
}
