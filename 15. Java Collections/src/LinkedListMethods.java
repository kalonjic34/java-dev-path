import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>(List.of(167,210,500,320));
        todoItemsLinkedList.add(870);
        todoItemsLinkedList.add(210);
        todoItemsLinkedList.add(10);

        
        System.out.println(todoItemsLinkedList.contains(210));
        System.out.println(todoItemsLinkedList.containsAll(List.of(167,320)));
        System.out.println(todoItemsLinkedList.containsAll(List.of(167,330)));
        System.out.println(todoItemsLinkedList.indexOf(500));
        System.out.println(todoItemsLinkedList.indexOf(509));
        System.out.println(todoItemsLinkedList.lastIndexOf(500));

        todoItemsLinkedList.remove(6);
        todoItemsLinkedList.removeAll(List.of(167,320));
        
        todoItemsLinkedList.removeFirst();
        todoItemsLinkedList.pop();

        todoItemsLinkedList.pollFirst();
        todoItemsLinkedList.pollLast();

        System.out.println(todoItemsLinkedList.peekFirst());
        System.out.println(todoItemsLinkedList.peekLast());

        for (Integer i : todoItemsLinkedList) {
            System.out.println(i);
        }
    }
}