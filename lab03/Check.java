////////////////////////////////////////
//Yangze Sun
// 09/11/15
// lab03[CSE2]
// Check Java Program 
//
// Fifth time compile the program
// This program is used to separate the bills(check) evenly.
// Compile the program 
//    javac. Check.java
// Run the program 
//    java Check//
//
  import java.util.Scanner;
//Define a class
 public class Check{
   // main method that every java program requried 
  public static void main(String[] args) {
// Create Scanner Constructor that will take input from STDIN via creating an instance 
  Scanner myScanner=new Scanner(System.in);
//Give the user for the original cost of the check
  System.out.print("Enter the orginal cost of the check in the form xx.xx: ");
//Begin accepting the user input
  double checkCost=myScanner.nextDouble();
//Prompt the user for the tips they would like to pay(accept input) 
  System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
  double tipPercent=myScanner.nextDouble();
  tipPercent /=100; // We want to convert the percentage into decimal value
//Prompt the user for the number of people who go to dinning together
  System.out.print("Enter the number of people who went out to dinner: ");
  int numPeople=myScanner.nextInt();
//Store the required values and calculate the amount that each person has to pay for
  double totalCost;
  double costPerPerson;
  int dollars, // Whole dollar amount of cost
      dimes, pennies; //for storing digits 
              // To the right of the decimal point
              // For the costs$
  totalCost=checkCost*(1+tipPercent);
  costPerPerson=totalCost/numPeople; 
// Get the whole number and drop the decimal fraction
  dollars=(int)costPerPerson;
// Get dimes amount, e.g.,
// (int)(6.73*10) %10 -> 67 %10 ->7
// where the %(mod) operator returns the remainder
// after the division:   583%100-> 83,  27%5 -> 2
dimes=(int)(costPerPerson*10)%10;
pennies=(int)(costPerPerson*100)%10;
System.out.println("Each person in the group owes $ " +dollars+ '.' +dimes+pennies);

  } //End of the program.
 }
