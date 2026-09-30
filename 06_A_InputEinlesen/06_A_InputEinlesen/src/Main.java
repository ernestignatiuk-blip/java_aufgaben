import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // 1. Create a Scanner object named "userInput".
        //    Ask the user to type in the following information:
	//
        //
        //    - The first name,
        //    - last name,
        //    - age,
        //    - birthday (day)
        //    - birthday (month)
        //    - birthday (year)
        //    - whether the user is a student
        //     -and at least three (or more) questions you want to add.
        System.out.println("Give me please some of your Information :)");

        Scanner userInput = new Scanner(System.in);
        /*System.out.println("Enter your first name:\n");
        String inputOld = userInput.nextLine();
        System.out.println("Your first name is " + inputOld);


        String inputNew = IO.readln("Enter your last name:");
        IO.println("Your last name is " + inputNew);

        System.out.println("Enter your age:");
        String age = userInput.nextLine();
        IO.println("Your age is " + age);

        System.out.println("Enter your birthday (day):");
        byte birthDay = userInput.nextByte();

        System.out.println("Enter your birthday (month):");
        byte birthMonth = userInput.nextByte();

        System.out.println("Enter your birthday (year):");
        byte birthYear = userInput.nextByte();
        System.out.println("You came into this world on " + birthDay + "." + birthMonth + "." + birthYear);

        System.out.println("Are you a student?:");
        System.out.println("if yes type true, if no type false");
        boolean student = userInput.nextBoolean();
        System.out.println("That is " + student + " that you are a student.");

        System.out.println("What is your favourite color?");
        userInput.nextLine();
        String favouriteColor = userInput.nextLine();
        System.out.println("Your favourite color is " + favouriteColor + ".");

        System.out.println("Where are you from?:");
        String place = userInput.nextLine();
        System.out.println("So you are from " + place );
        //    To make it easier for the user, only ask him one question at a time
        //    In the end, greet the user with his age and let him know about
        //    all the data you have gathered from the user.
        //
        //
        //    It's up to you how you design this little program, but use all
        //    of your knowledge so far. Pay attention to the datatypes.
        //
        //    Challenge:
        //    Also calculate approximately how many days he has lived so far!
        //    To make it easier, lets assume a year has always 365 days and
        //    every month has 30 days. For the month, you can take september (09)
        //    Hint for a possible approximate formula at the bottom of the code.
        //
        //    Possible output:
        //    Thank you for your input, Hansi Meier!
        //    You are 28 years old
        //    You were born in 27.4.1994
        //    Are you a student? true
        //    Your favorite food is: Gnocchi
        //    And so far you have lived approximately ~10370 days!



        //--------------------------------------------------------------------------------------------------------------
        // 2. Ask the user to input two numbers.
        //    Print the result of an addition, subtraction, division and multiplic
        System.out.println("Enter two random numbers");
        int firstNumber = userInput.nextInt();
        int secondNumber = userInput.nextInt();
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        float division = (float) firstNumber / secondNumber;
        int multiplication = firstNumber * secondNumber;
        IO.println("The addition of your numbers equals to: " + addition);
        IO.println("The subtraction of your numbers equals to: " + subtraction);
        IO.println("The division of your numbers equals to: " + division);
        IO.println("The multiplication of your numbers equals to: " + multiplication);


        //--------------------------------------------------------------------------------------------------------------
        // 3. Ask the user to input his weight and height.
        //    Calculate the body mass index (BMI) and print it to the user
        //    BMI = weight(kg) / height(m)^2
        System.out.println("Type in your weight in (kg)");
        float weight = userInput.nextFloat();
        System.out.println("Type in your height in (m)");
        float height = userInput.nextFloat();
        float bmi = weight / (height * height);
        IO.println("Your BMI is: " + bmi);


        //--------------------------------------------------------------------------------------------------------------
        // 4. Ask the user to input a number of minutes.
        //    Convert the minutes to hours and minutes and print it
        //    To test: 126minutes -> 2h and 6min
        System.out.println("Type in a number of minutes");
        int minutes = userInput.nextInt();
        int hours = minutes / 60;       // Ganzzahlige Division (126 / 60 = 2)
        int minutes1 = minutes % 60;     // Modulo gibt den Rest (126 % 60 = 6)

        System.out.println(hours + "h and " + minutes1 + "min");



        //--------------------------------------------------------------------------------------------------------------
        // 5. Ask the user to input a radius.
        //    Calculate and display its circumference (2 * π * r) and area (π * r^2).
        IO.println("Type in any radius");
        float radius = userInput.nextFloat();
        float circumference = (float) (2 * Math.PI * radius);
        float area = (float) (Math.PI * (radius * radius));
        System.out.println("Circumference is:" + circumference);
        System.out.println("Area is:" + area);*/

        //--------------------------------------------------------------------------------------------------------------
        // 6. Ask the user to input a bill-amount and a tip-amount(percentage)
        //    Calculate the total price.
        //    Example:
        //    Bill: 100.-
        //    Tip in %: 20
        //    Total: 120.-
        IO.println("Type in a bill amount");
        float bill = userInput.nextFloat();
        IO.println("Type in your tip-amount in percent");
        float tip = userInput.nextFloat();
        float total = bill += bill / 100 * tip;
        System.out.println("Your total price is " + total);


        //--------------------------------------------------------------------------------------------------------------
        // 6. Write a program to calculate your monthly and yearly salary
        //    Example:
        //    What's your hourly wage? -> 30
        //    How many hours do you work a week? -> 40
        //    Your monthly wage is: 4800
        //    Your yearly salary is: 57600 excluding the 13th month
        System.out.println("What's your hourly wage?");
        float hour = userInput.nextFloat();
        System.out.println("How many hours do you work a week?");
        float week = userInput.nextFloat();
        float month = (float) (hour * week);
        IO.println("Your monthly wage is:" + month + "$");
        float year = (month * 12);
        IO.println("Your yearly salary is:" + year + "$");
        System.out.println("Good boy");

        //--------------------------------------------------------------------------------------------------------------
        // 7. Write a little quiz about your favorite hobby/movie/book/song/game/dance/whatsoever.
        //    Include at least 10 questions. Use a byte to store your result.
        //    Example:
        //    Hello and welcome to my quiz about game development!
        //    Q 01: Which is the most used texture in all games based on an algorithm to generate natural looking textures
        //          terrain and much more?
        //    (User Input): I don't know
        //    It is the perlin noise (texture). If you were correct, write 1, else 0.
        //    (User Input): 0
        //    Q 02: Ok, next question! What is the name of the algorithm commonly used for pathfinding?
        //    (User Input): A-Star
        //    It's the A* or the A-star. If you were correct, write 1, else 0.
        //    (User Input): 1
        //    ....
        //    Q 10: Last question! What does 'LOD' stand for?
        //    (User Input): Don't know
        //    It stands for 'Level Of Detail'. If you were correct, write 1, else 0.
        //    Now im calculating your points....
        //    If you were honest, then you reached a total of n points! Congrats!



        // Make sure you didn't forget to close the scanner :)
        byte score = 0;

        System.out.println("Hello and welcome to my quiz about Basketball!");
        System.out.println("----------------------------------------------");

        IO.println("How many players from one team are on the court during a standard basketball game?");
        System.out.println("Q 01: How many players from one team are on the court during a game?");
        userInput.nextLine();
        System.out.println("It is 5 players. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 02: How many points is a shot worth from behind the three-point line?");
        userInput.nextLine();
        System.out.println("It is 3 points. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 03: What is the height of a standard NBA basketball hoop in feet?");
        userInput.nextLine();
        System.out.println("It is 10 feet (3.05 meters). If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 04: How many seconds is the NBA shot clock?");
        userInput.nextLine();
        System.out.println("It is 24 seconds. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 05: Which famous player is known as 'Air Jordan'?");
        userInput.nextLine();
        System.out.println("It is Michael Jordan. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 06: What is the illegal action of dribbling, stopping, and dribbling again?");
        userInput.nextLine();
        System.out.println("It is Double Dribble. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 07: How many quarters are played in a standard NBA game?");
        userInput.nextLine();
        System.out.println("There are 4 quarters. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 08: What is it called when a player gets 10+ in three stat categories?");
        userInput.nextLine();
        System.out.println("It is a Triple-Double. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 09: Which shot is worth 1 point after a foul?");
        userInput.nextLine();
        System.out.println("It is a Free Throw. If you were correct, write 1, else 0.");
        score += userInput.nextByte();
        userInput.nextLine();

        System.out.println("Q 10: Last question! How many fouls lead to a foul out in the NBA?");
        userInput.nextLine();
        System.out.println("It is 6 fouls. If you were correct, write 1, else 0.");
        score += userInput.nextByte();

        System.out.println("\nNow im calculating your points....");
        System.out.println("If you were honest, then you reached a total of " + score + " points! Congrats!");

        userInput.close();

    }
}
// Formula (approximately):
// (currentYear * daysPerYear + currentMonth * daysPerMonth) - (yourYear * daysPerYear + yourMonth * daysPerMonth);
// Example:
// (2024 * 365 + 9 *30) - (yourYear * 365 + yourMonth * 30);