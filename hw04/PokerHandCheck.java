////////////////////////////
//Yangze Sun
//hw04
//This program is used to randomly selecting 5 cards from a deck 
// and to detect if there will be one pair, two pair, or three of a kind
//Compile the program
// javac PokerHandCheck.java
// Run the program
// java PokerHandCheck
 import java.util.Random;
// Define a class
   public class PokerHandCheck{
       //main method used in every java program 
 public static void main(String[] args){
// Use a math random import to generate a random number 
  int Num=(int)(Math.random()*52)+2;
// Create two string variables
   String suitName;
   String cardIdentitdy;
// Use if statements to assgin the suit name 
   if(Num==1||Num==14||Num==27||Num==40)
     {System.out.println("You picked the "+"Ace"+" of");}
  else if(Num==11||Num==24||Num==37||Num==50)
    {System.out.println("You picked the"+"Jack"+" of");}
  else if(Num==12||Num==25||Num==38||Num==51)
    {System.out.println("You picked the "+"Queen"+" of");}
  else if(Num==13||Num==26||Num==39||Num==52)
    {System.out.println("You picked the "+"King"+" of");}
  else if(15<=Num&&Num<=23)
    {System.out.println("You picked the "+Num%13+" of");}
  else if(28<=Num&&Num<=36)
    {System.out.println("You picekd the "+Num%13+" of");}
  else if(41<=Num&&Num<=49)
    {System.out.println("You picked the "+Num%13+" of");}
  
// Use if statements again to assign the card identity 
   if(1<=Num&&Num<=13)
  {System.out.println("Diamonds");}
  else if(14<=Num&&Num<=26)
  {System.out.println("Clubs");}
  else if(27<=Num&&Num<=39)
  {System.out.println("Hearts");}
  else if(40<=Num&&Num<=52)
  {System.out.println("Spades");}
  
     
     
 }       
       
   }