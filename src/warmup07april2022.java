public class warmup07april2022 {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
// lives in city = first variable boolean
        boolean livesInCity = true;
//has transportation = second variable boolean
        boolean hasTransportation = true;
//can come in person = boolean expression of previous two variables
        boolean canComeInPerson = livesInCity && hasTransportation;
        //write if statement, if they can come in person, console writes You can come in person
        if ( canComeInPerson == true ) {
            System.out.println("You can come in person");
        }
        else if (canComeInPerson == false) {
            System.out.println("You can't come in person");
        }

    }

}




