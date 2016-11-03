/**
 * Created by Lazarus on 3.11.2016.
 */
public class HarjutusedCh5_1 {
 /* Exercise 5.1 Logical operators can simplify nested conditional statements.
    For example, can you rewrite this code using a single if statement?
    if (x > 0) {
        if (x < 10) {
            System.out.println("positive single digit number.");
        }
    }
    */

 public static void main(String[]args){
     int x=6;
     if (x > 0 && x < 10){
         System.out.println("positive single digit number.");
     }
 }


}
