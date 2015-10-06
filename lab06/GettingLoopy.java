/* Yangze Sun 
   10/02/2015
   lab06
   This program is used to practice on some basic loops of java program
  Compile the program
  javac GettingLoopy.java
  Run the program 
  java GettingLoopy */
  
 public class GettingLoopy{
    public static void main(String[] args){
// Step1 sample output
  int num=1,counter=0;
  System.out.println("Step 1: ");
     while(num<8){
    System.out.print(num);
     num++;}
    while(counter<=5){  //repeat 6 times
    System.out.print("7");
     counter++; }
   System.out.println("");
   System.out.println("");
// Step2 find the prime number between 10-100 
 int integer=10;
 // use while loop
  System.out.println("Step 2: ");
  System.out.print("WHILE LOOP: ");
  while(integer<=100){
    if(integer%2!=0&&integer%3!=0&&integer%5!=0&&integer%7!=0){
    System.out.print(integer+" "); 
    integer++;}
    else{integer++;}}
// use for loop
   System.out.println("");
   System.out.print("FOR LOOP: ");
   for(int num1=10;num1<=100;num1++){
     if(num1%2!=0&&num1%3!=0&&num1%5!=0&&num1%7!=0){
    System.out.print(num1+" "); }}
// use do-while loop
  System.out.println(" ");
  System.out.print("DO WHILE LOOP: ");
  int num2=10;
  do{if(num2%2!=0&&num2%3!=0&&num2%5!=0&&num2%7!=0) 
  {System.out.print(num2+" ");num2++;}else{num2++;}}
  while(num2<=100);
//happy ending face program 
  System.out.println(" ");
  System.out.println(" ");
  System.out.println("Step 3: ");
  int randomNum=(int)(Math.random()*196)+5; // [0,1)*196+5=[5,201)=[5,200]
  System.out.println(randomNum);
  for(int counter2=1;counter2<=randomNum;counter2++){
    System.out.print("ツ");
    if(counter2%20==0){
        System.out.print("\n");}}
  System.out.print("\n");
  }// end of the program 
}
