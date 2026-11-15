# Nivel 2 - Advanced Java Unit Testing with AssertJ

## Overview
This module explores advanced unit testing assertions using **AssertJ**, focusing on fluent, highly readable, and expressive assertion styles for primitives, objects, collections, maps, exceptions, and `Optional` types in Java.

## Structure & Components

All assertions for this level are contained within the `nivel2` package under `AssertJPracticesTest.java`:

### 1. Basic Assertions & References (Exercises 1 - 3)
- **Integer Equality (`shouldDemonstrateIntegerEqualityAndInequality`)**: Validates numerical equality and inequality using `.isEqualTo()` and `.isNotEqualTo()`.
- **Object References (`shouldDemonstrateObjectReferenceEquality`)**: Evaluates memory reference identity vs. object content equivalence using `.isSameAs()` and `.isNotSameAs()`.
- **Array Equality (`shouldDemonstrateIdenticalIntegerArrays`)**: Compares primitive integer arrays for exact content and structural match.

### 2. Collection & Map Assertions (Exercises 4 & 5)
- **ArrayList Assertions (`shouldPerformArrayListAssertions`)**:
  - Verifies exact element sequence using `.containsSequence()`.
  - Confirms items in any order using `.containsExactlyInAnyOrder()`.
  - Ensures elements appear only once via `.containsOnlyOnce()` and absence via `.doesNotContain()`.
- **Map Assertions (`shouldVerifyMapContainsKey`)**: Checks that a `Map` contains specific expected keys using `.containsKey()`.

### 3. Exceptions & Optionals (Exercises 6 & 7)
- **Exception Handling (`shouldAssertExceptions`)**: Uses `assertThatThrownBy()` combined with `.isInstanceOf()` and `.hasMessageContaining()` to verify that code blocks correctly throw expected exceptions with precise error messages.
- **Optional Values (`shouldAssertOptional`)**: Validates that an `Optional` container holds a value and matches expected content using `.isPresent()` and `.hasValue()`.

## How to Run Tests
1. Open the project in your Java IDE (IntelliJ IDEA, Eclipse, etc.).
2. Ensure AssertJ dependencies (`assertj-core`) are properly configured in your Maven or Gradle build file.
3. Run the `AssertJPracticesTest` suite to execute all level assertions.