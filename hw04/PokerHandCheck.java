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
// Use a math random import to generate 5 random numbers 
  int Num=(int)(Math.random()*52)+2;

// Create two String variales
  String suitName="";
  String suitName1="";
  String suitName2="";
  String suitName3="";
  String suitName4="";
  String cardIdentity="";
  String cardIdentity1="";
  String cardIdentity2="";
  String cardIdentity3="";
  String cardIdentity4="";
          
//Use if statements to assign the suit name
  if(Num==1||Num==14||Num==27||Num==40){suitName="Ace";}
  else if(Num==11||Num==24||Num==37||Num==50){suitName="Jack";}
  else if(Num==12||Num==25||Num==38||Num==51){suitName="Queen";}
  else if(Num==13||Num==26||Num==39||Num==52){suitName="King";}
  else if(2<=Num&&Num<=10){suitName=Num+"";}//convert int to string use i+""
  else if(15<=Num&&Num<=23){suitName=Num%13+"";}
  else if(28<=Num&&Num<=36){suitName=Num%13+"";}
  else if(41<=Num&&Num<=49){suitName=Num%13+"";}
 

// Use if statements again to assign the card identity 
  if(1<=Num&&Num<=13){cardIdentity="Diamonds";}
  else if(14<=Num&&Num<=26){cardIdentity="Clubs";}
  else if(27<=Num&&Num<=39){cardIdentity="Hearts";}
  else if(40<=Num&&Num<=52){cardIdentity="Spades";}
  
  System.out.println("Your random cards were: ");
  System.out.println("You picked the "+suitName+" of "+cardIdentity+".");
 
//Create another Number storage value
 int Num1=(int)(Math.random()*52)+2;
 
//Use if statements to assign the suit name
  if(Num1==1||Num1==14||Num1==27||Num1==40){suitName1="Ace";}
  else if(Num1==11||Num1==24||Num1==37||Num1==50){suitName1="Jack";}
  else if(Num1==12||Num1==25||Num1==38||Num1==51){suitName1="Queen";}
  else if(Num1==13||Num1==26||Num1==39||Num1==52){suitName1="King";}
  else if(2<=Num1&&Num1<=10){suitName1=Num1+"";}//convert int to string use i+""
  else if(15<=Num1&&Num1<=23){suitName1=Num1%13+"";}
  else if(28<=Num1&&Num1<=36){suitName1=Num1%13+"";}
  else if(41<=Num1&&Num1<=49){suitName1=Num1%13+"";}
 

// Use if statements again to assign the card identity 
  if(1<=Num1&&Num1<=13){cardIdentity1="Diamonds";}
  else if(14<=Num1&&Num1<=26){cardIdentity1="Clubs";}
  else if(27<=Num1&&Num1<=39){cardIdentity1="Hearts";}
  else if(40<=Num1&&Num1<=52){cardIdentity1="Spades";}
  System.out.println("You picked the "+suitName1+" of "+cardIdentity1+".");
  
  
//Create another Number storage value
 int Num2=(int)(Math.random()*52)+2;
 
//Use if statements to assign the suit name
  if(Num2==1||Num2==14||Num2==27||Num2==40){suitName2="Ace";}
  else if(Num2==11||Num2==24||Num2==37||Num2==50){suitName2="Jack";}
  else if(Num2==12||Num2==25||Num2==38||Num2==51){suitName2="Queen";}
  else if(Num2==13||Num2==26||Num2==39||Num2==52){suitName2="King";}
  else if(2<=Num2&&Num2<=10){suitName2=Num2+"";}//convert int to string use i+""
  else if(15<=Num2&&Num2<=23){suitName2=Num2%13+"";}
  else if(28<=Num2&&Num2<=36){suitName2=Num2%13+"";}
  else if(41<=Num2&&Num2<=49){suitName2=Num2%13+"";}
 

// Use if statements again to assign the card identity 
  if(1<=Num2&&Num2<=13){cardIdentity2="Diamonds";}
  else if(14<=Num2&&Num2<=26){cardIdentity2="Clubs";}
  else if(27<=Num2&&Num2<=39){cardIdentity2="Hearts";}
  else if(40<=Num2&&Num2<=52){cardIdentity2="Spades";}
  System.out.println("You picked the "+suitName2+" of "+cardIdentity2+".");
  
  
//Create another Number storage value
 int Num3=(int)(Math.random()*52)+2;
 
