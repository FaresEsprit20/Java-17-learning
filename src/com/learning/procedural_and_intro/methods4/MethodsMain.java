package com.learning.procedural_and_intro.methods4;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodsMain {

  public static void main(String... args) {

    /**
     * Exercise 1
     * @Author Fares Ben Slama
     */
   /* System.out.println("Enter integer numbers seperated by spaces");
    Scanner scanner = new Scanner(System.in);
    String stringInput = scanner.nextLine();
    String[] stringArray = stringInput.split("\s");
    int[] integerArray = new int[stringArray.length];
    for(int i=0;i<stringArray.length;i++){
      integerArray[i]  = Integer.parseInt(stringArray[i]);
    }
    System.out.println(Arrays.toString(integerArray));
    int max = findMaxIntInArray(integerArray);
    System.out.println("\n Max Value :  "+max);
*/

    /**
     * Exercise 2
     * @Author Fares Ben Slama
     */
   /*  System.out.println("\nEnter Height of rectangle : \n");
     Scanner scanner = new Scanner(System.in);
     int height = scanner.nextInt();
    System.out.println("\nEnter Width of rectangle : \n");
    int width = scanner.nextInt();
    drawRectangle(height,width);*/

    /**
     * Exercise 3
     * @Author Fares Ben Slama
     */

   /* System.out.println("\n Enter Text Please :  \n");
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.printf("\n %d \n",getWordsAmount(text));*/
    /**
     * Exercise 4
     * @Author Fares Ben Slama
     */
    /*System.out.println("\n Enter random strings seperated by spaces :  \n ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    String[] stringArray = string.split(" ");
    String[] filteredStringArray = filterWordsByLength(3, stringArray);
    System.out.println(Arrays.toString(stringArray));
    System.out.println(Arrays.toString(filteredStringArray));*/

    /**
     * Exercise 5
     * @Author Fares Ben Slama
     */
    /*System.out.println("\n Please specify the matrix size  :  \n");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    BigDecimal[][] matrix = new BigDecimal[size][size];
    for (int i = 0; i < matrix.length; i++) {
      Arrays.fill(matrix[i], BigDecimal.valueOf(0));
    }
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        BigDecimal digit = BigDecimal.valueOf(Double.parseDouble(i + "." + j));
        digit.setScale(1, RoundingMode.HALF_UP);
        matrix[i][j] = digit;
      }
    }
    displayMatrix(matrix);
    System.out.println("\nHow much do you want to rotate the matrix ? \n 1: 90 degree \n 2: 180 degree \n 3: 270 degree \n");
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        System.out.println("\n ========== Rotating matrix to 90 degree =========== \n");
        rotate90(matrix);
        displayMatrix(matrix);
        break;
      case 2:
        System.out.println("\n ========== Rotating matrix to 180 degree =========== \n");
        rotate180(matrix);
        displayMatrix(matrix);
        break;
      case 3:
        System.out.println("\n ========== Rotating matrix to 270 degree =========== \n");
        rotate270(matrix);
        displayMatrix(matrix);
        break;
      default:
        break;
    }*/
    /**
     * Exercise 6
     * @Author Fares Ben Slama
     */
   /* System.out.println("\n Specify the length of Array");
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] array = generateRandomArray(size);
    System.out.println("\n Array 1 \n");
    displayArray(array);
    int[] arrayTwo = new int[size * 2];
    for(int i = 0,j = array.length;i<array.length && j<arrayTwo.length;i++,j++) {
      arrayTwo[i] = array[i];
      arrayTwo[j] = array[i] * 2;
    }
    System.out.println("\n Array 2 \n");
    displayArray(arrayTwo);*/

    /**
     * Exercise 7
     * @Author Fares Ben Slama
     *
     */
    System.out.println("Enter two numbers seperated by space ");
    Scanner scanner = new Scanner(System.in);
    String entry = scanner.nextLine();
    String[] entries = entry.split("\\s+");
    int[] numbers = new int[entries.length];
    for(int i =0;i<numbers.length;i++) {
      numbers[i] = Integer.parseInt(entries[i]);
    }
    System.out.println("\n Entries \n"+Arrays.toString(numbers));
    int number1 = numbers[0];
    int number2 = numbers[1];
    int gcd = gcdRecursive(number1,number2);
    System.out.println("\n  GCD Recursive  :   "+gcd);






  }
  public static int gcdRecursive(int firstNumber, int secondNumber) {
    if(firstNumber == secondNumber) {
      return Math.abs(firstNumber);
  }else if(firstNumber > secondNumber) {
     return gcdRecursive(firstNumber - secondNumber, secondNumber);
    }else {
      return gcdRecursive(firstNumber, secondNumber - firstNumber);
    }
  }
  public static int findGcdIterative(int number1,int number2) {
    while(number1 != number2) {
      if(number1 > number2) {
        number1 = number1 - number2;
      }else {
        number2 = number2 - number1;
      }
    }
    return number2;
  }




  public static int[] generateRandomArray(int amountOfElements) {
    int[] array = new int[amountOfElements];
    for (int i = 0; i < array.length; i++) {
      Random random = new Random();
      array[i] = random.nextInt(100);
    }
    return array;
  }

  public static void displayArray(int[] array) {
    System.out.println();
    for (int i = 0; i < array.length; i++) {
      System.out.print("\t" + array[i]);
    }
    System.out.println();
  }

  public static void transposeMatrix(BigDecimal[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < i; j++) {
        BigDecimal aux = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = aux;
      }
    }
    System.out.println("\n Transposed Matrix  \n");
    displayMatrix(matrix);
    System.out.println();
  }

  /* 90 degrees
    4.0   3.0   2.0   1.0   0.0
    4.1   3.1   2.1   1.1   0.1
    4.2   3.2   2.2   1.2   0.2
    4.3   3.3   2.3   1.3   0.3
    4.4   3.4   2.4   1.4   0.4
    */
  public static void rotate90(BigDecimal[][] matrix) {
    transposeMatrix(matrix);
    inverseHorizontally(matrix);
  }

  public static void inverseHorizontally(BigDecimal[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[i].length - 1, c = 0; j > c; c++, j--) {
        BigDecimal aux = matrix[i][c];
        matrix[i][c] = matrix[i][j];
        matrix[i][j] = aux;
      }
    }
  }

  public static void inverseVertically(BigDecimal[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = matrix[i].length - 1, c = 0; j > c; c++, j--) {
        BigDecimal aux = matrix[c][i];
        matrix[c][i] = matrix[j][i];
        matrix[j][i] = aux;
      }
    }
  }

  /* 180 degree
  4.4   4.3   4.2   4.1   4.0
  3.4   3.3   3.2   3.1   3.0
  2.4   2.3   2.2   2.1   2.0
  1.4   1.3   1.2   1.1   1.0
  0.4   0.3   0.2   0.1   0.0
   */
  public static void rotate180(BigDecimal[][] matrix) {
    inverseVertically(matrix);
    inverseHorizontally(matrix);
  }

  /* 270 degree
  0.4   1.4   2.4   3.4   4.4
  0.3   1.3   2.3   3.3   4.3
  0.2   1.2   2.2   3.2   4.2
  0.1   1.1   2.1   3.1   4.1
  0.0   1.0   2.0   3.0   4.0
   */
  public static void rotate270(BigDecimal[][] matrix) {
    inverseVertically(matrix);
    transposeMatrix(matrix);
    inverseHorizontally(matrix);
    inverseVertically(matrix);
  }


  public static void displayMatrix(BigDecimal[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print("\t" + matrix[i][j]);
      }
      System.out.println();
    }
  }


  public static String[] filterWordsByLength(int minLength, String[] words) {
    String[] newArray = new String[words.length];
    Arrays.fill(newArray, " ");
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() >= minLength) {
        newArray[i] = words[i];
      }
    }
    return newArray;
  }

  public static int getWordsAmount(String text) {
    return text.length();
  }

  public static void drawRectangle(int height, int width) {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        if (i == 0 || i == height - 1) {
          System.out.print("*");
        } else {
          if (j == 0 || j == width - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
      }
      System.out.println("\t");
    }

  }

  public static int findMaxIntInArray(int[] intArray) {
    int max = intArray[0];
    for (int i = 1; i <= intArray.length - 1; i++) {
      if (intArray[i] > max) {
        max = intArray[i];
      }
    }
    return max;
  }


}
