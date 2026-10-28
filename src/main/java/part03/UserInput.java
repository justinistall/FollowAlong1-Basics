package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.




// This lets us use Scanner to get user input
import java.util.Scanner;

public class UserInput {

    // This starts the program
    public static void main(String[] args) {

        // Create a Scanner to read what the user types
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");

        // Save the name the user types
        String name = scanner.nextLine();

        // Ask the user for their age
        System.out.print("Enter your age: ");

        // Save the age the user types
        int age = scanner.nextInt();

        // Ask the user for their height
        System.out.print("Enter your height in feet: ");

        // Save the height the user types
        double height = scanner.nextDouble();

        // Print the user's information
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " feet.");

        // Close the Scanner
        scanner.close();
    }
}
