package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3546s
//        rewatch 59:06–61:29 for the Math methods, 64:54–68:28 for Random
// Guide: GUIDE.md in this folder, steps 2–6 and 12–16
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.




// This lets us generate random numbers
import java.util.Random;

public class Stretch {

    // This starts the program
    public static void main(String[] args) {

        // STRETCH A - MATH METHODS

        // Create two numbers
        double a = 9.7;
        double b = 4.2;

        // Find the bigger number
        System.out.println("Maximum: " + Math.max(a, b));

        // Find the smaller number
        System.out.println("Minimum: " + Math.min(a, b));

        // Find the square root of 25
        System.out.println("Square root: " + Math.sqrt(25));

        // Find 2 raised to the power of 3
        System.out.println("Power: " + Math.pow(2, 3));

        // Round a number up
        System.out.println("Ceiling: " + Math.ceil(a));

        // Round a number down
        System.out.println("Floor: " + Math.floor(a));

        // Round to the nearest whole number
        System.out.println("Round: " + Math.round(a));

        // Find the absolute value
        System.out.println("Absolute: " + Math.abs(-10));

        // STRETCH B - RANDOM NUMBERS

        // Create a Random object
        Random random = new Random();

        // Generate a random number from 1 to 10
        int number = random.nextInt(10) + 1;

        // Print the random number
        System.out.println("Random number: " + number);

        // Generate a random decimal
        double decimal = random.nextDouble();

        // Print the random decimal
        System.out.println("Random decimal: " + decimal);

        // Generate a random true or false
        boolean answer = random.nextBoolean();

        // Print the random boolean
        System.out.println("Random boolean: " + answer);

        // Generate a random dice roll
        int dice = random.nextInt(6) + 1;

        // Print the dice roll
        System.out.println("Dice roll: " + dice);
    }
}
