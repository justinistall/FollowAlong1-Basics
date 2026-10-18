package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args) {

        /* MY GUESS:
           7
           7
           14
           a: 7
           14
           14!
           A
           true
        */

        /* WHAT I GOT WRONG:
           A double prints 7.0, not 7.
           "a + b" prints the text instead of adding.
           "" + a + a makes 77 because it joins text.
        */

        // Stretch A
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);

        // Stretch B1
        char letter = 'J';
        int age = 19;
        double height = 6.5;
        boolean student = true;

        System.out.println(letter);
        System.out.println(age);
        System.out.println(height);
        System.out.println(student);

        // Stretch B2
        char initial = 'J';
        int classes = 4;
        double credits = 15.5;
        boolean hasJob = true;
        String major = "Information Technology";

        System.out.println(initial + " takes " + classes
                + " classes in " + major + ", for "
                + credits + " credit hours. Has a job: "
                + hasJob);
    }
}

