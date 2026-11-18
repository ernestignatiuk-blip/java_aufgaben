import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Check if the two Strings below are the same with the "=="-operator.
        //     Print either true or false, depending on if they are the same or not.

        String s1 = "Hello";
        String s2 = "Hello";
        // Compare the strings here with  "=="
        System.out.println(s1 == s2); // true (String Pooling)

        //----
        // Read a user input and save it to another string called s3. The user should type in "Hello" (just like s1/s2).
        // Now compare s3 with s1. Is it still true?
        System.out.println("Type in 'Hello':");
        String s3 = scanner.nextLine();

        // Compare the strings here with  "=="
        System.out.println(s3 == s1); // false (unterschiedliche Speicherorte bei Benutzereingabe)

        //----
        // Now instead of using the == operator, use "equals" and compare the
        // Strings again. What is the result now?

        // Compare the strings here with "equals"
        System.out.println(s3.equals(s1)); // true (vergleicht den Inhalt)


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. No coding needed. Check the program below. What do you have to type in the console when you are prompted
        //     by the scanner below so, that the output will be: "You clearly read the instructions carefully!"

        // (Code-Snippet aus der Aufgabe)
        // Scanner scannerExercise11 = new Scanner(System.in);
        // System.out.println("Enter a string!");
        // String inputExercise11 = scannerExercise11.nextLine();
        //
        // if(inputExercise11.equals("a string!")) {
        //     System.out.println("You clearly read the instructions carefully!");
        // } else {
        //     System.out.println("Missed the chance!");
        // }

        // Antwort: You need to type "a string!"


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Ask a user for a number.
        //      Check if the number is greater than 50 and smaller than 100 by using the &&-operator.
        //      If so, print "Number is between 50 and 100".
        //      If not, print "Number is not between 50 and 100".
        System.out.println("Type in a random number (Exercise 03):");
        int exercise03 = scanner.nextInt();
        if (50 < exercise03 && exercise03 < 100) {
            System.out.println("Number is between 50 and 100");
        } else {
            System.out.println("Number is not between 50 and 100");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Ask a user for a number.
        //      Check, if the number is smaller than 50 or (inclusive or) greater than 100 by using the ||-operator.
        //      If true, print that the number is out of the 50-100 bound.
        //      If false, print, that the number is in the 50-100 bound.
        System.out.println("Type in a random number (Exercise 04):");
        int exercise04 = scanner.nextInt();
        if (exercise04 < 50 || exercise04 > 100) {
            System.out.println("The number is out of the 50-100 bound");
        } else {
            System.out.println("The number is in the 50-100 bound");
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Use the variable to check if the variable is true or not in an if-statement using the "!"-operator.
        //      If the condition is true, print "Movie time!", else "Not watching a movie with lights on...";

        boolean lightsTurnedOff = true;
        if (!lightsTurnedOff) {
            System.out.println("Not watching a movie with lights on...");
        } else {
            System.out.println("Movie time!");
        }

        // After implementing the solution above, use the shortform of if-else to reproduce the same output
        System.out.println(!lightsTurnedOff ? "Not watching a movie with lights on..." : "Movie time!");


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  You're planning a weekend activity... Solve this task with only an XOR, but not an OR or an AND.

        System.out.println("Do you want to go to the beach? (true or false)");
        boolean goToBeach = scanner.nextBoolean();
        System.out.println("Do you want to go to the mountains? (true or false)");
        boolean goToMountains = scanner.nextBoolean();

        if (goToBeach ^ goToMountains) {
            if (goToBeach) {
                System.out.println("Packing sunscreen for the beach!");
            } else {
                System.out.println("Bringing hiking boots for the mountains!");
            }
        } else {
            if (goToBeach && goToMountains) {
                System.out.println("You can't go to both due to time constrains");
            } else {
                System.out.println("Don't be lazy, let's go somewhere!");
            }
        }


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");
        // 07.  School field trip criteria:
        //      - They must be in either the EMV's 1 or 2
        //      - They must have paid the trip fee (true) and must not be sick recently (false)

        System.out.println("Are you in EMV's 1, 2, 3, or 4 (as a number):");
        int emvs = scanner.nextInt();

        System.out.println("Have you paid the trip fee? (true or false):");
        boolean tripPaid = scanner.nextBoolean();

        System.out.println("Were you sick recently? (true or false):");
        boolean isSick = scanner.nextBoolean();

        boolean canComeToTrip = (emvs == 1 || emvs == 2) && tripPaid && !isSick;

        if (canComeToTrip) {
            System.out.println("The student can attend the field trip!");
        } else {
            System.out.println("The student cannot attend the field trip.");
        }

        scanner.close();
    }
}