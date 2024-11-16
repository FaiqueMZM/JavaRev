import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();         //linkedlist for fruits

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");

        System.out.println("First element of fruits linkedlist is : " + fruits.getFirst());
        System.out.println("Last element of fruits linkedlist is : " + fruits.getLast());
        System.out.println();

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println();
        System.out.println("Elements of fruits linkedlist is : " + fruits.toString());

        //addFirst()
        //addLast()
        //removeFirst()
        //removeLast()
        //getFirst()
        //getLast()
    }
}
