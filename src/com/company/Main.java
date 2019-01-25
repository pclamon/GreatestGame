package com.company;

public class Main
{
    public static void main(String[] args)
    {
        java.util.Scanner userInput = new java.util.Scanner(System.in);

        java.util.Random random = new java.util.Random();

        System.out.println("Please enter your name: ");
        String userName = userInput.next();

        int cont = 1;
        int win = 0;
        int lose = 0;
        int gamesPlayed = 1;
        int totalGuesses = 0;

        System.out.println("Guess a number from 1 to 100 in under 5 guesses!");

        while (cont == 1)
        {
            int rng = random.nextInt(100) + 1;
            int userNumber = 0;
            int guesses = 0;
            int loseGuesses = 0;
            int averageGuessPerWin = (totalGuesses - loseGuesses) / (gamesPlayed - lose);

            while ((userNumber != rng) && (guesses < 5))
            {
                System.out.println("Enter your guess: ");
                userNumber = userInput.nextInt();
                guesses += 1;
                totalGuesses += 1;

                if (userNumber > rng)
                {
                    System.out.println("Your number is too high.");
                }
                else if (userNumber < rng)
                {
                    System.out.println("Your number is too low.");
                }
            }

            if (userNumber == rng)
            {
                win += 1;
                System.out.println("Congratulations, " + userName + ", you win!");
                System.out.println("You took " + guesses + " guesses this game.");
                System.out.println("Total games: " + gamesPlayed);
                System.out.println("Wins: " + win);
                System.out.println("Losses: " + lose);
                System.out.println("Total guesses: " + totalGuesses);
                System.out.println("Average guesses per win: " + (averageGuessPerWin));
                gamesPlayed += 1;
            }
            else if (guesses >= 5)
            {
                lose += 1;
                loseGuesses = guesses;
                System.out.println("You lose.");
                System.out.println("Total games: " + gamesPlayed);
                System.out.println("Wins: " + win);
                System.out.println("Losses: " + lose);
                System.out.println("Total guesses: " + totalGuesses);
                System.out.println("Average guesses per win: " + (averageGuessPerWin));
                gamesPlayed += 1;

            }
            System.out.println("\nPlay again?\n1. Yes\n2. No");
            cont = userInput.nextInt();
        }

        System.out.println("Thanks for playing!");
    }
}
