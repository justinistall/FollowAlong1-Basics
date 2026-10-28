package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.




// This lets us generate random numbers
import java.util.Random;

public class RandomNumbers {

    // This starts the program
    public static void main(String[] args) {

        // Create a Random object
        Random random = new Random();

        // Generate a random whole number
        int number = random.nextInt(100) + 1;

        // Print the random whole number
        System.out.println("Random number: " + number);

        // Generate a random decimal between 0 and 1
        double decimal = random.nextDouble();

        // Print the random decimal
        System.out.println("Random decimal: " + decimal);

        // Generate a random true or false
        boolean value = random.nextBoolean();

        // Print the random boolean
        System.out.println("Random boolean: " + value);

        // Generate a random dice roll from 1 to 6
        int dice = random.nextInt(6) + 1;

        // Print the dice result
        System.out.println("Dice roll: " + dice);
    }
}

