package com.learning.strings2;

import java.util.Random;

public class RandomNumbers {

  public static void main(String[] args) {
    System.out.println("Random Numbers generation %n");
    /**
     * Random Numbers solution 1
     * @author Fares Ben Slama
     */
    System.out.printf("%n Random Number :   %d %n ", (int) (Math.random() * 100));

    /**
     * Random Numbers solution 2
     * @author Fares Ben Slama
     */
    //Random for any integer
    Random randomOne = new Random();
    System.out.println((" any random integer"));
    System.out.println(randomOne.nextInt());

    //Random number from 0 to 99
    Random randomTwo = new Random();
    System.out.println((" from 0 to 99  "));
    System.out.println(randomTwo.nextInt(100));

    //Random number from 1 to 100
    Random randomThree = new Random();
    System.out.println((" from 1 to 100  "));
    System.out.println(randomThree.nextInt(100) + 1);


  }



}
