package com.learning;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Fares Ben Slama
 */

public class Main {


    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the size of the Matrix ");
      int size = scanner.nextInt();
      double[][] matrix= new double[size][size];

      for(int i =0;i<matrix.length;i++){
          for(int j=0;j<matrix[i].length;j++) {
              matrix[i][j] = Double.parseDouble(i + "." +j);
          }
      }

        System.out.println(" Original Matrix ");
        displayMatrix(matrix);
        double[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println(" Transposed Matrix ");
        displayMatrix(transposedMatrix);

      System.out.println("How much do you want to rotate the Matrix  :");
      System.out.println("Press 1 to rotate matrix to 90 degrees");
      System.out.println("Press 2 to rotate matrix to 180 degrees");
      System.out.println("Press 3 to rotate matrix to 270 degrees");

      byte choice = scanner.nextByte();
      switch (choice) {
          case 1:
              System.out.println(" Original Matrix ");
              displayMatrix(matrix);
              System.out.println(" Transposed Matrix ");
              double[][] tranMatrix = transposeMatrix(matrix);
              displayMatrix(tranMatrix);
              System.out.println(" Inverted Horizontally Matrix ");
              double[][] inHerMatrix = inverseMatrixHorizontally(tranMatrix);
              displayMatrix(inHerMatrix);
              rotate90(matrix);
              break;
          case 2:
              System.out.println(" Original Matrix ");
              displayMatrix(matrix);
              rotate180(matrix);
              break;
          case 3:
              System.out.println(" Original Matrix ");
              displayMatrix(matrix);
              rotate270(matrix);
              break;
      }




    }

    public static double[][] initializeMatrixFrom(double[][] matrix){
        double[][] newMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }
        return newMatrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        double aux = 0.0;
        double[][] transposedMatrix = initializeMatrixFrom(matrix);
        for(int i=0;i<transposedMatrix.length;i++) {
           for(int j=i;j<transposedMatrix[i].length;j++) {
             aux = transposedMatrix[i][j];
             transposedMatrix[i][j] = transposedMatrix[j][i];
             transposedMatrix[j][i] = aux;
           }
       }
       return transposedMatrix;
    }

    public static double[][] inverseMatrixHorizontally(double[][] matrix) {
        double[][] invertedHorizontallyMatrix = initializeMatrixFrom(matrix);

        return invertedHorizontallyMatrix;
    }


    public static double[][] inverseMatrixVertically(double[][] matrix) {
        double[][] invertedVerticallyMatrix = initializeMatrixFrom(matrix);
        for(int i = 0; i< invertedVerticallyMatrix.length; i++) {
            for(int j = i; j< invertedVerticallyMatrix[i].length; j++) {

            }
        }
       return invertedVerticallyMatrix;
    }

    public static void rotate90(double[][] matrix) {

    }

    public static void rotate180(double[][] matrix) {

    }

    public static void rotate270(double[][] matrix) {

    }

    public static void displayMatrix(double[][] matrix) {
        System.out.println();
        // Display the matrix
        DecimalFormat df = new DecimalFormat("0.0");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(df.format(matrix[i][j]) + " \t ");
            }
            System.out.println();
        }
        System.out.println();
    }




}
