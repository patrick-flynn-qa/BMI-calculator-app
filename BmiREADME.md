# Java BMI Calculator

## Project Overview
This project is a simple command-line Body Mass Index (BMI) Calculator developed in Java as part of my QA Boot Camp training.

The application collects a user's weight in pounds and height in meters, converts the weight into kilograms, calculates BMI, and displays a corresponding weight category.

## Features
- Accepts user weight in pounds.
- Accepts user height in meters.
- Converts pounds to kilograms using a standard conversion factor.
- Calculates BMI using the metric BMI formula.
- Categorizes the calculated BMI into four weight classifications:
  - Underweight
  - Normal
  - Overweight
  - Obese

## BMI Calculation

The application uses the following formulas:

**Pounds to Kilograms:**

```text
Weight in Kilograms = Weight in Pounds × 0.45359237
```

**BMI Calculation:**

```text
BMI = Weight in Kilograms ÷ (Height in Meters × Height in Meters)
```

## BMI Categories
The application uses the following BMI ranges:

| BMI Range | Classification |
|---|---|
| Below 18.5 | Underweight |
| 18.5 – 24.9 | Normal |
| 25.0 – 29.9 | Overweight |
| 30.0 and above | Obese |

## Technologies Used
- Java 25
- Eclipse IDE
- Java Scanner Class for user input

## Java Concepts Practiced
This project demonstrates foundational Java programming concepts, including:

- Variables and data types (`double`)
- User input using the `Scanner` class
- Arithmetic operations and mathematical formulas
- Unit conversion
- Conditional statements (`if`, `else if`, and `else`)
- Comparison operators
- Logical operators (`&&`)
- Resource management using `scanner.close()`

## How to Run
1. Clone or download this repository.
2. Open the project in Eclipse or another Java IDE.
3. Locate the `BmiCalculator.java` file inside the `day3` package.
4. Run the application.
5. Enter your weight in pounds when prompted.
6. Enter your height in meters when prompted.
7. View the calculated BMI and corresponding category in the console.

## Example Usage

**User Input:**
```text
Enter your weight in pounds
180
Enter your height in meters
1.75
```

**Output:**
```text
23.765...
You are Normal
```

## Learning Objectives
The goal of this project was to gain practical experience with Java variables, user input, mathematical calculations, unit conversions, and conditional logic while developing a functional command-line application.

This project represents another hands-on programming exercise completed during QA Boot Camp training.
