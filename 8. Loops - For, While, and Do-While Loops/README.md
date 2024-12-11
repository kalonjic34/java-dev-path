# Learning Java: Loops - For, While, and Do-While Loops

Welcome to my Java learning journey focused on loops. In this repository, I delve into various loop structures in Java and provide examples and exercises to deepen my understanding of how to use loops effectively in programming.

## Table of Contents

- [Introduction](#introduction)
- [While Loop](#while-loop)
- [Do-While Loop](#do-while-loop)
- [For Loop](#for-loop)
- [Enhanced For Loop](#enhanced-for-loop)
- [Loop Control Statements](#loop-control-statements)
- [Nested Loops](#nested-loops)
- [Conclusion](#conclusion)

## Introduction

In Java, loops are used to execute a block of code repeatedly until a certain condition is met. They are essential for automating repetitive tasks and iterating over data structures. Let's explore the different types of loops available in Java.

## While Loop

**Purpose:** Continuously executes a block of code as long as a specified condition is true.

**Structure:**
```java
while (condition) {
    // Code to be executed
}
```

**Example:**
```java
int count = 0;
while (count < 5) {
    System.out.println("Count: " + count);
    count++;
}
```

## Do-While Loop

**Purpose:** Similar to the `while` loop, but guarantees at least one execution of the block.

**Structure:**
```java
do {
    // Code to be executed
} while (condition);
```

**Example:**
```java
int num = 1;
do {
    System.out.println("Number: " + num);
    num++;
} while (num <= 5);
```

## For Loop

**Purpose:** Executes a block of code a specified number of times.

**Structure:**
```java
for (initialization; condition; update) {
    // Code to be executed
}
```

**Example:**
```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}
```

## Enhanced For Loop

**Purpose:** Simplifies iterating over arrays and collections.

**Structure:**
```java
for (element : array) {
    // Code to be executed
}
```

**Example:**
```java
int[] numbers = {1, 2, 3, 4, 5};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

## Loop Control Statements

Java provides `break` and `continue` statements to control loop execution flow.

**Example:**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // Exit the loop when i is 5
    }
    System.out.println("Value of i: " + i);
}
```

You can also use the `continue` statement to skip the current iteration:
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue; // Skip printing when i is 2
    }
    System.out.println("Value of i: " + i);
}
```

## Nested Loops

Nested loops are loops within loops, allowing for more complex iteration patterns.

**Example:**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

## Conclusion

By mastering loop structures in Java, you can efficiently handle repetitive tasks and iterate over data structures with ease. Keep practicing and experimenting with loops to solidify your understanding of this fundamental programming concept.
