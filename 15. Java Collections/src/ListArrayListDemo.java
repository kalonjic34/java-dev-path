import java.util.ArrayList;
import java.util.List;

public class ListArrayListDemo {
    public static void main(String[] args) {
        var todoItemsArrayList = new ArrayList<String>();
        todoItemsArrayList.add("Take out the trash");
        todoItemsArrayList.add("Clean the dishes");
        todoItemsArrayList.add("Prep Dinner");
        todoItemsArrayList.add(0, "Take dog on the walk");
        todoItemsArrayList.set(0, "Take dog to the groomer");

        System.out.println(todoItemsArrayList.get(2));
    
        for (String todo : todoItemsArrayList) {
            System.out.println(todo);
        }
    }
}