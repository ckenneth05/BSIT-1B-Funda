/*CSNO5
Instruction: Write a program that would input fruit code bought by the 
customer, its type code ("I" for imported and "L" for local), and the 
quantity. Program must then output the customer's total bill. */






import java.util.Scanner;

class CSNO5{
    public static void main(String[] args){
        try{
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);


            System.out.println("Fruit Dealer: Hi <User>. My name is Christian Kenneth F. Gonzales.");
            Thread.sleep(3000);

            System.out.println("Fruit Dealer: It's my pleasure to serve you today.");
            Thread.sleep(3000);

            System.out.println("Fruit Dealer: Here's the available list of our products.");
            Thread.sleep(3000);

            System.out.println("\n**Store of Asia Fruit Shop**");

            System.out.println("\nFruit Code\tFruit Name\tLocal\t\tImported");
            System.out.println("\nG\t\tGUAVA\t\tP4.50/pcs\tP25.50/pcs");
            System.out.println("\nA\t\tAVOCADO\t\tP75.50/dz\tP250.00/dz");
            System.out.println("\nP\t\tPOMELO\t\tP150.00/dz\tP200.00/dz");
            System.out.println("\nM\t\tMANGO\t\tP50.00/pcs\tP60.00/pcs");
            System.out.println("\nY\t\tPAPAYA\t\tP23.00/pcs\tP25.00/pcs");

            Thread.sleep(5000);

            System.out.println("\nPlease input the code for the fruit you want as shown in the list.Take note: Just make sure you type the correct code and capital letter or else it will generate an error");
            System.out.println("Here is your selection for the fruit: \"G\" for Guava, \"A\" for Avocado, \"P\" for Pomelo, \"M\" for Mango, \"Y\" for papaya");
            System.out.println("Enter:");
            char fruit_code = input.next().charAt(0);

            System.out.println("\nPlease wait..........");
            Thread.sleep(3000);

            if(fruit_code == 'G' || fruit_code == 'A' || fruit_code == 'P' || fruit_code == 'M' || fruit_code == 'Y') 
            {
                System.out.println("Verified Successfully");
            }
            else{
                throw new IllegalArgumentException("Wrong imput. Please try again later.");
            }

            System.out.println("\nDo you want to buy a fruit from local (L) or imported (I)?.Take note: Just make sure you type the correct code and upper case letter or else it will generate an error");
            System.out.println("Enter:");
            char origin = input.next().charAt(0);
            System.out.println("\nPlease wait..........");
            Thread.sleep(3000);
            
            if(origin == 'L' || origin == 'I') 
            {
                System.out.println("Verified Successfully");
            }
            else{
                throw new IllegalArgumentException("Wrong imput. Please try again later.");
            }

            System.out.println("\nSelect a unit pieces (pcs) or dozens(dz).Take note: Just make sure you type the correct code and input the lower case letter only or else it will generate an error");
            System.out.println("Enter:");
            String unit = input2.nextLine();

            System.out.println("\nPlease wait..........");
            Thread.sleep(3000);

            if(unit.equals("pcs") || unit.equals("dz"))
            {
                System.out.println("Verified Successfully");
            }
            else{
                throw new IllegalArgumentException("Wrong imput. Please try again later.");
            }

            System.out.println("\nHow many " + unit + " " + "do you want to buy?:(number only)");
            System.out.println("Enter:");
            int quantity = input2.nextInt();

            System.out.println("\nPlease wait..........");
            Thread.sleep(3000);

            if(quantity >= 0 )
            {
                System.out.println("Verified Successfully");
            }
            else{
                throw new ArithmeticException("Wrong imput. Please try again later.");
            }

            float total_cost = 0f;

            switch(fruit_code){
                case 'G':
                    if(origin == 'L' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 4.50f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'L' && unit.equals("dz")){
                        total_cost = 4.50f * 12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("pcs") && quantity <= 11){
                        total_cost = 25.50f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("dz")){
                        total_cost = 4.50f * 12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                case 'A':
                    if(origin == 'L' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 6.29f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'L' && unit.equals("dz")){
                        total_cost = 75.50f  * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 20.83f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("dz")){
                        total_cost = 250f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                case 'P':
                     if(origin == 'L' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 12.50f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'L' && unit.equals("dz")){
                        total_cost = 150f  * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 16.66f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("dz")){
                        total_cost = 200f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                case 'M':
                    if(origin == 'L' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 50f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'L' && unit.equals("dz")){
                        total_cost = 50f * 12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 60f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("dz")){
                        total_cost = 60f * 12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                case 'Y':
                    if(origin == 'L' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 23f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'L' && unit.equals("dz")){
                        total_cost = 23f *12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("pcs") && quantity <= 100){
                        total_cost = 25f * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    else if (origin == 'I' && unit.equals("dz")){
                        total_cost = 25f * 12 * quantity;
                        System.out.println("\nYour total bill is:" + " " + "P" + total_cost);
                    break;
                    }
                    
                default:
                    System.out.println("ok");

           
            }
            


            



    
       }
       catch(Exception e){
        System.out.println(e);
       }


        
    }
}