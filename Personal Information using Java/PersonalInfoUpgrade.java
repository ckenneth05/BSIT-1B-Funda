import java.util.Scanner;												//import Scanner class in java.util package

public class PersonalInfoUpgrade {											//Creating a class named PersonalInforUpgrade
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);									//creating a Scanner object	named input
        Scanner input2 = new Scanner(System.in);									// creating a Scanner object named input2
        Scanner input3 = new Scanner(System.in);									// creating a Scanner object named input3
        System.out.println("Enter your Name:");
        String fullname = input.nextLine();
    
        System.out.println("Enter your full home address:");							//Ask							
        String fulladdr = input.nextLine();
    
        System.out.println("Enter your zip code:");
        int zipcode = input.nextInt();
    
        System.out.println("Enter the month of your birthdate(1-12):");
        int month = input.nextInt();
    
        System.out.println("Enter the date of your birthdate(1-31):");
        int day = input.nextInt();
    
        System.out.println("Enter the year of your birthdate(yyyy):");
        int year = input.nextInt();
    
        System.out.println("Enter your Birthplace:");
        String Birthplace = input2.nextLine();
     
        System.out.println("Enter your phone number(must be 11 digits and do not include 0 to the first digit):");
        long contact = input2.nextLong();
    
        System.out.println("Enter your Bloodtype:");
        char btype = input2.next().charAt(0);
    
        System.out.println("Enter the school where you've finished the study in elementary:");
        String elementary = input3.nextLine();
    
        System.out.println("Enter the school where you've finished the study in junior highschool:");
        String junior_high = input3.nextLine();
    
        System.out.println("Enter the school where you've finished the study in junior highschool:");
        String senior_high = input3.nextLine();
    
        System.out.println("*****Personal Information*****");
        System.out.println("Full name:" + " " + fullname);
        System.out.println("Address:" + " " + fulladdr + " " + zipcode);
        System.out.println("Birth Day:" + " " + "0" + month + " " + day + " " + year);
        System.out.println("Birthplace:" + " " + Birthplace);
        System.out.println("Contact Number:" + "0" +  " " + contact);
        System.out.println("Blood Type:" + " " + btype);
        System.out.println("*****Educational Background*****");
        System.out.println("Elementary:" + " " + elementary);
        System.out.println("Junior High School:" + " " + junior_high);
        System.out.println("Senior High School:" + " " + senior_high);
        
        
        
    }
    
}
