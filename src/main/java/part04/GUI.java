package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.



// This lets us create pop-up windows
import javax.swing.JOptionPane;

public class GUI {

    // This starts the program
    public static void main(String[] args) {

        // Ask the user to enter their name
        String name = JOptionPane.showInputDialog("Enter your name:");

        // Ask the user to enter their age
        String ageInput = JOptionPane.showInputDialog("Enter your age:");

        // Change the age from text to a whole number
        int age = Integer.parseInt(ageInput);

        // Ask the user to enter their height
        String heightInput = JOptionPane.showInputDialog("Enter your height:");

        // Change the height from text to a decimal number
        double height = Double.parseDouble(heightInput);

        // Show a message with the user's name
        JOptionPane.showMessageDialog(null, "Hello " + name + "!");

        // Show a message with the user's age
        JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

        // Show a message with the user's height
        JOptionPane.showMessageDialog(null, "Your height is " + height + " feet.");
    }
}
