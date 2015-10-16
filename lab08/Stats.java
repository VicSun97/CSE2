/* Yangze Sun
   10/16/2015
   lab08
   Stats program: used to calculate the mean and median of a group of input 
   and give out the output by using Method
   compile the program 
  javac Stats.java
   run the program
  java Stats */
 
 import java.util.Scanner; //import a scanner method 
 public class Stats{
   public static double mean(double a,double b,double c,double d,double e){ //declare the mean method by giving 5 inputs
      double meanValue=(a+b+c+d+e)/5;return meanValue;}// calculation process and return
   public static double median(double z,double x,double v,double n,double m){ // declare teh median method by giving 5 inputs
       double medianValue=v;return medianValue;}// calculation process and return
   public static void results(double meanValue,double medianValue){ // declare the void method and just give out the ...println
       double meanResult=meanValue;
       double medianReuslt=medianValue;
       System.out.println("The mean of these 5 numbers is "+meanResult+".");
       System.out.println("The median of these 5 numbers is "+medianReuslt+"."); }    
   //main method begins
    public static void main(String[] args){
    Scanner myScanner=new Scanner(System.in);
    System.out.print("Input your first double: "); //input 1st double
    double input1=myScanner.nextDouble();
    
    System.out.print("Input your second double: ");//input 2nd double which must is bigger than the 1st double
    double input2=0;   
    boolean flag1=true;
     while(flag1){
         input2=myScanner.nextDouble();
         if(input2>input1){
             flag1=true; break;}
         else{         //if input2<input1, then prompt the user to input again
    System.out.println(" ERROR: you should input a larger double.");
    System.out.print("Please input your second double again: ");
    flag1=true;}}
   
    
    System.out.print("Input your third double: ");//input 3rd double which must is bigger than the 2nd double
    double input3=0;   
    boolean flag2=true;
     while(flag2){
         input3=myScanner.nextDouble();
         if(input3>input2){
             flag2=true; break;}
         else{         //if input3<input2, then prompt the user to input again
    System.out.println(" ERROR: you should input a larger double.");
    System.out.print("Please input your third double again: ");
    flag2=true;}}   
    
    System.out.print("Input your fourth double: ");//input 4th double which must is bigger than the 3rd double
    double input4=0;   
    boolean flag3=true;
     while(flag3){
         input4=myScanner.nextDouble();
         if(input4>input3){
             flag3=true; break;}
         else{         //if input4<input3, then prompt the user to input again
    System.out.println(" ERROR: you should input a larger double.");
    System.out.print("Please input your fourth double again: ");
    flag3=true;}}   
         
    System.out.print("Input your fifth double: ");//input 5th double which must is bigger than the 4th double
    double input5=0;   
    boolean flag4=true;
     while(flag4){
         input5=myScanner.nextDouble();
         if(input5>input4){
             flag4=true; break;}
         else{         //if input5<input4, then prompt the user to input again
    System.out.println(" ERROR: you should input a larger double.");
    System.out.print("Please input your fourth double again: ");
    flag4=true;}}   
//call the 3 methods I have declared and use them in the main class
    double finalMean=mean(input1,input2,input3,input4,input5);
    double finalMedian=median(input1,input2,input3,input4,input5);
    results(finalMean,finalMedian);
    }
 }
       