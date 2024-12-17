# Learning Java: Java Collections

Welcome to my Java learning journey. This repository contains examples that I've worked on to deepen my understanding of Java programming, focusing on Java Collections. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Lists and ArrayLists](#lists-and-arraylists)
- [ArrayList Methods](#arraylist-methods)
- [ArrayList Objects](#arraylist-objects)
- [LinkedList](#linkedlist)
- [LinkedList Methods](#linkedlist-methods)
- [Sets and HashSets](#sets-and-hashsets)
- [Deques and ArrayDeques](#deques-and-arraydeques)
- [Map and HashMap](#map-and-hashmap)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of Java Collections. Collections are used to store and manipulate groups of data in a structured way.

## Lists and ArrayLists

### Purpose
To understand how to work with lists and ArrayLists in Java.

### Structure
```java
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
```

### Key Takeaways
- **Adding elements**: Use `add()` to add elements to the list.
- **Accessing elements**: Use `get()` to access elements by index.
- **Iterating through lists**: Use loops to iterate through elements.

---

## ArrayList Methods

### Purpose
To understand various methods available in ArrayList.

### Structure
```java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListMethod {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(167, 210, 500, 320, 870, 210, 10));
        
        System.out.println(numbers.size());
        System.out.println(numbers.contains(210));
        System.out.println(numbers.containsAll(List.of(167, 320)));
        System.out.println(numbers.indexOf(500));
        System.out.println(numbers.indexOf(509));
        System.out.println(numbers.indexOf(210));
        System.out.println(numbers.lastIndexOf(210));
        System.out.println(numbers.remove(6));
        System.out.println(numbers.retainAll(List.of(167, 320)));

        numbers.sort(Comparator.naturalOrder());
        numbers.sort(Comparator.reverseOrder());

        for (Integer i : numbers) {
            System.out.println(i);
        }

        numbers.clear();
        System.out.println(numbers.isEmpty());  
    }
}
```

### Key Takeaways
- **Size and containment**: Use `size()`, `contains()`, and `containsAll()`.
- **Index and removal**: Use `indexOf()`, `lastIndexOf()`, and `remove()`.
- **Sorting**: Use `sort()` with a comparator for ordering elements.

---

## ArrayList Objects

### Purpose
To understand how to work with custom objects in an ArrayList.

### Structure
```java
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<TodoItem> todoList = new ArrayList<TodoItem>();

        todoList.add(new TodoItem("Walk the dog", 3));
        todoList.add(new TodoItem("Learn Java", 5));

        for (TodoItem item : todoList) {
            System.out.println(item.getTitle() + " has a priority of " + item.getPriority());
        }
    }
}

public class TodoItem {
    private String title;
    private int priority;

    public TodoItem(String title, int priority) {
        this.title = title;
        this.priority = priority;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPriority() {
        return this.priority;
    }
}
```

### Key Takeaways
- **Custom objects**: Store and manage custom objects in ArrayList.
- **Getter methods**: Access object properties using getter methods.

---

## LinkedList

### Purpose
To understand how to work with LinkedList in Java.

### Structure
```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>(List.of(167, 210, 500, 320));
        todoItemsLinkedList.add(870);
        todoItemsLinkedList.add(210);
        todoItemsLinkedList.add(10);

        todoItemsLinkedList.set(2, 505);

        todoItemsLinkedList.offerFirst(90);
        todoItemsLinkedList.addLast(90);

        for (Integer i : todoItemsLinkedList) {
            System.out.println(i);
        }
    }
}
```

### Key Takeaways
- **Adding elements**: Use `add()`, `addFirst()`, `addLast()`, and `offerFirst()`.
- **Setting elements**: Use `set()` to update elements at a specific index.
- **Iterating through lists**: Use loops to iterate through elements.

---

## LinkedList Methods

### Purpose
To understand various methods available in LinkedList.

### Structure
```java
import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> todoItemsLinkedList = new LinkedList<>(List.of(167, 210, 500, 320));
        todoItemsLinkedList.add(870);
        todoItemsLinkedList.add(210);
        todoItemsLinkedList.add(10);

        System.out.println(todoItemsLinkedList.contains(210));
        System.out.println(todoItemsLinkedList.containsAll(List.of(167, 320)));
        System.out.println(todoItemsLinkedList.containsAll(List.of(167, 330)));
        System.out.println(todoItemsLinkedList.indexOf(500));
        System.out.println(todoItemsLinkedList.indexOf(509));
        System.out.println(todoItemsLinkedList.lastIndexOf(500));

        todoItemsLinkedList.remove(6);
        todoItemsLinkedList.removeAll(List.of(167, 320));
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
```

### Key Takeaways
- **Size and containment**: Use `contains()`, `containsAll()`.
- **Index and removal**: Use `indexOf()`, `lastIndexOf()`, `remove()`, `removeAll()`.
- **First and last elements**: Use `peekFirst()`, `peekLast()`, `pollFirst()`, `pollLast()`.

---

## Sets and HashSets

### Purpose
To understand how to work with sets and HashSets in Java.

### Structure
```java
import java.util.HashSet;
import java.util.List;

public class SetsAndHashSets {
    public static void main(String[] args) {
        var books = new HashSet<String>(List.of("Computer Software", "Computer Hardware"));
        books.add("Demo book");
        books.add("Harry and his friends");
        books.add("Eric takes on photography");
        books.add("Chad loves Java");
        books.add("Always be learning");
       
        System.out.println(books.contains("Harry and his friends"));
        System.out.println(books.size());

        for (String book : books) {
            System.out.println(book);
        }
    }
}
```

### Key Takeaways
- **Adding elements**: Use `add()` to add elements to the set.
- **Checking containment**: Use `contains()` to check if an element is in the set.
- **Iterating through sets**: Use loops to iterate through elements.

---

## Deques and ArrayDeques

### Purpose
To understand how to work with deques and ArrayDeques in Java.

### Structure
```java
import java.util.ArrayDeque;
import java.util.Deque;

public class DequesAndArrayDeques {
    public static void main(String[] args) {
        Deque<String> cards = new ArrayDeque<>();
        cards.add("Kings");
        cards.add("Queen");
        cards.addFirst("Ace");
        cards.addLast("Jack");

        cards.removeFirst();
        cards.removeLast();

        System.out.println(cards.peekFirst());
        System.out.println(cards.peekLast());

        System.out.println(cards.contains("Ace"));
        System.out.println(cards.contains("Eric"));

        System.out.println(cards);
        System.out.println(cards.getFirst());
        System.out.println(cards.getLast());
    }
}
```

### Key Takeaways
- **Adding elements**: Use `add()`, `addFirst()`, `addLast()`.
- **Removing elements**: Use `removeFirst()`, `removeLast()`.
- **Peeking elements**: Use `peekFirst()`, `peekLast()`.

---

## Map and HashMap

### Purpose
To understand how to work with maps and HashMaps in Java.

### Structure
```java
import java.util.HashMap;
import java.util.Map;

public class MapAndHashMap {
    public static void main(String[] args) {
        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("California", "CA");
        stateAbbreviations.put("New York", "NY");
        stateAbbreviations.put("Ohio", "OH");
        stateAbbreviations.put("Texas", "TX");

        System.out.println(stateAbbreviations.get("New York"));
        System.out.println(stateAbbreviations.containsKey("Ohio"));
        System.out.println(stateAbbreviations.containsValue("Washington"));
        
        System.out.println(stateAbbreviations.putIfAbsent("Washington", "WA"));
        stateAbbreviations.remove("New York");
        stateAbbreviations.put("Maryland", "MD");
        stateAbbreviations.put("Pennsylvania", "PB");
        stateAbbreviations.replace("Pennsylvania", "PA");
        System.out.println(stateAbbreviations);
        System.out.println(stateAbbreviations.size());
    }
}
```

### Key Takeaways
- **Adding entries**: Use `put()` to add key-value pairs to the map.
- **Checking keys and values**: Use `containsKey()` and `containsValue()`.
- **Retrieving values**: Use `get()` to retrieve the value associated with a key.
- **Conditional addition**: Use `putIfAbsent()` to add a key-value pair if the key is not already present.
- **Removing entries**: Use `remove()` to remove key-value pairs.
- **Replacing values**: Use `replace()` to update the value of an existing key.

---

## Conclusion

Understanding these Java Collection operations and methods enables efficient management of groups of data. By mastering fundamental collection concepts such as adding, accessing, iterating, and manipulating data in lists, sets, deques, and maps, you can handle complex data structures more effectively.


