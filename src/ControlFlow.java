public class ControlFlow {

    public static void main(String[] args) {
                                  //walkthrough help with Casey
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//                                                 //TODO: One of these is infinite loop
//        int a = 0;
//        do {
//            System.out.println(i);
//            a = i + 1;
//            a += 2;
//
//        } while (a < 100);
//
//        int b = 100;
//        do {
//            System.out.println(i);
//            b -= 5;
//
//        } while (b > -10);
//
//        long c = 2L;
//        do {
//            System.out.println(i);
////            i = (int) Math.pow(i, 2);    //explictly casting stops at highest boundaries
//            c *= i;
//        } while (c < 1000000L);      // no need to put L because doesn't need to be a long but..
//        // .wont hurt anything
//
//        for (long e = 2L; e< 1000000L; e*=e) {
//            System.out.println(e);
//
//        }

        //fizzbuzz
        for (int f = 1; f <= 100; f++) {
            if (f % 3 == 0 && f % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (f % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (f % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(f);
            }
        }
    }

}
