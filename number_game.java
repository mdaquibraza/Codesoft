import java.util.Random;
import java.util.Scanner;

public class number_game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessed = false;
            System.out.println("Round " + (rounds + 1) + ": Guess a number between 1 and 100");

            while (!guessed && attempts < 6) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score++;
                    guessed = true;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessed) {
                System.out.println("Game over! The number was " + numberToGuess);
            }

            System.out.println("Score: " + score + " rounds won");
            System.out.print("Play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            playAgain = response.equals("yes");
            rounds++;
        }

        scanner.close();
    }
}
