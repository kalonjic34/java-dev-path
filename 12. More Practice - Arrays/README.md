# Learning Java: More Practice with Arrays

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on arrays. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Arrays Fundamentals](#arrays-fundamentals)
- [Arrays Initialization](#arrays-initialization)
- [Passing Arrays into Methods](#passing-arrays-into-methods)
- [Returning Arrays from Methods](#returning-arrays-from-methods)
- [Filling Arrays](#filling-arrays)
- [Sorting Arrays](#sorting-arrays)
- [Searching Arrays](#searching-arrays)
- [Two-Dimensional (2D) Arrays](#two-dimensional-2d-arrays)
- [Coding Exercises](#coding-exercises)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of arrays in Java. Arrays are used to store multiple values in a single variable, making it easier to manage collections of data.

## Arrays Fundamentals

### Purpose
To understand how to declare, initialize, and iterate through arrays.

### Structure
```java
public class ArrayDemo {
    public static void main(String[] args) {
        // initialize the array
        String[] colors = {"Red", "Green", "Blue", "Yellow"};

        // display contents of array
        System.out.println("Contents of the array: ");
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);

        // display length of the array
        System.out.println("Length of the array: " + colors.length);

        // loop through the array - version 1
        System.out.println("Looping through the array - Version 1:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        // loop through the array - version 2
        System.out.println("Looping through the array - Version 2:");
        for (String temp : colors) {
            System.out.println(temp);
        }
    }
}
```

### Key Takeaways
- **Initialization**: Arrays can be initialized with values directly.
- **Accessing elements**: Use index to access specific elements.
- **Iteration**: Use loops to iterate through array elements.

---

## Arrays Initialization

### Purpose
To initialize arrays dynamically and handle user input for array size and elements.

### Structure
```java
import java.util.Scanner;

public class StudentGradesDemo {
    public static void main(String[] args) {
        // prompt the user for how many grades
        Scanner scan = new Scanner(System.in);
        System.out.print("How many grades will you enter: ");
        int numGrades = scan.nextInt();

        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numGrades];

        // read each grade and assign to an array element
        for (int i = 0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number: " + (i + 1) + ": ");
            userInputGrades[i] = scan.nextDouble();
        }

        // print out the array elements
        for (double temp : userInputGrades) {
            System.out.println(temp);
        }

        scan.close();
    }
}
```

### Key Takeaways
- **Dynamic array size**: Array size can be determined at runtime.
- **User input**: Read values from the user and store them in the array.

---

## Passing Arrays into Methods

### Purpose
To pass arrays as arguments to methods and compute values based on the array elements.

### Structure
```java
import java.util.Scanner;

public class ComputeGradeAverageDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many grades will you enter: ");
        int numGrades = scan.nextInt();

        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numGrades];

        // read each grade and assign to an array element
        for (int i = 0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number: " + (i + 1) + ": ");
            userInputGrades[i] = scan.nextDouble();
        }

        // compute average
        double gradeAverage = ComputeGradeAverage(userInputGrades);
        System.out.println("Grade average: " + gradeAverage);

        scan.close();
    }

    private static double ComputeGradeAverage(double[] userInputGrades) {
        double sum = 0.0;
        // compute the sum of the grades
        for (double temp : userInputGrades) {
            sum += temp;
        }
        // compute the grade average, based on the length of the array
        return sum / userInputGrades.length;
    }
}
```

### Key Takeaways
- **Passing arrays**: Arrays can be passed to methods as arguments.
- **Calculations**: Methods can perform calculations based on array elements.

---

## Returning Arrays from Methods

### Purpose
To return arrays from methods and handle array operations within methods.

### Structure
```java
import java.util.Scanner;

public class ComputeGradeAverageDemoV2 {
    public static void main(String[] args) {
        double[] userInputGrades = readUserInputGrades();
        displayGrades(userInputGrades);

        // compute average
        double gradeAverage = ComputeGradeAverage(userInputGrades);
        System.out.println("Grade average: " + gradeAverage);
    }

    private static void displayGrades(double[] userInputGrades) {
        // print out the array elements
        for (double temp : userInputGrades) {
            System.out.println(temp);
        }
    }

    private static double[] readUserInputGrades() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many grades will you enter: ");
        int numGrades = scan.nextInt();

        // initialize the array based on the number of grades
        double[] userInputGrades = new double[numGrades];

        // read each grade and assign to an array element
        for (int i = 0; i < userInputGrades.length; i++) {
            System.out.print("Enter grade number: " + (i + 1) + ": ");
            userInputGrades[i] = scan.nextDouble();
        }
        scan.close();

        return userInputGrades;
    }

    private static double ComputeGradeAverage(double[] userInputGrades) {
        double sum = 0.0;
        // compute the sum of the grades
        for (double temp : userInputGrades) {
            sum += temp;
        }
        // compute the grade average, based on the length of the array
        return sum / userInputGrades.length;
    }
}
```

### Key Takeaways
- **Returning arrays**: Methods can return arrays as results.
- **Modular code**: Break down operations into separate methods for clarity.

---

## Filling Arrays

### Purpose
To fill an array with a specific value using the `Arrays.fill()` method.

### Structure
```java
import java.util.Arrays;
import java.util.Scanner;

public class FillArrayDemo {
    public static void main(String[] args) {
        // prompt the user for size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scan.nextInt();

        System.out.print("What number do you want to fill the array with? ");
        int theNum = scan.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];

        // fill the array
        Arrays.fill(myDataArray, theNum);

        // display the contents of the array
        for (int temp : myDataArray) {
            System.out.println(temp);
        }

        scan.close();
    }
}
```

### Key Takeaways
- **Filling arrays**: Use `Arrays.fill()` to set all elements to a specific value.
- **Convenient method**: Simplifies initializing arrays with default values.

---

## Sorting Arrays

### Purpose
To sort an array using the `Arrays.sort()` method and display the sorted elements.

### Structure
```java
import java.util.Arrays;
import java.util.Scanner;

public class SortArrayDemo {
    public static void main(String[] args) {
        // prompt the user for size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scan.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];

        // read each number and assign it to an array
        for (int i = 0; i < myDataArray.length; i++) {
            System.out.print("Enter number " + (1 + i) + ": ");
            myDataArray[i] = scan.nextInt();
        }

        // print out the array elements before sorting
        System.out.println("BEFORE sorting: ");
        displayData(myDataArray);

        // sort the array
        Arrays.sort(myDataArray);

        // print out the array elements after sorting
        System.out.println("AFTER sorting: ");
        displayData(myDataArray);

        scan.close();
    }

    private static void displayData(int[] myDataArray) {
        for (int temp : myDataArray) {
            System.out.println(temp);
        }
    }
}
```

### Key Takeaways
- **Sorting arrays**: Use `Arrays.sort()` to sort array elements in ascending order.
- **Display methods**: Separate methods can be used to display array contents.

---

## Searching Arrays

### Purpose
To search for an element in a sorted array using the `Arrays.binarySearch()` method.

### Structure
```java
import java.util.Arrays;
import java.util.Scanner;

public class SearchArrayDemo {
    public static void main(String[] args) {
        // prompt the user for size of the array
        Scanner scan = new Scanner(System.in);
        System.out.print("What size array do you want? ");
        int size = scan.nextInt();

        // initialize the array
        int[] myDataArray = new int[size];

        // read each number and assign it to an array
        for (int i = 0; i < myDataArray.length; i++) {
            System.out.print("Enter number " + (1 + i) + ": ");
            myDataArray[i] = scan.nextInt();
        }

        System.out.println();

        System.out.print("What number do you want to search for? ");
        int searchKey = scan.nextInt();

        // sort array first
        Arrays.sort(myDataArray);

        // search the array
        int result = Arrays.binarySearch(myDataArray, searchKey);
        boolean found = (result >= 0);

        System.out.println("Found: " + found);

        if (found) {
            System.out.println("We found the number: " + searchKey);
        } else {
            System.out.println("We did not find the number: " + searchKey);
        }

        scan.close();
    }
}
```

### Key Takeaways
- **Searching arrays**: Use `Arrays.binarySearch()` to find the index of an element in a sorted array.
- **Pre-sorting**: The array must be sorted before performing a binary search for accurate results.

---

## Two-Dimensional (2D) Arrays

### Purpose
To create and manipulate 2D arrays by declaring, initializing, and computing values such as a multiplication table.

### Structure
```java
import java.util.Scanner;

public class MultiplicationTableDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many rows: ");
        int numRows = scan.nextInt();

        System.out.print("How many columns: ");
        int numCols = scan.nextInt();

        scan.close();

        // initialize the array based on the rows and columns
        int[][] table = new int[numRows][numCols];

        // compute multiplication table values
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                table[row][col] = (row + 1) * (col + 1);
            }
        }

        // print out the results
        System.out.println();
        for (int[] rows : table) {
            for (int col : rows) {
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
```

### Key Takeaways
- **Declaration and initialization**: Define a 2D array and allocate space for rows and columns.
- **Nested loops**: Use nested loops to compute and assign values in a 2D array.
- **Accessing elements**: Iterate through rows and columns to access or modify elements.

---


## Conclusion

Understanding these array operations and methods enables efficient management of collections of data in Java. By mastering fundamental array concepts such as initialization, iteration, passing arrays to methods, and using built-in methods like `Arrays.fill()`, `Arrays.sort()`, and `Arrays.binarySearch()`, you can handle complex data manipulations more effectively.
