

/**
 * Basic Java Concepts and Examples
 *
 * This file contains fundamental Java programming concepts with examples.
 * It covers data types, operators, control structures, loops, and basic I/O.
 *
 * Author: [Your Name]
 * Date: January 17, 2026
 */

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        System.out.println("=== Java Basics Tutorial ===\n");

        // 1. Hello World and Basic Operations
        helloWorldExample();

        // 2. Data Types
        dataTypesExample();

        // 3. Type Conversion and Casting
        typeConversionExample();

        // 4. Operators
        operatorsExample();

        // 5. Control Structures
        controlStructuresExample();

        // 6. Loops
        loopsExample();

        // 7. Arrays (Basic)
        arraysExample();

        // 8. User Input
        userInputExample();
    }

    /**
     * 1. Hello World and Basic Arithmetic Operations
     */
    public static void helloWorldExample() {
        System.out.println("1. Hello World and Basic Operations:");
        System.out.println("Hello, World!");

        int a = 10;
        int b = 30;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        double div = (double) a / b; // Type casting for decimal division

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Sum: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + String.format("%.2f", div));
        System.out.println();
    }

    /**
     * 2. Data Types in Java
     *
     * Primitive Data Types:
     * - byte: 1 byte, range: -128 to 127
     * - short: 2 bytes, range: -32,768 to 32,767
     * - int: 4 bytes, range: -2,147,483,648 to 2,147,483,647
     * - long: 8 bytes, range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     * - float: 4 bytes, for decimal numbers
     * - double: 8 bytes, for decimal numbers (more precise)
     * - char: 2 bytes, for single characters
     * - boolean: 1 byte, true or false
     *
     * Non-Primitive Data Types:
     * - String, Arrays, Classes, Interfaces, etc.
     */
    public static void dataTypesExample() {
        System.out.println("2. Data Types:");

        // Primitive data types
        byte byteVar = 100;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 1000000000L;
        float floatVar = 3.14f;
        double doubleVar = 3.141592653589793;
        char charVar = 'A';
        boolean boolVar = true;

        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);

        // Non-primitive
        String stringVar = "Hello Java!";
        System.out.println("String: " + stringVar);
        System.out.println();
    }

    /**
     * 3. Type Conversion and Casting
     *
     * Type Conversion (Widening/Implicit): Smaller to larger data types
     * byte -> short -> int -> long -> float -> double
     *
     * Type Casting (Narrowing/Explicit): Larger to smaller data types
     * Requires explicit casting: (targetType) value
     */
    public static void typeConversionExample() {
        System.out.println("3. Type Conversion and Casting:");

        // Implicit conversion (widening)
        int intNum = 100;
        long longNum = intNum; // int to long
        float floatNum = intNum; // int to float
        double doubleNum = intNum; // int to double

        System.out.println("Implicit Conversion:");
        System.out.println("int to long: " + longNum);
        System.out.println("int to float: " + floatNum);
        System.out.println("int to double: " + doubleNum);

        // Explicit casting (narrowing)
        double pi = 3.14159;
        float piFloat = (float) pi; // double to float
        int piInt = (int) pi; // double to int (loses decimal part)

        System.out.println("Explicit Casting:");
        System.out.println("double to float: " + piFloat);
        System.out.println("double to int: " + piInt + " (decimal part lost)");
        System.out.println();
    }

    /**
     * 4. Operators in Java
     *
     * Arithmetic: +, -, *, /, %
     * Relational: ==, !=, >, <, >=, <=
     * Logical: &&, ||, !
     * Assignment: =, +=, -=, *=, /=, %=
     * Unary: ++, --
     */
    public static void operatorsExample() {
        System.out.println("4. Operators:");

        int a = 10, b = 3;

        // Arithmetic operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment operators
        System.out.println("Assignment Operators:");
        int c = 5;
        System.out.println("c = " + c);
        c += 3; // c = c + 3
        System.out.println("c += 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);

        // Unary operators
        System.out.println("Unary Operators:");
        int d = 5;
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("d after post-increment = " + d);
        System.out.println("--d = " + (--d)); // Pre-decrement
        System.out.println();
    }

    /**
     * 5. Control Structures
     *
     * if-else, switch-case statements
     */
    public static void controlStructuresExample() {
        System.out.println("5. Control Structures:");

        int age = 20;

        // if-else
        System.out.println("if-else Example:");
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // if-else if-else
        System.out.println("if-else if-else Example:");
        if (age >= 18) {
            System.out.println("Adult: You can drive and vote.");
        } else if (age >= 13) {
            System.out.println("Teenager.");
        } else {
            System.out.println("Child.");
        }

        // switch-case
        System.out.println("switch-case Example:");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        System.out.println();
    }

    /**
     * 6. Loops
     *
     * while, do-while, for loops
     */
    public static void loopsExample() {
        System.out.println("6. Loops:");

        // while loop
        System.out.println("while loop (print numbers 1 to 5):");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // do-while loop
        System.out.println("do-while loop (print numbers 1 to 5):");
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        // for loop
        System.out.println("for loop (print numbers 1 to 5):");
        for (int j = 1; j <= 5; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        // Enhanced for loop (for-each)
        System.out.println("Enhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }

    /**
     * 7. Arrays (Basic)
     *
     * Arrays are fixed-size, homogeneous data structures
     */
    public static void arraysExample() {
        System.out.println("7. Arrays:");

        // Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};

        // Print array elements
        System.out.println("Array elements:");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        // Array operations
        System.out.println("Array length: " + arr.length);
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[arr.length - 1]);

        // Sum of array elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
        System.out.println();
    }

    /**
     * 8. User Input
     *
     * Using Scanner class for input
     */
    public static void userInputExample() {
        System.out.println("8. User Input:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your height (in cm): ");
        double height = scanner.nextDouble();

        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your height is " + height + " cm.");

        scanner.close();
        System.out.println();
    }
}







