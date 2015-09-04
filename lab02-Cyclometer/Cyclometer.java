////////////////////////////////////////////
//Yangze Sun 
//09/04/2015
//lab02 [CSE2]
//Cyclometer Java Program 
//
//  Third Time compile the program
// A program is used to record the speed and distance for bicycle
//    Complie the program
//       javac Cyclometer.java
//    Run the program 
//       java Cyclometer//

// Define a class
  public class Cyclometer{
        //A major method that is required for every Java program
      public static void main(String[] args) {
// Begin storing varibles(input data)
  int secsTrip1=480; //Number of seconds taken for Trip 1 
  int secsTrip2=3220; //Number of seconds taken for Trip 2 
  int countsTrip1=1561; //Number of rotations needed for Trip 1
  int countsTrip2=9037; //Number of rotations needed for Trip 2
  
// Then store data for constants and distants(output data)
  double wheelDiameter=27.0, // The diameter of one wheel 
  PI=3.14159, // Value of constant PI used to calculate the perimeter
  feetPerMile=5280, // Constant value for converting mile to feet
  inchesPerFoot=12, // This is used to comvet mile to inches 
  secondsPerMinute=60; // Constant for converting minute to second
  double distanceTrip1,distanceTrip2,totalDistance; // Store the value for distance
  
  System.out.println("Trip 1 took " +
      (secsTrip1/secondsPerMinute)+ " minutes and had " +
      countsTrip1+"counts."); 
  System.out.println("Trip 2 took " +
       (secsTrip2/secondsPerMinute) +" minutes and had "+
       countsTrip2+"counts.");

//run the calculation
//Calculate the total distance Trip1 and Trip2 taken by using formula
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
//Above gives distance in inches 
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTrip1+distanceTrip2;

//Print out the output data.
System.out.println("Trip 1 was " +distanceTrip1 +" miles");
System.out.println("Trip 2 was " +distanceTrip2 +" miles");
System.out.println("The total distance was " +totalDistance +" miles");

      }  // This should be the end of main process. 
  }
 