/*CSNO4
Instruction: The cost of a brand new car is P420,000 for GL model and 
P398,000 for XL model. If a car phone will be installed, an 
additional P40,000 will be added to the cost. Moreover, a 15% 
discount on the total cost will be given if the buyer pays in full 
(not installment). 
Write a program that would input the car model bought whether with 
car phone (use code "W" for car with car phone and "O" for without 
car phone) and whether it will be paid in full (use code "F" for full 
payment and "I" for installment). Program must then output the net 
cost of the car.
*/

import java.util.Scanner;

class CSNO4{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);

            System.out.println("Car Salesman: Hi <User>. My name is Christian Kenneth F. Gonzales.");
            Thread.sleep(3000);

            System.out.println("Car Salesman: It's my pleasure to serve you today.");
            Thread.sleep(3000);

            System.out.println("Car Salesman: Here's the available list of our product and its price.");
            Thread.sleep(3000);

            System.out.println("\n**Brand New Car**");

            System.out.println(">GL Model => P 420,000 \t XL Model => P398,000");
            System.out.println("\nAdditional Options\nCarPhone => P 40,000");
            
            Thread.sleep(3000);

            System.out.println("\nChoose the car you want to buy\nType \"G\" to select the GL Model and Type \"X\" to select XL Model\nEnter:");
            char car_select = input.next().charAt(0);

            System.out.println("\nDo you want to install car phone on your selected car?\nType \"W or w\" to install car phone and Type \"O or o\" without car phone\nEnter:");
            char carphone_select = input.next().charAt(0);

            System.out.println("\nIf you select Fully-paid, you get 15% discount on the items you pick");
            System.out.println("Do you want to fully-paid or do you want to proceed to installment?:\nType \"F or F\" to select fully-paid and Type \"I or i\" for installment\nEnter:");
            char Fullpayment_select = input.next().charAt(0);

            System.out.println("\nPlease wait for a second!");
            Thread.sleep(3000);


            if (car_select == 'G'| car_select == 'g' | car_select == 'X'|car_select == 'x' && carphone_select == 'W' | carphone_select == 'w' | carphone_select == 'O' | carphone_select == 'o' ){
                System.out.println("\nVerification passed!");
                Thread.sleep(1000);
                System.out.println("\nPlease wait for a second!");


            }
            else{
                throw new IllegalArgumentException("\nError. Your input doesn't found in our system. Please try again later!");
            }




            float gl_selected = 0f;
            float xl_selected = 0f;
            float car_phone = 0f;
            double result = 0f;

            if (car_select == 'G' ||car_select == 'g'){
                gl_selected = 420000;
            }
            if (car_select == 'X' || car_select == 'x'){
                xl_selected = 398000;
            }

            if (carphone_select == 'W' || carphone_select == 'w'){
                car_phone = 40000;
            }


            System.out.println("\nCar Salesman:After you choose, Let's proceed to calculation of the Net Cost");
            Thread.sleep(3000);
            System.out.println("\nCar Salesman:The formula for net cost is  the base cost of your choosen car plus the additonal features minus Discount");
            Thread.sleep(3000);

            if (Fullpayment_select == 'F' | Fullpayment_select == 'f'){
                result = gl_selected + xl_selected + car_phone - 0.15;
            } else{
                result = gl_selected + xl_selected - 0;
            }

            System.out.println("\nCar Salesman: The net cost of the car is:" + "P" + (float) result);
            Thread.sleep(3000);

        }
        catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("\nThank you for using my system! Arigatogusaimasuu");
        }
            

        




        
    }
}