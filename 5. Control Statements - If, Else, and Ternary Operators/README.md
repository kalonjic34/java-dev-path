# Learning Java: Control Statements and Logical Operators

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on control statements and logical operators. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [If Statement](#if-statement)
- [Nested If Statement](#nested-if-statement)
- [Logical Operators](#logical-operators)
- [If Statements Exercise Chatbot](#if-statements-exercise-chatbot)
- [If Else Control Statements](#if-else-control-statements)
- [Nested If Else Control Statements](#nested-if-else-control-statements)
- [If Else If Else](#if-else-if-else)
- [Ternary Operators](#ternary-operators)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various control statements and logical operators in Java. Each section provides practical examples and use cases to help solidify my understanding and application of these concepts in Java programming.

## If Statement

The `if` statement allows you to execute a block of code only if a specified condition is true.

Example:
```java
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean isSunny = true;
        if (isSunny) {
            System.out.println("Such a lovely day!\n");
        }

        int a = -5;
        if (a > 0) {
            System.out.println("We have a positive number");
        }
        System.out.println("Outside of any conditions!\n");

        String name = scan.nextLine();
        if(name.equals("Chris")){
            System.out.println("Hi Chris");
        }

        scan.close();
    }
}
```

## Nested If Statement

You can nest `if` statements within other `if` statements to create more complex conditions.

Example:
```java
public class NestedIfStatements {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        if(a > 0){
            if(b > a){
                System.out.println("B is greater than A");
            }
        }
        System.out.println("After If Statement");
    }
}
```

## Logical Operators

Logical operators allow you to combine multiple conditions. The common logical operators are `&&` (logical AND), `||` (logical OR), and `!` (logical NOT).

Example:
```java
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // Logical AND
        boolean result = a && b; // false
        
        // Logical OR
        result = a || b; // true
        
        // Logical NOT
        result = !a || b; // true
        
        System.out.println("a is " + a + " and !a is " + !a + "\n");
        
        int x = 5; 
        int y = 10;
        if (x > 0 && y > x) {
            System.out.println("y is greater than x");
        }
    }
}
```

## If Statements Exercise Chatbot

Created a simple chatbot using if statements to respond to user input based on specific keywords.

Example:
```java
import java.util.Scanner;

public class ChatbotExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your prompt: ");
        String userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("hello") || userInput.equalsIgnoreCase("hi")) {
            System.out.println("Chatbot: Hello there, how are you?");
        }
        
        if (userInput.equalsIgnoreCase("how are you?") || userInput.equalsIgnoreCase("how's it going?")) {
            System.out.println("Chatbot: I'm just a robot and have no feelings");
        }
        
        if (userInput.equalsIgnoreCase("weather") || userInput.equalsIgnoreCase("what's the weather like?")) {
            System.out.println("Chatbot: It's a sunny day");
        }
        
        if (userInput.equalsIgnoreCase("bye") || userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Bye, have a great day!");
        }

        if (!userInput.equalsIgnoreCase("hello") 
        || !userInput.equalsIgnoreCase("hi") 
        || !userInput.equalsIgnoreCase("how are you?") 
        || !userInput.equalsIgnoreCase("how's it going?") 
        || !userInput.equalsIgnoreCase("weather") 
        || !userInput.equalsIgnoreCase("what's the weather like?")
        || !userInput.equalsIgnoreCase("bye") 
        || !userInput.equalsIgnoreCase("goodbye")) {
            System.out.println("Chatbot: Sorry, I didn't get it");
        }
        scan.close();
    }
}
```

## If Else Control Statements

The `if-else` statement allows you to execute one block of code if a condition is true and another block if the condition is false.

Example:
```java
public class IfElse {
    public static void main(String[] args) {
        int number = 5;

        if (number % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }
    }
}
```

## Nested If Else Control Statements

You can create complex decision structures using nested `if-else` statements.

Example:
```java
public class NestedIfElse {
    public static void main(String[] args) {
        int number = -5;
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is 0");
        }
    }
}
```

## If Else If Else

The `if-else if-else` statement allows you to test multiple conditions in sequence.

Example:
```java
public class IfElseIfElse {
    public static void main(String[] args) {
        int score = 64;

        if (score > 90) {
            System.out.println("Grade is A");            
        } else if (score >= 85) {
            System.out.println("Grade is B");
        } else if (score >= 70) {
            System.out.println("Grade is C");
        } else if (score >= 60) {
            System.out.println("Grade is D");
        } else if (score >= 50) {
            System.out.println("Grade is E");
        } else {
            System.out.println("Grade is F");
        }
    }
}
```

## Ternary Operators

The ternary operator (`? :`) is a shorthand for the `if-else` statement that evaluates a condition and returns one of two values.

Example:
```java
public class TernaryOperators {
    public static void main(String[] args) {
        int age = 16;
        double discount = (age < 18) ? 0.10 : 0.05;
        System.out.println("The discount is: " + discount * 100 + "%");
    
        int score = 85;
        char grade = (score >= 90) ? 'A' 
                : (score >= 80) ? 'B'
                : (score >= 70) ? 'C'
                : (score >= 60) ? 'D'
                : (score >= 50) ? 'E'
                : 'F';
        System.out.println("The grade is " + grade);
    }
}
```

## Conclusion

This sandbox has been an excellent resource for exploring control statements and logical operators in Java. These fundamental skills are essential for making decisions in your programs and building more complex logic. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.
