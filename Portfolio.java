public class Discussion {
    public static void main(String args[]){
        /*dataType[] arrayRefVar;  preferred way
         * dayaType[] arrayRefVar[]; works,but not preferred
         */

         //double[] myList; //preferred way
         //double myList[]; //works but not preferred way

         /*double myList[] = new double[10]; //creation of elements 
         myList[0] = 5.6;
         myList[1] = 4.5;
         myList[2] = 3.3;
         myList[3] = 13.2;
         myList[4] = 4.0;
         myList[5] = 34.33;
         myList[6] = 34.0;
         myList[7] = 45.45;
         myList[8] = 99.993;
         myList[9] = 11123;
         System.out.println(myList[7]);
         */

         /*Exercise 1
          * Create an Array of Strings with 10 elements, name your array fruits
          */
          //String[] Array_fruits = new fruits[10];

         /*double myList[] = new double[10]; //creation of elements 
         myList[0] = 5.6;
         myList[1] = 4.5;
         myList[2] = 3.3;
         myList[3] = 13.2;
         myList[4] = 4.0;
         myList[5] = 34.33;
         myList[6] = 34.0;
         myList[7] = 45.45;
         myList[8] = 99.993;
         myList[9] = 11123;

         for(int i = 0; i<myList.length;i++){
            System.out.println(myList[i]);
         }
         */

        //Example 2 array initialization and For loop
        /*int a[] = {33, 3 , 4 ,5}; //creation of elements 

     
         for(int i = 0; i<a.length;i++){
            System.out.println(a[i]);
         }
        */

        /*Exercise #2
        a) In your fruits array, assign the following items to their respective index positions:
        1. apple
        2. banana
        3. grapes
        4. starfruit
        5. mango
        6. strawberry
        7. orange
        8. pomelo
        9. avocado
        10. pears
        b) Display the element using for loop
        */

        /*String[] fruits = new String[10];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "grapes";
        fruits[3] = "starfruit";
        fruits[4] = "mango";
        fruits[5] = "strawberry";
        fruits[6] = "orange";
        fruits[7] = "pomelo";
        fruits[8] = "avocado";
        fruits[9] = "pears";
        for(int i = 0; i<fruits.length;i++){
            System.out.println(fruits[i]);
         }
        */

        /*Exercises 3 - For each loop
        int arr[] = {33, 3 , 4 ,5}; //creation of elements 

         for(int i:arr){
            System.out.println(i);
         }
         */

         //Using for each loop, display the elements of your fruits array
        /*String[] fruits = new String[10];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "grapes";
        fruits[3] = "starfruit";
        fruits[4] = "mango";
        fruits[5] = "strawberry";
        fruits[6] = "orange";
        fruits[7] = "pomelo";
        fruits[8] = "avocado";
        fruits[9] = "pears";
        for(String i: fruits){
            System.out.println(i);
         }
        */

        //Example 6 Print, Summing, Finding largest number

        /*double myList[] = {5.6, 4.5, 3.3, 13.2, 4.0,34.33,34.0, 45.45,99.993,11123};
        //Print all the array elements
        for(int i = 0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        //Summing all elements
        double total = 0;
        for(int i = 0; i<myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is" + total);
        //Finding the largest element
        double max = myList[0];
        for (int i = 1; i<myList.length;i++){
            if(myList[i] > max) max = myList[i];
        }
        System.out.println("Max number is" + max);
        */

        //For Minimum array 

        /*double myList[] = {5.6, 4.5, 3.3, 13.2, 4.0,34.33,34.0, 45.45,99.993,11123};
        //Print all the array elements
        for(int i = 0; i<myList.length; i++){
            System.out.println(myList[i] + " ");
        }
        //Summing all elements
        double total = 0;
        for(int i = 0; i<myList.length; i++){
            total += myList[i];
        }
        System.out.println("Total is" + total);
        //Finding the largest element
        double min = myList[0];
        for (int i = 1; i<myList.length;i++){
            if(myList[i] < min) min = myList[i];
        }
        System.out.println("Min number is" + min);
        */

        


        







        





        
        

         
         

     
          

         


          







         

        


               


                
            
            
        
        
        

    }
    

}
