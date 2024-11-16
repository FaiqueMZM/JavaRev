import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<String, Integer> fruits = new HashMap<>();   //hashmap for fruit items (name, price)

        fruits.put("apple", 100);        //insert elements to hashmap
        fruits.put("orange", 120);
        fruits.put("pineapple", 350);
        fruits.put("mango", 150);

        System.out.println("Price of apple: " + fruits.get("apple"));
        System.out.println();

        for (String key : fruits.keySet()) {
            System.out.println(key + ": " + fruits.get(key));
        }

        System.out.println();
        System.out.println("Fruits hashmap has : " + fruits);
        fruits.remove("apple");
        System.out.println("Fruits hashmap after removing 'apple' : " + fruits);

        fruits.clear();
        System.out.println("Fruits hashmap after clearing everything : " + fruits);
    }
}
