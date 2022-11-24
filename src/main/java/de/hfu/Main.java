package de.hfu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter text");

        String text = myObj.nextLine();
        System.out.println("text is: " + text.toUpperCase());

    }
}