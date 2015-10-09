/* Yangze Sun 
   10/09/2015
   lab06
   encrypted_x program: this program is used to hide the secret message X pattern. 
   compile the program
  javac encrypted_x.java
   run the program 
  java encrypted_x   */
  import java.util.Scanner;// import a scanner method for input
  public class encrypted_x{
    public static void main(String[] args){
        Scanner myScanner=new Scanner(System.in);
    int input=0;
    boolean flag=false;
    System.out.print("Input your integer: ");
    while(!flag){
       while(myScanner.hasNextInt()){
           input=myScanner.nextInt();
         if(input>=0&&input<=100){
           flag=true;break;}
         else if(input<0||input>100){
          System.out.println(" ERROR: need an integer between 0-100.");
          System.out.print("Please input your integer again: ");
          myScanner.hasNextInt(); }}}
    for(int i=0;i<input;i++){
     if(i==0||i==input-1){System.out.print(" ");}
     else{System.out.print("*");}
      for(int j=1;j<input;j++){
       if(j==i||j==input-1-i){System.out.print(" ");}
       else{System.out.print("*");}}
        System.out.println();}
  }  //end of the program 
  }