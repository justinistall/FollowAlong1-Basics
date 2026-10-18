package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2915s
//        rewatch 48:35–52:25 for + - * / % ++ -- and casting
// Guide: GUIDE.md in this folder, steps 1–6
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.



public class Stretch {
    public static void main(String[] args) {

        // Stretch A
        int a = 20;
        int b = 6;

        // Addition
        System.out.println(a + b);

        // Subtraction
        System.out.println(a - b);

        // Multiplication
        System.out.println(a * b);

        // Division
        System.out.println(a / b);

        // Remainder
        System.out.println(a % b);

        // Stretch B
        int number = 10;

        // Increase by 1
        number++;
        System.out.println(number);

        // Decrease by 1
        number--;
        System.out.println(number);

        // Casting to a double
        double result = (double) a / b;
        System.out.println(result);
    }
}