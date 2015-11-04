/* Yangze Sun
   hw10 
   Shuffling: This program is used to shuffle the 52 cards in the deck and then pick up 5 cards from it randomly
  compile the program
    javac Shuffling.java
  run the program 
    java Shuffling
  */
  
  public class Shuffling{
      public static void printArray(String[] array){  //creating a method for print the elements in a String array separately
        int noOfElement=array.length;  // Number of element is the length of this array
        for(int i=0;i<array.length;i++){ // print out the each element in array with " "(space) splitting
            System.out.print(array[i]+" ");}}
      public static void shuffle(String[] arrayList){  // a method for shuffling the deck cards
       int num=arrayList.length; 
      for(int j=0;j<60;j++){ // the number of shuffling>50 times, so I choose 60 times
        for(int i=0;i<num;i++){  
        int index=(int)(Math.random()*num);
         //Swap the position of elements in the array at that index with the first element
          String temp=arrayList[i]; 
          arrayList[i]=arrayList[index];
          arrayList[index]=temp;
      }}}
      public static String[] randomizeHand(String[] arrayShuffle){ // a method that pick up 5 random cards 
       String[] combine=new String[5];
       int k=-1;
       for(int i=0;i<5;i++){
           int j=(int)(Math.random()*52);
            if(j==k){continue;} // use if statements to avoid from picking up the same item twice
            else{combine[i]=arrayShuffle[j];k=j;
       }}
        return combine;} // return out a combined arraylist
      
      public static void main(String[] args){ // main method
          String[] suitNames={"C","H","S","D"}; // create a string array for suitnames
          String[] rankNames={"2","3","4","5","6","7","8","9","10","J","Q","K","A"}; // create a string array for ranknames
          String[] cards=new String[52]; // create a string for combining both suitnames array and ranknames array
          for(int i=0;i<52;i++){  // print out the first ordered 52 deck cards
              cards[i]=rankNames[i%13]+suitNames[i/13];
              System.out.print(cards[i]+" ");
          }
          System.out.println("\n"+"\n"+"Shuffled: ");
          shuffle(cards); // call shuffle method
          printArray(cards); // call printArray method
          System.out.println("\n"+"\n"+"Randomized Hand!");
      // call randonmizeHand method and store the returned array into a new declared array
          String[] fiveRandom=randomizeHand(cards); 
          printArray(fiveRandom); // call printArray method
      } // end of the main method
      
  }//end of the program 