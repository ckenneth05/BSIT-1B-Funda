import java.util.Scanner;


public class PersonalInfo{
	public static void main(String[] args){

	int month;
	int day;
	int yyyy;
	int contact_num;

	Scanner input = new Scanner(System.in);									//creating a Scanner object
	
	System.out.println("Enter your Name:");
	String fullname = input.nextLine();

	System.out.println("Enter your full home address:");
	String fulladdr = input.nextLine();

	System.out.println("Enter your zip code:");
	int zipcode = input.nextInt();

	System.out.println("Enter the month of your date(1-31):");
	int mverifier = input.nextInt();
	if (mverifier <= 12){
		int month = mverifier;
	}
	else {
		System.out.println("Error. You reched the max value");
	}
	
	System.out.println("Enter the date of your birthday(dd):");
	int dverifier = input.nextInt();
	if (dverifier <= 31){
		int day = dverifier;
	}
	else {
		System.out.println("Error. You reched the max value");
	}

	System.out.println("Enter the year of your birthday(yyyy):");
	int yverifier = input.nextInt();
	if (yverifier <= 2099){
		int yyyy = yverifier;
	}
	else {
		System.out.println("Error. You reched the max value.");
	}

	System.out.println("Enter your Birthplace:");
	String Birthplace = input.nextLine();

	System.out.println("Enter your Birthplace:");
	String Birthplace = input.nextLine();
	
	System.out.println("Enter your phone number(must be 11 digits and do not include 0 to the first digit):");
	int cnumverifier = input.nextInt();
	if (contact_numverifier <= 9999999999 ){
		int contact_num = cnumverifier;
	}
	else {
		System.out.println("Error. You reched the max value.");
	}

	System.out.println("Enter your Bloodtype:");
	char btype = input.next().charAt(0);

	System.out.println("Enter the school where you've finished the study in elementary:");
	String elementary = input.nextLine();

	System.out.println("Enter the school where you've finished the study in junior highschool:");
	String junior_high = input.nextLine();

	System.out.println("Enter the school where you've finished the study in junior highschool:");
	String senior_high = input.nextLine();

	System.out.println("*****Personal Information*****");
	System.out.println("Full name:" + " " + fullname);
	System.out.println("Address:" + " " + fulladdr + " " + zipcode);
	System.out.println("Birth Day:" + " " + "0" + month + " " + day + " " + yyyy);
	System.out.println("Birthplace:" + " " + Birthplace);
	System.out.println("Contact Number:" + " " + contact_num);
	System.out.println("Blood Type:" + " " + btype);
	System.out.println("*****Educational Background*****");
	System.out.println("Elementary:" + " " + elementary);
	System.out.println("Junior High School:" + " " + junior_high);
	System.out.println("Senior High School:" + " " + senior_high);
	
	
	}
}
	
	
	