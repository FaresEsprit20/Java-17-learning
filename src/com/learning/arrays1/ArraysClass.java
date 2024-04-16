package com.learning.arrays1;

import java.util.Arrays;


/**
 * @author Fares
 */

public class ArraysClass {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    //to do more here
    int[][] matrix = {
      {1,-10,4},
      {5,7,2},
      {3,5,9}
    };
    int[] array =  {5,7,2};
    int[] array2 =  {9,1,0};
    int[] array3 =  {5,7,2};
//    System.out.println(Arrays.toString(array));
//    Arrays.sort(array);
//    System.out.println(Arrays.toString(array));
//    System.out.println(Arrays.binarySearch(array , 7) - 1);
//    /* Arrays deppToString to display two-dimensional arrays */
//      System.out.println(Arrays.deepToString(matrix));

      /* Compare Two arrays works only with Arrays.equals because arrays are reference type and not a primitive type */
       System.out.println( Arrays.equals(array3,array2));  //false
    System.out.println( Arrays.equals(array,array3));  //true

  }



}
