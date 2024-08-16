import java.util.Scanner;
import java.util.Random;

public class randomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;

        do {
            int numberToGuess = random.nextInt(100) + 1;  
            int numberOfAttempts = 5;
            int userScore = 0;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have " + numberOfAttempts + " attempts to guess the number between 1 and 100.");

            boolean hasGuessedCorrectly = false;

            for (int i = 1; i <= numberOfAttempts; i++) 
	    {
                System.out.print("Attempt " + i + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) 
		{
                    System.out.println("Congratulations! You guessed the correct number.");
                    userScore += (numberOfAttempts - i + 1) * 10;
                    hasGuessedCorrectly = true;
                    break;
                } 
		else if (userGuess > numberToGuess) 
                    System.out.println("Your guess is too high.");
		else
                    System.out.println("Your guess is too low.");
            }

            if (!hasGuessedCorrectly) 
                System.out.println("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");

            System.out.println("Your score for this round is: " + userScore);

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
