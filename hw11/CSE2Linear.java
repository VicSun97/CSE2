/* Yangze Sun
   hw 11
   CSE2Linear search program 
   This program is used to search the students' grade in CSE2 and find out how many iterations 
   are used in linear search 
   compile the program 
    javac CSE2Linear.java
   run the program
    java CSE2Linear */
    
import java.util.Scanner;
import java.util.Random;
  public class CSE2Linear{
    public static int input(int grade){ // create a method for inputting error messages 
     Scanner myScanner=new Scanner(System.in);
     boolean flag=true;
      while(flag){ 
      if(myScanner.hasNextInt()){
          while(flag){
            grade=myScanner.nextInt();
            if(grade>=0&&grade<=100){
            flag=false;break;}
            else{
             System.out.println("ERROR: Please input an integer between 0-100.");
             System.out.print("Please input again: ");
             flag=true; }}}
      else{
      System.out.println("ERROR: Please input an integer.");
      System.out.print("Please input again: ");
      myScanner.next();flag=true;}}
   return grade; }
      public static void printArray(int[] array){ // create a print method for array
          for(int i=0;i<array.length;i++){
              System.out.print(" "+array[i]);
          }} 
      public static void sortArray(int[] array){
          for(int i=0;i<array.length;i++){
              if(i==0){continue;}
              else if(array[i]<array[i-1]){
              int temp=array[i];
              array[i]=array[i-1];
              array[i-1]=temp; }
      }}
      
      public static void main(String[] args){  // Begining of the main method 
  System.out.print("Enter 15 ints for final grades in CSE2: ");
  int[] grade=new int[15]; 
 for(int i=0;i<grade.length;i++){
     grade[i]=input(0);
     if(i==0){continue;}
     else if(grade[i]==grade[i-1]){
        System.out.println("ERROR: Please input a inequal number to the last one.");
        grade[i]=input(0);}
     }
  System.out.print("Here are the array that you input: ");
  printArray(grade);
  sortArray(grade);
  System.out.print("\n");
  System.out.println("Sorted: ");
  printArray(grade);
  
      
 
          
      }// end of the main method
      
  }// end of the program