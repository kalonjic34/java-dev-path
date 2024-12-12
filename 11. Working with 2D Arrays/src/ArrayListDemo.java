import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Dates");

        System.out.println(fruits.get(2));

        boolean hasBanana = fruits.contains("Banana");
        System.out.println(hasBanana);

        System.out.println(fruits.size());

        fruits.addFirst("Pear");
        fruits.add(2, "Plum");
        fruits.remove("Banana");
        // fruits.remove(0);


        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}