# Learning Java: Introduction to Arrays

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on arrays. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Declaring, Initializing, Accessing, and Modifying Arrays](#declaring-initializing-accessing-and-modifying-arrays)
- [Array Length and For Loops](#array-length-and-for-loops)
- [Enhanced For Loop - For Each Loop](#enhanced-for-loop---for-each-loop)
- [Sum, Min, and Max of an Array](#sum-min-and-max-of-an-array)
- [Arrays toString and sort Methods](#arrays-tostring-and-sort-methods)
- [Array binarySearch Method](#array-binarysearch-method)
- [copyOf and By Value vs By Reference](#copyof-and-by-value-vs-by-reference)
- [Arrays fill and equals Methods](#arrays-fill-and-equals-methods)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of arrays in Java. Arrays are used to store multiple values in a single variable, making it easier to manage collections of data.

## Declaring, Initializing, Accessing, and Modifying Arrays

### Purpose
To store multiple values of the same type in a single variable.

### Structure
```java
int[] numbers; // Declaring the array but not taking space
numbers = new int[5]; // Initializing
int[] numbers2 = {1, 2, 3, 4, 5}; // Declaring and initializing
numbers2[0] = 420; // Modifying an array element
int firstNum = numbers2[0]; // Accessing an array element
System.out.println(firstNum); // Output: 420
```

### Key Takeaways
- **Declaring an array**: Specifies the type and name.
- **Initializing an array**: Allocates memory for the array.
- **Accessing elements**: Using the index to get elements.
- **Modifying elements**: Using the index to set elements.

---

## Array Length and For Loops

### Purpose
To iterate through array elements using a loop.

### Structure
```java
int[] numbers = {1, 22, 33, 45, 5, 7};
System.out.println("Array length is: " + numbers.length);
for (int i = 0; i < numbers.length; i++) {
    numbers[i] = numbers[i] * 2;
    System.out.println(numbers[i]);
}
```

### Key Takeaways
- **Array length**: Use `.length` to get the number of elements.
- **For loop**: Iterate through each element using its index.

---

## Enhanced For Loop - For Each Loop

### Purpose
To iterate through array elements without using an index.

### Structure
```java
int[] numbers = {1, 22, 33, 45, 5, 7};
for (int number : numbers) {
    System.out.println(number);
}
```

### Key Takeaways
- **Enhanced for loop**: Simplifies iteration over arrays.
- **Read-only access**: Does not allow modifying elements directly.

---

## Sum, Min, and Max of an Array

### Purpose
To calculate the sum, minimum, and maximum values of an array.

### Structure
```java
int[] numbers = {1, 22, 33, 45, 5, 7, 0};
int sum = 0, max = numbers[0], min = numbers[0];
for (int number : numbers) {
    sum += number;
    if (number > max) max = number;
    if (number < min) min = number;
}
System.out.println("Sum is: " + sum);
System.out.println("Max is: " + max);
System.out.println("Min is: " + min);
```

### Key Takeaways
- **Calculating sum**: Use a loop to add elements.
- **Finding min and max**: Compare each element with current min and max.

---

## Arrays toString and sort Methods

### Purpose
To convert an array to a string and sort its elements.

### Structure
```java
import java.util.Arrays;

int[] nums = {2, 5, 1, 3, 4, 7, 3, 8};
String[] names = {"Frank", "Sam", "Liam"};
System.out.println("Pre sorting " + Arrays.toString(nums));
Arrays.sort(nums);
System.out.println("Post sorting " + Arrays.toString(nums));
Arrays.sort(names);
System.out.println(Arrays.toString(names));
```

### Key Takeaways
- **toString method**: Converts array to a string representation.
- **sort method**: Sorts the array elements in ascending order.

---

## Array binarySearch Method

### Purpose
To find the index of an element in a sorted array.

### Structure
```java
import java.util.Arrays;

int[] nums = {2, 5, 1, 3, 4, 7, 3, 8};
Arrays.sort(nums);
int index = Arrays.binarySearch(nums, 6);
System.out.println("Index of 6 is at " + index);
```

### Key Takeaways
- **binarySearch method**: Finds the index of the specified element in a sorted array.
- **Array must be sorted**: Ensure the array is sorted before performing a binary search.

---

## copyOf and By Value vs By Reference

### Purpose
To copy arrays and understand the difference between value and reference copying.

### Structure
```java
import java.util.Arrays;

int[] nums = {2, 5, 1, 3, 4, 7, 3, 8};
int[] notReallyAbackupOfNums = nums; // by Reference 
int[] backupOfNums = Arrays.copyOf(nums, nums.length); // by Value
int[] lessNums = Arrays.copyOf(nums, 5);

Arrays.sort(nums); // sorts nums array
System.out.println("nums: " + Arrays.toString(nums));
System.out.println("Backup of nums: " + Arrays.toString(backupOfNums));
System.out.println("lessNums: " + Arrays.toString(lessNums));
```

### Key Takeaways
- **copyOf method**: Creates a new array with a copy of the original elements.
- **By reference**: Changes in the original array affect the reference array.
- **By value**: Changes in the original array do not affect the copied array.

---

## Arrays fill and equals Methods

### Purpose
To fill an array with a specific value and compare arrays.

### Structure
```java
import java.util.Arrays;

int[] nums = new int[5];
Arrays.fill(nums, 0, 3, 10);
Arrays.fill(nums, 3, 5, 11);
System.out.println(Arrays.toString(nums));

int[] myNums = {10, 10, 10, 11, 10};
System.out.println(Arrays.equals(nums, myNums));
```

### Key Takeaways
- **fill method**: Sets all elements in the specified range to a specific value.
- **equals method**: Compares two arrays for equality based on their elements.

---

## Conclusion

Understanding these array operations and methods enables efficient management of collections of data in Java. Keep practicing to strengthen your programming skills and explore more advanced array manipulations

