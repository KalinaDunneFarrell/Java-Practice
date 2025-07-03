/**
 * @author Kalina Dunne Farrell
 */

// Imports
import java.util.Scanner;

public class Driver {

    /**
     * Main method
     * 
     * @param args - Command line arguments (not used)
     */
    public static void main(String[] args) {
        // TODO: generate random number
        int number = 0;
        /** Number of guesses user has made */
        int counter = 0;
        /** Range number is in (for hints) */
        int numRange = getNumRange(number);
        /** Number of hints user has made */
        int hintCount = 0;
        /** Scanner to get user input */
        Scanner keyboard = new Scanner(System.in);
        /** User input */
        String input;

        // TODO: Loop to get user input until number = guess
        do {
            System.out.print("Enter your guess or \"h\" for hint");
            input = keyboard.next();

            // TODO: Check if H to get hint
            if (input.equalsIgnoreCase("h")) {
                giveHint(number, hintCount, numRange);
                hintCount++;
            }
            // TODO: not hint - call checkInt and loop until true
            // TODO: check guess - loop
            
        } while (true);
        // TODO: after number = guess, output counter
    }

    // TODO: Method to check integer input
    /**
     * Checks if the passed parameter (user input) is an integer
     * 
     * @param input    - user input
     * @return isValid - did the user enter an integer?
     */
    public boolean checkInt(String input) {
        /** Boolean - was input an integer (true) or not (false) */
        boolean isValid;

        // TODO: try convert to int - set isValid to true
        try {
            Integer.parseInt(input);
            isValid = true;
        } catch (Exception e) {
            // TODO: change exception type
            System.out.println(input + " is not a number.");
            isValid = false;
        }

        return isValid;
    }

    /**
     * Gives the user a hint
     * 
     * @param number - number to guess
     */
    public static void giveHint(int number, int hintCount, int numRange) {
        // TODO: print hint depending on number range
        
    }

    /**
     * Sets the number range for hints
     * 
     * @param number - the number to guess
     */
    public static int getNumRange(int number) {

        return 0;
    }
}