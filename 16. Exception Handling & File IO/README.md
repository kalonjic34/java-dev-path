# Learning Java: Exception Handling & File I/O

Welcome to my Java learning journey. This repository contains examples that I've worked on to deepen my understanding of Java programming, focusing on Exception Handling and File I/O. Below, you'll find a summary of what I've learned and some of the key concepts I've explored.

## Table of Contents

- [Introduction](#introduction)
- [Exception Handling](#exception-handling)
- [Multiple Catch Statements](#multiple-catch-statements)
- [Finally Block](#finally-block)
- [File Input and Throw](#file-input-and-throw)
- [File Reader](#file-reader)
- [BufferedReader](#bufferedreader)
- [Try with Resources](#try-with-resources)
- [BufferedWriter](#bufferedwriter)
- [Conclusion](#conclusion)

## Introduction

This guide covers the basics of Exception Handling and File I/O in Java. Exception Handling allows the programmer to manage errors and exceptional conditions gracefully, while File I/O is essential for reading from and writing to files.

## Exception Handling

### Purpose
To understand how to handle exceptions using try-catch blocks.

### Structure
```java
public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        String numberString = "love2code";

        try {
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);  
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
```

### Key Takeaways
- **Try-Catch Block**: Use try-catch to handle exceptions.
- **Exception Object**: Catch and handle exceptions using the Exception object.

---

## Multiple Catch Statements

### Purpose
To understand how to handle multiple types of exceptions using multiple catch blocks.

### Structure
```java
public class Main {
    public static void main(String[] args) {
        parseString("abc");
    }

    public static void parseString(String numberString){
        try {
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);  
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("String needs to be a valid int.");
        } catch(Exception e){
            System.out.println(e);
        }
    } 
}
```

### Key Takeaways
- **Multiple Catch Blocks**: Use multiple catch blocks to handle different types of exceptions.
- **Pipe Operator**: Use the pipe operator (|) to catch multiple exceptions in a single catch block.

---

## Finally Block

### Purpose
To understand how to use the finally block for cleanup code.

### Structure
```java
public class Main {
    public static void main(String[] args) {
        parseString("32");
    }

    public static void parseString(String numberString){
        try {
            int numberInt = Integer.parseInt(numberString);
            System.out.println(numberInt);  
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("String needs to be a valid int.");
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println("In the finally block.");
        }
    } 
}
```

### Key Takeaways
- **Finally Block**: Use the finally block to execute code that should run regardless of whether an exception occurs.

---

## File Input and Throw

### Purpose
To understand how to throw exceptions from methods and handle file input.

### Structure
```java
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }  

    public static void readFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("file.txt");
    }
}
```

### Key Takeaways
- **Throwing Exceptions**: Use the `throws` keyword to indicate that a method can throw exceptions.
- **FileReader**: Use FileReader to read from a file.

---

## File Reader

### Purpose
To understand how to read from a file using FileReader.

### Structure
```java
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("story.txt");
            int character;
            while ((character = fileReader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }
}
```

### Key Takeaways
- **Reading Characters**: Use FileReader to read characters from a file.
- **Closing Resources**: Ensure that the file reader is closed in the finally block.

---

## BufferedReader

### Purpose
To understand how to read from a file using BufferedReader.

### Structure
```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("story.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}
```

### Key Takeaways
- **Reading Lines**: Use BufferedReader to read lines from a file.
- **Efficient Reading**: BufferedReader provides more efficient reading of characters, arrays, and lines.

---

## Try with Resources

### Purpose
To understand how to use try-with-resources to manage resources.

### Structure
```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
```

### Key Takeaways
- **Try with Resources**: Use try-with-resources to automatically close resources.

---

## BufferedWriter

### Purpose
To understand how to write to a file using BufferedWriter.

### Structure
```java
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
            writer.write("Hello World!");
            writer.newLine();
            writer.write("This is a simple text file");
        } catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
```

### Key Takeaways
- **Writing to File**: Use BufferedWriter to write text to a file.
- **Automatic Resource Management**: Use try-with-resources for automatic resource management.

---

## Conclusion

Understanding these Exception Handling and File I/O operations in Java enables efficient error management and file operations. By mastering concepts such as try-catch blocks, multiple catch statements, finally blocks, and file reading/writing, you can handle complex programming tasks more effectively.




