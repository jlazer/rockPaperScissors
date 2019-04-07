/*
Justin Lazarski
Jonathan La Rosa
Team Project 1: Question 3 Rock Paper Scissors
CIS 3090.04
4/5/19
 */
package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    // Random Computer Choice
    public static String computerChoice() {

        String[] computerChoiceArray = new String[]{"rock", "paper", "scissors"};
        Random randomNum = new Random();
        int num = randomNum.nextInt(3);

        System.out.println("Random number: " + num);

        System.out.println("Computer Choice: " + computerChoiceArray[num]);
        return computerChoiceArray[num];
    }

    // Takes in user Choice
    public static String userChoice(String choice) {
        String userChoice = choice;
        Scanner input = new Scanner(System.in);
        userChoice = userChoice.toLowerCase();
        System.out.println("User Choice: " + userChoice);

        while(!isValidChoice(userChoice)) {
            System.out.print("Invalid input, enter rock, paper, or scissors: ");
            userChoice = input.nextLine();
            userChoice = userChoice.toLowerCase();
            System.out.println("User Choice: " + userChoice);
        }
        return userChoice;
    }
    public static boolean isValidChoice(String choice) {

        return (choice.equalsIgnoreCase("rock")) || (choice.equalsIgnoreCase("paper")) || (choice.equalsIgnoreCase("scissors"));

    }
    public static String determineWinner(String computer, String user) {
        String winner;
        System.out.println("hello from determinewinner method");
        String userChoice = user;
        String computerChoice = computer;

        if (userChoice == "rock" && computerChoice == "scissors") {
            winner = "Rock versus Scissors..You win!";
        } else if (userChoice == "scissors" && computerChoice == "rock") {
            winner = "Scissors versus Rock..You Lose!";
        } else if (userChoice == "rock" && computerChoice == "paper") {
            winner = "Rock versus Paper..You Lose!";
        } else if (userChoice == "paper" && computerChoice == "rock") {
            winner = "Paper versus Rock..You Win!";
        } else if (userChoice == "paper" && computerChoice == "scissors") {
            winner = "Paper versus Scissors..You lose!";
        } else if (userChoice == "scissors" && computerChoice == "paper") {
            winner = "Scissors versus Paper..You Win!";
        } else {
            winner = userChoice + " versus " + computerChoice + "... Ties!"; 
        }

        return winner;
        
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput;
        String computerInput = "";
        while(true) {

            System.out.println("Please enter 'rock' 'paper' or 'scissors'");
            //userInput = input.nextLine();
            userInput = userChoice(input.nextLine());
            computerInput = computerChoice();

            System.out.println("Computer Choice: " + computerInput);

            System.out.println(determineWinner(computerInput, userInput));
        }
        //computerChoice();
        //System.out.println("Computer Choice: " + computerChoice);

        //System.out.println("Please enter 'rock' 'paper' or 'scissors'");
        //userInput = input.nextLine();

        //userChoice(userInput);
        //System.out.println("userInput: " + userInput);

        }
    }