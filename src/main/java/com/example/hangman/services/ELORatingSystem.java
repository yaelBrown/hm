package com.example.hangman.services;

public class ELORatingSystem {
    private static final int INITIAL_RATING = 1000;
    private static final int K_FACTOR = 32;

    public static void updateRatings(int player1Rating, int player2Rating, boolean player1Wins) {
        double expectedOutcomePlayer1 = 1 / (1 + Math.pow(10, (player2Rating - player1Rating) / 400.0));
        double expectedOutcomePlayer2 = 1 / (1 + Math.pow(10, (player1Rating - player2Rating) / 400.0));

        int player1NewRating = player1Rating + (int) (K_FACTOR * (player1Wins ? 1 - expectedOutcomePlayer1 : 0 - expectedOutcomePlayer1));
        int player2NewRating = player2Rating + (int) (K_FACTOR * (player1Wins ? 0 - expectedOutcomePlayer2 : 1 - expectedOutcomePlayer2));

        player1Rating = player1NewRating;
        player2Rating = player2NewRating;
        // Update Rating by using setter.
        System.out.println(player1Rating);
    }

    public static void main(String[] args) {
        // Example Usage
        int player1Rating = 1000;
        int player2Rating = INITIAL_RATING;

        // Player 1 wins
        updateRatings(player1Rating, player2Rating, true);
        System.out.println("Player 1 new rating: " + player1Rating);
        System.out.println("Player 2 new rating: " + player2Rating);
    }
}


/*
// ChatGPT revision
public class EloRatingSystem {

    private static final int INITIAL_RATING = 1000;
    private static final int K_FACTOR = 32;

    public static void main(String[] args) {
        int player1Rating = INITIAL_RATING;
        int player2Rating = INITIAL_RATING;

        // Player 1 wins
        int[] newRatings = updateRatings(player1Rating, player2Rating, true);
        player1Rating = newRatings[0];
        player2Rating = newRatings[1];

        System.out.println("Player 1 new rating: " + player1Rating);
        System.out.println("Player 2 new rating: " + player2Rating);
    }

    public static int[] updateRatings(int player1Rating, int player2Rating, boolean player1Wins) {
        double expectedOutcomePlayer1 = 1 / (1 + Math.pow(10, (player2Rating - player1Rating) / 400.0));
        double expectedOutcomePlayer2 = 1 / (1 + Math.pow(10, (player1Rating - player2Rating) / 400.0));

        int player1NewRating = player1Rating + (int) (K_FACTOR * (player1Wins ? 1 - expectedOutcomePlayer1 : 0 - expectedOutcomePlayer1));
        int player2NewRating = player2Rating + (int) (K_FACTOR * (player1Wins ? 0 - expectedOutcomePlayer2 : 1 - expectedOutcomePlayer2));

        return new int[]{player1NewRating, player2NewRating};
    }
}
 */