/* Yangze Sun 
   hw08
   Area Program: used to calculate the area of different geometrical shapes
   according to their dimensions by using Methods
  Compile the program 
   javac Area.java
  Run the program 
   java Area  */

 import java.util.Scanner;
 public class Area{
//declare the method for rectangle
  
  public static double rectangleArea(double length,double width){
       return length*width;} //Method for calculating the area of rectangle
  public static double triangleArea(double height,double base){
       return (height*base)/2;}//Method for calculating the area of triangle
  public static double circleArea(double radius){
       return Math.PI*Math.pow(radius,2);}//Method for calculating the area of circle
  public static double validity(String input){  //Method for checking for the validity of input
     // make input as string first since so both double, int or other types can be typed
      Scanner myScanner=new Scanner(System.in);
      boolean flag=true;
      while(flag){  //use try-catch to determine if the input is double
         try{input=myScanner.next();
            Double.parseDouble(input);break;}
         catch(NumberFormatException e){  /* if the running inside try is wrong or unnormal,
                  then ask user to prompt the input again */
             System.out.println("   ERROR: you should type the double.");
             System.out.print("Please input the length again: ");
             continue;
         }}return Double.parseDouble(input);}// return out the string after casting into double 
  // main method begins
  public static void main(String[] args){
  String shape="";
  Scanner myScanner1=new Scanner(System.in);
  System.out.print("Please type the shape: ");
  boolean flag1=true;
    while(flag1){  // make sure that the valid shape is typed
            shape=myScanner1.next();
        if(shape.equals("rectangle")||shape.equals("triangle")||shape.equals("circle")){
                flag1=true;break;}
     // if the shape is not right, ask the user to prompt the shape again
        else{System.out.println("  ERROR: you should type among 'rectangle','triangle', and 'circle'.");
                 System.out.print("Please type the shape again: ");
                 flag1=true;}}
  if(shape.equals("rectangle")){ 
     System.out.print("Please input the length: ");
     String length=""; //define the string 
     double length1=validity(length);  //Call the input method
     System.out.print("Please input the width: ");
     String width="";
     double width1=validity(width); // Call the input method
     double area=rectangleArea(length1,width1); // Call the rectangleArea method
     System.out.println("The rectangle area is "+area);}
  
  if(shape.equals("triangle")){
     System.out.print("Please input the height: ");
     String height="";
     double height1=validity(height);// Call the input method
     System.out.print("Please input the base: ");
     String base="";
     double base1=validity(base);// Call the input method
     double area1=triangleArea(height1,base1);// call the triangleArea method
     System.out.println("The triangle area is "+area1);}
     
   if(shape.equals("circle")){
     System.out.print("Please input the radius: ");
     String radius="";
     double radius1=validity(radius);// Call the input method
     double area2=circleArea(radius1);// call the circleArea method
     System.out.println("The radius1 area is "+area2);}
     

  }//end of the main method 
 
  }//end of the whole program 
    

   
    