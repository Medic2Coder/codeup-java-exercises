public class warmup07april2022 {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
// lives in city = first variable boolean
        boolean livesInCity = false;
//has transportation = second variable boolean
        boolean hasCarTransportation = false;
//can come in person = boolean expression of previous two variables
        boolean canComeInPerson = livesInCity && hasCarTransportation;
        //write if statement, if they can come in person, console writes You can come in person
        if (canComeInPerson == true) {
            System.out.println("You can come in person");
        } else if (canComeInPerson == false) {
            System.out.println("What, you have a jetpack but you still want to attend via zoom?");
        }

    }
                   //TODO: Parse int from string
    public static int parseInt(String string) {
        return Integer.parseInt(string);
    }
}




