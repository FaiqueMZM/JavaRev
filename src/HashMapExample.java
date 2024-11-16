import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> fruit = new HashMap<>();   //hashmap for fruit items (name, price)

        fruit.put("apple", 100);        //insert elements to hashmap
        fruit.put("orange", 120);
        fruit.put("pineapple", 350);
        fruit.put("mango", 150);

        System.out.println("Price of apple: " + fruit.get("apple"));
        System.out.println();

        for (String key : fruit.keySet()) {
            System.out.println(key + ": " + fruit.get(key));
        }

        System.out.println(fruit);
        fruit.remove("apple");
        System.out.println(fruit);

        fruit.clear();
        System.out.println(fruit);
    }
}
