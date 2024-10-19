# **File I/O, String, and StringBuilder**

## **Input and Output Streams**
- An **I/O Stream** represents a source of input or a destination for output.
- Streams support various types of data, including simple bytes, primitive data types, localized characters, and even objects.

---

### **PrintStream and System.out**

#### **Class PrintStream**

```java
java.lang.Object
  java.io.OutputStream
    java.io.FilterOutputStream
      java.io.PrintStream
```

- The `PrintStream` class provides multiple methods to write data to an output.
- Internally, a `PrintStream` places data into a **buffer** (a temporary memory region), and the system outputs the buffer at specific times.
  
- **`System.out`** is a predefined `PrintStream` object associated with the standard output device, typically the screen.
- The **System** class's `out` variable is declared as `PrintStream out` within the **System** class.
  - *Note*: The `System.out` class is predefined and does not require an import statement for usage.
  
- Methods like **`print()`** and **`println()`** are part of the `PrintStream` class and are used to output common data types like `int`, `double`, `float`, and reference types such as `String` and `ArrayList`.

---

### **InputStream, System.in, and Throws Clause**

```java
java.lang.Object
  java.io.InputStream
```

- The `InputStream` class provides several **read()** methods to extract bytes of data from an input source.

- **`System.in`** is a predefined `InputStream` object associated with the standard input device, usually the keyboard. `System.in` reads standard input data from a buffer filled by the operating system.

- When using an `InputStream`, a programmer must add the clause **`throws IOException`** to the definition of **`main()`**.
- The **throws** clause indicates that the method may unexpectedly exit during runtime due to an **exception**.

```java
import java.io.IOException;

public class InputStreamReader {
  public static void main (String[] args)
  throws IOException {
     int usrInput;

     // Read 1st byte
     usrInput = System.in.read();
  }
}
```

---

### **Scanner**

- The **`Scanner`** class simplifies input handling by automatically scanning and converting input data into the desired data types.
- To initialize a **Scanner** object, you can pass **System.in** (an `InputStream`) as an argument to the constructor:

```java
Scanner scnr = new Scanner(System.in);
```

---

## **Output Formatting**

### **Class Formatter**

```java
java.lang.Object
  java.util.Formatter
```

- The `Formatter` class interprets **printf-style** format strings and supports the alignment of text, numeric formatting, date/time formatting, and locale-specific output. It supports Java types like `byte`, `BigDecimal`, and `Calendar`.

- The syntax for format specifiers follows this structure:

```plaintext
%[argument_index$][flags][width][.precision]conversion
```

  - **`argument_index`**: Optional. A decimal integer indicating the position of the argument in the argument list (e.g., `1$` refers to the first argument).
  - **`flags`**: Optional. A set of characters modifying the output format (e.g., padding, alignment).
  - **`width`**: Optional. Specifies the minimum number of characters for output.
  - **`precision`**: Optional. Specifies the number of characters, typically for floating-point values.
  - **`conversion`**: Required. Specifies how the argument should be formatted based on its type.

- Note that formatters are not thread-safe by default.

### **`printf()` and `format()` Methods**

- The **`printf()`** method's first argument is the **format string**, which specifies the text layout and contains placeholders (called **format specifiers**) for printing values.
- A **format specifier** starts with `%` and is followed by a character denoting the type of value to print.

| Format Specifier | Data Type(s)        | Notes                                               |
|------------------|---------------------|-----------------------------------------------------|
| %c               | char                | Prints a single Unicode character                   |
| %d               | int, long, short     | Prints a decimal integer value                      |
| %o               | int, long, short     | Prints an octal integer value                       |
| %h               | int, char, long, short| Prints a hexadecimal integer value                  |
| %f               | float, double        | Prints a floating-point value                       |
| %e               | float, double        | Prints a floating-point value in scientific notation|
| %s               | String               | Prints characters in a String or literal            |
| %%               |                     | Prints the "%" character                            |
| %n               |                     | Prints the platform-specific newline character      |

