package deckofcard;

import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Scanner;


public class Main {

    private static int getIntegerInput(String prompt, Scanner scanner) {

        System.out.print(prompt);

        int validInteger = -1;

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {

                validInteger = scanner.nextInt();

                break;

            } else {

                System.out.println("Error: Invalid input, try again...");

                System.out.print(prompt);

                scanner.next();

            }

        }

        return validInteger;

    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numPlayers = getIntegerInput("Number of players: ", scanner);

        if (numPlayers <= 0) {

            throw new IllegalArgumentException("Number of players must be positive.");

        }

        int numCards = getIntegerInput("Number of cards: ", scanner);

        if (numCards <= 0) {

            throw new IllegalArgumentException("Number of cards must be positive.");

        }

        Map<Integer, List<Integer>> playerToCards = new HashMap<>();

        int i = 0;

        while (i < numCards) {

            playerToCards.computeIfAbsent(i % numPlayers + 1, k -> new ArrayList<>())

                    .add(i + 1);

            i++;

        }

        System.out.printf("playerToCards = %s%n", playerToCards);

        playerToCards.forEach((player, cards) ->

                System.out.printf("Player %s - %d cards%n", player, cards.size()));

    }

}