import java.util.Scanner;

public class AverageRainfall
{
  public static void main(String[] args)
  {
       String input;            // Holds the user's input
       int years;              //To hold the number of years for analysis   
       int months = 12;        // The number of months
       int totalMonths = 0;    // The total number of months analysed accumulator set to 0
       char repeat;            // To reapeat the process
       double totalRainfall = 0;  // The total amount of rainfall, accumulator set to 0
       double rainfall;          //The amount of rainfall collected per month
      
       // Create scanner object for input
       Scanner keyboard = new Scanner(System.in);
       
       // To repeat the process if the user wants to
       do
       {
       System.out.print("Enter number of years you would like to enter in your analysis:");
       years = keyboard.nextInt();
       
       // input validation
       while (years <1)
        {
         System.out.println("Invalid input, please enter a positive number. ");
         years = keyboard.nextInt();
        }
       for (int y = 0; y < years; y++)  //y variable place holder for the outer loop(year)
       {
           for (int m = 1; m <months+1; m++) // m variable placeholder for the inner loop (  months)
           {
               int year = 1 + y;    //  year represents the year whose data is entered by the user

               System.out.print("Please enter the rainfall for " + year + " month " + m +":");
               rainfall = keyboard.nextDouble();
               
               // Rainfall should be a positive value
               if(rainfall > -1)
               {
               totalRainfall += rainfall;
               }

               if(rainfall < 0)
               {
                   System.out.println("value must be greater or equal to 0 ");
                   System.out.println("Enter the rainfall in inches  for year " + year + " month " + m +":");
               }
           }
       }  
       totalMonths = months*years;
       System.out.println(); // Prints a blank line
       System.out.println("Data collected for "+ totalMonths +" months. ");
       System.out.printf("Total rainfall is %.2f inches.\n" ,totalRainfall);
       System.out.printf("Average monthly rainfall is: %.2f \n" , (totalRainfall/(years*12)));
       System.out.println(); // Prints a blank line

       keyboard.nextLine();
       System.out.println("Would you like to process another set of rainfall data?");
       System.out.print("Yes or No: ");
       input = keyboard.nextLine();    
       repeat = input.charAt(0);      
      }
       while (repeat == 'Y' || repeat == 'y');
   }
}

