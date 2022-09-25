package org.training.util;

import java.util.Scanner;

public class Program {

    public static int printMenu() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Witaj w Bazie");
        System.out.println("Wyświetl bazę - 1 ");
        System.out.println("Modyfikuj osobę - 2 ");
        System.out.println("dodaj osobę - 3 ");
        System.out.println("usuń osobę - 4 ");
        System.out.println("wyświetl osobę - 5");
        System.out.println("EXIT - 0");

        return 0;
    }

    static int readOptions() {
        Program.printMenu();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String choice = sc.nextLine();
        try {
            return Integer.parseInt(choice);
        } catch (NumberFormatException nfe) {
            return 8;
        }
    }

}
