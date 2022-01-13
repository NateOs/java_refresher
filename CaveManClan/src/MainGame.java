import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class MainGame {
	public static void main(String[] args) {
		System.out.println("Hello World, welcome to the caveman clan");
		/*
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
			
		
		//  let's do some loops
		
		for (int i = 0; i < 9; i++) {
			System.out.println("The number is " + i);
		}
		
		System.out.println("===========================================");
		
		for (int i = 0; i < 29; i = i + 3) {
			System.out.println("The number is " + i);
		}
		
		// let's do some arrays
		
		int[] luckyNumbers = { 21, 22, 23, 24, 25, 26, 27, 28, 29 };
		
		System.out.println("===========================================");
		
		for (int i = 0; i < luckyNumbers.length; i++) {
			System.out.println("The number at position " + i + " is " + luckyNumbers[i]);
		}
		
		// this is the equivalent of a forEach loop in java
		for (int number : luckyNumbers) {
			System.out.println("The number is a lucky number " + number);
		}
		
		// array lists, are flexible, resizable arrays, use different methods
		
		ArrayList<Integer> unluckyNumbers = new ArrayList<>();
		
		unluckyNumbers.add(7);
		unluckyNumbers.add(27);
		unluckyNumbers.add(37);
		unluckyNumbers.add(47);
		unluckyNumbers.add(57);
		
		
		for (int i = 0; i < unluckyNumbers.size(); i++) {
			System.out.println("The number at position " + i + " is " + unluckyNumbers.get(i));
		}
		
		// this is the equivalent of a forEach loop in java
		for (int number : unluckyNumbers) {
			System.out.println("The number is an unlucky number " + number);
		}
		*/

		//let's do some objects

		CaveMan c1 = new CaveMan();
		CaveMan c2 = new CaveMan("Bob", 20, 150f);

		c1.SayHi();
		c2.SayHi();

		c1.setName("John");

		c1.SayHi();
		c2.SayHi();
	}
}
