package org.training.util;

import java.util.Scanner;

public class Utils {
    private static final Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        return sc.nextLine();
    }

    public static int readInt(String message) {
        System.out.println(message);
        String choice = sc.nextLine();
        try {
            return Integer.parseInt(choice);
        } catch (NumberFormatException nfe) {
            readInt(message + " : NumberFormatException");
        }
        return 8;
    }

    public static final String getPersonIdMessage() {
        return "Wybierz id osoby: ";
    }
    public static final String getPersonNameMessage() {
        return "Wybierz imię osoby: ";
    }

    public static final String getPersonAgeMessage() {
        return "Wybierz wiek: ";
    }

    public static final String getPersonMailMessage() {
        return "Wybierz mail: ";
    }

    public static final String removingNameMessage() {
        return "Wybierz osobę do usunięcia: ";
    }

    public static final String getOptionMessage() {
        return "Wybierz opcję: ";
    }

    public static final String getDataOptionMessage() {
        return "Wybierz daną do zmiany 1- wiek 2- mail: ";
    }

}
