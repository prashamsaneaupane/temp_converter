# Homework — Temperature Converter

## Overview

In this assignment, you will create a Java program that converts temperatures between Celsius and Fahrenheit using your own methods.

This assignment introduces writing and calling your own static methods.

You will practice:

- Declaring variables
- Using `double` data types
- Writing static methods with parameters and return values
- Calling methods from `main`
- Performing arithmetic calculations inside a method
- Formatting output with `System.out.printf()`

---

## Learning Objectives

By completing this assignment, you should be able to:

1. Write a static method that accepts parameters and returns a value.
2. Call a method from `main` and store its returned value in a variable.
3. Perform a calculation inside a method rather than directly in `main`.
4. Reuse logic by breaking a program into smaller methods.
5. Format decimal values when displaying output.

---

## Problem Description

Create a Java program named:

```text
TemperatureConverter.java
```
Your program will ask the user for a temperature and store it in a `double` variable

Your program will then ask the user if to convert it to celsius 
```java
                System.out.print("Convert to Celsius [true/false]: ");
                ctc = kbd.nextBoolean();
                kbd.nextLine();
```
where kbd is my own scanner object, feel free to change it to yours

If the user enters `true` , you will call the static method: 

```java
public static double fahrenheitToCelsius(double fahrenheit)
```

else, you will call the static method:

```java
public static double fahrenheitToCelsius(double fahrenheit)
```


---

## Requirements

### 1. Class Name

Your Java file must be named:

```text
TemperatureConverter.java
```

The class must be named:

```java
TemperatureConverter
```



---

### . Required Methods

You must write the following two static methods, in addition to the main() method:

```java
public static double celsiusToFahrenheit(double celsius)
public static double fahrenheitToCelsius(double fahrenheit)
```

`celsiusToFahrenheit` calculates:

```text
fahrenheit = (celsius * 9 / 5) + 32
```

`fahrenheitToCelsius` calculates:

```text
celsius = (fahrenheit - 32) * 5 / 9
```

DON'T forget to `return` the calculated values!


---


## Required Output

Your program must display the results using the following format:

if the user chooses to convert to celsius:

```text
Temperature Converter
----------------------
98.60 F = 37.00 C
```

otherwise:

```text
Temperature Converter
----------------------
25.00 C = 77.00 F
```


All temperature values must be displayed with exactly **two decimal places**.

---

## Using `printf()`

Use `System.out.printf()` to display the temperature values with two decimal places.

For example:

```java
System.out.printf("%.2f C = %.2f F%n", celsius, convertedFahrenheit);
```

---

## Restrictions

For this assignment:

- Do not use arrays.
- Do not use `ArrayList`.
- Do not use loops.
- Do not create additional classes.
- Do not use external libraries.
- Do not hard-code the converted results — they must be calculated inside your methods.
- Do not perform the conversion calculations directly in `main`. They must happen inside `celsiusToFahrenheit` and `fahrenheitToCelsius`.

The purpose of this assignment is to practice writing and calling your own methods.

---


## How to Compile

Open a terminal in the directory containing `TemperatureConverter.java`.

Compile the program:

```bash
javac TemperatureConverter.java
```

If there are no compilation errors, Java will create:

```text
TemperatureConverter.class
```

---

## How to Run

Run the program using:

```bash
java TemperatureConverter
```

---


## Before You Submit

Make sure that:

- [ ] The file is named exactly `TemperatureConverter.java`.
- [ ] The class is named exactly `TemperatureConverter`.
- [ ] The program contains the required `main` method.
- [ ] The `celsiusToFahrenheit` method is written exactly as specified.
- [ ] The `fahrenheitToCelsius` method is written exactly as specified.
- [ ] The conversion calculations happen inside the methods, not in `main`.
- [ ] All temperature values are displayed with exactly two decimal places.
- [ ] The program compiles without errors.
- [ ] The program produces the required output.

## Submission Reminder

Your final submission should be:

```text
TemperatureConverter.java
```
