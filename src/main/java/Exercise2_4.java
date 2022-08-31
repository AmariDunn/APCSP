/*
 Amari Dunn
8/31/22
Exercise 2.4
Converts Pounds to Kilos
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;
public class Exercise2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter a number in pounds:");
        
        double pounds = input.nextDouble();
        double kilo = pounds * 0.454;
        
        System.out.println( pounds + " pounds is " + kilo + " kilograms ");
    }
}