//Use if statements to assign the suit name
  if(Num3==1||Num3==14||Num3==27||Num3==40){suitName3="Ace";}
  else if(Num3==11||Num3==24||Num3==37||Num3==50){suitName3="Jack";}
  else if(Num3==12||Num3==25||Num3==38||Num3==51){suitName3="Queen";}
  else if(Num3==13||Num3==26||Num3==39||Num3==52){suitName3="King";}
  else if(2<=Num3&&Num3<=10){suitName3=Num3+"";}//convert int to string use i+""
  else if(15<=Num3&&Num3<=23){suitName3=Num3%13+"";}
  else if(28<=Num3&&Num3<=36){suitName3=Num3%13+"";}
  else if(41<=Num3&&Num3<=49){suitName3=Num3%13+"";}
 

// Use if statements again to assign the card identity 
  if(1<=Num3&&Num3<=13){cardIdentity3="Diamonds";}
  else if(14<=Num3&&Num3<=26){cardIdentity3="Clubs";}
  else if(27<=Num3&&Num3<=39){cardIdentity3="Hearts";}
  else if(40<=Num3&&Num3<=52){cardIdentity3="Spades";}
  System.out.println("You picked the "+suitName3+" of "+cardIdentity3+".");
  
 //Create another Number storage value
 int Num4=(int)(Math.random()*52)+2;
 
//Use if statements to assign the suit name
  if(Num4==1||Num4==14||Num4==27||Num4==40){suitName4="Ace";}
  else if(Num4==11||Num4==24||Num4==37||Num4==50){suitName4="Jack";}
  else if(Num4==12||Num4==25||Num4==38||Num4==51){suitName4="Queen";}
  else if(Num4==13||Num4==26||Num4==39||Num4==52){suitName4="King";}
  else if(2<=Num4&&Num4<=10){suitName4=Num4+"";}//convert int to string use i+""
  else if(15<=Num4&&Num4<=23){suitName4=Num4%13+"";}
  else if(28<=Num4&&Num4<=36){suitName4=Num4%13+"";}
  else if(41<=Num4&&Num4<=49){suitName4=Num4%13+"";}
 

// Use if statements again to assign the card identity 
  if(1<=Num4&&Num4<=13){cardIdentity4="Diamonds";}
  else if(14<=Num4&&Num4<=26){cardIdentity4="Clubs";}
  else if(27<=Num4&&Num4<=39){cardIdentity4="Hearts";}
  else if(40<=Num4&&Num4<=52){cardIdentity4="Spades";}
  System.out.println("You picked the "+suitName4+" of "+cardIdentity4+".");
  
//To test if there are one pair, two pairs and a three kind 
  if(suitName.equals(suitName1))
  {System.out.println("You have a pair!");}
  else if(suitName.equals(suitName1))
  {System.out.println("You have a pair!");}
  else if(suitName.equals(suitName2))
  {System.out.println("You have a pair!");}
  else if(suitName.equals(suitName4))
  {System.out.println("You have a pair!");}
  else if(suitName1.equals(suitName2))
  {System.out.println("You have a pair!");}
  else if(suitName1.equals(suitName3))
  {System.out.println("You have a pair!");}
  else if(suitName1.equals(suitName4))
  {System.out.println("You have a pair!");}
  else if(suitName2.equals(suitName3))
  {System.out.println("You have a pair!");}
  else if(suitName2.equals(suitName4))
  {System.out.println("You have a pair!");}
  else if(suitName3.equals(suitName4))
  {System.out.println("You have a pair!");}
  else if(suitName!=suitName1||suitName!=suitName2||suitName!=suitName3||suitName!=suitName4)
  {System.out.println("You have a high card!");}
  else if(suitName1!=suitName2||suitName1!=suitName3||suitName1!=suitName4)
  {System.out.println("You have a high card!");}
  else if(suitName2!=suitName3||suitName2!=suitName4||suitName3!=suitName4)
  {System.out.println("You have a high card!");}
  else if(suitName1.equals(suitName)||suitName.equals(suitName2))
  {System.out.println("You have a three of a kind!");}
  else if(suitName.equals(suitName1)||suitName1.equals(suitName3))
  {System.out.println("You have a three of a kind!");}
  else if(suitName.equals(suitName1)||suitName1.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  else if(suitName1.equals(suitName2)||suitName2.equals(suitName3))
  {System.out.println("You have a three of a kind!");}
  else if(suitName1.equals(suitName2)||suitName2.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  else if(suitName2.equals(suitName3)||suitName3.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  else if(suitName.equals(suitName3)||suitName3.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  else if(suitName.equals(suitName2)||suitName2.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  else if(suitName1.equals(suitName3)||suitName3.equals(suitName4))
  {System.out.println("You have a three of a kind!");}
  
 } //End of the program 
       
   }