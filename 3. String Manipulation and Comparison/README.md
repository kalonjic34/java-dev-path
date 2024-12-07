# Learning Java: String Manipulation and Comparison

Welcome to my Java learning journey. This repository contains examples and exercises that I've worked on to deepen my understanding of Java programming, focusing on string manipulation and comparison. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [String Creation and Concatenation](#string-creation-and-concatenation)
- [String Length and charAt Method](#string-length-and-charat-method)
- [String Comparison with == (Comparing References)](#string-comparison-with--comparing-references)
- [String Comparison with equals and equalsIgnoreCase](#string-comparison-with-equals-and-equalsignorecase)
- [String Comparison with compareTo (Lexicographically)](#string-comparison-with-compareto-lexicographically)
- [Cutting Strings using substring()](#cutting-strings-using-substring)
- [String Replace, toUpperCase, toLowerCase](#string-replace-touppercase-tolowercase)
- [Conclusion](#conclusion)

## Introduction

This repository documents my journey as I explore various aspects of string manipulation and comparison in Java. Each section provides practical examples and use cases to help solidify my understanding and application of string handling in Java.

## String Creation and Concatenation

Learned how to create and concatenate strings.

Example:
```java
public class StringCreationConcatenation {
    public static void main(String[] args) {
        String morning = "Good Morning";
        System.out.println(morning);

        String night = new String("Good night");
        night = "Good Night";
        System.out.println(night);

        String firstName = "Chris ";
        String lastName = "Kalonji";
        // String concatenation
        String fullName = firstName + lastName;
        int age = 30; 
        String bio = "I am " + fullName + " and I'm " + age + " years old";
        System.out.println(bio);
    }
}
```

## String Length and charAt Method

Learned how to get the length of a string and access specific characters using `charAt`.

Example:
```java
public class StringLengthCharAt {
    public static void main(String[] args) {
        String quote = "May the forth be with you";
        int length = quote.length();
        System.out.println(length);

        // charAt(index) where index is the position of the character within the string
        char firstChar = quote.charAt(0);
        char tenthChar = quote.charAt(9);

        System.out.println("The first character is " + firstChar);
        System.out.println("The tenth character is " + tenthChar);
    }
}
```

## String Comparison with == (Comparing References)

Learned how to compare strings using the `==` operator (compares references).

Example:
```java
public class StringComparisonWithEquals {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        // Comparing references
        System.out.println("Comparing " + str1 + " and " + str2 + " using == " + (str1 == str2));
        System.out.println("Comparing " + str1 + " and " + str3 + " using == " + (str1 == str3));        
    }
}
```

## String Comparison with equals and equalsIgnoreCase

Learned how to compare strings using `equals` and `equalsIgnoreCase`.

Example:
```java
public class StringComparisonEqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("java");

        // Comparing references (memory address)
        System.out.println("Comparing str1 and str2 using == " + (str1 == str2));
        System.out.println("Comparing str1 and str3 using == " + (str1 == str3));
                
        // Comparing the value of variables
        System.out.println("Comparing str1 and str2 using equals() " + str1.equals(str2));        
        System.out.println("Comparing str1 and str3 using equals() " + str1.equals(str3));        
        
        // Comparing the value of variables while ignoring case sensitivity
        System.out.println("Comparing str1 and str2 using equalsIgnoreCase() " + str1.equalsIgnoreCase(str2));        
        System.out.println("Comparing str1 and str3 using equalsIgnoreCase() " + str1.equalsIgnoreCase(str3));        
    }
}
```

## String Comparison with compareTo (Lexicographically)

Learned how to compare strings lexicographically using `compareTo`.

Example:
```java
public class StringComparisonCompareTo {
    public static void main(String[] args) {
        String animal1 = "Bat";
        String animal2 = "Dog";
        String animal3 = "Cat";

        System.out.println("Comparing animal1 to animal2 using compareTo() " + animal1.compareTo(animal2));
        System.out.println("Comparing animal1 to animal3 using compareTo() " + animal1.compareTo(animal3));
        System.out.println("Comparing animal2 to animal1 using compareTo() " + animal2.compareTo(animal1));
    }
}
```

## Cutting Strings using substring()

Learned how to extract substrings from a string using `substring`.

Example:
```java
public class StringSubstring {
    public static void main(String[] args) {
        String phrase = "Programming in Java";
        String word1 = phrase.substring(0, 11);
        String word2 = phrase.substring(15);

        System.out.println("Word 1 is: " + word1);
        System.out.println("Word 2 is: " + word2);
    }
}
```

## String Replace, toUpperCase, toLowerCase

Learned how to replace characters in a string and convert strings to upper or lower case.

Example:
```java
public class StringReplaceCase {
    public static void main(String[] args) {
        String phrase = "The quick brown fox";

        String newPhrase = phrase.replace('o', 'a');
        System.out.println("Modified phrase: " + newPhrase);

        String upperCaseString = phrase.toUpperCase();
        System.out.println("Uppercase phrase: " + upperCaseString);

        String lowerCaseString = phrase.toLowerCase();
        System.out.println("Lowercase phrase: " + lowerCaseString);
    }
}
```

## Conclusion

This sandbox has been an excellent resource for exploring string manipulation and comparison in Java. I look forward to building more complex projects with these foundational skills. If you find this repository helpful, feel free to explore and use these examples as a reference for your own learning.

