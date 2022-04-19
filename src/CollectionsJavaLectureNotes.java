import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class CollectionsJavaLectureNotes {

    public static void main(String[] args) {
        String[] toppings = {"pepperoni", "sausage", "mushrooms", "onions", "green peppers", "pineapple", "extra cheese"};

        List<String> toppingList = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            toppingList.add(toppings[random.nextInt(toppings.length)]);
        }

//        System.out.println(toppingList);
        HashMap<String, Integer> toppingMap = new HashMap<>();

        for (String topping : toppingList) {
            if (toppingMap.containsKey(topping)) {
                toppingMap.put(topping, toppingMap.get(topping) + 1);
            }

            else {
                toppingMap.putIfAbsent(topping, 1);
            }

        }

        System.out.println(toppingMap);
        System.out.println(toppingMap.get("extra cheese"));
        System.out.println(toppingMap.get("pineapple"));
        System.out.println(toppingMap.get("onions"));
        System.out.println(toppingMap.get("green peppers"));
        System.out.println(toppingMap.get("mushrooms"));
        System.out.println(toppingMap.get("sausage"));
        System.out.println(toppingMap.get("pepperoni"));

    }
}
