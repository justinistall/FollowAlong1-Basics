package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.



import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Ask for a place
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();

        // Ask for an animal
        System.out.print("Enter an animal: ");
        String animal = scanner.nextLine();

        // Ask for an adjective
        System.out.print("Enter an adjective: ");
        String adjective = scanner.nextLine();

        // Ask for a number
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        // Ask for a food
        System.out.print("Enter your favorite food: ");
        String food = scanner.nextLine();

        // Print the Mad Libs story
        System.out.println();
        System.out.println("===== MY MAD LIBS STORY =====");

        System.out.println("One day, " + name + " went to " + place + ".");
        System.out.println("While walking, a " + adjective + " "
                + animal + " appeared.");
        System.out.println(name + " was only " + age
                + " years old and got scared.");
        System.out.println("The animal wanted some " + food + ".");
        System.out.println("After eating, the animal became friendly.");
        System.out.println(name + " had the best day ever!");

        scanner.close();
    }
}