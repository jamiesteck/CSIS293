/* 	
	Jamie Steck
	Jan 27, 2017 - Week 1
	GuessNumber 
	Randomly choose a number that the user has to guess until correct
*/

import java.util.Scanner; //use the Java class Scanner to get input from the command line
import java.security.SecureRandom; //use the SecureRandom class for random number generator


public class GuessNumber
{
	public static void main(String[] args)
	{
		//create the scanner
		Scanner input = new Scanner(System.in); 
		//create the random number generator
		SecureRandom randomNumbers = new SecureRandom(); 

		//declare the variables
		
		int theNumber = randomNumbers.nextInt(100) + 1; //pick random integer from 1 to 100
		int numberGuesses = 0; //how many guess until correct
		boolean correctGuess = false; //has the number been guessed yet
		int guess; //the guess by user

		System.out.printf("%nWelcome to Professor Steck's Number Guessing Game.%n");
		System.out.println("I am thinking of a number between 1 and 100...");

		//cause a short delay while "thinking", 1000 is one second
		try 
		{
    		Thread.sleep(2000);
		} 
		catch(InterruptedException ex) 
		{
    		Thread.currentThread().interrupt();
		}


		//ask for a guess until it is correct
		while(correctGuess == false)
		{
			//ask for guess
			System.out.printf("%nEnter your guess: ");
			guess = input.nextInt();
			System.out.printf("%n");
			numberGuesses++;
			if(guess == theNumber)
			{
					System.out.print("Yes! You are correct! ");
					System.out.printf("It took you %d guesses. %n%n", numberGuesses);
					correctGuess = true;
			}
			else 
			{
				if(guess > theNumber)
				{
					System.out.print("Sorry, you are not correct.");
					System.out.printf("Your guess was too high. %n");
				}
				else
				{
					System.out.print("Sorry, you are not correct.");
					System.out.printf("Your guess was too low. %n");
				}
			}
		}
	}
}