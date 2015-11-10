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
             System.out.println("ERROR: Please input an integer between 0-100.");// if input is not in range 0-100, then reinput
             System.out.print("Please input again: ");
             flag=true; }}}
      else{
      System.out.println("ERROR: Please input an integer."); // if input is not an integer, then reinput
      System.out.print("Please input again: ");
      myScanner.next();flag=true;}}
   return grade; }
      public static void printArray(int[] array){ // create a print method for array
          for(int i=0;i<array.length;i++){
              System.out.print(array[i]+" ");
          }} 
     
     public static void sortedArray(int[] array){
         for(int i=0;i<array.length;i++){ //rearrange the array to list from smallest to largest
          for(int j=i+1;j<array.length;j++){
            if(array[i]>=array[j]){
             int temp=array[i];
             array[i]=array[j];
             array[j]=temp;
            }}} 
         }
     public static void linearSearch(int[] array,int key){ // To check if the key is found or not found and say how many iterations are used
         for(int i=0;i<array.length;i++){
             if(array[i]==key){
                 System.out.println(key+" was found in the list with "+(i+1)+" iterations");break;}
             else if(i==array.length-1&&array[i]!=key){
                 System.out.println(key+" was not found in the list with "+(i+1)+" iterations"); }
              }
         }
      public static void scrambledArray(int[] array){  // create a method that scrambled the array
          Random rand=new Random();// use java.util.random method to scramble the index number
          for(int i=0;i<array.length;i++){
              int num=rand.nextInt(15);
             // swap the two different positioned values by swaping their index number 
              int temp=array[i];
              array[i]=array[num];
              array[num]=temp; }
      }
      
      public static void main(String[] args){  // Begining of the main method 
  Scanner myScanner=new Scanner(System.in); // create a Scanner constructor
  System.out.println("Enter 15 ints for final grades in CSE2: "); 
  int[] grade=new int[15]; // create a int array to represent students' grades
 for(int i=0;i<grade.length;i++){ 
     grade[i]=input(0); //call input method to test for the valid of input
     if(i==0){continue;}
     else if(grade[i]==grade[i-1]){
        System.out.println("ERROR: Please input a inequal number to the last one."); 
        // if the input is equal to last one,then call the input method again
        grade[i]=input(0);}
     }
  System.out.print("Here are the array that you input: ");
  printArray(grade); // call the printArray method
  sortedArray(grade); // call the sortedArray method to rearrange array in order
  System.out.print("\n");
  System.out.println("Sorted: ");
  printArray(grade);// call the printArray method
  System.out.print("\n");
  System.out.print("Enter a grade to search for: ");// prompt the user for inputting a search key
  int key=myScanner.nextInt();
  linearSearch(grade,key); // call the linearSearch method
  System.out.println("Scrambled: ");
  scrambledArray(grade);// call the scrambled method
  printArray(grade);// call the printArray method
  System.out.print("\n");
  System.out.print("Enter a grade to search for: ");// prompt the user for inputting a another search key
  int key1=myScanner.nextInt();
  linearSearch(grade,key1);// call the linearSearch method
          
      }// end of the main method
      
  }// end of the program