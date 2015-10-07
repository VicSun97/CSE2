/* Yangze Sun
   hw06
   This program is used to visualize a bar graph and estimated expenditure for 
   a broke college student
  Complile the program 
  javac BarGraph.java
  Run the program 
  java BarGraph   */
  
//import a scanner
  import java.util.Scanner;
// main method added
  public class BarGraph{
      public static void main(String[] args){
//create scanner constructor
 Scanner myScanner=new Scanner(System.in);
 System.out.print("Expenses for Monday:    $");// prompt the input 
 double mon=myScanner.nextDouble();
 System.out.print("Expenses for Tuesday:   $");// prompt the input 
 double tue=myScanner.nextDouble();
 System.out.print("Expenses for Wednesday: $");// prompt the input 
 double wed=myScanner.nextDouble();
 System.out.print("Expenses for Thursday:  $");// prompt the input 
 double thu=myScanner.nextDouble();
 System.out.print("Expenses for Friday:    $");// prompt the input 
 double fri=myScanner.nextDouble();
 System.out.print("Expenses for Saturday:  $");// prompt the input
 double sat=myScanner.nextDouble();
 System.out.print("Expenses for Sunday:    $");// prompt the input
 double sun=myScanner.nextDouble();
 System.out.println();

  System.out.print("Mon:    ");
  for(int counter=1;counter<=Math.round(mon);counter++){
  System.out.print("*");} // use Math.round Method to round the double int
  System.out.print("\n");
  System.out.print("Tues:   ");
 for(int counter1=1;counter1<=Math.round(tue);counter1++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("Wed:    ");
 for(int counter2=1;counter2<=Math.round(wed);counter2++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("Thu:    ");
 for(int counter3=1;counter3<=Math.round(thu);counter3++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("Fri:    ");
 for(int counter4=1;counter4<=Math.round(fri);counter4++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("Sat:    ");
 for(int counter5=1;counter5<=Math.round(sat);counter5++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("Sun:    ");
 for(int counter6=1;counter6<=Math.round(sun);counter6++){
  System.out.print("*");}
  System.out.print("\n");
  System.out.print("\n");
// calculate the average daily expense 
  double mean=(mon+tue+wed+thu+fri+sat+sun)/7;
  System.out.println("Your average daily expenses are:  $"+Math.round(mean*100)/100.00);
// use a random generator to pick up a fluctuation percentage of estimated expenses for next weeks 
  double ranNum=(double)(Math.random()*41)-20;// random number between -20 and 20
  double sumExpenses=0;
  for(int counter7=1;counter7<=52;counter7++){
    sumExpenses+=mean;
    double interest=(sumExpenses*ranNum/100.00);
    sumExpenses+=interest;
  }
  System.out.println("Estimated expenditure for 4 years: $"+Math.round(sumExpenses*100)/100);
  
   }// end of the program 
      
  }
  