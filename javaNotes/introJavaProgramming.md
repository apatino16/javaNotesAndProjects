# **Introduction to Java Programming**

## **What is Programming?**
- **Programming** is the process of creating software—a set of instructions that tell a computer what to do.
- A **programmer** is someone who creates these instructions.

## **Why Java?**
- **Java** is one of the most widely-used programming languages, with over 3 billion devices running Java, including PCs, Android devices, and servers.
- **Key Characteristics**: Fast, secure, and reliable.

---

# **Basic Java Output**

## **"Hello, World!" Program**
- The most basic program to write in Java is one that prints "Hello, World!" to the screen. It's used to:
  - Verify the development environment setup.
  - Ensure you can compile and run Java programs.
  - Confirm you can view program results.

### **Java Example Code** 
```
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // Prints "Hello World" with a newline
        System.out.print("Hello World");   // Prints "Hello World" without a newline
    }
}
```

> **Note:** A **String literal** is any text surrounded by double quotes, e.g., `"Hello World"`.

---

## **Comments in Java**
- Comments are for human readability and are ignored by the compiler:
  - `// Single-line comment`
  - `/* Block comment spanning multiple lines */`
  - `/** Javadoc comment to generate API documentation */`

---

## **Whitespace**
- **Whitespace** includes spaces, tabs, and blank lines, improving code readability. The compiler ignores most whitespace.

---

## **Logical Errors & Warnings**
- **Logical Errors**: These occur when your program runs but produces unintended results. E.g., concatenating numbers as strings instead of adding them.
- **Compiler Warnings**: Warnings indicate potential issues but won't stop compilation. E.g., unused variables or open file resources.

---

# **History of Computer Programming**

- **Bit & Byte**: 
  - A **bit** is a binary digit (`0` or `1`).
  - A **byte** consists of 8 bits.

- **Evolution of Programming Languages**:
  - **1940s**: Machine instructions are executed directly.
  - **Assembly Language**: Human-readable instructions translated into machine instructions.
  - **1950s**: Development of high-level languages (e.g., **FORTRAN**, **COBOL**).
  - **Compilers**: Translate high-level programs into executable code.
  - **Java**: Created to be **platform-independent**—compiled once and run anywhere using the **JVM** (Java Virtual Machine).

---

# **History of Java**

- **1978**: **C** invented by **Brian Kernighan** and **Dennis Ritchie**.
- **1985**: **C++** adds object-oriented features to C.
- **1991**: **Java** created by **James Gosling** at **Sun Microsystems** (now Oracle).
- **1995**: Public release of Java, emphasizing "write once, run anywhere."

---

# **Computer Hardware Overview**

- **Processor or Central Processing Unit (CPU)**: Executes instructions and manages program operations.
  -- When you turn your computer on, a program called the BIOS (basic input/output system) sets up the computer’s basic hardware. The processor then executes another program called the operating system (OS), which allows users to concurrently run programs that interface with the computer's hardware.
  --  The CPU performs the fetch, decode, and execute cycle operations in order to process program information.
  
- **Memory or Random-access Memory (RAM)**: Temporarly stores programs and data that are currently running.
    -- RAM is divided into units called bytes (8 bits of 1s and 0s).
    -- Each byte in memory is assigned a unique number called an address.
    -- RAM is volatile, so if you turn the computer off, its contents are erased.
    -- A processor spends much of its time moving data between memory and storage. A common way to make a computer faster is to increase the RAM. Use free -h on the command line to see how much RAM is being used.

- **Storage Devices, or Disks or Hard Drive**: Non-volatile storage like hard drives and SSDs.
  
- **Input/Output Devices**: Devices like keyboards (input) and monitors (output).

---

## **Basic Structure of a Java Program**

### **Components**
```
// This is a comment
public class HelloWorld { // Class header
    public static void main(String[] args) { // Main method header
        System.out.println("Hello World"); // Statement
    }
} // End of class
```
- **Class Header**: `public class HelloWorld`
- **Main Method**: `public static void main(String[] args)`
- **Statements**: Individual lines of code ending with `;`

---

# **Java Program with Input**

### **Using the `Scanner` Class**
- **Scanner** is used to capture input from the user.
- Methods like `next()` and `nextInt()` parse strings and integers.

### **Java Example Code**
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
