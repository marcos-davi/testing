# Nivel 1 - JUnit 5 Unit Testing & Core Exercises

## Overview
This module introduces automated unit testing in Java using **JUnit 5**, focusing on foundational testing techniques, parameterization, exception handling, and clean code principles.

## Structure & Components

Following the **Single Responsibility Principle (SRP)**, the exercises are divided into independent packages under `level1`:

### 1. Exercise 1: Library Management (`level1.exercise1`)
- **`Library.java`**: Manages a collection of book titles using an `ArrayList`. Provides functionality to:
    - Add books while preventing duplicates and null/empty entries.
    - Retrieve the full list in insertion order.
    - Get a book by its specific index position.
    - Insert a book at a specific position.
    - Remove a book by its title.
    - Return an independent alphabetically sorted copy without altering the original insertion order.
- **`LibraryTest.java`**: JUnit 5 test suite validating instantiation, size constraints, positioning, removal, and sorted copies.

### 2. Exercise 2: Parameterized DNI Calculation (`level1.exercise2`)
- **`CalculoDni.java`**: Computes the official Spanish DNI letter based on the numeric value using the modulo 23 algorithm and validates against negative numbers by throwing an `IllegalArgumentException`.
- **`CalculoDniTest.java`**: Utilizes JUnit 5 `@ParameterizedTest` with `@CsvSource` to validate multiple DNI numbers and their corresponding letters, alongside `@ValueSource` to verify exception handling for negative values.

### 3. Exercise 3: Exception Control (`level1.exercise3`)
- **`ArrayExceptionDemo.java`**: Contains a method that intentionally triggers an `ArrayIndexOutOfBoundsException` by accessing an invalid array index.
- **`ArrayExceptionDemoTest.java`**: Uses `assertThrows` to ensure the expected exception is correctly caught and verified.

## How to Run Tests

Run the test classes individually or execute all tests within the `test/java/nivel1/exercise*` package.