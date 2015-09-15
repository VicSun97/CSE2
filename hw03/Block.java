//////////////////////////////////////////
//Yangze Sun
//hw03
//Block java Program 
// This program is used to calculate the volume and surface area of the block. 
// Compile the program
//    javac Block.java
// Run the program
//    java Block 
// 
// Create a import Scanner
  import java.util.Scanner;
//Define a class
  public class Block{
    // main method that has been used in every java program 
  public static void main(String[] args){
// Create Scanner Constructor 
  Scanner myScanner=new Scanner(System.in);
//Prompt the user for the length of the block
  System.out.print("Enter the length of the block: ");
//Accept the input data for length 
  double length=myScanner.nextDouble();
// Prompt the user for the width of the block
  System.out.print("Enter the width of the block: ");
// Accept the input for width
  double width=myScanner.nextDouble();
//Prompt the user for the height of the block
  System.out.print("Enter the height of the block: ");
//Accept the input data for height 
  double height=myScanner.nextDouble();
//Store the values for for volume and surface area
  double volume,surfaceArea;
//Calculate the volume and surface area
  volume=length*width*height;
  surfaceArea=(length*width+length*height+height*width)*2;
  System.out.println("The volume of the block dimensions "+length+" x "+width+" x "+height+" is "+volume+".");
  System.out.println("The surface area of the block is "+surfaceArea+".");
      
  }//End of the program.
     
  }