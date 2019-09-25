/**
 * Skeleton code for while loops practice day.
 * 
 * @author Roy Chancellor
 * @version 3/15/2019
 */
import java.util.Scanner;
public class WhileLoops
{
    public static void main( String args []){
        int a;
        double b, c,d,e;
        System.out.println("choose your option");
        Scanner s = new Scanner (System.in);
        System.out.println("1) Square a number");
        System.out.println("2) Cube a number");
        System.out.println("3) Quit");
        a= s.nextInt();
        while(a!=3){
            if (a==1){
                System.out.println("choose a number to square");
                b=s.nextDouble();
                c=b*b;
                System.out.println();
                System.out.println(c);
                System.out.println("1) Square a number");
                System.out.println("2) Cube a number");
                System.out.println("3) Quit");
                System.out.println();
                a=s.nextInt();
            }
            else if (a==2){
                System.out.println("choose a number to cube");
                d=s.nextDouble();
                e=d*d*d;
                System.out.println();
                System.out.println(e);
                System.out.println("1) Square a number");
                System.out.println("2) Cuber a number");
                System.out.println("3) Quit");
                System.out.println();
                a=s.nextInt();
            }
            System.out.println();
            System.out.println("You closed the Program");
                s.close();
            
                
        
        
        
        
    }
}
}
