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
       public static int[][] raggedArray(){ // Create a method for filling in the 2D array with random member arrays 
       int a=(int)(Math.random()*11+10); // return an array contains randomly 10 to 20 member arrays
       int[][] result=new int[a][]; // declare and initiate a new 2D array which will be returned
    for(int i=0;i<result.length;i++){ // give each member array a size of randomly 10 to 20 integers
        result[i]=new int[(int)(Math.random()*11+10)];
      for(int j=0;j<result[i].length;j++){
      result[i][j]=(int)(Math.random()*2001-1000); // give the value of each number to be randomly between -1000 and 1000
   }
  }
return result;}

     public static void printArray(int[][] array){ // create a method to print out the two-dimensional array
         for(int i=0;i<array.length;i++){
             for(int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]+" "); 
                 }
           System.out.println();}
     }
     
     public static void printArray(int[] array){ //create a method to print single dimensional array
         for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" "); 
            }
         }
          
     public static int[] findSmallest(int[][] array){ // create a method to return the member array with smallest size
        int[] result=new int[0]; 
        result=array[0];
        int temp=array[0].length;
        for(int i=0;i<array.length;i++){
           if(array[i].length<=temp){ 
               temp=array[i].length;
               result=array[i];
           }
        }
        return result;
     }
     
     public static int[] findLargest(int[][] array){  //create a method to return the member array with biggest number
         int max=array[0][0];
         int[] result=new int[0];
         for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(max<=array[i][j]){
                    max=array[i][j];
                    result=array[i];
                }
            } 
         }System.out.print("\n"); 
         System.out.println("\n"+"The largest number is "+max);
     return result;}
     
     public static int[] mostEven(int[][] array){ // create a method to return the member array containing biggest even number
         int[] result=new int[0];
         int maxEven=array[0][0];
         for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
              if(maxEven<=array[i][j]&&array[i][j]%2==0){
                  maxEven=array[i][j];
                  result=array[i];
              }
            }
         } System.out.print("\n");
         System.out.println("\n"+"The Largest even number is "+maxEven);
        return result; 
     }
     
      public static void main(String[] arg){  // main method
         int[][] array=new int[0][0];
         array=raggedArray();//call the raggedArray method
         System.out.println("The raggedArray: "); 
         printArray(array); // call the printArray method
         int[] memArray=new int[0];
         memArray=findSmallest(array); //call the findSmallest method
        System.out.println("\n"+"The member array with smallest size ");
         printArray(memArray); //call the printArray method
         int[] memArray1=new int[0];
         memArray1=findLargest(array);
         printArray(memArray1); //call the printArray method
         int[] memArray2=new int[0];
         memArray2=mostEven(array); // call the mostEven method
         printArray(memArray2); //call the printArray method
         System.out.print("\n");
   } //end of the main method
       
   }//end of the whole programs