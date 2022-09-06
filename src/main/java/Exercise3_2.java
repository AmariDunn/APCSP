/*
Amari Dunn
09/6/22
Exercise 3.2
Add Three Numbers
 */

/**
 *
 * @author 142037
 */

import java.util.Scanner;
public class Exercise3_2 {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int number1 = (int)(System.currentTimeMillis() * 1.5 %20);
        int number2 = (int)(System.currentTimeMillis() % 10);
        int number3 = (int)(System.currentTimeMillis() /27 % 5);
        
        System.out.println("What is " + number1 + " + " + number2 + " + " + number3 + "?");
        
        int answer = input.nextInt();
        
        System.out.println( number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer)) ;
    }
}
