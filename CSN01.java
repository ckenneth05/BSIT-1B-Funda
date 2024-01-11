import java.util.Scanner;
/*
Case Study No.1
Instruction:

Income tax is computed based on net taxable income. The income tax table is as follows:
Net Taxable Income (NTI)                                                    Tax Due
Below 2,500                                                                 P0
At least 2,500 but below 5000                                               P100 + 3% of NTI
At least 5,000 but below 10,000                                             P175 + 5% of NTI
At least 10,000 but below 25,000                                            P425 + 8% of NTI
At least 25,000 but below 50,000                                            P1625 + 13% of NTI
At least 50,000                                                             P4875 + 25% of NTI

Make a program that would input the gross income and tax exemption and then output the 
tax due. (Net taxable income equals gross minus tax exemption)
 */



class CSNO1{
    public static void main(String[] args){
        try {


        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter your gross income:");
        Double GrossIncome = input1.nextDouble();

        System.out.println("Enter your TaxExemption:");
        Double TaxExemption = input1.nextDouble();

        double NTI = (GrossIncome - TaxExemption);

        System.out.println("Your Net Taxable Income is:" + NTI);

        System.out.println("Calculating the Tax Due. Please Wait");

        Thread.sleep(2000);

        if (NTI >= 2500 && NTI <= 5000){
            double result = (NTI - 0.03 + 100);
            System.out.println("The amount of your Income Tax after tax due is:" + "P" +  result);
        }
        
        else if (NTI >= 5000 && NTI <= 10000){
            double result = NTI - 0.05 + 175;
            System.out.println("The amount of your Income Tax after tax due is:" + "P" + result);
        }
        
        else if (NTI >= 10000 && NTI <= 25000){
            double result = NTI - 0.13 + 425;
            System.out.println("The amount of your Income Tax after tax due is:" + "P" +  result);
        }

        else if (NTI >= 25000 && NTI <= 50000){
            double result = NTI - 0.05 + 1625;
            System.out.println("The amount of your Income Tax after tax due is:" + "P" + result);
        }
        
        else if (NTI == 50000){
            double result = NTI - 0.25 + 4875;
            System.out.println("The amount of your Income Tax after tax due is:" + "P" + result);
        }

        else{
            double result = NTI;
            System.out.println("The amount of your Income Tax after tax due is: "+ "P" + result);

        }

     } catch (InterruptedException e){
            System.out.println(e);
        } finally{
            System.out.println("The system is now finished to process. Bye Bye");
        }

     }

}
