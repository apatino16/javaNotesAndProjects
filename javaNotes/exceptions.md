# Java Exceptions
- An exception is an unexpected incident that stops the normal execution of a program.
## Handling Exceptions
- To avoid having a program end when an exception occurs, a program can use try and catch blocks to handle the exception during program execution.
- A **try block** surrounds normal code, which is exited immediately if a statement within the try block throws an exception.
- A **catch block** catches an exception thrown in a preceding try block. If the thrown exception's type matches the catch block's parameter type, the code within the catch block executes. A catch block is called an **exception handler**.

**Common Exception Types**

|Type|Reason Exception is Thrown|
|-------|-------|
|EOFException | End of file or end of stream has been reached unexpectedly during input |
|  InputMismatchException| Received input does not match expected type or the input is out of range for the expected type (thrown by Scanner)|
|ArrayIndexOutOfBoundsException| An array has been accessed with an illegal index (negative or greater than array size)|
|FileNotFoundException| Attempt to open a file denoted by a filename failed|
|ArithmeticException|Arithmetic condition failed (Ex: Divide by zero error)|

- A program can throw user-defined exceptions using a throw statement. A **throw** statement throws a throwable object, like an exception, during program execution.
` throw new Exception("Message");`
- The catch block catches the exception and outputs the exception message via Exception's `getMessage()` method.
` System.out.println(e.getMessage());`
- The thrown exception's type is Exception, which matches the catch block's parameter type. Thus, the catch block can catch and handle the exception. Note that because Exception is the base class for all exception types, this catch block can catch all exceptions.
```
catch (Exception e) {
  // ...
}
```
- A try block can have multiple catch blocks. Each catch block handles a different type of exception.
-----
## Exceptions with files
### Handling exceptions from opening invalid files
- To open a file we use the FileInputStream constructor, and specify the file's name and location of the file to open.
` fileToOpen = new FileInputStream("fileName.txt");`
- The FileInputStream constructor throws `FileNotFoundException` if the specified file cannot be found or opened for reading.
```
try {
fileScnr = new Scanner (new FileInputStream(fileName));
  // ...
}
catch (FileNotFoundException e) {
  // ...
}
```

### Closing Files
- A good practice is to close all files to allow the operating system to cleanup any resources used while reading or writing a file.

```
// ...
// Open input file.
         fileInStream = new FileInputStream("input.txt");
         fileScanner = new Scanner(fileInStream);
         System.out.println("Opened input.txt");

         // Open output file.
         fileOutStream = new FileOutputStream("output.txt");
         fileWriter = new PrintWriter(fileOutStream);
         System.out.println("Opened output.txt");
// ...
// Close both files.
      if (fileScanner != null) {
         fileScanner.close();
         System.out.println("Closed input.txt");
      }

      if (fileWriter != null) {
         fileWriter.close();
         System.out.println("Closed output.txt");
      }
```
### Closing files with the try-with-resources statement
- A program can use a try-with-resources statement to automatically close files if any exception, caught or uncaught, occurs within a try block.
- The **try-with-resources** statement declares closable resources, like files, within parentheses after the try keyword and before the try's opening curly brace.
- The declared resources are closed after the try block exits. Multiple resources, separated by semicolons, can be declared in a single try-with-resources statement.
```
try (Scanner fileScnr = new Scanner(new FileInputStream("input.txt"))){
// ...
}

```
### Finally block
- A `finally` block always executes when a try block exits. A programmer can use a finally block to do additional processing, even if an exception is thrown in the try statement.
```
try () {
// ...
}
catch () {
// ...
}
finally {
// ...
}
```
## Exceptions with methods
### Specifying exceptions thrown by a method
- A `throws` clause specifies the types of exceptions that a method may throw and callers of the method should handle.
- A throws clause is specified after a method's parameters list and before the opening brace.
- A throws clause may specify multiple exception types, separated by commas.
```
public static double methodName(parameters) throws Exception{

}

```

### Checked vs unchecked exceptions
Java has two types of exception:
- A checked exception is an exception that a programmer should be able to anticipate and handle.
- An unchecked exception is an exception caused by hardware or logic errors that a programmer usually cannot anticipate and handle.

- Java's catch or specify requirement requires methods to either catch a checked exception using a catch block, or specify that the method throws the checked exception using a throws clause. **Code that does not obey the catch or specify requirement does not compile.**

|Unchecked Exception| Notes |
|---|---|
|NullPointerException| Indicates a null reference|
|IndexOutOfBoundsException| Indicates that an index is outside the appropiate range|
|ArithmeticException|Indicates the occirrence of an exceptional arithmetic condition|
|IOError|Indicates the failure of an I/O operation|
|ClassCastException|Indicates an invalid attemot to cast an object to type of which the object is not an instance|
|IllegalArgumentException|Indicates an illegal or inappropriate method argument|

### Throwing exceptions in methods calling other methods
- A method may call another method with a throws clause. If the calling method does not handle the exception types thrown by the called method, the calling method's throws clause must specify all exception types thrown by the called method.

## User-defined Exceptions
- Limitations of using the Exception class: catching unintended exceptions
- A programmer can define a custom exception type by extending the Exception class.
```
// User-defined exception class with a fixed exception message.
public class NaNException extends Exception {
  public NanException(){
    super("NaN Exception");
}
}
```
- Instead of passing a fixed exception message to super(), the constructor for NaNException can take a custom exception message as a constructor argument.
- A user-defined exception type can call any of Exception's constructors via super(). Calling super without arguments calls the Exception class's empty constructor, which does not set an exception message.
- The constructor parameters for a user-defined exception type can differ from the constructor parameters used by the Exception type. The variable name passed into NaNException's constructor is used to build the full exception message.

