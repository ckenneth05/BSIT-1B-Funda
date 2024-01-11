/*Christian Kenneth F. Gonzales
 * BSIT-1C
 */



/* Build a basic calculator that can perform addition, subtraction, multiplication, and division based on user input. 
Take two numbers and an operator as input and display the result
 *
 */



import java.util.Scanner;

public class Exercises2{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        try{
            char add_operator = '+';
            char sub_operator = '-';
            char multip_operator = '*';
            char div_operator = '/';
            double result = 0;


            System.out.println("Enter the first number:");
            double first_num = input.nextDouble();

            System.out.println("Enter the second number:");
            double second_num = input.nextDouble();
            System.out.println("Please wait");
            Thread.sleep(3000);

            System.out.println("\nHERE'S THE AVAILABLE OPERATOR TO CHOOSE!");
            System.out.println("Type the symbol for addition operator '+'");
            System.out.println("Type the symbol for subtraction operator '-'");
            System.out.println("Type the symbol for multiplication operator '*'");
            System.out.println("Type the symbol for division operator '/'");



            System.out.println("\nSelect the operator:");
            char operator = input.next().charAt(0);
            System.out.println("Please wait for verification if the input is correct!");
            Thread.sleep(3000);

            input.close();

            if (operator == add_operator){
                System.out.println("System verification success!");
                System.out.println("Please Wait");
                Thread.sleep(3000);
            }
            else if (operator == sub_operator){
                System.out.println("System verification success!");
                System.out.println("Please Wait");
                Thread.sleep(3000);
            }
            else if (operator == multip_operator){
                System.out.println("System verification success!");
                System.out.println("Please Wait");
                Thread.sleep(3000);
            }
            else if (operator == div_operator){
                System.out.println("Verification success");
                System.out.println("Please Wait");
                Thread.sleep(3000);
            }
            else{
                throw new IllegalArgumentException();
            }
            switch(operator){
                case '+':
                    result = first_num + second_num;
                    System.out.println("The result is:" + " " + result);
                    System.out.println("Please wait");
                    Thread.sleep(3000);
                    break;
                case '-':
                    result = first_num - second_num;
                    System.out.println("The result is:" + " " + result);
                    System.out.println("Please wait");
                    Thread.sleep(3000);
                    break;
                case '*':
                    result = first_num * second_num;
                    System.out.println("The result is:" + " " + result);
                    System.out.println("Please wait");
                    Thread.sleep(3000);

                    break;
                case '/':
                    result = first_num / second_num;
                    System.out.println("The result is:" + " " + result);
                    System.out.println("Please wait");
                    Thread.sleep(3000);
                    break;
            }




            

        }catch(Exception e){
            System.out.println("Please try again later!");
        }
        
        finally{
            
            System.out.println("Thank you for using my system!");
        }


    }
}