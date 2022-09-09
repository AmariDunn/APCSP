/*
 Amari Dunn
9/9/22
Exercise 3.14
Heads or Tails
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise3_14 {
    public static void main(String[] args){
     Scanner input = new Scanner (System.in);
     int side = (int)(Math.random() * 2);
     
     System.out.println("Guess if the coin is heads (0) or tails (1).");
     int guess = input.nextInt();
     
     if (side == 0 && side == guess)
         System.out.println("That is correct!");
      else if (side == 1 && side == guess) 
         System.out.println("That is correct!");
      else if (side == 0 && side != guess) 
         System.out.println("That is incorrect, the coin landed on heads!");
      else if (side == 1 && side != guess) 
         System.out.println("That is incorrect, the coin landed on tails!");
     
     
    }
}
