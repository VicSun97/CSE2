////////////////////////
//Yangze Sun
//hw03
// Timer java program 
// 
// This program is used to remind the people the time remaining for eating a dinner 
// Compile the program 
//  javac Timer.java
// Run the program 
// java Timer
// 
//Create a import scanner
  import java.util.Scanner;
// Define a class
  public class Timer{
      // main method required for every java program 
  public static void main(String[] args){
// Create Scanner Constructor 
  Scanner myScanner=new Scanner(System.in);
// Promopt the user for the current time 
  System.out.print("Enter the current time: ");
//Accept the user input 
  int currentTime=myScanner.nextInt();
//Prompt the user for the exact time to begin a dinner 
  System.out.print("Enter the time that you will be eating dinner: ");
//Input the dinnertime value
  int dinnerTime=myScanner.nextInt();
//Store the values for hours and minutes remained until dinner
  int hoursRemained,minutesRemained,differenceTimeMins;// differenceTime is the time difference between dinner and current time
  int hoursDifference,minsForDinner,minsForCurrent;//convert all hours into minutes 
//Calculate the minutes needed until dinner
  minsForDinner=dinnerTime/100*60+(dinnerTime-dinnerTime/100*100);//minutes for dinner time
  //like if dinnerTime=1828, we can convert into minutes time for 18*60+28=1108 minutes. 
  //All the total minutes I calculated here can be explained as the minutes that had taken from the beginning 0000(which is 00:00).
  minsForCurrent=currentTime/100*60+(currentTime-currentTime/100*100);//minutes for current time
  differenceTimeMins=minsForDinner-minsForCurrent;
  hoursRemained=differenceTimeMins/60;
  minutesRemained=differenceTimeMins%60;// End of calculation
System.out.println("You have "+hoursRemained +" hours "+"and "+minutesRemained+" minutes "+"until "+"dinner." );
      
    }//End of the whole program. 
  
  }