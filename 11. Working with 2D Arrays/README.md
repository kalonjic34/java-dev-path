# Learning Java: Working with 2D Arrays and ArrayList

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on 2D arrays and ArrayList. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [2D Arrays - Declaration, Initialization, and Iteration](#2d-arrays---declaration-initialization-and-iteration)
- [2D Arrays - Easier Initialization](#2d-arrays---easier-initialization)
- [2D Arrays - Enhanced for Loops](#2d-arrays---enhanced-for-loops)
- [2D Arrays - Get the Largest and Lowest Number](#2d-arrays---get-the-largest-and-lowest-number)
- [2D Arrays - Get the Sum of All Items](#2d-arrays---get-the-sum-of-all-items)
- [ArrayList and Its Methods](#arraylist-and-its-methods)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of working with 2D arrays and ArrayList in Java. 2D arrays allow the storage of data in a table-like structure, while ArrayList provides dynamic array-like behavior.

## 2D Arrays - Declaration, Initialization, and Iteration

### Purpose
To create and manipulate a 2D array by declaring, initializing, and iterating through its elements.

### Structure
```java
public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = new int[3][3];
        my2DArray[0][0] = 1;
        my2DArray[0][1] = 2;
        my2DArray[0][2] = 3;
        my2DArray[1][0] = 4;
        my2DArray[1][1] = 5;
        my2DArray[1][2] = 6;
        my2DArray[2][0] = 7;
        my2DArray[2][1] = 8;
        my2DArray[2][2] = 9;

        System.out.println("My2d Array length: " + my2DArray.length);

        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Key Takeaways
- **Declaration and initialization**: Define and allocate space for the array.
- **Iteration**: Use nested loops to access and modify array elements.

---

## 2D Arrays - Easier Initialization

### Purpose
To simplify the initialization of a 2D array using array literals.

### Structure
```java
public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("My2d Array length: " + my2DArray.length);

        for (int i = 0; i < my2DArray.length; i++) {
            for (int j = 0; j < my2DArray[i].length; j++) {
                System.out.print(my2DArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

### Key Takeaways
- **Array literals**: Initialize arrays more conveniently.
- **Readability**: Easier to visualize the array structure.

---

## 2D Arrays - Enhanced for Loops

### Purpose
To iterate through a 2D array using enhanced for loops.

### Structure
```java
public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int[] row : my2DArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

### Key Takeaways
- **Enhanced for loop**: Simplifies iteration through arrays.
- **Readability**: Cleaner code for iterating through elements.

---

## 2D Arrays - Get the Largest and Lowest Number

### Purpose
To find the largest and lowest number in a 2D array.

### Structure
```java
public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10, 11, 12, 13, 0}
        };

        int largest = my2DArray[0][0];
        int lowest = my2DArray[0][0];
        for (int[] row : my2DArray) {
            for (int num : row) {
                if (num > largest) {
                    largest = num;
                }
                if (num < lowest) {
                    lowest = num;
                }
            }
        }
        System.out.println("Large number is: " + largest);
        System.out.println("Lowest number is: " + lowest);
    }
}
```

### Key Takeaways
- **Finding extremes**: Use loops to compare and find the largest and lowest values.
- **Initialization**: Set initial values to the first element of the array.

---

## 2D Arrays - Get the Sum of All Items

### Purpose
To calculate the sum of all elements in a 2D array.

### Structure
```java
public class DeclarationInitialization {
    public static void main(String[] args) {
        int[][] my2DArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int sum = 0;
        for (int[] row : my2DArray) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Sum is: " + sum);
    }
}
```

### Key Takeaways
- **Summing elements**: Use nested loops to accumulate the sum of all elements.
- **Initialization**: Start with a sum of 0.

---

## ArrayList and Its Methods

### Purpose
To demonstrate the usage of ArrayList and its methods.

### Structure
```java
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

        fruits.add(0, "Pear");
        fruits.add(2, "Plum");
        fruits.remove("Banana");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
```

### Key Takeaways
- **Dynamic size**: ArrayList can grow and shrink dynamically.
- **Useful methods**: Methods like `add()`, `remove()`, `get()`, `contains()`, and `size()` provide flexibility.
- **Enhanced for loop**: Simplifies iteration through the list.

---

## Conclusion

Understanding these 2D array operations and ArrayList methods enables efficient management of complex data structures in Java. Keep practicing to strengthen your programming skills and explore more advanced data manipulations.


