# Learning Java: Handling User Input and Simple Calculations

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on handling user input and performing simple calculations. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [User Input with Text and the Scanner Class](#user-input-with-text-and-the-scanner-class)
- [User Input with Numbers and Simple Addition](#user-input-with-numbers-and-simple-addition)
- [Next Line Buffer Behavior](#next-line-buffer-behavior)
- [Solution: Calories Counter Pro](#solution-calories-counter-pro)
- [Modulo Operator](#modulo-operator)
- [Unary, Increment, and Decrement Operators](#unary-increment-and-decrement-operators)
- [Relational Operators](#relational-operators)
- [Compound Operators](#compound-operators)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various aspects of Java programming, including how to handle user input, use the Scanner class, and apply different types of operators.

## User Input with Text and the Scanner Class

Learned how to capture user input as text using the `Scanner` class.

Example:
```java
import java.util.Scanner;
public class UserInputAndScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.println("Welcome to the Java Club " + name);
        scan.close();
    }
}
```

## User Input with Numbers and Simple Addition

Explored capturing numerical input and performing simple addition using the `Scanner` class.

Example:
```java
import java.util.Scanner;
public class UserInputNumbersAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number a: ");
        int a = scan.nextInt();
        System.out.print("Enter number b: ");
        int b = scan.nextInt();
        int sum = a + b;
        System.out.println("The sum of a & b is: " + sum);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.print("So your age is: " + age);

        scan.close();
    }
}
```

## Next Line Buffer Behavior

Learned how to handle the next line buffer behavior in the `Scanner` class.

Example:
```java
import java.util.Scanner;
public class NextLineBufferBehavior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();
        scan.nextLine(); // to consume the next line (Enter key)

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Welcome to the Java Club " + name);
        scan.close();
    }
}
```

## Solution: Calories Counter Pro

Created a calories counter program to practice user input and arithmetic operations.

Example:
```java
import java.util.Scanner;
public class CaloriesCounterPro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String food1, food2, food3;
        int calories1, calories2, calories3;
        int totalCalories;

        System.out.println("Welcome to the Calories Counter Pro");

        System.out.print("Enter the name of food 1: ");
        food1 = scan.nextLine();
        System.out.print("Enter the calories for " + food1 + " ");
        calories1 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the name of food 2: ");
        food2 = scan.nextLine();
        System.out.print("Enter the calories for " + food2 + " ");
        calories2 = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter the name of food 3: ");
        food3 = scan.nextLine();
        System.out.print("Enter the calories for " + food3 + " ");
        calories3 = scan.nextInt();
        scan.nextLine();

        totalCalories = calories1 + calories2 + calories3;

        System.out.println("\nYour calories intake: ");
        System.out.println("1. " + food1 + " - " + calories1 + " calories");
        System.out.println("2. " + food2 + " - " + calories2 + " calories");
        System.out.println("3. " + food3 + " - " + calories3 + " calories");
        System.out.println("\nYour total calories intake was: " + totalCalories);

        System.out.println("Thanks for using Calories Counter Pro");
        scan.close();
    }
}
```

## Modulo Operator

Learned about the modulo operator and how it can be used to find the remainder of a division operation.

Example:
```java
public class ModuloOperator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 8;
        int result;

        // Addition
        result = num1 + num2;
        System.out.print("Addition result: " + result);

        // Subtraction
        result = num1 - num2;
        System.out.print("\nSubtraction result: " + result);

        // Multiplication
        result = num1 * num2;
        System.out.print("\nMultiplication result: " + result);

        // Division
        result = num1 / num2;
        System.out.print("\nDivision result: " + result);

        // Modulo
        result = num2 % num1;
        System.out.println("\nModulo result: " + result);
    }
}
```

## Unary, Increment, and Decrement Operators

Learned how to use unary, increment, and decrement operators in Java.

Example:
```java
public class UnaryIncrementDecrementOperators {
    public static void main(String[] args) {
        // Unary Operators
        int a =  5;
        int negative = -a;
        System.out.println(negative);

        // Increment Operator (Post Increment)
        int b = a++;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        // a is 6 
        // Increment Operator (Pre Increment)
        System.out.println("\nPre-Increment");
        b = ++a;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        // Decrement Operator (Pre Decrement)
        System.out.println("\nPre-Decrement");
        b = --a;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        // Decrement Operator (Post Decrement)
        System.out.println("\nPost-Decrement");
        b = a--;
        System.out.println("a is " + a);
        System.out.println("b is " + b);
    }
}
```

## Relational Operators

Learned about relational operators and how they are used to compare values.

Example:
```java
public class RelationalOperators {
    public static void main(String[] args) {
        // Relational Operators
        int a = 6;
        int b = 5;
        
        // Equal Operator
        boolean result = (a == b);
        System.out.println(result);

        // Not Equal Operator
        result = (a != b);
        System.out.println(result);

        // Greater than Operator >
        result = (a > b); 
        System.out.println(result);

        // Less than Operator <
        result = (a < b);
        System.out.println(result);

        // Less than or equal Operator <=
        result = (a <= b);
        System.out.println("less than or equal " + result);

        // Greater than or equal Operator >=
        result = (a >= b);
        System.out.println("greater than or equal " + result);
    }
}
```

## Compound Operators

Learned about compound operators and how they simplify arithmetic operations combined with assignment.

Example:
```java
public class CompoundOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        // Addition assignment
        a += 3; // a = a + 3;
        System.out.println("after addition assignment " + a);

        // Subtraction assignment
        a -= 3; // a = a - 3;
        System.out.println("after subtraction assignment " + a);

        // Multiplication assignment
        a *= 3; // a = a * 3;
        System.out.println("after multiplication assignment " + a);

        // Division assignment
        a /= 3; // a = a / 3;
        System.out.println("after division assignment " + a);

        // Modulo assignment
        a %= 3; // a = a % 3;
        System.out.println("after modulo assignment " + a);
    }
}
```

## Conclusion

This sandbox has been an excellent resource for exploring Java programming, particularly in the areas of user input, the Scanner class, and various operators. I look forward to building more complex projects with these foundational skills. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.


