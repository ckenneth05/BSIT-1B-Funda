/*CSNO3
Instruction: It is known that January 2006 starts on Sunday. Make a program 
that would input a numeric day (between1 and 31) and output 
the day of the week the day falls. For example, if 4 is entered for 
the day, the program must display "WEDNESDAY", if 8 was 
entered, "SUNDAY" must be displayed and so on..
*/

import java.util.Scanner;

class CSNO3{
    public static void main(String[] args){
        try{
            int[] Monday = {2, 9, 16, 23, 30 };
            int[] Tuesday = {3, 10, 17, 24, 31};
            int[] Wednesday = {4, 11, 18, 25};
            int[] Thursday = {5, 12, 19, 26};
            int[] Friday = {6, 13, 20, 27};
            int[] Saturday = {7, 14, 17,21, 28};
            int[] Sunday = {1, 8, 15, 22, 29};

            int Monday_list = Monday.length;
            int Tuesday_list = Tuesday.length;
            int Wednesday_list = Wednesday.length;
            int Thursday_list = Thursday.length;
            int Friday_list = Friday.length;
            int Saturday_list = Saturday.length;
            int Sunday_list = Sunday.length;

            Scanner input = new Scanner(System.in);

            System.out.println("Type any numerical date of January");
            int in = input.nextInt();

            System.out.println("Verifying your input. Please wait.");
            Thread.sleep(4000);

            if (in <= 31 && in >=0){
                System.out.println("Your input is valid. Please wait");
                Thread.sleep(4000);
            }
            else{
                throw new ArithmeticException("The value you entered is not correct. Please try again later"); 
            }


            for (int i =0; i <= Monday_list; i++){
                if(in == Monday[i]){
                    System.out.println("Its Monday");
                    Thread.sleep(4000);
                }
                for (int j = 0; j <= Tuesday_list; j++){
                    if(in == Tuesday[j]){
                        System.out.println("Its Tuesday");
                        Thread.sleep(4000);
                    }
                    for (int k = 0; k <= Wednesday_list; k++){
                        if(in == Wednesday[k]){
                            System.out.println("Its Wednesday");
                            Thread.sleep(4000);
                        }
                        for (int l = 0; l <= Thursday_list; l++){
                            if(in == Thursday[l]){
                                System.out.println("Its Thursday");
                                Thread.sleep(4000);
                            }
                            for (int m = 0; m <= Friday_list; m++){
                                if(in == Friday[m]){
                                    System.out.println("Its Friday");
                                    Thread.sleep(4000);
                                }
                                for (int n =0; n <= Saturday_list; n++){
                                    if(in == Saturday[n]){
                                        System.out.println("Its Saturday");
                                        Thread.sleep(4000);
                                    }
                                    for (int o = 0; o <= Sunday_list; o++){
                                        if(in == Sunday[o]){
                                            System.out.println("Its Sunday");
                                            Thread.sleep(4000);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch(Exception e){
            System.out.println("Thank you for using my system!");
        }
    }
}