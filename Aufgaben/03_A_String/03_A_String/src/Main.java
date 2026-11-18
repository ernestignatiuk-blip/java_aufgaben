public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Print "I am learning Java output and getting to know Strings better" to the console.

        System.out.println("I am learning Java output and getting to know Strings better");
        System.out.println("");

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now print "String concatenation works!" to the console, but not in one piece.
        //    You need to use the "+" operator, which you can also use in the output itself.

        System.out.println("String" + "concatenation" + "works");
        System.out.println("");

        //--------------------------------------------------------------------------------------------------------------
        // 3. Create a variable "firstName" with the appropriate data type and assign your first name to the variable.
        //    Then print this variable to the console.


        String myString = "Ernest";
        System.out.println(myString);
        System.out.println("");

        //--------------------------------------------------------------------------------------------------------------
        // 4. Now create another variable.
        //    Name of the variable: lastName.
        //    Value of the variable: Your last name.
        //    Study the code below and complete it so, that the following  output is displayed on the console:
        //
        //    My first name is ...
        //    And my last name is ...
        //    (Obviously replace "..." with your first/last name).


                String firstName = "Ernest";
                String lastName = "Ignatiuk";

                System.out.println("My first name is " + firstName);
                System.out.println("And my last name is " + lastName);
        System.out.println("");



        //--------------------------------------------------------------------------------------------------------------
        // 5. Complete the code below so, that it prints the following output:
        //   Berufsfachschule Oberwallis


        String school = "Berufsfachschule";
        String location= "Oberwallis";

        // Do not change the following lines
        String result = school + " " + location;
        System.out.println(result);

        // What is the purpose of " " ?

        // Leertaste,Absatz

        //--------------------------------------------------------------------------------------------------------------
        // 6. Declare a variable language with the value "Java" and print "I am learning Java!" using the variable.
            String programlanguage = "Java";
            String result1 = "I am learning" + " " + programlanguage + "!";
        System.out.println(result1);
        //--------------------------------------------------------------------------------------------------------------
        // 7. Print the following lines including
        // one single double quotation marks ("...")
        // and newlines using a single System.out.println:
		
        // I am learning about
        // escape characters.
        // I need to look up
        // "escape characters"
        // to solve this task.

        //
            public static void main(String[] args) {
                System.out.println("I am learning about\nescape characters.\nI need to look up\n\"escape characters\"\nto solve this task.");
            }
        }


    }
}