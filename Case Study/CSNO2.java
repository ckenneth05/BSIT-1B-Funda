/*
CSNO2
Instruction:
Write a program that reads in a time of day in 24-hr notation and 
output it in 12-hr notation. For example, if the input is 1345,the 
output should be 1:45 PM. If input is 920, output should be 9:20 
AM. Consider 1200 midnight as 12:00 AM and 1200 noon as 
12:00 PM.
 */
import java.util.Scanner;

class CSNO2{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            System.out.println("Enter your hours(1-24):");
            int hours = input.nextInt();
            System.out.println("Please wait. Processing!");
            Thread.sleep(4000);

            if (hours <= 24 && hours >=1) {
            System.out.println("Your input is valid.");
            }

            else{
                throw new ArithmeticException("The value is invalid. Please try again later!");
            }
            
            System.out.println("Enter your minutes(0 - 59):");
            int minutes = input.nextInt();
            System.out.println("Please wait due to processing!");
            Thread.sleep(4000);

            if (minutes <= 59 && minutes >=0) {
                System.out.println("Okey. Valid number");
            }

            else{
                throw new ArithmeticException("The value is invalid. Please try again later!");
            }

            System.out.println("The conversion from 24-hour format to 12-hour format is now processing. Please wait for a second");
            Thread.sleep(4000);
            
            String timeformat = "AM";

            if (hours >= 13 && hours != 24) {
                timeformat = "PM";
                hours -=12;

            } else if(hours == 24){
                hours = 12;

            } else if (hours == 12){
                timeformat = "PM";
            }

            else{
                hours += 0;

            }


            System.out.println("The conversion of 12-hour notation is:" + hours + ":" + minutes + " " + timeformat);
            Thread.sleep(4000);


            
        } catch (Exception e){
            System.out.println("Error. Please try again later!");
        }
        finally{
            System.out.println("Thank you for using my system!See you again");
        }


        
        
            
        
        
            
       

       
        
        
           


   

       



        

        







        /*System.out.println("Enter a time in 24-hour notation(example 1232,1413, 2311):");

        String timeIn24HourNotation = scanner.nextLine();

        // Split the time string into hours and minutes.
        String[] timeParts = timeIn24HourNotation.split(" ");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Convert the hours to 12-hour notation.
        String amOrPm = "AM";
        if (hours >= 12) {
            amOrPm = "PM";
            hours -= 12;
        }

        // If the hours are 0, then the time is midnight or noon.
        if (hours == 0) {
            hours = 12;
        }

        // Output the time in 12-hour notation.
        System.out.println("The time in 12-hour notation is: " + hours + ":" + minutes + " " + amOrPm); */



    }
}