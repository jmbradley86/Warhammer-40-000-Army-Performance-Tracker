package com.techelevator;

import java.time.LocalDate;
import java.time.LocalTime;

public class Application {

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        System.out.println("Hello!");
        System.out.println("Today is " + LocalDate.now());
        System.out.println("The current time is " + LocalTime.now());
        userInterface.startCommand();

    }

}
