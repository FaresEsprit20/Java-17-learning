package com.learning;

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
        transposeMatrix(matrix);
        System.out.println(" Transposed Matrix ");
        displayMatrix(matrix);

      System.out.println("How much do you want to rotate the Matrix  :");
      System.out.println("Press 1 to rotate matrix to 90 degrees");
      System.out.println("Press 2 to rotate matrix to 180 degrees");
      System.out.println("Press 3 to rotate matrix to 270 degrees");

      byte choice = scanner.nextByte();
      switch (choice) {
          case 1:
              System.out.println(" Original Matrix ");
              displayMatrix(matrix);
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


    public static double[][] transposeMatrix(double[][] matrix) {
        double aux = 0.0;
       for(int i=0;i<matrix.length;i++) {
           for(int j=i;j<matrix[i].length;j++) {
             aux = matrix[i][j];
             matrix[i][j] = matrix[j][i];
             matrix[j][i] = aux;
               System.out.println(aux);
               System.out.println(matrix[i][j]);
               System.out.println(matrix[j][i]);
               System.out.println("*************");
           }
       }
       return matrix;
    }

    public static void inverseMatrixHorizontally(double[][] matrix) {

    }

    public static void inverseMatrixVertically(double[][] matrix) {

    }

    public static void rotate90(double[][] matrix) {

    }

    public static void rotate180(double[][] matrix) {

    }

    public static void rotate270(double[][] matrix) {

    }

    public static void displayMatrix(double[][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[i].length;j++) {
           System.out.printf("%f \t",matrix[i][j]);
            }
            System.out.println();
        }


    }




}
