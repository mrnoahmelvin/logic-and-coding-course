import java.util.Arrays;
import java.util.Scanner;
public class PrimeSieve {
   public static boolean[] sieve = new boolean [1000];
    
   public static void main(String[] args) {
       Arrays.fill(sieve, true); //sets all values to true
       sieve[0] = false;
       sieve[1] = false;
       int numnber=0;
       int corn = 12;
       int inputTooHoo=12;
       Scanner kets = new Scanner(System.in);
       while (corn == 12) {
           System.out.println("What a number do you a want???");
            inputTooHoo = kets.nextInt();
            if(inputTooHoo>=1) {
                corn = 13;
            }
            else{
            }
            }
    
       for(int i=2; i<=999;i++){
           //wrote al gore by self
           for(int l=2*i;l<=999;l+=i){
               sieve[l] = false;
           }              
       }  
     int[] tegerity = collectPrimes();
     printPrimeFactors(inputTooHoo, tegerity);
     System.out.print(Arrays.toString(tegerity));
     }
   public static int[] collectPrimes() {
       int count=0;
    for(int handyMan = 0;handyMan<=999;handyMan++) {
        if(sieve[handyMan] == true) {
           count++;
        }
     }
     int jakob = 0;
     int[] numburger = new int[count];
    for(int handyMan = 0;handyMan<=999;handyMan++) {
        if(sieve[handyMan] == true) {
            numburger[jakob] = handyMan;
            jakob++;
        }
    }
    return numburger;
    }
   public static void printPrimeFactors(int veryCool, int[] seive){
       
       System.out.println("The prime factoriiztion of " + veryCool + " is: ");
       
       for(int hughNuetron = 0; hughNuetron<veryCool; hughNuetron++) {
           int amount = 0;
           while (veryCool%seive[hughNuetron]==0) {
                amount++;
               veryCool = veryCool/seive[hughNuetron];
                
        }
        if(amount>0){
        System.out.println(seive[hughNuetron] + ": " + amount);
        }
    }
   }
}
