/*Christian Kenneth F. Gonzales
 * BSIT-1C
 */



/*Build a program that calculates the Body Mass Index(BMI) based on a person's height and weight.
The user should enter their height(in meters) and weight (in kilograms),
and the program should output their BMI categories(e.g, "Underweight","Normal weight","Overweight", "Obese")
 * 
 */
import java.util.Scanner;

public class Exercises3{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        try{
            double minimum_height = 0.546;
            double maximum_height = 2.74;

            
            double minimum_weight = 17.51;
            double maximum_weight = 635;

            System.out.println("Enter your height in meters in m only");
            double user_height = input.nextDouble();
            
            System.out.println("Please Wait. For verification purposes!");
            Thread.sleep(3000);

            if (user_height >= minimum_height && user_height <= maximum_height ){
                System.out.println("Verification Success!");

            }

            else{
                throw new Exception();
            }
            

            System.out.println("Enter your weight in kilograms in kg only");
            double user_weight = input.nextDouble();
            
            System.out.println("Please Wait. For verification purposes!");
            Thread.sleep(3000);

            

            if (user_weight >= minimum_weight && user_weight <= maximum_weight){
                System.out.println("Verification Success!");
            }

            else{
                throw new Exception();
            }

           

            double BMI = user_weight / (user_height * user_height);

            if( BMI <= 18.5){
                System.out.println("Please Wait!");
                Thread.sleep(3000);
                System.out.println("You are under weight" + " " + BMI + "kg/m^2");
            }
            else if (BMI > 18.5 && BMI <=24.9){
                System.out.println("Please Wait!");
                Thread.sleep(3000);
                System.out.println("You are normal weight" + " " + BMI + "kg/m^2");
            }
            else if (BMI > 24.9 && BMI <= 29.9){
                System.out.println("Please Wait!");
                Thread.sleep(3000);
                System.out.println("You are over weight" + " " + BMI + "kg/m^2");
            }
            else{
                System.out.println("Please Wait!");
                Thread.sleep(3000);
                System.out.println("You are obese" + " " + BMI + "kg/m^2");
            }

        }catch(Exception e){
            System.out.println("Wrong input. Please try again later!");
        }
        
        finally{
            
            System.out.println("Thank you for using my system!");
        }
        input.close();
    }
}