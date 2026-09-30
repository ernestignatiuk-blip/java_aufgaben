public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.

        System.out.println("Aufgabe 1");
        System.out.println("byte < short < int < long < float < double");

        // 1. Variablen erstellen und initialisieren
        byte myByte = 10;
        short myShort = 20;
        int myInt = 30;
        long myLong = 40L;
        float myFloat = 50.0f;
        double myDouble = 60.0d;


// --- a) Von BYTE
        short byteToShort = myByte;
        int byteToInt = myByte;
        long byteToLong = myByte;
        float byteToFloat = myByte;
        double byteToDouble = myByte;

        System.out.println("byteToShort: " + byteToShort);
        System.out.println("byteToInt: " + byteToInt);
        System.out.println("byteToDouble: " + byteToDouble);


// --- b) Von SHORT aus ---

        int shortToInt = myShort;
        long shortToLong = myShort;
        float shortToFloat = myShort;
        double shortToDouble = myShort;

// --- d) Von INT aus ---
        long intToLong = myInt;
        float intToFloat = myInt;
        double intToDouble = myInt;

// --- e) Von LONG aus ---
        float longToFloat = myLong;
        double longToDouble = myLong;

// --- f) Von FLOAT aus ---
        double floatToDouble = myFloat;
        System.out.println("floatToDouble: " + floatToDouble);

        //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        long myLong1 = 1234567890L;
        int myInt1 = (int) myLong1;
        System.out.println(myInt1);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;

        // Try to guess first what happens, then test it.
        System.out.println(myNumber);

        // Das erste String ist ein Text und nicht eine Zahl, das zweite ist eine Zahl.
        // Java rechnet nicht, sondern klebt die Werte einfach aneinander (das nennt man Konkatenation).
        //Java wandelt die Zahl 10 automatisch in den Text "10" um und hängt ihn hinten an den Text 33 an.


        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        // int houseNumber = houseNumberInString;
        // System.out.println(houseNumber)
        String houseNumberInString1 = "52";
        int houseNumber = Integer.valueOf(houseNumberInString1);
        System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Der direkte Versuch, einen Text (String) in eine Ganzzahl (int) zu speichern,
        // führt zu einem Fehler, weil Java die beiden Datentypen nicht automatisch ineinander umwandeln kann.

    }
}