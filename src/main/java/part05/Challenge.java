package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.




import java.util.Random;
import java.util.Scanner;

public class Challenge {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Create Random for rolling dice
        Random random = new Random();

        // Ask how many times to roll
        System.out.print("How many dice rolls? ");
        int rolls = scanner.nextInt();

        // Keep track of the total
        int total = 0;

        // Keep track of highest and lowest rolls
        int highest = 0;
        int lowest = 6;

        // Roll the dice the requested number of times
        for (int i = 1; i <= rolls; i++) {

            // Generate a random number from 1 to 6
            int dice = random.nextInt(6) + 1;

            // Print the result of each roll
            System.out.println("Roll " + i + ": " + dice);

            // Add the roll to the total
            total += dice;

            // Check for the highest roll
            highest = Math.max(highest, dice);

            // Check for the lowest roll
            lowest = Math.min(lowest, dice);
        }

        // Check that at least one roll was made
        if (rolls > 0) {

            // Calculate the average
            double average = (double) total / rolls;

            // Print the dice report
            System.out.println("=== Dice Report ===");
            System.out.println("Total: " + total);
            System.out.println("Average: " + average);
            System.out.println("Highest: " + highest);
            System.out.println("Lowest: " + lowest);
        }

        // Close Scanner
        scanner.close();
    }
}

