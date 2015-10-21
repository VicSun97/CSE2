/* Yangze Sun 
   hw08
   String Analysis Program:
   this program is used to examine a given number of characters in the string
   to determine that if they are letters
  compile the program 
   javac StringAnalysis.java
  run the program 
   java StringAnalysis */
  import java.util.Scanner;
  public class StringAnalysis{
      public static boolean analysis(String string){  /*declare a method that check if 
      all characters are letters or not when user wants to check the whole part*/
          for(int i=0;i<string.length();i++){
            if(!(string.charAt(i)>='a'&&string.charAt(i)<='z')){ /*if each character is not between 
            'a'and 'z' then return false*/
                return false;}}
            return true;} // for other conditions, it is true 
      public static boolean analysis(String strin,int num){
          if(strin.length()>=num){
            for(int i=0;i<num;i++){
            if(!(strin.charAt(i)>='a'&&strin.charAt(i)<='z')){
                return false;}}}
          else if(strin.length()>num){
             for(int i=0;i<strin.length();i++){
            if(!(strin.charAt(i)>='a'&&strin.charAt(i)<='z')){
                return false;} 
          }}return true;}
// the beginning of the main method      
   public static void main(String[] args){
       Scanner myScanner=new Scanner(System.in);
       System.out.print("Please enter a string: ");
       String str=myScanner.next();
       System.out.println("Do you want to test the whole string or part of them?"+"Type whole or part." );
       System.out.print("Type your choice: ");// ask the user if they want to check the whole or just part of string
       String choice=myScanner.next();
       if(choice.equals("whole")){ 
           if(analysis(str)){ // call the method inside if statements. 
               // Then print out the result
               System.out.println("They are all letters.");}
            else{System.out.println("They are not all letters.");}}
      else if(choice.equals("part")){ // when user wants to check the part
       System.out.print("Please enter the number of characters that you want to test: ");
       int number=0;
       boolean flag=true;
      while(flag){
         if(myScanner.hasNextInt()){  //check if the input is an integer
             number=myScanner.nextInt();
            if(number>0){flag=true;break;}
            else{System.out.println(" ERROR: Please enter an int: ");
           System.out.print("Please enter the number again: ");flag=true;}}
         else{System.out.println(" ERROR: Please enter an int: "); /* if input is not an integer, ask 
           user to type the input again*/
           System.out.print("Please enter the number again: ");
           myScanner.next(); }}
      if(analysis(str,number)){ // call the method inside if statements.
          // Then print out the result
          System.out.println("They are all letters.");}
          else{System.out.println("They are not all letters.");}
      } 
     
   } // end of the main method   
     
  }//end of the wholee program 
  