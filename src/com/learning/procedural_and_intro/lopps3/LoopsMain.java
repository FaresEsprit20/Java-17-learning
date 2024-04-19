package com.learning.procedural_and_intro.lopps3;

import java.util.Scanner;

public class LoopsMain {

  public static void main(String[] args) {


    System.out.println("======================== Loops ===========================  ");
    //while loop never executes if the condition is wrong
    int counter = 0;
    while (counter < 5) {
      System.out.println("Less then 5");
      counter++;
    }
    //do while, it executes once at least
    do {
      System.out.println("Do while Loop");
    } while (counter > 5);
    //for loop
    for (int i = 0, j = 10; i < j; i++, j--) {
      System.out.println("\n Iteration number " + (i + 1));
      System.out.printf("i  %d  j %d \n ", i, j);
    }
    /*  For Each Loop */
    int[] array = {5, 2, 7};
    int sum = 0;

    //for each loop
    for (int index : array) {
      System.out.println(index);
      sum += index;
    }
    System.out.printf(" \n Sum = %d \n", sum);

    /**
     * Nested Loop
     * @Author Fares Ben Slama
     *
     * We used labels in that case to break the second loop when J = 1 while We continued loop1
     */

  loop1:  for(int i = 0;i < 3;i++) {
      System.out.printf(" \n I =  %d \n",i);
  loop2:    for (int j = 0; j <3;j++){
        System.out.printf("\n  J = %d \n",j);
        if(j == 1){
          break loop2;
        }
      }
    }


  }


}
