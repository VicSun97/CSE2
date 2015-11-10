/* Yangze Sun
   lab11
   This program is used to practice linear search and binary search methods
  Compile the program 
    javac Search.java
  Run the program 
    java Search
  */
  import java.util.Scanner;
  public class Search{
      
      public static void main(String[] args){
        int[] array1=new int[50]; // Create array1 whose size is 5000
        int[] array2=new int[50]; // create array2 whose size is 5000
          for(int i=0;i<array1.length;i++){  // fill array 1 between 0 and 100000
              array1[i]=(int)(Math.random()*100001);
              /*System.out.println(i+":"+array1[i]);*/
          }
          int temp1=array1[0];
          for(int i=0;i<array1.length;i++){ // use linear search to print out the max and min of 1st array
              if(i==0){continue;}
              else{
                if(array1[i]>=temp1){temp1=array1[i];}
              else if(array1[i]<temp1){continue; }
           } }
  System.out.println("The maximum of array1 is:"+temp1);
          int temp2=array1[0];
          for(int i=0;i<array1.length;i++){
              if(i==0){continue;}
              else{
                 if(array1[i]>temp2){continue;}
                 else if(array1[i]<=temp2){temp2=array1[i];}
              }  }  
  System.out.println("The mimimum of array1 is:"+temp2);
      
      int temp3=0;
      for(int i=0;i<array2.length;i++){  
          array2[i]=(int)(Math.random()*100001);}
      for(int i=0;i<array2.length;i++){ //rearrange the array2 to list from smallest to largest
          for(int j=i+1;j<array2.length;j++){
            if(array2[i]>=array2[j]){
             temp3=array2[i];
             array2[i]=array2[j];
             array2[j]=temp3;
            }}} 
       /* for(int i=0;i<array2.length;i++){
         System.out.println(i+":"+array2[i]);}*/
        int a=array2[0];
     System.out.println("The maximum of array2 is:"+temp3); // directly print out the max and min of array2
     System.out.println("The mimimum of array2 is:"+a);
  
  Scanner myScanner=new Scanner(System.in);
   System.out.print("Please enter an integer: "); // prompt the user for an integer, if not right, then exit 
   boolean flag=true;
   int integer=myScanner.nextInt();
   while(flag){
       if(integer>=0){break;}
       else{return;}}
  int low=0;
  int high=array2.length-1;
 boolean flag1=true;
 int mid=0; 
   while(flag1){   // use binary search to find out whether the key integer entered is found out in this array 
     if(high>=low){
      mid=(low+high)/2;
      if(integer<array2[mid]){  // narrow the higher band and lower band each time
       high=mid-1;}
      else if(integer==array2[mid]){
          System.out.println(integer+" was found in the list."); // if key is found 
          if(high>0){System.out.println("The number above the key was "+array2[mid+1]);
          System.out.println("The number below the key was "+array2[mid-1]);}
          else if(high<low){
         System.out.println("The number above the key was "+array2[mid+1]);
         System.out.println("The number below the key was none"); }
          break;}
      else{low=mid+1;}}
     else if(high<low){
         flag1=false;
         System.out.println(integer+" was not found in the list."); // if key was not found
         if(high==0){
         System.out.println("The number above the key was "+array2[mid+1]);
         System.out.println("The number below the key was none");}
     }
     }
      }// end of the main method
      
  }// end of the whole program