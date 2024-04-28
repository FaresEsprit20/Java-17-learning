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
        double[][] matrix = new double[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Double.parseDouble(i + "." + j);
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
                rotate90(matrix);
                break;
            case 2:
                rotate180(matrix);
                break;
            case 3:
                rotate270(matrix);
                break;
        }

    }

    public static double[][] initializeMatrixFrom(double[][] matrix) {
        double[][] newMatrix = new double[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, matrix[i].length);
        }
        return newMatrix;
    }

    public static double[][] transposeMatrix(double[][] matrix) {
        double aux = 0.0;
        double[][] transposedMatrix = initializeMatrixFrom(matrix);
        for (int i = 0; i < transposedMatrix.length; i++) {
            for (int j = i; j < transposedMatrix[i].length; j++) {
                aux = transposedMatrix[i][j];
                transposedMatrix[i][j] = transposedMatrix[j][i];
                transposedMatrix[j][i] = aux;
            }
        }
        return transposedMatrix;
    }

    public static double[][] inverseMatrixHorizontally(double[][] matrix) {
        double[][] invertedHorizontallyMatrix = initializeMatrixFrom(matrix);
        for(int i = 0; i< invertedHorizontallyMatrix.length;i++){
            for(int j=0; j< invertedHorizontallyMatrix[i].length/2;j++){
                double temp = invertedHorizontallyMatrix[i][j];
                invertedHorizontallyMatrix[i][j] = invertedHorizontallyMatrix[i][invertedHorizontallyMatrix.length - 1-j];
                invertedHorizontallyMatrix[i][invertedHorizontallyMatrix.length - 1-j] = temp;
            }
        }
        return invertedHorizontallyMatrix;
    }


    public static double[][] inverseMatrixVertically(double[][] matrix) {
        double[][] invertedVerticallyMatrix = initializeMatrixFrom(matrix);
        for(int i =0;i<invertedVerticallyMatrix.length;i++) {
            for(int j =0 ;j<invertedVerticallyMatrix[i].length / 2;j++) {
                double temp = invertedVerticallyMatrix[j][i];
                invertedVerticallyMatrix[j][i] = invertedVerticallyMatrix[invertedVerticallyMatrix[i].length -1 -j][i];
                invertedVerticallyMatrix[invertedVerticallyMatrix[i].length -1 -j][i] = temp;
            }
        }
        return invertedVerticallyMatrix;
    }

    public static void rotate90(double[][] matrix) {
        System.out.println(" Original Matrix ");
        displayMatrix(matrix);
        System.out.println(" Transposed Matrix ");
        double[][] tranMatrix = transposeMatrix(matrix);
        displayMatrix(tranMatrix);
        System.out.println(" Rotated 90 deg Matrix ");
        double[][] inHerMatrix = inverseMatrixHorizontally(tranMatrix);
        displayMatrix(inHerMatrix);
    }

    public static void rotate180(double[][] matrix) {
        System.out.println(" Original Matrix ");
        displayMatrix(matrix);
        System.out.println(" Rotated 180 deg Matrix ");
        double[][] horizontalMatrix = inverseMatrixHorizontally(matrix);
        double[][] verticalMatrix = inverseMatrixVertically(horizontalMatrix);
        displayMatrix(verticalMatrix);
    }

    public static void rotate270(double[][] matrix) {
        System.out.println(" Original Matrix ");
        displayMatrix(matrix);
        System.out.println(" Transposed Matrix ");
        double[][] tranMatrix = transposeMatrix(matrix);
        displayMatrix(tranMatrix);
        System.out.println(" Rotated 270 deg Matrix ");
        double[][] inVerMatrix = inverseMatrixVertically(tranMatrix);
        displayMatrix(inVerMatrix);
    }

    public static void displayMatrix(double[][] matrix) {
        System.out.println();
        // Display the matrix
        DecimalFormat df = new DecimalFormat("0.0");
        for (double[] doubles : matrix) {
            for (double aDouble : doubles) {
                System.out.print(df.format(aDouble) + " \t ");
            }
            System.out.println();
        }
        System.out.println();
    }


}
