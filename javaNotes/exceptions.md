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


## Exceptions with methods
## User-defined Exceptions

