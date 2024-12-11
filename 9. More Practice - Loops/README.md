# Learning Java: More Practice - Loops and Control Keywords

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on loops and control keywords. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [For Loop](#for-loop)
- [Nested For Loop](#nested-for-loop)
- [While Loop](#while-loop)
- [Do-While Loop](#do-while-loop)
- [Break Keyword](#break-keyword)
- [Continue Keyword](#continue-keyword)
- [Coding Exercises](#coding-exercises)
- [Conclusion](#conclusion)

## Introduction
This guide covers the basic concepts of loops and control keywords in Java. Loops are used to execute a block of code repeatedly, and control keywords manage the flow of the program.

## For Loop

### Purpose
Used to execute a block of code a specific number of times when the number of iterations is known beforehand.

### Structure
```java
for (initialization; condition; update) {
    // Executes if the condition is true
}
```

### Example: Printing "Hello World" 100 Times
```java
public class ForLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello World");
        }
    }
}
```

### Key Takeaways
- **Initializes a loop variable**: The loop starts by initializing a variable.
- **Condition is checked before each iteration**: If the condition is true, the loop continues; if false, the loop exits.
- **Updates after each iteration**: The loop variable is updated after each iteration.

---

## Nested For Loop

### Purpose
Allows the execution of a loop inside another loop, enabling the iteration over multi-dimensional data structures or creating complex patterns.

### Structure
```java
for (initialization; condition; update) {
    for (initialization; condition; update) {
        // Executes the inner loop for each iteration of the outer loop
    }
}
```

### Example: 5x5 Multiplication Table
```java
public class NestedForLoops {
    public static void main(String[] args) {
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                int value = row * col;
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
```

### Key Takeaways
- **Inner loop completes all iterations for each iteration of the outer loop**: This can be used for complex data structures or patterns.
- **Useful for creating grids or tables**: Example includes multiplication tables.

---

## While Loop

### Purpose
Used to execute a block of code repeatedly as long as the condition remains true. It's often used when the number of iterations is not known beforehand.

### Structure
```java
while (condition) {
    // Executes if the condition is true
}
```

### Example: User Input Validation
```java
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;

        while (!done) {
            System.out.println("Hello World");
            System.out.print("Are we done? Y/N: ");
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }
            System.out.println();
        }

        scan.close();
    }
}
```

### Key Takeaways
- **Condition is checked before each iteration**: Loop continues as long as the condition is true.
- **Commonly used for input validation**: Repeats until the user provides valid input.

---

## Do-While Loop

### Purpose
Similar to a `while` loop, but guarantees that the block of code is executed at least once before the condition is tested.

### Structure
```java
do {
    // Executes at least once
} while (condition);
```

### Example: User Input Validation
```java
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean done = false;
        do {
            System.out.println("Hello World");
            System.out.print("Are we done? Y/N: ");
            String userInput = scan.nextLine();

            if (userInput.equalsIgnoreCase("Y")) {
                done = true;
            }
            System.out.println();
        }while (!done);

        scan.close();
    }
}
```

### Key Takeaways
- **Executes the block at least once**: The condition is checked after the first iteration.
- **Useful for menu-driven programs**: Ensures the menu is displayed at least once.

---

## Break Keyword

### Purpose
Used to exit the loop prematurely.

### Structure
```java
for (initialization; condition; update) {
    if (condition) {
        break; // Exits the loop
    }
}
```

### Example: Exiting a Loop
```java
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                break; // Break loop at 5
            }
            System.out.println("Counter: " + i);
        }
    }
}
```

### Key Takeaways
- **Exits the loop when a specific condition is met**: Useful for stopping a loop early.

---

## Continue Keyword

### Purpose
Used to skip the current iteration and continue with the next iteration of the loop.

### Structure
```java
for (initialization; condition; update) {
    if (condition) {
        continue; // Skips the current iteration
    }
}
```

### Example: Skipping an Iteration
```java
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip remaining statements in current iteration
            }
            System.out.println("Counter: " + i);
        }
    }
}
```

### Key Takeaways
- **Skips the rest of the code in the current iteration**: Moves on to the next iteration without completing the current one.

---

## Coding Exercises

### Exercise 1: Multiplication Table

#### Purpose
Generate a 10x10 multiplication table using nested for loops.

#### Example: 10x10 Multiplication Table
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int row = 1; row <= 10; row++) {
            for (int col = 1; col <= 10; col++) {
                int value = row * col;
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
```

---

### Exercise 2: Sum of Numbers

#### Purpose
Calculate the sum of all numbers from 1 to 100 using a for loop.

#### Example: Sum of Numbers
```java
public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 100: " + sum);
    }
}
```

---

### Exercise 3: Input Validation

#### Purpose
Keep asking the user to enter a number greater than 10 using a while loop. If the number is less than or equal to 10, ask again.

#### Example: Input Validation
```java
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInput;

        while (true) {
            System.out.print("Enter a number greater than 10: ");
            userInput = scan.nextInt();

            if (userInput >= 10) {
                System.out.println("Thank you. You entered " + userInput + ".");
                break;
            }
            System.out.println("Invalid input. Try again");
        }
        scan.close();
    }
}
```

---

### Exercise 4: Password Prompt

#### Purpose
Prompt the user for a password using a do-while loop. Keep asking until the user enters the correct password.

#### Example: Password Prompt
```java
import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userPassword = "p@ss123";

        do {
            System.out.print("Enter the password: ");
            String inputPassword = scan.nextLine();

            if (inputPassword.equals(userPassword)) {
                System.out.println("Access granted.");
                break;
            }
            System.out.println("Incorrect password. Try again");
        } while (true);

        scan.close();
    }
}
```

---

## Conclusion
Understanding these loop structures and control keywords enables you to efficiently manage repetitive tasks and control the flow of your Java programs. Keep practicing to strengthen your programming skills.
