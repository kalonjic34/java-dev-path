import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>(List.of(167,210,500,320));
        todoItemsLinkedList.add(870);
        todoItemsLinkedList.add(210);
        todoItemsLinkedList.add(10);

        todoItemsLinkedList.set(2,505);

        // todoItemsLinkedList.addFirst(90);

        todoItemsLinkedList.offerFirst(90);
        todoItemsLinkedList.addLast(90);

        // System.out.println(todoItemsLinkedList.get(2));

        // System.out.println(todoItemsLinkedList.size());
        
        for (Integer i : todoItemsLinkedList) {
            System.out.println(i);
        }
        
    }
}