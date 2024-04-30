package com.learning.oop;

/**
 * @author Fares Ben Slama
 */
public class oopMain {

    //Initialization Block

    /*
     * This is only called when an object is created !
     */
    {
        System.out.println(" \n Initialization Block loaded into JVM \n");
    }

    /*
     * This is only called when a Class is loaded !
     */
    static {
        System.out.println(" \n Class Main loaded into JVM \n");
    }

    public static void main(String... args) {

    }



}
