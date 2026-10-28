package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        starts at about 48:08 — stop at about 52:25, at "get started with expressions"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 04, topic 1 — expressions: + - * / % ++ -- and casting
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Expressions.
//    Leave the "package part04;" line and the "public class Expressions" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


;

public class Expressions {

    // This starts the program
    public static void main(String[] args) {

        // Create two numbers
        int a = 10;
        int b = 3;

        // Add the two numbers
        int sum = a + b;

        // Subtract the two numbers
        int difference = a - b;

        // Multiply the two numbers
        int product = a * b;

        // Divide the two numbers
        int quotient = a / b;

        // Get the remainder after dividing
        int remainder = a % b;

        // Print the math results
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Increase a by one
        a++;

        // Print the new value of a
        System.out.println("After increment: " + a);

        // Decrease b by one
        b--;

        // Print the new value of b
        System.out.println("After decrement: " + b);

        // Create a decimal number
        double x = 9.75;

        // Change the decimal into a whole number
        int y = (int) x;

        // Print the number after casting
        System.out.println("Casting: " + y);

        // Divide using decimals instead of whole numbers
        double result = (double) 10 / 3;

        // Print the decimal result
        System.out.println("Decimal division: " + result);
    }
}
