public class Warmup {
    //create a method isPalindrome that takes a string as a parameter and returns true if the
    // string is a palindrome

    public static void main(String[] args) {
        System.out.println("************************************");
        System.out.println("Using 'isPalindrome': \n\t");
        System.out.println(Warmup.isPalindrome("racecar"));
        System.out.println(Warmup.isPalindrome("hello"));
        System.out.println("------------------------------------");
        System.out.println("************************************");




        System.out.println("\n************************************");
        System.out.println("Using 'Palindrome2': \n\t");
        System.out.println(Warmup.isPalindrome2("racecar"));
        System.out.println(Warmup.isPalindrome2("hello"));
        System.out.println("------------------------------------");
        System.out.println("************************************");



    }

    public static boolean isPalindrome(String str) {
        //create a boolean variable to store the result
        boolean result = false;
        //create a variable to store the length of the string
        int length = str.length();
        //create a variable to store the middle of the string
        int middle = length / 2;
        //create a variable to store the last index of the string
        int lastIndex = length - 1;
        //create a for loop to iterate through the string
        for (int i = 0; i < middle; i++) {
            //create a variable to store the first character of the string
            char first = str.charAt(i);
            //create a variable to store the last character of the string
            char last = str.charAt(lastIndex);
            //if the first character is not equal to the last character, return false
            if (first != last) {
                return false;
            }
            //decrement the last index
            lastIndex--;
        }
        //return true if the loop completes
        return true;
    }


    public static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbReverse = sb.reverse();
        if (s.equals(String.valueOf(sbReverse))) {
            return true;
        }
        return false;

    }
}



