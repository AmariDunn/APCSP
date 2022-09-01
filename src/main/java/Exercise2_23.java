/*
Amari Dunn
9/1/22
Exercise 2.23
Cost of Driving Trip
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise2_23{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the driving distance: ");
        
        double distance = input.nextDouble();
        
        System.out.println("Enter miles per gallon");
        double mpg = input.nextDouble();
        
        System.out.println("Enter price per gallon");
        double ppg = input.nextDouble();
        
        double cost = (distance / mpg) * ppg;
        cost = (int)(cost * 100) / 100.0;
        
        System.out.println("The cost of driving is $" + cost);
    }
}