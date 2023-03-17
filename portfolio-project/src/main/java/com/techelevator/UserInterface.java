package com.techelevator;

import java.util.Scanner;

public class UserInterface {
    Scanner userInput = new Scanner(System.in);

    public String startCommand() {
        System.out.println("++AUTHENTICATION SUCCESSFUL. WELCOME, CHAPTER MASTER++");
        System.out.println("Record battle results?  Y/N >>>");
        return userInput.nextLine();

    }
}
//
//boolean validEntry;
//while !validEntry {
//    inputMethod();
//        }
//    else
//        good code block