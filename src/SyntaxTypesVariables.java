public class SyntaxTypesVariables {

    public static void main(String[] args) {
        //JS Variable Declartation
        //let something = value
        int a = 10;                   //about precision

        //JAVA VARIABLE DECLARATION

        //DATATYPE -> variableName = value;

        byte myByte = 127;

        byte daysOfMonth = 31;

        short employees = 32767;

        int userID = 1000000000;      //no suffix

        long galaxyCoordinate = 999999999999999999L;
        //        System.out.println(galaxyCoordinate);

        float roundedPi = 3.14f; //NEEDS THE f

        double roundedPi2 = 3.141592653589793; //no suffix   //more precision

        char myChar = 'A'; //single character and only time you can use single quotes

        boolean markLovesJava = true;

        boolean markHatesJava = false;    //there is a class alternative which is a wrapper, and
        // has to do with methods

        String myString = "Some String";

        String someOtherQuote = "\"This is a quote by a famous person\"";
        System.out.println(someOtherQuote);

        String backslashes = "I can do backslash \\. Double backslash \\\\. Triple backslash " +
                "\\\\\\.";
        System.out.println(backslashes);

        System.out.println("\t" + "I am a tab" + someOtherQuote);

        //CONSTANTS:
        final int SIDES_OF_A_DICE = 6;
        final String API_KEY = "b75b703d8195f6f433ca";
        final String GITHUB_API_BASE_URL = "https://api.github.com";


        int sum = 1 + 1;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }


        int almostPi = (int) 3.14;   // check console, will be 3
        System.out.println(almostPi);

        double pi = 3.14159;            //will be what in console?
        System.out.println(pi);

        System.out.println(sum);

        System.out.println(sum++);

        System.out.println(sum);




    }

}
