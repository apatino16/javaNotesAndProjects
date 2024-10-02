# **Methods in Java**

## **Method Basics**
A **method** in Java is a reusable block of code that performs a specific task. Methods help organize code, make it more readable, and allow for code reuse.

### **Reasons for Creating Methods**
- **Improve readability**: Methods modularize your code, reducing clutter and improving readability.
- **Abstraction**: You can focus on what a method does without knowing its inner workings.
- **Reusability**: Avoid duplicating code by calling the same method multiple times across your program.
- **Encapsulation**: Encapsulate the behavior of a class into smaller parts.

### **Defining a Method**
A method is defined by a **method header** and a **method body**. The header specifies access modifiers, the return type, the method name, and parameters (if any). The body contains the code that the method executes.

```java
// Example of a simple method
public class Example {
    public static void sayHello() { // Method header
        System.out.println("Hello, World!"); // Method body
    }
}
```
In this example, `sayHello()` is a method that prints "Hello, World!" to the console.

### **Calling a Method**
To execute the code in a method, you "call" or "invoke" it:
```java
Example.sayHello(); // Calls the sayHello method
```

---

## **Method Modifiers**
**Modifiers** control the access level and behavior of a method.

### **Access Modifiers**
- **`public`**: The method can be called from any other class.
- **`private`**: The method can only be called within its own class.
- **`protected`**: The method can be accessed within its own package and subclasses.

### **Other Modifiers**
- **`static`**: The method belongs to the class, not an instance (object). This allows calling the method without creating an object of the class.
    ```java
    public static void printInfo() {
        System.out.println("This is a static method.");
    }
    ```
- **`final`**: The method cannot be overridden in any subclasses.

---

## **Method Parameters and Arguments**
### **Parameters** (Formal Parameters)
- Parameters are **variables** declared in the method definition, allowing you to pass data into the method.
   ```java
   public static void greet(String name) { 
       System.out.println("Hello, " + name);
   }
   ```

### **Arguments** (Actual Parameters)
- **Arguments** are the values passed to a method when you call it.
   ```java
   greet("Alice"); // Outputs: Hello, Alice
   ```

- **Multiple Parameters**:
   ```java
   public static int sum(int a, int b) { 
       return a + b; 
   }
   sum(3, 5); // Outputs: 8
   ```

---

## **Void vs. Value-Returning Methods**
### **Void Methods**
- A **void** method **does not return a value**. It performs a task and terminates.
   ```java
   public static void printHello() {
       System.out.println("Hello");
   }
   printHello(); // Outputs: Hello
   ```

### **Value-Returning Methods**
- A value-returning method performs a task and **returns a result**.
   ```java
   public static int multiply(int x, int y) {
       return x * y;
   }
   int result = multiply(4, 5); // result is 20
   ```

---

## **Return Statements**
The **`return` statement** is used to return a value from a method. The return type must match the declared type in the method header.

```java
public static double findAverage(int a, int b) {
    return (a + b) / 2.0;
}
double average = findAverage(10, 20); // average is 15.0
```

- **`void` methods do not need a return statement** unless used to exit the method early:
   ```java
   public static void checkNumber(int num) {
       if (num < 0) {
           return; // Exit early if number is negative
       }
       System.out.println("Number is non-negative");
   }
   ```

---

## **Passing Variables and Objects to Methods**
- **Pass by Value**: Java passes **primitive data types** by value, meaning a copy of the variable is passed, and changes do not affect the original.
    ```java
    public static void changeNumber(int num) {
        num = 10;
    }
    int original = 5;
    changeNumber(original); // original remains 5
    ```

- **Pass by Reference**: Objects, such as arrays or instances of classes, are passed by reference, so changes inside the method affect the original object.
    ```java
    public static void updateArray(int[] arr) {
        arr[0] = 99;
    }
    int[] numbers = {1, 2, 3};
    updateArray(numbers); // numbers[0] is now 99
    ```

---

## **Useful Array Methods**
Common operations on arrays include:
- **Finding the Maximum Value**:
   ```
   public static int findMax(int[] arr) {
       int max = arr[0];
       for (int num : arr) {
           if (num > max) max = num;
       }
       return max;
   }
   ```

- **Finding the Minimum Value**:
   ```
   public static int findMin(int[] arr) {
       int min = arr[0];
       for (int num : arr) {
           if (num < min) min = num;
       }
       return min;
   }
   ```

- **Calculating the Sum of All Elements**:
   ```
   public static int sumArray(int[] arr) {
       int sum = 0;
       for (int num : arr) {
           sum += num;
       }
       return sum;
   }
   ```

- **Calculating the Average**:
   ```
   public static double averageArray(int[] arr) {
       int total = 0;
       for (int num : arr){
         total += num;
       }
       return (double) total / arr.length;
   }
   ```

