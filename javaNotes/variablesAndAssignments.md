# **Variables and Assignments**

## **What is a Variable?**
- A **variable** is a named memory location for storing data.
- You must first declare a variable with its **data type** and then **assign** a value.
   ```
   dataType identifier = value;
   ```

### **Primitive Data Types (8)**
- `int`, `byte`, `short`, `long` (integers)
- `double`, `float` (floating-point numbers)
- `char` (characters)
- `boolean` (true/false)

### **Example**
```
public class VariableAssignmentDemo {
    public static void main(String[] args) {
        int age = 10; // Declaring and initializing

        int num; // Declaration
        num = 8; // Assignment
        num = 9; // Re-assignment

        int a, b, c;
        a = 5; b = 6; c = 7;

        System.out.println(age);
    }
}
```

---

## **Identifiers**
- Names for variables, objects, or methods.
   - Can contain: Letters, digits, underscores (`_`), dollar signs (`$`).
   - **Cannot** start with a digit.
   - **CamelCase** convention: Start with lowercase, capitalize subsequent words.

## **Reserved Keywords**
- Reserved words (e.g., `int`, `class`, `void`) have special meanings and **cannot** be used as identifiers.

---

## **Constant Variables**
- **Constants** are variables whose values never change, declared using the `final` keyword.
   ```
   final double PI = 3.14;
   ```
   - Convention: Uppercase with underscores, e.g., `SALES_TAX`.

### **Example**
```
public class ConstantDemo {
    public static final double PI = 3.14;
    public static final double SALES_TAX = 9.5;

    public static void main(String[] args) {
        System.out.println(PI);
    }
}
```

---

## **Style Guidelines**
- Use **meaningful** and **self-documenting** names for identifiers.
- **Class names** start with an uppercase letter.
- **Variables, objects, and methods** start with lowercase.
- **Constants** use all caps with underscores (`UPPER_CASE`).
- **Whitespace** for readability; indent 2-4 spaces per block of code.

---

## **Data Types**
### **Integers**
- **Integer types**: `byte`, `short`, `int`, `long`
   - **Cannot** hold decimal values.
   - **Integer literals**: Whole numbers in the code, e.g., `42`.

### **Floating-Point Numbers**
- **Types**: `double` (most common), `float` (less precise)
   - **Floating-point literals**: Numbers with a decimal, e.g., `3.14`.

### **Characters**
- **Type**: `char`
   - Represented by **single quotes**, e.g., `'a'`, `'#'`.
   - Internally stored as numbers (ASCII or Unicode).

---

## **Basic Arithmetic Expressions**
- **Operators**:
   - `+` (addition), `-` (subtraction), `*` (multiplication), `/` (division), `%` (modulus).
- **Precedence rules** determine the order of operations.
   - Use **parentheses** for clarity and grouping.

---

## **Math Methods**
- Java's `Math` class provides methods for complex operations.
   - [Math Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html)

---

## **Type Conversion**
- **Implicit conversion**: Automatic type change (e.g., `int` to `double`).
- **Explicit conversion (type casting)**: Force conversion by prefixing with `(type)`.

---

## **Integer Overflow**
- An integer variable has a **min** and **max** value.
- **Overflow** occurs when a value exceeds this range, causing unexpected behavior.

---

# **Strings**
- **String**: A sequence of characters enclosed in double quotes (`"Hello"`).
   - **String class** provides methods to manipulate strings.
   - [String Documentation](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)

---

## **Scanner (Input Handling)**
- **Scanner** (`java.util.Scanner`) is used for reading input.
   - **Methods**: `next()`, `nextLine()`, `nextInt()`, `nextDouble()`, etc.
   - [Scanner Documentation](https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/util/Scanner.html)

### **Example**
```
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = keyboard.next();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("Hi " + name + ", you are " + age + " years old.");
    }
}
```

---

## **Formatted Output with `printf()`**
```
System.out.printf(FormatString, ArgList);
```
- **Specifiers**: `%d` (integer), `%f` (float), `%s` (string)
- Example:
   ```
   System.out.printf("Hello %s, you are %d years old.\n", name, age);
   ```

---

## **Variable Scope**
- A variable’s **scope** is where it can be accessed in the code.
   - Begins at **declaration** and ends at the **closing curly brace**.
   - **Scope issues** occur if a variable is used outside its defined block.

---

## **Debugging & Error Handling**
- **Logical Errors**: Incorrect logic causing unexpected results.
- **Warnings**: Potential issues highlighted during compilation but do not prevent program execution.
