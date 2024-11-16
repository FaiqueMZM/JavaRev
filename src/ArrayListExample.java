import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();     //arraylist for fruits

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

        System.out.println("First element in fruit arraylist is : " + fruits.get(0));
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("Fruits arraylist has : " + fruits);
        fruits.remove("Pear");
        System.out.println("Fruits arraylist after removing 'Pear' : " + fruits);
    }
}
