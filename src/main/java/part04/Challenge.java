package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.


import javax.swing.JOptionPane;

public class Challenge {
    public static void main(String[] args) {

        // Ask for the total bill
        String billInput = JOptionPane.showInputDialog(
                "Enter the total bill amount:");

        if (billInput == null) {
            return;
        }

        // Convert the bill to a number
        double bill = Double.parseDouble(billInput.trim());

        // Ask for the tip percentage
        String tipInput = JOptionPane.showInputDialog(
                "Enter the tip percentage:");

        if (tipInput == null) {
            return;
        }

        // Convert the tip to a number
        double tipPercent = Double.parseDouble(tipInput.trim());

        // Calculate the tip
        double tip = bill * tipPercent / 100;

        // Calculate the total
        double total = bill + tip;

        // Show the results
        JOptionPane.showMessageDialog(null,
                "Bill: $" + String.format("%.2f", bill)
                        + "\nTip: $" + String.format("%.2f", tip)
                        + "\nTotal: $" + String.format("%.2f", total));
    }
}

