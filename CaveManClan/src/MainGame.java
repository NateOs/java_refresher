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
		CaveMan c2 = new CaveMan("Bob", 20, 150f, new ArrayList<Rock>());

		c1.SayHi();
		c2.SayHi();

		c1.setName("John");

		c1.SayHi();
		c2.SayHi();

		System.out.println("c1 is " + c1);
		System.out.println("c2 is " + c2);

		// creating rock objects from class
		Rock r1 = new Rock();
		Rock r2 = new Rock("red", 88.5f);
		Rock r3 = new Rock("green", 85.5f);
		Rock r4 = new Rock("grey", 90.5f);

		// adding rock objects to an arrayList as a collection of rocks
		ArrayList<Rock> rocks = new ArrayList<>();

		rocks.add(r1);
		rocks.add(r2);
		rocks.add(r3);
		rocks.add(r4);

		// assigned rock collection to cavemen
		c2.setRockCollection(rocks);


		ArrayList<Rock> otherRocks = new ArrayList<>();
		otherRocks.add(r3);
		c1.setRockCollection(otherRocks);

		System.out.println("rock collection contains " + c2.getRockCollection().size() + " rocks: " + c2.getRockCollection());
		System.out.println("rock collection contains " + c1.getRockCollection().size() + " rocks: " + c1.getRockCollection());
	}
}