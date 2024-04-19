package com.learning.procedural_and_intro.lopps3;

import java.util.Scanner;

public class LoopHomework {



  public static void main(String... args) {


   /* System.out.println("Enter the pyramid height  : \n");
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();

    for(int i =0;i<height * 2;i++) {
      int middle = (i <= height)? i : ((height * 2) -i);
      for(int j = 0; j < middle;j++) {
           System.out.print("*\t");
      }
       System.out.println();
    } */

    int[][] matrix = {
      {1, 2, 3, 4, 5},
      {6, 7},
      {8, 9, 10}
    };

    for(int i = 0;i<matrix.length;i++) {
      for(int j=0; j<matrix[i].length;j++) {
         System.out.printf("%d\t",matrix[i][j]);
      }
      System.out.println();
    }


    /**
     *
     * Matrix Stars Display
     * @author Fares Ben Slama
     *
     */
    System.out.println(" Enter the height of Pyramid : ");
    Scanner scanner = new Scanner(System.in);
    int height = scanner.nextInt();
    int newHeight = 0;
    for(int i = 0; i < height * 2; i++) {

      if(i >height) {
        newHeight = ( height * 2) - i;
      }else {
        newHeight = i;
      }

      for(int j = 0; j< newHeight ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }












    /**
     * @Author Fares Ben Slama
     * First Solution Exercise 1
     */
    /*System.out.println("Enter an Integer Number  :  \n");
    Scanner scanner = new Scanner(System.in);
    int integer = scanner.nextInt();
    String stringInteger = String.valueOf(integer);
    char[] stringArray = stringInteger.toCharArray();
    for(int index: stringArray) {
      System.out.printf("\n%c\n",index);
    }*/

    /**
     * @Author Fares Ben Slama
     * Second Solution Exercise 1
     */
    /*System.out.println("Enter an Integer Number  :  \n");
    Scanner scanner = new Scanner(System.in);
    int integer = scanner.nextInt();
    int modulo = 0;
    String stringInteger = String.valueOf(integer);
    int pow = (int) Math.pow(10,stringInteger.length() -1);

    while(pow > 0){
      modulo = integer % pow;
      integer /= pow;
      System.out.printf("\n%d %d \n",integer,pow);
      integer = modulo;
      pow /=10;
    }*/


    /**
     * @Author Fares Ben Slama
     * First Solution Exercise 2
     */
  /* System.out.println("Enter the pyramid height : \n");
   Scanner scanner = new Scanner(System.in);
   int height = scanner.nextInt();
   char[][] matrix = new char[height * 2][height];
   for(int i = 0;i < height*2;i++){
     for(int j= 0; j < height;j++){
       matrix[i][j] = ' ';
     }
   }
   for(int i=0;i< (height *2);i++) {
       int starsCount = (i< (height))? i : height - (i-height) -2;
     for(int j=0;j<=starsCount;j++) {
       matrix[i][j] = '*';
     }
   }

   for(int i =0;i<matrix.length; i++) {
     for(int j=0;j<matrix[i].length;j++) {
         System.out.printf("%c \t",matrix[i][j]);
     }
     System.out.println();
   }*/

  }





}
