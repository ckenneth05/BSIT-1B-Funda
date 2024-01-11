public class labexercise2{					//labexercise2 is my java class
	public static void main(String[] args){
	String fname = "Christian Kenneth";			// declare String name "fname" to store my first name
	char mname = 'F';					// declare char name "mname" to store my middle initial
	String lname = "Gonzales";				// declare string name "lname" to store my last name
	String Student_num = "20_UR_1079";			// declare string name "Student_num" to store my student ID
	float mid_grade = 90.12f;				// declare float name "mid_grade" to store my midterm grade
	float fin_grade = 87.32f;				// declare float name "fin_grade" to store my final grade
	float Final_grade = (mid_grade + fin_grade) / 2;	// declare float name "Final_grade" to compute my average grade

	// display all the necessary information

	System.out.println("*****Student Information*****");
	System.out.println("Student:" + " " +lname + "," + " " + fname + " " + mname + ".");
	System.out.println("Student Number:" + " " + Student_num);
	System.out.println();
	System.out.println("*****Student Performance Record*****");
	System.out.println("Midterm Grade:" + " " + mid_grade);
	System.out.println("Finals Grade:" + " " + fin_grade);
	System.out.println("Your Final Grade:" + " " + Final_grade);

	}
}