/*
 Amari Dunn
9/7/22
Exercise 3.10
Addition Quiz
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise3_10 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int num1 = (int)(Math.random() * 50);
        int num2 = (int)(Math.random() * 50);
        
        System.out.println("What is " + num1 + " + " + num2 + "?");
        int answer = input.nextInt();
        
        if (answer == num1 + num2)
            System.out.println("Your answer is correct!");
        else {
            System.out.println("Your answer is wrong.");
            System.out.println("The correct answer is " + (num1 + num2));
                    }
        
    }
}
