package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class Swap {

    // This starts the program
    public static void main(String[] args) {

        // Create the first variable
        int a = 10;

        // Create the second variable
        int b = 20;

        // Print the values before swapping
        System.out.println("Before swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Save the value of a temporarily
        int temp = a;

        // Put the value of b into a
        a = b;

        // Put the original value of a into b
        b = temp;

        // Print the values after swapping
        System.out.println("After swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
