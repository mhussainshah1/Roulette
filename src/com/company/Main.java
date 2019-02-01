package com.company;

import java.util.Scanner;

/**
 * You will write a Java program to simulate Roulette, a casino game.
 * <p>
 * Players will be able to enter in the amount of money they want to bet and the type of bet they will be placing.
 * <p>
 * The types of bets include:
 * Red: You are betting that the next roll will come up red.
 * Black: You are betting that the next roll will come up black.
 * Even: This is wagering that the ball will land on an even number between 1-36.
 * Odd: This is wagering that the ball will land on an odd number between 1-36.
 * Low: This is a bet that the next number will be between 1 and 18.
 * High: This is a bet that the next number will be between 19 and 36.
 * <p>
 * The program will then randomly generate a number between 1-36 and a color (red or black). You will then double the
 * player's amount if they won, or deduct their money if they lost.
 * <p>
 * Allow the user to play as many games as they want until they want to quit.
 * <p>
 * At the end of the program, print out the net amount of money they've earned, whether that's positive or negative.
 * In addition, also print out the number of games they have won and lost.
 */
public class Main {
    static int totalAmount, won, lost;

    public static void main(String[] args) {
        System.out.println("WELCOME! Let's play some Roulette!");

        Scanner keyboard = new Scanner(System.in);
        boolean choice = true;

        String betInput, color;
        int betAmountInput, betNumber, betColor;
        do {
            System.out.print("\nEnter the type of bet you would like to place (red|black|even|odd|high|low): ");
            betInput = keyboard.next().toLowerCase();
            System.out.print("Enter in your bet amount: ");
            betAmountInput = keyboard.nextInt();

            // generate a number between 1 - 36
            betNumber = 1 + (int) (Math.random() * 36);

            //generate two colors
            color = "";
            betColor = 1 + (int) (Math.random() * 2);
            switch (betColor) {
                case 1:
                    color = "red";
                    break;
                case 2:
                    color = "black";
                    break;
            }
            System.out.println(" The ball landed on " + betNumber + " " + color + ".");

            switch (betInput) {
                case "red": // Red: You are betting that the next roll will come up red.
                case "black": //Black: You are betting that the next roll will come up black.
                    if (betInput.equals(color)) {
                        win(betNumber);
                    } else {
                        loose(betAmountInput);
                    }
                    break;
                case "even"://Even: This is wagering that the ball will land on an even number between 1-36.
                    if (betNumber % 2 == 0) {
                        win(betNumber);
                    } else {
                        loose(betAmountInput);
                    }
                    break;
                case "odd"://Odd: This is wagering that the ball will land on an odd number between 1-36.
                    if (betNumber % 2 != 0) {
                        win(betNumber);
                    } else {
                        loose(betAmountInput);
                    }
                    break;
                case "low"://Low: This is a bet that the next number will be between 1 and 18.
                    if (betNumber <= 18) {
                        win(betNumber);
                    } else {
                        loose(betAmountInput);
                    }
                    break;
                case "high"://High: This is a bet that the next number will be between 19 and 36.
                    if (betNumber > 18) {
                        win(betNumber);
                    } else {
                        loose(betAmountInput);
                    }
                    break;
            }

            System.out.println("\nYou currently have: $" + totalAmount);
            System.out.print("\nWould you like to play again (true|false)? ");
            choice = keyboard.nextBoolean();
        }
        while (choice);

        System.out.println("Thank you for playing!");
        System.out.println("\t This is how much money you have remaining: $" + totalAmount);
        System.out.println("You've won " + won + " game(s) and lost " + lost + " game(s).");
    }

    public static void win(int betNumber) {
        totalAmount += (betNumber * 2);
        won++;
        System.out.println("\tCongratulations, you've won.");
    }

    public static void loose(int betAmountInput) {
        totalAmount -= betAmountInput;
        lost++;
        System.out.println("\tSorry, you've lost this bet.");
    }
}