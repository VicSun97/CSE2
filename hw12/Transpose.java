/* Yangze Sun
    hw12
    Transpose Java
    This program is used to make a transfer from row-major formating matrix to column-major formating matrix
   Compile the program 
     javac Transpose.java
   Run the program 
     java Transpose */
  import java.util.Scanner;
  public class Transpose{
     public static int[][] randomMatrix(int width,int height){  //create the first method to fill in values in matrix between -10 and 10
         int[][] matrix=new int[height][width];
         for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[i].length;j++){
                 matrix[i][j]=(int)(Math.random()*21-10); // randomly give value to array between -10 and 10
             }  }
     return matrix; } // end of the randomMatrix method
     public static void printMatrix(int[][] matrix){  // print out the matrix in row-major format and check for rectangularity
         int temp=matrix[0].length;
         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i].length==temp){  // if the size of each member array is same, it is a rectangle.
                temp=matrix[i].length;    
                System.out.print(matrix[i][j]+" ");}
                else if(matrix[i].length!=temp){ // if the size of each member array is not same, it is not a rectangle. Give warning.
                System.out.println("ERROR:this is not a rectangle.");break;}
        }System.out.println(); 
    } } // end of printMatrix method
    
    public static int[][] transposeMatrix(int[][] matrix){ /* create a transpose method used to
    convert row-major format to column-major format */
      int[][] transMatrix=new int[matrix[0].length][matrix.length];  
        for(int i=0;i<transMatrix.length;i++){
         for(int j=0;j<transMatrix[i].length;j++){
             transMatrix[i][j]=matrix[j][i]; /* swap the size of member array and the size of member of the member array to make sure
            that the each row is now converted to each column */
         }
        }
   return transMatrix; } // end of the transpose method

      public static void main(String[] args){  // beginning of the main method
          Scanner myScanner=new Scanner(System.in);
          System.out.print("Please input the width: ");
         int width=0;
          boolean flag=true;
          while(flag){
              if(myScanner.hasNextInt()){ //check if it is a integer
                  width=myScanner.nextInt();
                  if(width>0){flag=false;break;} // check if it is a positive value
                  else{System.out.println("ERROR: you do not input a positive value. ");        
                       System.out.print("Please input the width again: ");
                       flag=true;} }
              else{System.out.println("ERROR: you do not input an integer. ");
                  System.out.print("Please input the width again: ");
                      flag=true;myScanner.next();} }
                      
          System.out.print("Please input the height: ");
          int height=0;
          boolean flag1=true;
          while(flag1){
              if(myScanner.hasNextInt()){
                  height=myScanner.nextInt();
                  if(height>0){flag1=false;break;}
                  else{System.out.println("ERROR: you do not input a positive value. ");        
                       System.out.print("Please input the height again: ");
                       flag1=true;} }
              else{System.out.println("ERROR: you do not input an integer. ");
                  System.out.print("Please input the height again: ");
                      flag1=true;myScanner.next();} }
       
        int[][] matrix=new int[0][0]; // declare, allocate and initiate a matrix array
        System.out.println("This is the original matrix: ");
        matrix=randomMatrix(width,height); //call the randomMatrix method and use the returned 2D array
        printMatrix(matrix); // call the printMatrix method
        int[][] transMatrix=new int[0][0]; // declare, allocate and initiate a transMatrix 2D array
        System.out.println();
        System.out.println("This is the transposeMatrix: ");
        transMatrix=transposeMatrix(matrix);// call the transposeMatrix method and use the returned 2D array
        printMatrix(transMatrix);// call the printMatrix method
      
      } // end of the main method
      
  } // end of the whole program
  