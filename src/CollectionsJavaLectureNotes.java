import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CollectionsJavaLectureNotes {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        Random random = new Random();

        String[] toppingList = new String[0];
        int[] toppings = new int[0];
        for (int i = 0; i < 50; i++) {
            toppingList.add(toppings[random.nextInt(toppings.length)]);
        }

        System.out.println(toppingList);
        HashMap<String, Integer> toppingMap = new HashMap<>();

        for (String topping : toppingList) {
            if (toppingMap.containsKey(topping)) {
                toppingMap.put(topping, toppingMap.get(topping) + 1);
            }

            else {
                toppingMap.putIfAbsent(topping, 1);
            }

        }
    }
}
