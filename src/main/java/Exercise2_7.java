/*
 Amari Dunn
9/2/22
Exercise 2.7
Display Years and days
 */
 
/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise2_7 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the nubmer of minutes: ");
        int minutes = input.nextInt();
        int remainingMinutes = minutes;
        
        int years = (remainingMinutes / 525600) ;
        remainingMinutes = remainingMinutes % 525600;
        
        int days = remainingMinutes / 1440;
        
        System.out.println( minutes + " minutes is approximately " + years + " years and " + days + " days" );
        
    }
}