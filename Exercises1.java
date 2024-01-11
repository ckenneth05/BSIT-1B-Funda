/*Christian Kenneth F. Gonzales
 * BSIT-1C
 */


/*  Write a program that determines whether a given year is a leap year. 
A leap year is divisible by 4, but not by 100, unless it is also divisible by 400. */


import java.util.Scanner;

public class Exercises1{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        try{

            System.out.println("Hi. Please type any year except zero (0):");
            int year = input.nextInt();
            System.out.println("Please Wait");
            Thread.sleep(3000);

            input.close();
          

            if (year >= 1){
                 System.out.println("Verification Success!");
            }
            else{
                throw new ArithmeticException();
            }

            if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0){
                System.out.println("Your given year is leap year");
            }
            else{
                System.out.println("Your given year is not a leap year");
            }

        }catch(Exception e){
            System.out.println("Please try again later!");
        }
        finally{
            System.out.println("Thank you for using my system!");
        }


    }
}