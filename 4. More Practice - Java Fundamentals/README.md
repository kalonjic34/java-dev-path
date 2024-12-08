
# Learning Java: Fundamentals, String Manipulation, Data Types, and Input Handling

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Strings in Java](#strings-in-java)
- [Reading String Input](#reading-string-input)
- [Primitive Data Types](#primitive-data-types)
- [Reading Integer Input](#reading-integer-input)
- [Casting and Conversion](#casting-and-conversion)
- [Coding Exercise](#coding-exercise)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various aspects of Java programming, including string manipulation, primitive data types, input handling, and type casting and conversion.

## Strings in Java

Strings in Java are objects that represent sequences of characters. They are immutable, meaning once created, their values cannot be changed. Java provides several methods for manipulating strings, such as concatenation, case conversion, and obtaining string length.

Example:
```java
public class Strings {
    public static void main(String[] args) {
        String message = "Hello World.";
        String extra = "I love to code!";

        // Concatenation
        System.out.println(message + " " + extra);

        // String methods: length(), toUpperCase(), toLowerCase()
        System.out.println("Length of " + message + " is " + message.length());
        System.out.println("Upper case version of " + message + " is " + message.toUpperCase());
        System.out.println("Lower case version of " + message + " is " + message.toLowerCase());

        // Combining strings
        String combo = message + " " + extra;
        System.out.println("Combo: " + combo);

        // Convert to upper case
        String upperVersion = combo.toUpperCase();
        System.out.println("Upper version: " + upperVersion);
    }
}
```

## Reading String Input

Using the `Scanner` class, you can capture user input from the console. The `nextLine()` method reads a line of text, making it useful for capturing strings that include spaces.

Example:
```java
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // Creating a scanner for reading input from the user
        Scanner scan = new Scanner(System.in);

        // Prompting the user
        System.out.print("What is your favorite color? ");
        String theColor = scan.nextLine();

        System.out.print("What is your favorite hobby? ");
        String theHobby = scan.nextLine();

        // Displaying the input back to the user
        System.out.println("\nYour favorite color is " + theColor);
        System.out.println("Your hobby is " + theHobby);

        // Closing the scanner to release resources and prevent memory leaks
        scan.close();
    }
}
```

## Primitive Data Types

Java has several primitive data types, such as `int`, `double`, `float`, and `char`. These are used to store simple values. Performing arithmetic operations on these types is straightforward.

Example:
```java
public class DataTypes {
    public static void main(String[] args) {
        double gradeExam1 = 87.5;
        double gradeExam2 = 100.0;
        double gradeExam3 = 66.50;

        // Calculating the average
        double gradeAverage = ((gradeExam1 + gradeExam2 + gradeExam3) / 3);

        // Displaying the grades and the average
        System.out.println("Grade exam 1: " + gradeExam1);
        System.out.println("Grade exam 2: " + gradeExam2);
        System.out.println("Grade exam 3: " + gradeExam3);
        System.out.println("Grade average: " + gradeAverage);

        // Formatting the output to 2 decimal places
        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted average: " + formattedAvg);
    }
}
```

## Reading Integer Input

The `Scanner` class can also be used to capture numerical input from the user, such as integers and doubles. The methods `nextInt()` and `nextDouble()` are useful for this purpose.

Example:
```java
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        // Creating a scanner for reading input from the user
        Scanner scan = new Scanner(System.in);

        // Prompting the user for grades
        System.out.print("Enter grade exam 1: ");
        double gradeExam1 = scan.nextDouble();

        System.out.print("Enter grade exam 2: ");
        double gradeExam2 = scan.nextDouble();

        System.out.print("Enter grade exam 3: ");
        double gradeExam3 = scan.nextDouble();

        // Calculating the average
        double gradeAverage = ((gradeExam1 + gradeExam2 + gradeExam3) / 3);

        // Displaying the grades and the average
        System.out.println("\nGrade exam 1: " + gradeExam1);
        System.out.println("Grade exam 2: " + gradeExam2);
        System.out.println("Grade exam 3: " + gradeExam3);
        System.out.println("Grade average: " + gradeAverage);

        // Formatting the output to 2 decimal places
        String formattedAvg = String.format("%.2f", gradeAverage);
        System.out.println("Formatted average: " + formattedAvg);

        // Closing the scanner to release resources and prevent memory leaks
        scan.close();
    }
}
```

## Casting and Conversion

Type casting is converting a variable from one type to another. Explicit casting is required when narrowing (e.g., `double` to `int`), whereas implicit casting is done automatically when widening (e.g., `int` to `double`). Additionally, conversion methods like `Integer.parseInt()` can convert strings to numeric types.

Example:
```java
public class CastingConversion {
    public static void main(String[] args) {
        // Converting double to int
        double theDoubleGradeAvg = 89.70;
        int theIntGradeAvg = (int) theDoubleGradeAvg;
        System.out.println("theDoubleGradeAvg= " + theDoubleGradeAvg);
        System.out.println("theIntGradeAvg= " + theIntGradeAvg);

        // Converting float to byte
        float theFloatDistance = 123.60f;
        byte theByteDistance = (byte) theFloatDistance;
        System.out.println("theFloatDistance= " + theFloatDistance);
        System.out.println("theByteDistance= " + theByteDistance);

        // Converting int to char
        int theCharacterCode = 65;
        char theChar = (char) theCharacterCode;
        System.out.println("theCharacterCode= " + theCharacterCode);
        System.out.println("theChar= " + theChar);

        // Converting String to int
        int count = Integer.parseInt("49");
        System.out.println("count= " + count);
    }
}
```

## Coding Exercises

### Exercise 1: String Manipulation
**Description:** Write a Java program that takes a user's first and last name as input, then performs the following operations:
1. Concatenate the first and last names to create a full name.
2. Convert the full name to uppercase.
3. Print the length of the full name.
4. Print the first and last character of the full name.

**Instructions:**
1. Create a new Java class named `FullNameManipulation`.
2. Use the `Scanner` class to read input from the user.
3. Perform the required string operations and display the results.

**Expected Output:**
```
Enter your first name: Chris
Enter your last name: Kalonji
Full name: Chris Kalonji
Uppercase full name: CHRIS KALONJI
Length of full name: 12
First character: C
Last character: i
```

## Conclusion

This sandbox has been an excellent resource for exploring Java programming, particularly in the areas of string manipulation, primitive data types, input handling, and type casting and conversion. These fundamental skills are the building blocks for more complex Java applications. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.


