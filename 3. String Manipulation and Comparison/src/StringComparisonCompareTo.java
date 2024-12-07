public class StringComparisonCompareTo {
    public static void main(String[] args) {
        String animal1 = "Bat";
        String animal2 = "Dog";
        String animal3 = "Cat";

        System.out.println("Comapring animal 1 to animal 2 using compareTo() "+animal1.compareTo(animal2));
        System.out.println("Comapring animal 1 to animal 3 using compareTo() "+animal1.compareTo(animal3));
        System.out.println("Comapring animal 2 to animal 1 using compareTo() "+animal2.compareTo(animal1));
    }
}