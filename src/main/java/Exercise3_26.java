/*
Amari Dunn
9/9/22
Exercise 3.26
Display Integer Divisibility
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise3_26 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer");
        int num = input.nextInt();
      
         System.out.print("Is " + num + "  divisible by 5 and 6? ");
         System.out.println(num % 5 == 0 && num % 6 == 0 );
         System.out.print("Is " + num + " divisible by 5 or 6? ");
         System.out.println(num % 5 == 0 || num % 6 == 0 );
         System.out.print("Is " + num + " divisible by 5 or 6, but not both? ");
         System.out.println(num % 5 == 0 ^ num % 6 ==0 );
    }
}
