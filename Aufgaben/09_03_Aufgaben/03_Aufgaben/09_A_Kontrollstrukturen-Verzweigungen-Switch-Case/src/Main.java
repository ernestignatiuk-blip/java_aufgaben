import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.
        System.out.println("please enter a number between 1 and 7");
        int weekday = scanner.nextInt();
        switch (weekday) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday!");
                break;
        }
        System.out.println("New version");
        switch (weekday){
            case 1 -> System.out.println("It isMonday");
            case 2 -> System.out.println("It is tuesday");
            case 3 -> System.out.println("It is wednesday");
            case 4 -> System.out.println("It is thursday");
            case 5 -> System.out.println("It is friday");
            case 6 -> System.out.println("It is saturday");
            case 7 -> System.out.println("It is sunday");
            default -> System.out.println("Not a weekday");

        }

        scanner.nextLine();

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.
        System.out.println("Give me an month");
        String month = scanner.nextLine();
        String season = switch (month) {
            case "January" -> "Winter";
            case "February" -> "Winter";
            case "March" -> "Spring";
            case "April" -> "Spring";
            case "Mai" -> "Spring";
            case "June" -> "Summer";
            case "July" -> "Summer";
            case "August" -> "Summer";
            case "September" -> "Autumn";
            case "Oktober" -> "Autumn";
            case "November" -> "Autumn";
            case "December" -> "Winter";
            default -> "Not a month!";
        };
        System.out.println(season);
        String result;
        System.out.println("Enter a month");
        String month1 = scanner.nextLine();

        switch (month1) {
            case "January":
            case "February":
            case "December":
                result = "Winter";
                break;
            case "March":
            case "April":
            case "Mai":
                result = "Spring";
                break;
            case "June":
            case "July":
            case "August":
                result = "Summer";
                break;
            case "September":
            case "Oktober":
            case "November":
                result = "Autumn";
                break;
            default:
                result = "Not a month!";
                break;
        }
        System.out.println(result);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.

        System.out.println("Give me a month number between (1-12)");
        byte monthNumber1 = scanner.nextByte();

        String resultNew = switch (monthNumber1) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            case 2 -> "28";
            default -> "Not a month";
        };

        System.out.println(resultNew);

        System.out.println("Give me a month number between (1-12)");
        byte monthNumber2 = scanner.nextByte();

        String resultOld;
        switch (monthNumber2) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                resultOld = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                resultOld = "30";
                break;
            case 2:
                resultOld = "28";
                break;
            default:
                resultOld = "Not a month";
                break;
        }

        System.out.println(resultOld);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

        System.out.println("Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): ");
        byte choice = scanner.nextByte();

        String result04 = switch (choice) {
            case 1 -> "Warrior (Strength: 10, Agility: 5, Intelligence: 2)";
            case 2 -> "Mage (Strength: 3, Agility: 4, Intelligence: 9)";
            case 3 -> "Rogue (Strength: 4, Agility: 10, Intelligence: 4)";
            case 4 -> "Cleric (Strength: 6, Agility: 3, Intelligence: 8)";
            default -> "Invalid class choice";
        };

        System.out.println(result04);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        System.out.println("Which digit do you want to translate? ");
        int digit = scanner.nextInt();

        System.out.println("In which language do you want to translate your digit? ");
        int language = scanner.nextInt();

        String result05 = switch (language) {
            case 1 -> switch (digit) {
                case 0 -> "Null";
                case 1 -> "Eins";
                case 2 -> "Zwei";
                case 3 -> "Drei";
                case 4 -> "Vier";
                case 5 -> "Fünf";
                case 6 -> "Sechs";
                case 7 -> "Sieben";
                case 8 -> "Acht";
                case 9 -> "Neun";
                default -> "Ungültige Ziffer";
            };
            case 2 -> switch (digit) {
                case 0 -> "zero";
                case 1 -> "one";
                case 2 -> "two";
                case 3 -> "three";
                case 4 -> "four";
                case 5 -> "five";
                case 6 -> "six";
                case 7 -> "seven";
                case 8 -> "eight";
                case 9 -> "nine";
                default -> "Invalid digit";
            };
            case 3 -> switch (digit) {
                case 0 -> "zero";
                case 1 -> "ichi";
                case 2 -> "ni";
                case 3 -> "san";
                case 4 -> "shi";
                case 5 -> "go";
                case 6 -> "roku";
                case 7 -> "nana";
                case 8 -> "hachi";
                case 9 -> "";
                default -> "Mukō na sūchi";
            };
            default -> "Invalid language";
        };

        System.out.println(result05);
        scanner.nextLine();

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06. Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //     Calculate the correct answer and print it out.
        //     Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!)

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter operation (addition, subtraction, division, multiplication):");
        String operation = scanner.nextLine();

        String calcResult = switch (operation) {
            case "addition" -> String.valueOf(num1 + num2);
            case "subtraction" -> String.valueOf(num1 - num2);
            case "multiplication" -> String.valueOf(num1 * num2);
            case "division" -> {
                if (num2 == 0) {
                    yield "number two must not be 0!";
                } else {
                    yield String.valueOf(num1 / num2);
                }
            }
            default -> "Invalid operation!";
        };

        System.out.println("Result: " + calcResult);

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01. Try to come up with a program on your own and the tools you know so far.

        scanner.close();
    }
}