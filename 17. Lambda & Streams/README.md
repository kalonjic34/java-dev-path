# Learning Java: Lambda & Streams

Welcome to my Java learning journey. This repository contains examples that I've worked on to deepen my understanding of Java programming, focusing on Lambda Expressions and Streams. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Intro into Lambda](#intro-into-lambda)
- [Create First Lambda](#create-first-lambda)
- [Lambda in Detail](#lambda-in-detail)
- [Lambda Try and Catch](#lambda-try-and-catch)
- [Streams](#streams)
- [Streams in Detail](#streams-in-detail)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of Lambda Expressions and Streams in Java. Lambda Expressions provide a concise way to represent anonymous functions, while Streams allow for functional-style operations on sequences of elements.

## Intro into Lambda

### Purpose
To understand the basics of Lambda expressions and how to use them.

### Structure
```java
import java.util.ArrayList;
import java.util.List;

public class LambdaIntro {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Eric");
        names.add("Melissa");
        names.add("Sam");
        names.add("Milo");

        names.forEach((n) -> System.out.println(n));
    }    
}
```

### Key Takeaways
- **Lambda Expression**: Use lambda expressions to define the method implementation inline.
- **ForEach Method**: Iterate through a collection using the forEach method with a lambda expression.

---

## Create First Lambda

### Purpose
To create and use a basic lambda expression with a functional interface.

### Structure
```java
public class FirstLambda {
    public static void main(String[] args) {
        Greetings lambda = (n) -> System.out.println(n);
        lambda.greetings("Hello Java Developers!");
    }
}

@FunctionalInterface
interface Greetings {
    void greetings(String greeting);
}
```

### Key Takeaways
- **Functional Interface**: Create a functional interface with a single abstract method.
- **Lambda Expression**: Implement the functional interface using a lambda expression.

---

## Lambda in Detail

### Purpose
To understand how to create more detailed lambda expressions and use them with predicates and custom interfaces.

### Structure
```java
import java.util.function.Predicate;

public class LambdaInDetail {
    public static void main(String[] args) {
        StringEndings execlamationMark = (s) -> s + "!";
        System.out.println(execlamationMark.preform("Hello"));
        
        String a  = "Milo";
        String b  = "Tester";

        StringCompare value = (s1, s2) -> {
            if (s1.length() > s2.length()) {
                return s1;
            }
                return s2;
        };

        String longerWord = value.preform(a, b);
        System.out.println(longerWord);

        Predicate<Integer> lessThan100 = i -> (i < 100);
        Predicate<Integer> greaterThan100 = i -> (i > 50);
        
        boolean result = lessThan100.and(greaterThan100).test(101);
        boolean result1 = lessThan100.negate().test(101);
        System.out.println(result);
        System.out.println(result1);
    }
}

@FunctionalInterface
interface StringEndings {
    String preform(String s);
}

@FunctionalInterface
interface StringCompare {
    String preform(String s1, String s2);
}
```

### Key Takeaways
- **Lambda Expressions**: Use lambda expressions to implement custom interfaces.
- **Predicates**: Use predicates to test conditions and combine them using logical operations.

---

## Lambda Try and Catch

### Purpose
To understand how to handle exceptions within lambda expressions.

### Structure
```java
public class LambdaTryCatch {
    public static void main(String[] args) {
        Calculate divide = (a, b) -> {
            try {
                return a / b;
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return -1;
            }
        };

        int solution = divide.preform(10, 2);
        System.out.println(solution);
    }
}

@FunctionalInterface
interface Calculate {
    int preform(int a, int b);
}
```

### Key Takeaways
- **Exception Handling**: Handle exceptions within lambda expressions using try-catch blocks.

---

## Streams

### Purpose
To understand how to use Streams for functional-style operations on sequences of elements.

### Structure
```java
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Eric", "Melissa", "Sam", "Milo", "Alice");
        List<String> result = names.stream()
                .filter(s -> s.length() <= 6)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());
        result.forEach(System.out::println);
    }
}
```

### Key Takeaways
- **Stream Operations**: Use streams to perform filter, map, sort, and collect operations on collections.
- **Method References**: Use method references for concise code.

---

## Streams in Detail

### Purpose
To understand how to use streams with custom objects and perform complex operations.

### Structure
```java
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Eric", 8));
        employees.add(new Employee(2, "Sam", 5));
        employees.add(new Employee(3, "Alice", 12));
        employees.add(new Employee(4, "Melissa", 1));
        employees.add(new Employee(5, "Elijah", 24));
        employees.add(new Employee(6, "Liam", 1));
        employees.add(new Employee(7, "Enrique", 18));
        
        long employeesYearAboveTen = employees.stream()
                    .filter(e -> e.getYearsOfService() > 10).count();
        System.out.println(employeesYearAboveTen);

        List<Employee> namesStartWithE = employees.stream()
                    .filter(e -> e.getFirstName().startsWith("E"))
                    .toList();
        namesStartWithE.forEach(n -> System.out.println(n.getFirstName()));
    }
}

public class Employee {
    private int id;
    private String firstName;
    private int yearsOfService;

    public Employee(int id, String firstName, int yearsOfService) {
        this.id = id;
        this.firstName = firstName;
        this.yearsOfService = yearsOfService;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public int getYearsOfService() {
        return this.yearsOfService;
    }
}
```

### Key Takeaways
- **Custom Objects**: Use streams with custom objects to perform complex operations.
- **Filter and Count**: Use filter to conditionally select elements and count the results.

---

## Conclusion

Understanding these Lambda Expressions and Stream operations in Java enables more concise and functional-style coding. By mastering concepts such as lambda expressions, functional interfaces, predicates, stream operations, and handling exceptions within lambdas, you can handle complex programming tasks more effectively.


