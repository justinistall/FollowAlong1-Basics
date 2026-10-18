package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        rewatch 35:40–38:50 for swapping, 39:25–47:00 for Scanner
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// You will also need the Scanner import line, above the class.



import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {

        // Stretch A - Swapping variables
        int a = 10;
        int b = 20;

        // Print the values before swapping
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Swap the values
        int temp = a;
        a = b;
        b = temp;

        // Print the values after swapping
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Stretch B - Scanner
        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Ask the user for their favorite color
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine();

        // Print the information
        System.out.println("Your name is " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your favorite color is " + color);

        scanner.close();
    }
}