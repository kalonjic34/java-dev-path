# Learning Java: Methods and Their Uses

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on methods. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Getting Started with Methods](#getting-started-with-methods)
- [Methods Parameters and Overloading](#methods-parameters-and-overloading)
- [Methods Returning a Value](#methods-returning-a-value)
- [Methods Recursion](#methods-recursion)
- [Coding Exercises](#coding-exercises)
  - [Exercise 1: Greet Multiple People](#exercise-1-greet-multiple-people)
  - [Exercise 2: Temperature Conversion](#exercise-2-temperature-conversion)
  - [Exercise 3: Sum of Numbers Using a Method](#exercise-3-sum-of-numbers-using-a-method)
  - [Exercise 4: Calculate n-th Power](#exercise-4-calculate-n-th-power)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of methods in Java. Methods are reusable blocks of code that perform specific tasks, making it easier to manage and organize code.

## Getting Started with Methods

### Purpose
To understand how to define and call methods.

### Structure
```java
public class MethodDemo {
    public static void main(String[] args) {
        // call the method
        displayGreetings();
    }

    // define the method
    static void displayGreetings(){
        System.out.println("Hello world!");
        System.out.println("Welcome, welcome.");
        System.out.println("Please make yourself at home.");
    }
}
```

### Key Takeaways
- **Defining methods**: Use the `static` keyword and a method name to define a method.
- **Calling methods**: Call the method by using its name followed by parentheses.

---

## Methods Parameters and Overloading

### Purpose
To understand how to pass parameters to methods and how to overload methods.

### Structure
```java
public class MethodDemo {
    public static void main(String[] args) {
        // call the method
        displayGreetings(3);
    }

    static void displayGreetings(int count){
        for (int i = 0; i <= count; i++) {
            displayGreetings();
            System.out.println();
        }
    }

    // define the method
    static void displayGreetings(){
        System.out.println("Hello world!");
        System.out.println("Welcome, welcome.");
        System.out.println("Please make yourself at home.");
    }
}
```

### Key Takeaways
- **Parameters**: Pass values to methods using parameters.
- **Method overloading**: Define multiple methods with the same name but different parameters.

---

## Methods Returning a Value

### Purpose
To understand how to define methods that return a value.

### Structure
```java
public class MethodReturnDataDemo {
    public static void main(String[] args) {
        int value = 5;
        int output = summation(value);
        System.out.println("The summation of " + value + ": " + output);
    }

    static int summation(int num){
        return num * (num + 1) / 2;
    }
}
```

### Key Takeaways
- **Return values**: Use the `return` keyword to return a value from a method.
- **Calling methods with return values**: Store the returned value in a variable.

---

## Methods Recursion

### Purpose
To understand how to define and use recursive methods.

### Structure
```java
public class RecursionDemo {
    public static void main(String[] args) {
        int value = 5;
        int output = factorial(value);
        System.out.println("Factorial of " + value + ": " + output);
    }

    // define method
    static int factorial(int num){
        // base case: 0! = 1
        if (num == 0) {
            return 1;
        } else {
            // recursive case: num! = num * (num - 1)!
            return num * factorial(num - 1);
        }
    }
}
```

### Key Takeaways
- **Recursion**: A method that calls itself to solve a problem.
- **Base case**: The condition that stops the recursion.
- **Recursive case**: The part of the method that calls itself with modified parameters.

---

## Coding Exercises

### Exercise 1: Greet Multiple People

#### Purpose
To write a method that prints a personalized greeting for multiple people.

#### Structure
```java
public class GreetPerson {
    public static void main(String[] args) {
        greetPerson("Alice");
        greetPerson("Sam");
        greetPerson("Liam");
    }

    static void greetPerson(String name){
        System.out.println("Hello, " + name + "!");
    }
}
```

### Key Takeaways
- **Personalized greetings**: Use a parameter to customize the greeting message.
- **Calling the method**: Call the method multiple times with different values.

---

### Exercise 2: Temperature Conversion

#### Purpose
To write two overloaded methods to convert temperatures between Celsius and Fahrenheit.

#### Structure
```java
import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scan.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scan.nextDouble();
            double fahrenheit = convertTemperature(celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scan.nextDouble();
            double celsius = convertTemperature(fahrenheit, true);
            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
        } else {
            System.out.println("Invalid choice.");
        }

        scan.close();
    }

    static double convertTemperature(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double convertTemperature(double fahrenheit, boolean isFahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
```

### Key Takeaways
- **Method overloading**: Define multiple methods with the same name but different parameters.
- **Temperature conversion**: Use formulas to convert temperatures between Celsius and Fahrenheit.

---

### Exercise 3: Sum of Numbers Using a Method

#### Purpose
To write a method that calculates the sum of two numbers.

#### Structure
```java
import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number: ");
        int num2 = scan.nextInt();
        int output = findSum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + ": " + output);
        scan.close();
    }

    static int findSum(int num1, int num2){
        int result = num1 + num2;
        return result;
    }
}
```

### Key Takeaways
- **Parameters**: Pass multiple values to a method.
- **Return values**: Return the sum of the parameters from the method.

---

### Exercise 4: Calculate n-th Power

#### Purpose
To write a method that calculates the power of a number using recursion.

#### Structure
```java
import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = scan.nextInt();
        System.out.print("Enter exponent: ");
        int exponent = scan.nextInt();
        System.out.println("Result: " + power(base, exponent));
        scan.close();
    }

    static int power(int base, int exponent){
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}
```

### Key Takeaways
- **Recursion**: Use recursion to solve problems involving repeated multiplication.
- **Base case**: Return 1 when the exponent is 0.
- **Recursive case**: Multiply the base by the result of the recursive call with a decremented exponent.

---

## Conclusion

Understanding these method operations and concepts enables efficient management of code in Java. By mastering fundamental method concepts such as defining, calling, overloading, returning values, and using recursion, you can write more modular and reusable code.

