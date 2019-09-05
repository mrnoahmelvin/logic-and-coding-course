/**
 * Skeleton of a program that takes in the user's birth month and determines the number of days in the month
 *
 * @author Roy Chancellor
 * @version 2/6/2019
 */

import java.util.Scanner;  //enables user input

public class Birthday
{
    public static void main( String[] args) {
        //variable declarations
        int m;
        
        //get user input
        Scanner keys = new Scanner(System.in);
        System.out.println("what month you were you born");  //prompt the user for a birth month
        //your birth month variable = keys.nextInt();
        m= keys.nextInt();
        keys.close();
        
        //determine the number of days in the user's birth month
        if (m == 1|| m== 3|| m== 5|| m==7||m==8||m==10||m==12){
        System.out.println("your month has 31 days i it");
    }
    else if (m== 9||m==4||m==6||m==11){
        System.out.println("your month has 30 days in it");
    }
    else if (m==2){
        System.out.println("your month has either 28 or 29 days");
    }
        //output the result to the user
        System.out.println("");
    }
}