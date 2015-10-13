/* Yangze Sun 
   10/09/2015
   Twisty Program: this program is used to 
   generate a twisted "X" pattern with using characters '#','/', and '\'.
  Compile the program 
   javac Twisty.java
  Run the program 
   java Twisty */

 import java.util.Scanner;// intro the scanner method
public class Twisty{
  public static void main(String[] args){  
    Scanner myScanner=new Scanner(System.in);
    System.out.print("Input your desired length: ");
    int inputLen=0;// an integer to store the user input for length
    boolean flag=true;// a switch that to enter again if the input is wrong
  while(flag){
    if(myScanner.hasNextInt()){
       inputLen=myScanner.nextInt();
    // Check for input of desired length, if input>80, then reject and enter again 
     if(inputLen<=80&&inputLen>0){
         flag=true; break;}
    else{System.out.println("   Error: Please input an integer smaller than 80.");
         System.out.print("Input your desired length again: ");
         flag=true;}} 
    // if the input is not an integer, then reenter again     
   else{System.out.println("   Error: Please enter an integer.");
        System.out.print("Input your desired length again: ");
        myScanner.next();}}  
// Next, input the desired width using the same method 
   System.out.print("Input your desired width: ");
    int inputWid=0;// an integer to store the user input for width
    boolean hat=true;// a switch that to enter again if the input is wrong
  while(hat){
    if(myScanner.hasNextInt()){
       inputWid=myScanner.nextInt();
    // Check for input of desired width, if width>Length, then reject and enter again 
     if(inputWid<inputLen&&inputWid>0){
         flag=true; break;}
    else{System.out.println("   Error: Please input an integer smaller than the length.");
         System.out.print("Input your desired width again: ");
         flag=true;}} 
    // if the input is not an integer, then reenter again     
   else{System.out.println("   Error: Please enter an integer.");
        System.out.print("Input your desired width again: ");
        myScanner.next();}}  
 
 // store the remainder that is needed for using mathematical rules for each pattern 
  int remainder1=1;
  int remainder2=0;
  int remainder3=inputWid;
  int remainder4=inputWid*2-1;
  for(int counter1=0;counter1<inputWid;counter1++){
     System.out.print("\n");// give a newline after each inner loop finishes
     for(int counter2=1;counter2<=inputLen;counter2++){
       if(counter2%(inputWid*2)==remainder1){  
          System.out.print("#");}// pattern for # from up to down
    else if((counter2-1)%inputWid==remainder2){
         System.out.print("\\");}// pattern for \ from up to down 
    else if(counter2%(inputWid*2)==remainder3){
        System.out.print("/");} // pattern for / from down to up
    else if((counter2-1)%(inputWid*2)==remainder4){
        System.out.print("#");}// pattern for # from down to up
       else{System.out.print(" ");}} // others are blank space
       remainder1++;remainder2++;remainder3--;remainder4--;}//add 1 more per time to remainder
  } //end the of program    
    
}