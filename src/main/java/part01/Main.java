package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=470s
//        starts at 7:50 — stop at about 17:30, at "tips and tricks"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 01 — print, println, escape sequences, comments
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. So is yours.
//    Leave the "package part01;" line alone. Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.



public class Main {

    public static void main(String[] args) {

        // Prints a message and moves to the next line
        System.out.println("Hello World!");

        // Prints text without moving to the next line
        System.out.print("My name is ");

        // Finishes the sentence on the same line
        System.out.println("Justin");

        // Prints two messages on separate lines
        System.out.println("I am learning Java.\nJava is fun!");

        // Adds a tab space between the words
        System.out.println("Name:\tJustin");

        // Prints quotation marks inside the message
        System.out.println("He said \"Hello!\"");

        // Prints a backslash
        System.out.println("This is a backslash: \\");

        // Prints a blank line
        System.out.println();

        // Prints a final message
        System.out.println("This is my first Java program!");

    }
}