package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.


public class InClass {
    public static void main(String[] args) {

        // STEP 1 — Create the rover's variables.

        // This stores the rover's name.
        String roverName = "Mars Rover";

        // This stores the rover's battery level.
        int battery = 95;

        // This stores the rover's fuel level.
        double fuel = 87.5;

        // This stores the rover's grade.
        char grade = 'C';

        // This checks if the rover is working.
        boolean isWorking = true;

        // Print the rover's information.
        System.out.println("Rover: " + roverName);
        System.out.println("Battery: " + battery);
        System.out.println("Fuel: " + fuel);
        System.out.println("Grade: " + grade);
        System.out.println("Working: " + isWorking);

        // STEP 2 — Fix the bugs.

        // Use double because 87.5 has a decimal.
        double fuelLevel = 87.5;

        // Use single quotes for a char.
        char roverGrade = 'C';

        // Use lowercase battery to match the variable.
        System.out.println(battery);
    }
}