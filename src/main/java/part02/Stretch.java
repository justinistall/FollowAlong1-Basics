package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
public class Stretch {
    public static void main(String[] args) {

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
                + " classes in " + major + " for "
                + credits + " credit hours. Has a job: "
                + hasJob);
    }
}
