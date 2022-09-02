/*
Amari Dunn
9/2/22
Exercise 2.8
Show Time in Timezone
 */

/**
 *
 * @author 142037
 */

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.println("Enter the time zone offset to GMT:");
        
        int offset = input.nextInt();
        
        long totalMil = System.currentTimeMillis();
        long totalS = totalMil / 1000;
        long currentS = totalS % 60;
        long totalMin = totalS / 60;
        long currentMin = totalMin % 60;
        long totalHour = totalMin / 60;
        long currentHour = (totalHour + offset) % 24;
        
        System.out.println("The current time is " + currentHour + ":" + currentMin + ":" + currentS);
    }
}