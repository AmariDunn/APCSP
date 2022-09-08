/*
 Amari Dunn
9/8/22
Exercise 3.5
Find Future Dates
 */

/**
 *
 * @author 142037
 */
import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter today's day: ");
        int day = input.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        switch (day){
            case 0: System.out.print("Today is Sunday"); break;
            case 1: System.out.print("Today is Monday"); break;
            case 2: System.out.print("Today is Tuesday"); break;
            case 3: System.out.print("Today is Wednesday"); break;
            case 4: System.out.print("Today is Thursday"); break;
            case 5: System.out.print("Today is Friday"); break;
            case 6: System.out.print("Today is Saturday"); break;
            default: System.out.println("Today is not a day");
            System.exit(1);
        }
        switch ((elapsed + day) % 7){
            case 0: System.out.print(" and the future day is Sunday"); break;
            case 1: System.out.print(" and the future day is Monday"); break;
            case 2: System.out.print(" and the future day is Tuesday"); break;
            case 3: System.out.print(" and the future day is Wednesday"); break;
            case 4: System.out.print(" and the future day is Thursday"); break;
            case 5: System.out.print(" and the future day is Friday"); break;
            case 6: System.out.print(" and the future day is Saturday"); 
        }    
        
    }
}
