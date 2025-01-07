import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int numberToGuess = rand.nextInt(10) + 1;
        int guess;

        System.out.println("Guess a number between 1 and 10:");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! The number was " + numberToGuess);
            }
        } while (guess != numberToGuess);
    }
}
