package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.




// This lets us use Scanner to get user input
import java.util.Scanner;

public class Hypotenuse {

    // This starts the program
    public static void main(String[] args) {

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the first side
        System.out.print("Enter side a: ");

        // Save the first side
        double a = scanner.nextDouble();

        // Ask the user for the second side
        System.out.print("Enter side b: ");

        // Save the second side
        double b = scanner.nextDouble();

        // Calculate the hypotenuse
        double c = Math.sqrt((a * a) + (b * b));

        // Print the answer
        System.out.println("The hypotenuse is: " + c);

        // Close the Scanner
        scanner.close();
    }
}
