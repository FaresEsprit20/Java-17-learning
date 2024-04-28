package com.learning.procedural_and_intro.enums;

import java.util.Scanner;

public class HomeWork {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Enter a Message Type :  ");
        char input = scanner.next().charAt(0);
//        do {
//            System.out.println("\n  Message Type Must be : A or B or C or D ");
//            input = scanner.next().charAt(0);
//        }while (Character.toUpperCase(input) != 'A' && Character.toUpperCase(input) != 'B' && Character.toUpperCase(input) != 'C' && Character.toUpperCase(input) != 'D' );

        while (Character.toUpperCase(input)  != 'A' && Character.toUpperCase(input) != 'B' && Character.toUpperCase(input) != 'C' && Character.toUpperCase(input) != 'D' ) {
            System.out.println("\n  Message Type Must be : A or B or C or D ");
            input = scanner.next().charAt(0);
        }
        Priority priority = null;
        switch (Character.toUpperCase(input)) {
            case 'A':
                priority = Priority.HIGH;
                System.out.println("\n Priority Type : "+priority.name());
                break;
            case 'B':
                priority = Priority.MEDIUM;
                System.out.println("\n Priority Type : "+priority.name());
                System.out.println();
                break;
            case 'C', 'D':
                priority = Priority.LOW;
                System.out.println("\n Priority Type : "+priority.name());
                System.out.println();
                break;
        }

    }



}
