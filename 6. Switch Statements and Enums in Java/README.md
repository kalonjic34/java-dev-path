# Learning Java: Switch Statements and Enums

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on switch statements and enums. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Basic Switch Statement](#basic-switch-statement)
- [Experimenting with Break and Fall Through](#experimenting-with-break-and-fall-through)
- [Switch Statements with Char](#switch-statements-with-char)
- [Switch Statements with Strings](#switch-statements-with-strings)
- [Enums and Switch](#enums-and-switch)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various aspects of switch statements and enums in Java. Each section provides practical examples and use cases to help solidify my understanding and application of these concepts in Java programming.

## Basic Switch Statement

The `switch` statement allows you to execute one block of code out of many based on the value of a variable.

Example:
```java
public class SwitchStatements {
    public static void main(String[] args) {
        int day = 5;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "N/A";
                break;
        }
        System.out.println("Today is " + dayName);
    }
}
```

## Experimenting with Break and Fall Through

Exploring the use of `break` statements to prevent fall-through and how to intentionally allow fall-through behavior.

Example:
```java
public class SwitchStatements {
    public static void main(String[] args) {
        int day = 6;

        switch (day) {
            case 1:
                System.out.println("Work on Project A");
                break;
            case 2:
                System.out.println("Work on Project B");
                break;
            case 3:
                System.out.println("Wednesday: Write proposal");
                break;
            case 4:
                System.out.println("Thursday: Meeting all day");
                break;
            case 5:
                System.out.println("Friday: Submit a report");
                break;
            case 6:
                System.out.println("Saturday: Relax");
                // Intentionally allowing fall-through
            case 7:
                System.out.println("Sunday: Relax");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
```

## Switch Statements with Char

Using the `switch` statement with `char` values to categorize grades.

Example:
```java
public class SwitchStatementsChar {
    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done!");
                break;
            case 'D':
                System.out.println("Passed!");
                break;
            case 'E':
                System.out.println("Better luck next time!");
                break;
            case 'F':
                System.out.println("You failed, try better next time!");
                break;
            default:
                System.out.println("Grade doesn't exist");
                break;
        }
    }
}
```

## Switch Statements with Strings

Using the `switch` statement with `String` values to respond to different seasons.

Example:
```java
import java.util.Scanner;

public class SwitchStatementsStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What season is it? ");
        String season = scan.nextLine();
        scan.close();

        switch (season) {
            case "Spring":
                System.out.println("The flowers are blooming, how nice!");
                break;
            case "Summer":
                System.out.println("It's sunny and hot, time for the beach!");
                break;
            case "Autumn":
                System.out.println("The leaves are falling and it's windy!");
                break;
            case "Winter":
                System.out.println("Cold and snowy, let's build a snowman!");
                break;
            default:
                System.out.println("I have never heard of this season before");
                break;
        }
    }
}
```

## Enums and Switch

Using enums in combination with switch statements for better type safety and clarity.

Example:
```java
public class EnumsSwitch {
    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, 
        THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public enum CoffeeSize {
        SMALL, MEDIUM, LARGE, VENTI
    }

    public static void main(String[] args) {
        CoffeeSize size = CoffeeSize.LARGE;
        double price;

        switch (size) {
            case SMALL:
                price = 2.50;
                break;
            case MEDIUM:
                price = 3.00;
                break;
            case LARGE:
                price = 3.50;
                break;
            case VENTI:
                price = 4.00;
                break;
            default:
                price = 0.00;
                break;
        }
        System.out.println("The price for your coffee is: " + price);
    }
}
```

## Conclusion

This sandbox has been an excellent resource for exploring switch statements and enums in Java. These fundamental skills are essential for making decisions in your programs and building more complex logic. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.
