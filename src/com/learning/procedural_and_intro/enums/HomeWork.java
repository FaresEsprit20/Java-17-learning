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

        Message message = null;
        switch (Character.toUpperCase(input)) {
            case 'A':
                message = Message.valueOf(String.valueOf(Character.toUpperCase(input)));
                System.out.println("\n Priority Type : "+message.getPriority()+ " Message Type : "+message.name());
                break;
            case 'B', 'C', 'D':
                message = Message.valueOf(String.valueOf(Character.toUpperCase(input)));
                System.out.println("\n Priority Type : "+message.getPriority()+ " Message Type : "+message.name());
                System.out.println();
                break;
        }

    }



}
