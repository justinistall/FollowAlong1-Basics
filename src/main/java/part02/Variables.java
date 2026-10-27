package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class Variables {

    // This starts the program.
    public static void main(String[] args) {

        // This stores a whole number.
        int age = 20;

        // This stores a decimal number.
        double price = 19.99;

        // This stores a single letter.
        char grade = 'A';

        // This stores true or false.
        boolean isStudent = true;

        // This stores a name.
        String name = "Justin";

        // This stores another whole number.
        long bigNumber = 123456789L;

        // This stores a decimal number.
        float temperature = 98.6f;

        // This prints the age.
        System.out.println(age);

        // This prints the price.
        System.out.println(price);

        // This prints the grade.
        System.out.println(grade);

        // This prints if the person is a student.
        System.out.println(isStudent);

        // This prints the name.
        System.out.println(name);

        // This prints the big number.
        System.out.println(bigNumber);

        // This prints the temperature.
        System.out.println(temperature);

        // This prints a greeting using the name.
        System.out.println("Hello " + name);
    }
}
