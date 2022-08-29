/*
Amari
8/26/22
Exercise 2.1
Convert Celcius to Fahrenheit
 */
/**
 * 
 * @author 142037
 */

import java.util.Scanner;

public class Exercise2_1 {
    public static void main (String[] args) {
        //Scanner Object
        Scanner input = new Scanner (System.in);
        
        //User Input
        System.out.println( "Enter a degree in Celsius" );
        
        //Remember that order matters!
        
        //Variables
        double celcius = input.nextDouble();
        double fahrenheit = (9.0/5) * celcius + 32;
        
        //Display Result
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
    }
            
}
