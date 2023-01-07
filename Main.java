/*
*  The program is about Rock-Paper-Scissors game 
*  with a computer opponent.
*
* @author  Seti Ngabo
* @version 1.0
* @since   2022-9-20
*/

import java.io.Console;

/**
* This program plays rock, paper, scissors.
*/
final class RockPaperScissors {
    /**
     * Set constant rock.
     */
    private static final int ROCK = 1;

    /**
     * Set constant paper.
     */
    private static final int PAPER = 2;

    /**
     * Set constant scissor.
     */
    private static final int SCISSOR = 3;

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Get user input
        final Console console = System.console();
        final String userString = console.readLine(
            "Choose one of the following (rock(1), paper(2), or scissors(3)): ");

        // process
	int userInput = 0;

        try {
	    userInput = Integer.valueOf(userString);
        } catch(Exception e) {
	    System.out.println("\nInvalid input, try again");
      System.out.println("\nDone.");
	    System.exit(0);
	}

        final int lower = 1;
        final int higher = 3;
        final int randomInt = (int) (Math.random() * higher + lower);

        if (userInput == randomInt) {
            System.out.println("You tied!");
        } else if (userInput == ROCK & randomInt == PAPER) {
            System.out.println("You lose!");
        } else if (userInput == ROCK & randomInt == SCISSOR) {
            System.out.println("You won!");
        } else if (userInput == PAPER & randomInt == ROCK) {
            System.out.println("You won!");
        } else if (userInput == PAPER & randomInt == SCISSOR) {
            System.out.println("You lose!");
        } else if (userInput == SCISSOR & randomInt == ROCK) {
            System.out.println("You lose!");
        } else if (userInput == SCISSOR & randomInt == PAPER) {
            System.out.println("You won!");
        } else {
	    System.out.println("Error Occurred Please Try Again.");
	}

	// Output
	if (randomInt == ROCK) {
	    System.out.println("\nThe computer chose rock.");
	} else if (randomInt == PAPER) {
	    System.out.println("\nThe computer chose paper.");
	} else if (randomInt == SCISSOR) {
	    System.out.println("\nThe computer chose scissors.");
	} else {
	    System.out.println("\nError Occurred Please Try Again.");
	}
       System.out.println("\nDone.");
  }
}
