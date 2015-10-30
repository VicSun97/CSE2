/* Yangze Sun 
   10/30/2015
   lab 10
this program is used to create two arrays that print out 
correponding student names and their midterm grades
 compile the program 
   javac Arrays.java
 run the program 
   java Arrays  */
   
 import java.util.Scanner;  
 public class Arrays{
     public static void main(String[] args){
         int NUM_STUDENTS=(int)(Math.random()*6+5);// give ramdom number of students between 5 and 10
         System.out.println("Enter "+NUM_STUDENTS+" student names: ");
         String []students=new String[NUM_STUDENTS]; // declare the first array via String type
         Scanner myScanner=new Scanner(System.in);
         for(int i=0;i<NUM_STUDENTS;i++){ //A loop that enters students names 
             students[i]=myScanner.next();
         }
         System.out.println("");
         System.out.println("Here are the midterm grades of "+NUM_STUDENTS+" students above: ");
        
          
        for(int i=0;i<NUM_STUDENTS;i++){ // a loop that cyclically print out corresponding student name and random midterm grades
         int []midterm=new int[100]; 
         midterm[i]=(int)(Math.random()*101);  // Declare and give values to second array via int type between 0 and 100    
         System.out.print(students[i]+":"+midterm[i]); 
         System.out.println("");
     }
     
 }}