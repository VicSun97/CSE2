///////////////////////
//Yangze Sun
//09/18/15
//lab04[CSE2]
//Card Gernerator java program 
// This program is used to generate a random card from the decks to play a trick in magic show. 
// Compile the program 
// javac CardGenerator.java
// Run the program 
// java CardGenerator 
//
  import java.util.Random;
// Define a class
  public class CardGenerator{
      // main method used in every java program
  public static void main(String[] args){
//Use a math ramdom to generator a ramdom number 
  int Num=(int)(Math.random()*52)+2;
// Create two String variales
  String suitName="";
  String cardIdentity="";
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
  
  System.out.println("You picked the "+suitName+" of "+cardIdentity+".");
     
} // End of the program
  }
 