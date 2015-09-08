//////////////////////////////////////
//Yangze Sun
//hw02
//Arithemtic Java Program 
//
// This program is used to calculate the total tost of items
//   bought in Walmart after taxation.
// Fourth compile the program 
//      javac Arithmetic.java
// Run the program 
//       java Arithmetic 
//
//define a class
public class Arithmetic{
    
// add main method 
   public static void main(String[] args) {
//       
// Input variables for socks 
   int nSocks=3; // Number of pairs of socks 
   double sockCost$=2.58; //Cost per pair of socks
                          //"$" is part of the variable name
  
// Input variables for glasses
   int nGlasses=6; // Number of drinking glasses
   double glassCost$=2.29; // Cost per glass
   
// Input varibales for envelopes 
   int nEnvelopes=1; // Number of boxes of envelopes 
   double envelopeCost$=3.25;// cost per box of envelopes
   double taxPercent=0.06; // PA sales tax percent 
   
   System.out.println("I bought "+nSocks+" pairs of socks, "+nGlasses+" bottle of drinking glasses,and "+nEnvelopes+" piece of envelopetoday." );
   System.out.println("The cost for socks is "+sockCost$+" $ per pair.");
   System.out.println("The cost for glass is "+glassCost$+" $ per bottle.");
   System.out.println("The cost for envelope is "+envelopeCost$+" $ per each.");

// Store the total cost value for each item
   double totalSockCost$,totalGlassCost$,totalEvenlopeCost$,totalItemsCost$;
   
// Begin first calculation process  
   totalSockCost$=nSocks*sockCost$; //Total cost of socks before taxing
   totalGlassCost$=nGlasses*glassCost$; //Total cost of glasses before taxing
   totalEvenlopeCost$=nEnvelopes*envelopeCost$; // Total cost of envelopes before taxing 
   totalItemsCost$=totalSockCost$+totalGlassCost$+totalEvenlopeCost$; // total cost(before taxing)
//Convert into 2 decimal number   
   totalItemsCost$=(0.0+(int)(totalItemsCost$*100))/100;
   
// Store the sales tax values   
   double salesTaxSock$,salesTaxGlass$,salesTaxEnvelope$,totalTax$,totalCost$;

// Begin second calculation process 
   salesTaxSock$=totalSockCost$*taxPercent;// Sales tax values for all bought socks
   salesTaxGlass$=totalGlassCost$*taxPercent; //Sales tax values for all bought glasses
   salesTaxEnvelope$=totalEvenlopeCost$*taxPercent; // Sales tax values for all bought envelopes
   totalTax$=salesTaxSock$+salesTaxGlass$+salesTaxEnvelope$;// total sales tax
   totalCost$=totalItemsCost$+totalTax$; //total cost(after taxing)
//Convert into 2 decimal number  
   totalTax$=(0.0+(int)(totalTax$*100))/100;
   totalCost$=(0.0+(int)(totalCost$*100))/100;
   
   System.out.println("The total cost of the purchases(before tax) is "+totalItemsCost$+"$.");
   System.out.println("The total sales tax is "+totalTax$+"$.");
   System.out.println("The total cost of the purchases(including tax) is "+totalCost$+"$.");
   
   }//the end of main method
}