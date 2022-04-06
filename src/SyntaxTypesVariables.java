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

        String backslashes = "I can do backslash \\. Double backslash \\\\. Triple backslash \\\\\\.";
        System.out.println(backslashes);

        System.out.println("\t" + "I am a tab" +someOtherQuote);
        

    }

}
