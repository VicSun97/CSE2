/* Yangze Sun 
   10/06/2015
   hw06
   CheckDigit Program 
   This program is used to check if the barcode in ISBN of the book is valid
   Compile the program 
   javac CheckDigit.java
   Run the program 
   java CheckDigit */
 import java.util.Scanner;//import a Scanner method
 public class CheckDigit{
  public static void main(String[] args){
    Scanner myScanner=new Scanner(System.in);//Create a scanner constructor 
    System.out.print("Please enter a 10 digit barcode: ");
    boolean it=true;
    String barcode="";
    while(it){barcode=myScanner.nextLine();
   int digits=String.valueOf(barcode).length();
   int bar=Integer.parseInt(barcode); 
    if(digits<10){
        System.out.print("This is NOT a valid ISBN. Please enter 10 digits: ");
    }
    else{it=false;}}
    int bar=Integer.parseInt(barcode);// cast string to int
    int multiple=2;
    int bar2=bar;
    int sum=0;
    int div=10;
    bar=bar/10;
    int increase;
    for(int counter1=1;counter1<=9;counter1++){
      increase=(bar%div)*multiple;
      sum+=increase;
      multiple++;
      bar=bar/10;
    }// calculate for the sum
      String X="10";
      int x=Integer.parseInt(X);
      if(sum%11==bar2%10||sum%11==bar2%x){
          System.out.println("This is a valid ISBN.");
      }
      else{System.out.println("This is NOT a valid ISBN.Check digit should be X.");}
      
  }//end of the program 
 }
    