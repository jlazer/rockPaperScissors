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

    public static String computerChoice() {

        String computerChoice = "";
        Random randomNum = new Random();
        int num = randomNum.nextInt(3);
        num += 1;
        System.out.println("Random number: " + num);

        if (num == 1) {
            computerChoice = "rock";
        } else if (num == 2) {
            computerChoice = "paper";
        } else if (num == 3) {
            computerChoice = "scissors";
        }

        System.out.println("Computer Choice: " + computerChoice);
        return computerChoice;
    }
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
    public static void determineWinner(String computer, String user) {
        String winner;
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
            if (userChoice == "rock" && computerChoice == "rock") {
                winner = "Rock versus Rock...Tie!";
            } else if (userChoice == "paper" && computerChoice == "paper") {
                winner = "Paper versus Paper...Tie!";
            } else if (userChoice == "scissors" && computerChoice == "scissors") {
                winner = "Scissors versus Scissors...Tie!";
            }
        }

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

            determineWinner(computerInput, userInput);

        }
        //computerChoice();
        //System.out.println("Computer Choice: " + computerChoice);

        //System.out.println("Please enter 'rock' 'paper' or 'scissors'");
        //userInput = input.nextLine();

        //userChoice(userInput);
        //System.out.println("userInput: " + userInput);

        }
    }