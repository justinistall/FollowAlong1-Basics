package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class MathMethods {

    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double z = Math.max(x, y);
        System.out.println(z);

        double max = Math.max(x, y);

        // This finds the smaller number
        double min = Math.min(x, y);

        // This makes the number positive
        double abs = Math.abs(y);

        // This finds the square root
        double sqrt = Math.sqrt(9);

        // This rounds to the nearest whole number
        long round = Math.round(x);

        // This rounds the number up
        double ceil = Math.ceil(x);

        // This rounds the number down
        double floor = Math.floor(x);

        // This prints the answers
        System.out.println(max);
        System.out.println(min);
        System.out.println(abs);
        System.out.println(sqrt);
        System.out.println(round);
        System.out.println(ceil);
        System.out.println(floor);

    }

}