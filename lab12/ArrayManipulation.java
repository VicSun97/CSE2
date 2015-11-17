/* Yangze Sun
   lab 12
   ArrayManipulation Program 
   This program is used to create a 2D array, and then to find out the 
   largest member array, smallest member array and the largest number of even members.
  compile the program 
   javac ArrayManipulation.java
  Run the program 
   java ArrayMAnipulation */
   
   public class ArrayManipulation{
       public static int[][] raggedArray(int[][] array){ /* Create a method for filling in the 2D array with random member arrays, 
       random sizes and random integers for each member array */
        /* int ranNum1=(int)(Math.random()*11+10);
         for(int i=0;i<array.length;i++){
             int ranNum2=(int)(Math.random()*11+10);
             array=new int[ranNum1][ranNum2];
             for(int j=0;j<array[i].length;j++){
                 array[i][j]=(int)(Math.random()*11+10);
             } 
         } return array;}*/
       int ranNum1=(int)(Math.random()*11+10);
       int ranNum2=0;
       array=new int[ranNum1][ranNum2];
       for(int i=0;i<array.length;i++){
         for(int j=0;j<array[i].length;j++){
             array[i][j]=(int)(Math.random()*2001-1000);
             } ranNum2=(int)(Math.random()*10+11);
       } return array;}
       
       public static void printArray(int[][] array){ //create a method to print out 2d Array
           for(int i=0;i<array.length;i++){
             for(int j=0;j<array[i].length;j++){
                 System.out.print(array[i][j]+" ");
             }
           System.out.println();}
          }
      
        public static void printArray(int[] array){// create  a method to print out 1d array
            for(int i=0;i<array.length;i++){
                System.out.print(array[i]+" ");
            }
        }
        
        public static int[] findSmallest(int[][] array){
            int min=array[0].length;
            int[] array1=new int[0];
            for(int i=0;i<array.length;i++){
                int temp=array[i].length;
             if(temp>min){continue;}
             else if(temp<=min){min=array[i].length;array1=array[i];} }
            return array1;}
        
       public static void main(String[] args){
          int[][] array=new int[0][0];
           array=raggedArray(array);
           printArray(array); 
          /* int[] array1=findSmallest(array);
          System.out.println("\n");
           printArray(array1);*/
   } //end of the main method
       
   }//end of the whole programs