---

### **Formatting Floating-Point Values**

Sub-specifiers allow further customization of floating-point output:

```plaintext
%(flags)(width)(.precision)specifier
```

| Sub-specifier | Description                                                                                                                                                                                                                     | Example                                               |
|---------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------|
| width         | Specifies the minimum number of characters to print. If the formatted value has fewer characters than the width, the output will be padded with spaces or zeros (if the '0' flag is specified).                                   | `printf("Value: %7.2f", myFloat);`  →  Value: 12.34   |
| .precision    | Specifies the number of digits following the decimal point. A default precision of 6 is used if unspecified.                                                                                                                     | `printf("%.4f", myFloat);` → 12.3400 <br> `printf("%3.4e", myFloat);` → 1.2340e+01 |
| flags         | `-`: Left-aligns the output. <br> `+`: Prints a plus sign for positive numbers. <br> `0`: Pads the output with zeros when needed. <br> Space: Prints a space before positive numbers.                                            | `printf("%+f", myFloat);` → +12.340000 <br> `printf("%08.2f", myFloat);` → 00012.34 |

---

### **Formatting Integer and String Values**

**Integer values** can be formatted similarly to floating-point values, except without the `.precision` sub-specifier.

**String values** are formatted using sub-specifiers as well.

| Sub-specifier | Description                                                                                                                        | Example                                    |
|---------------|------------------------------------------------------------------------------------------------------------------------------------|--------------------------------------------|
| width         | Specifies the minimum number of characters to print. If the string is shorter than the width, the output will be padded with spaces.| `printf("%20s String", myString);` → Formatting String |
| .precision    | Specifies the maximum number of characters to print. The string will be truncated if longer than this value.                        | `printf("%.6s", myString);` → Format      |
| flags         | `-`: Left-aligns the output.                                                                                                        | `printf("%-20s String", myString);` → Formatting String |

---

### **Flushing Output**

- Output is stored in a buffer to improve performance. When the buffer is full or when resources become available, data is printed. A programmer can use the **`flush()`** method to manually flush the buffer and send output to the destination.
- Example: `System.out.flush();` flushes the `System.out` buffer, writing its contents to the screen.

---

## **Streams Using Strings**

### **Input String Stream**

- A `Scanner` can be used to extract data from a string by associating the Scanner with the string, allowing the program to process data like input from a user.

```java
Scanner inSS = new Scanner(userInfo);
```

### **Output String Stream**

- An **output string stream** allows building and formatting strings before outputting them. This is achieved using `StringWriter` and `PrintWriter` classes:

```java
import java.io.StringWriter;
import java.io.PrintWriter;

StringWriter sw = new StringWriter();
PrintWriter pw = new PrintWriter(sw);
```

---

## **File Input**

### **FileInputStream**

```java
java.lang.Object
  java.io.InputStream
    java.io.FileInputStream
```

- A **FileInputStream** reads data from files. Example:

```java
FileInputStream fileByteStream = new FileInputStream("input.txt");
```

### **Reading Until End of File**

- The **`hasNextInt()`** method checks if an integer is available for reading. Similar methods are available for other data types.

---

## **File Output**

### **FileOutputStream**

A **FileOutputStream** is used to write data to a file.

| Action                                   | Sample Code                                                    |
|------------------------------------------|----------------------------------------------------------------|
| Open the file `helloWorld.txt` for writing | `FileOutputStream fileStream = new FileOutputStream("helloWorld.txt");` |
| Create a PrintWriter to write to the file  | `PrintWriter outFS = new PrintWriter(fileStream);`              |
| Write the string "Hello World!" to the file| `outFS.println("Hello World!");`                                |
| Close the file after writing data          | `outFS.close();`                                                |

- If the file cannot be opened, a **FileNotFoundException** is thrown.
- The file is created when successfully opened, even if empty.
