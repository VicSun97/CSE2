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
 boolean it=true,it2=true,it3=true,it4=true,it5=true,it6=true,it7=true;
 double mon=0,tue=0,wed=0,thu=0,fri=0,sat=0,sun=0;
 System.out.print("Expenses for Monday:    $");// prompt the input 
while(it){mon=myScanner.nextDouble();
  if(mon<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it=false;}}
 
 System.out.print("Expenses for Tuesday:   $");// prompt the input 
while(it2){tue=myScanner.nextDouble();
  if(tue<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it2=false;}}

 System.out.print("Expenses for Wednesday: $");// prompt the input 
while(it3){wed=myScanner.nextDouble();
  if(wed<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it3=false;}}

 System.out.print("Expenses for Thursday:  $");// prompt the input 
while(it4){thu=myScanner.nextDouble();
  if(thu<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it4=false;}}

 System.out.print("Expenses for Friday:    $");// prompt the input 
while(it5){fri=myScanner.nextDouble();
  if(fri<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it5=false;}}

 System.out.print("Expenses for Saturday:  $");// prompt the input
while(it6){sat=myScanner.nextDouble();
  if(sat<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it6=false;}} 

 System.out.print("Expenses for Sunday:    $");// prompt the input
while(it7){sun=myScanner.nextDouble();
  if(sun<0){
   System.out.print("Please only enter positive numbers. Try again:  $");}
  else{it7=false;}}

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
  System.out.println("Your average weekly expenses are:  $"+Math.round(mean*100)/100.00);
// use a random generator to pick up a fluctuation percentage of estimated expenses for next weeks 
  double ranNum=(double)(Math.random()*41)-20;// random number between -20 and 20
  double sumExpenses=mean;
  System.out.println(ranNum);
  for(int counter7=1;counter7<=52;counter7++){
    double interest=(sumExpenses*ranNum/100.00);
    sumExpenses+=interest;
  }
  System.out.println("Estimated expenditure for 4 years: $"+Math.round(sumExpenses*100)/100.00);
  
   }// end of the program 
      
  }
  