---

## **Passing and Returning Arrays to/from Methods**
- **Passing an Array**: You can pass an entire array to a method.
   ```
   public static void printArray(int[] arr) {
       for (int num : arr) {
           System.out.print(num + " ");
       }
   }
   ```

- **Returning an Array**: A method can return an array.
   ```
   public static int[] createArray() {
       return new int[]{1, 2, 3};
   }
   ```

---

## **Method Overloading**
**Method overloading** allows multiple methods with the same name but different parameter lists within the same class.

```
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}

add(5, 10);    // Calls int version
add(5.5, 10.5); // Calls double version
```

- **Overloading is determined by the parameter list, not the return type**.

---

## **Javadoc Comments for Java API Documentation**
Javadoc comments start with `/**` and end with `*/`. They describe classes, methods, and their parameters/return values.

```
/**
 * Calculates the area of a circle.
 * @param radius The radius of the circle
 * @return The area of the circle
 */
public static double calculateArea(double radius) {
    return Math.PI * radius * radius;
}
```

- **Annotations** (`@param`, `@return`, etc.) help describe parameters, return types, exceptions thrown, and more.

```
@param to describe a method parameter 
@return to describe  method return type
```

- **Generating Javadoc**: Use the `javadoc` tool to create HTML documentation.
   ```
   javadoc -d destination ProgramName.java
   ```
---
## **Unit Testing Methods**

**Unit Testing** is a fundamental practice in software development that involves testing individual units or components of a program to ensure they behave correctly. A **unit** is typically the smallest testable part of an application, such as a method or function.

### Why Test in Units?
- **Early Bug Detection**: By testing parts of a program individually, bugs can be found and fixed early, preventing larger issues when the whole program is integrated.
- **Simplifies Debugging**: Testing each method independently helps isolate where issues occur, as opposed to searching through an entire program.

### **Creating a Testbench (Test Harness)**
A **testbench**, also known as a **test harness**, is a **separate program** designed specifically to test a method or a small set of related methods. The goal of a testbench is to **verify the correctness** of the method by passing in different inputs and checking if the outputs are as expected.

Each set of inputs to the testbench is called a **test vector**. A good set of test vectors should cover:
- **Typical inputs**: Common values that a user would normally input.
- **Border cases**: Uncommon or extreme values, such as `0`, very large or small values, or negative numbers. Border cases help ensure that the method handles all potential scenarios.

### **Using `assert` for Testing**
In Java, you can use the `assert` statement to test if a certain expression is true. If the expression evaluates to `false`, `assert` will print an error message and halt the program. It has the form:

```
assert testExpression : detailedMessage;
```

- **`testExpression`**: A Boolean expression that is tested for `true` or `false`.
- **`detailedMessage`**: A message that is displayed if `testExpression` evaluates to `false`. It helps describe the error.

Example:

```
int result = addNumbers(2, 3);
assert result == 5 : "Error: Expected 5 but got " + result;
```

If `result` is not `5`, this `assert` statement will output something like:
```
Exception in thread "main" java.lang.AssertionError: Error: Expected 5 but got X
```

### **Enabling Assertions in Java**
By default, **assertions** are disabled in Java. To enable them, you need to add the `-ea` (enable assertions) flag when running your program.

```
java -ea TestHarness
```

Without enabling assertions, the `assert` statements will not execute, and any errors they would catch will not be reported.

### **Example Test Harness Using Assertions**

Suppose we have a method `multiplyByTwo()` that doubles its input:
```
public static int multiplyByTwo(int x) {
    return x * 2;
}
```

We can create a test harness to check if this method behaves correctly:

```java
public class TestHarness {
    public static void main(String[] args) {
        System.out.println("Testing started");

        // Test typical inputs
        assert multiplyByTwo(2) == 4 : "Error: 2 * 2 should be 4";
        assert multiplyByTwo(0) == 0 : "Error: 0 * 2 should be 0";

        // Test border case (negative number)
        assert multiplyByTwo(-3) == -6 : "Error: -3 * 2 should be -6";

        System.out.println("Testing completed");
    }

    public static int multiplyByTwo(int x) {
        return x * 2;
    }
}
```
### **Interpreting the Output**
- If all `assert` expressions evaluate to `true`, the program will output:
  ```
  Testing started
  Testing completed
  ```
- If any `assert` expression evaluates to `false`, it will throw an `AssertionError` with the specified detailed message, and the program will halt.

### **Benefits of Using Assertions**
- **Compact & Readable Testing**: Assertions allow for short and readable test code.
- **Immediate Error Identification**: When an assertion fails, it quickly identifies the issue by providing a message and line number.
- **Border Case Testing**: Encourages the practice of including edge or border cases to test the robustness of methods.






