# Learning Java: More Practice - Conditionals

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on conditionals. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [If-Else Statement](#if-else-statement)
- [If-Else with Compounds and Nested If](#if-else-with-compounds-and-nested-if)
- [If-Else If](#if-else-if)
- [Ternary Operator](#ternary-operator)
- [Comparing Strings](#comparing-strings)
- [Switch Statement](#switch-statement)
- [Modern Switch Statement](#modern-switch-statement)
- [Enums and Switch Statement](#enums-and-switch-statement)
- [Coding Exercises](#coding-exercises)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various aspects of conditionals in Java. Each section provides practical examples and use cases to help solidify my understanding and application of these concepts in Java programming.



## **1. If-Else Statements**
- **Purpose**: Used to execute a block of code based on a condition.
- **Structure**:
  ```
  if (condition) {
      // Executes if the condition is true
  } else {
      // Executes if the condition is false
  }
  ```

### Example: Voting Eligibility
```
if (age >= minVotingAge) {
    System.out.println("You are eligible to vote.");
} else {
    System.out.println("You are NOT eligible to vote.");
}
```

### Key Takeaways:
- Conditions are evaluated as boolean expressions.
- The `if` block executes if the condition is `true`.
- The `else` block executes if the condition is `false`.

---

## **2. If-Else with Compounds and Nested If**
- **Purpose**: Combine multiple conditions or nest one `if` statement inside another.
- **Logical Operators**:
  - `&&` (AND): Both conditions must be `true`.
  - `||` (OR): At least one condition must be `true`.
  - `!` (NOT): Reverses the boolean value.

### Example: Class Count and Even/Odd Check
```
if (userCount >= minClassCount && userCount <= maxClassCount) {
    System.out.println("Your class is in the recommended range.");
    if (userCount % 2 == 0) {
        System.out.println("You have an even number of classes.");
    } else {
        System.out.println("You have an odd number of classes.");
    }
} else {
    System.out.println("Your class count is outside the recommended range.");
}
```

### Key Takeaways:
- Use `&&` and `||` for combining conditions.
- Nested `if` statements allow more granular checks.

---

## **3. If-Else If**
- **Purpose**: Check multiple conditions sequentially.
- **Structure**:
  ```
  if (condition1) {
      // Executes if condition1 is true
  } else if (condition2) {
      // Executes if condition2 is true
  } else {
      // Executes if none of the above conditions are true
  }
  ```

### Example: Exam Scoring
```
if (scoreOnExam >= firstTierScoreMin) {
    System.out.println("You scored in the first tier.");
} else if (scoreOnExam >= secondTierScoreMin) {
    System.out.println("You scored in the second tier.");
} else {
    System.out.println("Low grade. You did not score in the top tiers.");
}
```

### Key Takeaways:
- Conditions are checked in order.
- Only the first `true` condition block executes.
- Always include a final `else` for unhandled cases.

---

## **4. Ternary Operator**
- **Purpose**: A shorthand for simple `if-else` statements.
- **Structure**:
  ```
  variable = (condition) ? valueIfTrue : valueIfFalse;
  ```

### Example: Voting Eligibility
```
String message = (age >= minVotingAge) ? "You are eligible to vote." : "You are not eligible to vote.";
System.out.println(message);
```

### Key Takeaways:
- Reduces code but can be harder to read with complex conditions.
- Use for simple, concise conditional assignments.

---

## **5. Comparing Strings**
- **Purpose**: Compare strings for equality.
- **Methods**:
  - `==`: Compares memory addresses (not recommended for strings).
  - `.equals()`: Compares string contents.
  - `.equalsIgnoreCase()`: Compares string contents ignoring case.

### Example: Comparing Strings
```
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1 == s2); // Compares memory (true for literals)
System.out.println(s1.equals(s2)); // Compares content (true)

String s3 = new String("Hello");
System.out.println(s1 == s3); // Compares memory (false)
System.out.println(s1.equals(s3)); // Compares content (true)
```

### Key Takeaways:
- Always use `.equals()` or `.equalsIgnoreCase()` for comparing string values.
- `==` should not be used for comparing string contents.

---

## **6. Switch Statements**
- **Purpose**: Simplifies checking a variable against multiple values.
- **Structure**:
  ```
  switch (variable) {
      case value1:
          // Executes if variable == value1
          break;
      case value2:
          // Executes if variable == value2
          break;
      default:
          // Executes if no cases match
          break;
  }
  ```

### Example: Computer Type Description
```
switch (computerType) {
    case "smartphone":
        System.out.println("Smartphones offer computing power in your hand.");
        break;
    case "tablet":
        System.out.println("Tablets are lightweight for browsing and light tasks.");
        break;
    case "laptop":
        System.out.println("Laptops are portable for work on the go.");
        break;
    case "desktop":
        System.out.println("Desktops excel in gaming and work-related tasks.");
        break;
    default:
        System.out.println("Unknown computer type.");
        break;
}
```

### Key Takeaways:
- A `break` statement prevents fall-through to the next case.
- The `default` case handles unmatched values.

---

## **7. Modern Switch Statements**
- **Purpose**: A more concise and readable switch syntax.
- **Structure**:
  ```
  switch (variable) {
      case value1 -> System.out.println("Action for value1");
      case value2 -> System.out.println("Action for value2");
      default -> System.out.println("Default action");
  }
  ```

### Example: Modern Switch
```
String description = switch (computerType) {
    case "smartphone" -> "Smartphones offer computing power in your hand.";
    case "tablet" -> "Tablets are lightweight for browsing and light tasks.";
    case "laptop" -> "Laptops are portable for work on the go.";
    case "desktop" -> "Desktops excel in gaming and work-related tasks.";
    default -> "Unknown computer type.";
};
System.out.println(description);
```

### Key Takeaways:
- Use `->` for cleaner syntax.
- Switch expressions can directly return values.

---

## **8. Enums and Switch Statements**
- **Purpose**: Use enums for predefined constant values with switches.
- **Structure**:
  ```
  public enum EnumName {
      VALUE1, VALUE2, VALUE3
  }
  ```

### Example: Enum-Based Switch
```
public enum ComputerType {
    SMARTPHONE, TABLET, LAPTOP, DESKTOP
}
String description = switch (myComputerType) {
    case SMARTPHONE -> "Smartphones offer computing power in your hand.";
    case TABLET -> "Tablets are lightweight for browsing and light tasks.";
    case LAPTOP -> "Laptops are portable for work on the go.";
    case DESKTOP -> "Desktops excel in gaming and work-related tasks.";
};
System.out.println(description);
```

### Key Takeaways:
- Enums provide type safety and readability.
- Enum constants are used directly in switch cases.

---

## **9. Coding Exercises**

### **1. Movie Ticket Price**
- Conditions:
  - Below 13: $8
  - 13–59: $12
  - 60+: $6

```
import java.util.Scanner;

public class MovieTicketPrice {
    // Exercise 1: Movie Ticket Price
    // Write a program that calculates the price of a movie ticket based on the person's age.

    // If the person is below 13, the ticket costs $8.
    // If the person is between 13 and 59 (inclusive), the ticket costs $12.
    // If the person is 60 or older, the ticket costs $6.
    // Requirements:

    // Use if-else statements to determine the ticket price.
    // Print the final ticket price.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        if (age < 13) {
            System.out.println("The tickets cost $8.");
        } else if(age >= 13 && age <= 59){
            System.out.println("The ticket costs $12.");
        }else if (age>=60){
            System.out.println("The ticket costs $6.");
        }
        scan.close();
    }
}
```

---

### **2. Library Membership**
- Free membership if:
  - Age < 18 OR books borrowed > 10.

```
import java.util.Scanner;

public class LibraryMembership {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        System.out.print("Enter number of books borrowed: ");
        int booksBorrowed = scan.nextInt();

        if (age < 18 && booksBorrowed > 10) {
            System.out.println("You qualify for a free membership.");
        } else{
            System.out.println("You don't qualify for a free membership.");
        }
        scan.close();
    }
}
```

---

### **3. Simple Calculator**
- Perform basic arithmetic using a switch.

```
import java.util.Scanner;

public class SimpleCalculator {

    // Exercise 3: Calculator with Switch
    // Write a program that acts as a simple calculator. It takes two numbers and a mathematical operator (+, -, *, /) and performs the operation.

    // Requirements:

    // Use a switch statement to handle the operations.
    // Handle invalid operators with the default case.
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int firstNumber = scan.nextInt();

        System.out.print("Enter a second number: ");
        int secondNumber = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter operator (+, -, /, *): ");
        String operator = scan.nextLine();

        switch (operator) {
            case "+":
                System.out.print("Results: ");
                System.out.print(firstNumber + secondNumber);
                break;
            case "-":
                System.out.print("Results: ");
                System.out.print(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println("Results: "+firstNumber / secondNumber);
                break;
            case "*":
                System.out.println("Results: "+firstNumber * secondNumber);
                break;
            default:
                System.out.println("Wrong operator!");
                break;
        }
        scan.close();
    }
}
```
---

### **4. Fruit Selector**
- Switch-based description of fruits.

```
import java.util.Scanner;

public class FruitSelector {

    // Exercise 4: Fruit Selector
    // Write a program that takes the name of a fruit and prints a description of it using a switch statement.

    // Requirements:

    // Use a switch statement to evaluate the fruit name.
    // Add cases for "apple", "banana", "orange", and "grape".
    // Include a default case for unknown fruits.
    // Descriptions:

    // "apple": "Apples are red or green and delicious."
    // "banana": "Bananas are yellow and great for energy."
    // "orange": "Oranges are a good source of Vitamin C."
    // "grape": "Grapes are small, round, and juicy."
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a fruit: ");

        String pickFruit = scan.nextLine();
        pickFruit = pickFruit.toLowerCase();

        switch (pickFruit) {
            case "apple" -> System.out.println("Apples are red or green and delicious.");
            case "banana" -> System.out.println("Bananas are yellow and great for energy.");
            case "orange" -> System.out.println("Oranges are a good source of Vitamin C.");
            case "grape" -> System.out.println("Grapes are small, round, and juicy.");
            default -> System.out.println("That's not a fruit");
        }
        scan.close();
    }
}
```

---

## Conclusion
This sandbox has been an excellent resource for exploring conditionals in Java, particularly in the areas of if-else statements, ternary operators, string comparisons, switch statements, and enums. These fundamental skills are essential for making decisions in your programs and building more complex logic. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.