import java.util.Random;
import java.util.Scanner;

public class MainGame {
	public static void main(String[] args) {
		System.out.println("Hello World, welcome to the caveman clan");

		// start the game with fuessing a number, demo of vars and while loop
Random rand = new Random();
		int theSecretNumber = rand.nextInt(10);
		int yourGuess = 0;

	
			Scanner scanner = new Scanner(System.in);

			while (theSecretNumber != yourGuess) {
				System.out.println("I have a secret number, guess what?");
	
				//get input from the users
				yourGuess = scanner.nextInt();
	
				// check if the guess is correct
				if (yourGuess < theSecretNumber) {
					System.out.println("You guessed too low!");
				}
				if (yourGuess > theSecretNumber) {
					System.out.println("You guessed too high, try a smaller number!");
				}
			}
		
			System.out.println("You guessed correctly!");
	
	}

}
