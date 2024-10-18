# **Classes and Objects**

## **What is an Object?**
- An **object** in programming is a grouping of data (variables or fields) and operations (methods) that can be performed on that data. Objects represent real-world entities and can hold attributes and behaviors.
  
### **Abstraction**
- **Abstraction** allows users to interact with an object at a high level, hiding lower-level internal details. This concept is also known as **information hiding** or **encapsulation**.
- **Encapsulation** keeps fields private and exposes only necessary methods to interact with the data.

### **Abstract Data Type (ADT)**
- An **Abstract Data Type (ADT)** is a data type that restricts its creation and update to well-defined operations. A class is often used to implement an ADT.

---

## **Classes in Java**

### **What is a Class?**
- A **class** is a blueprint for creating objects (instances). It defines the data (fields) and operations (methods) that the object can have. 
- **Fields** and **methods** together are called **class members**.

### **Public Member Methods**
- Public methods define operations that can be performed on an object by external users.
- Users don’t need to understand how the methods are implemented, just how to use them.

### **Private Fields**
- Fields in a class are usually declared as **private** to protect them from being accessed directly outside the class. This maintains encapsulation.
- Private fields can only be modified or accessed through public **getter** and **setter** methods.

---

## **Defining Classes and Methods**

### **Class Structure**
- The typical structure of a class includes the class name, private fields, and public methods to manipulate those fields.

Example:
```java
public class Car {
    private String model;
    private int year;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
```

### **Mutators and Accessors**
- **Mutator methods** (also called **setters**) modify the value of a field.
- **Accessor methods** (also called **getters**) retrieve the value of a field without modifying it.

Example:
```java
public void setYear(int year) {
    this.year = year; // Mutator (setter)
}

public int getYear() {
    return year; // Accessor (getter)
}
```

### **Private Helper Methods**
- **Private helper methods** assist public methods by performing smaller tasks that users of the class don't need to see or know about.

---

## **Constructors**

### **What is a Constructor?**
- A **constructor** is a special method called automatically when an object is created. It initializes the object's fields.
- A constructor must have the same name as the class and no return type (not even `void`).

Example:
```java
public class Car {
    private String model;
    private int year;

    // Constructor
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

### **Default Constructor**
- If a class doesn't provide any constructors, Java automatically creates a **default constructor** that initializes fields to their default values (e.g., `null` for objects, `0` for numeric types).

### **Constructor Overloading**
- You can **overload constructors** by defining multiple constructors with different parameter lists to allow different ways of creating objects.

Example:
```java
public class Car {
    private String model;
    private int year;

    public Car() {
        this("Unknown", 2000);  // Calls the overloaded constructor
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
```

---

## **The `this` Keyword**

### **What is `this`?**
- **`this`** is a reference to the **current object**. It helps differentiate between instance variables and parameters when they share the same name.

Example:
```java
public void setModel(String model) {
    this.model = model;  // Refers to the current object's model field
}
```

### **Using `this` in Constructors**
- You can use `this()` within a constructor to call another constructor from the same class, reducing code duplication.

Example:
```java
public Car(String model) {
    this(model, 2000);  // Calls the constructor with two parameters
}
```

---

## **Objects and References**

### **References in Java**
- A **reference** is a variable that points to the memory location of an object. When you create an object using `new`, a reference to the object’s memory location is returned.

### **Multiple Object References**
- Multiple references can point to the same object. If one reference modifies the object, the change will be visible to all references pointing to that object.

---

## **Static Fields and Methods**

### **Static Fields**
- A **static field** belongs to the class itself rather than to any individual object. It is shared among all instances of the class.

Example:
```java
public class Counter {
    public static int count = 0; // Static field shared across all instances
}
```

### **Static Methods**
- **Static methods** belong to the class, not to any specific instance of the class. They can be called without creating an object of the class.
- Static methods cannot access instance fields directly because they are tied to the class, not an instance.

Example:
```java
public static void printCount() {
    System.out.println(Counter.count);
}
```

---

## **Wrapper Classes**

### **Wrapper Classes Overview**
- **Wrapper classes** provide a way to treat primitive types as objects. Java provides wrapper classes for each primitive type:
  - `Integer` for `int`
  - `Double` for `double`
  - `Boolean` for `boolean`

### **Autoboxing and Unboxing**
- **Autoboxing** automatically converts a primitive type to its corresponding wrapper class.
- **Unboxing** automatically converts a wrapper class object back to a primitive type.

Example:
```java
Integer num = 10;  // Autoboxing
int val = num;     // Unboxing
```

---

## **ArrayList**

### **What is an ArrayList?**
- An **ArrayList** is a resizable array that grows or shrinks dynamically. It is part of the **Java Collections Framework**.
- Unlike arrays, an **ArrayList** only supports reference types (e.g., `Integer`, `String`).

### **Common Methods of ArrayList**
- **`add(T element)`**: Adds an element to the list.
  ```java
  list.add(5);  // Adds 5 to the ArrayList
  ```

- **`get(int index)`**: Retrieves the element at the specified index.
  ```java
  int value = list.get(0);  // Gets the element at index 0
  ```

- **`set(int index, T element)`**: Replaces the element at the specified index.
  ```java
  list.set(0, 10);  // Sets the element at index 0 to 10
  ```

- **`size()`**: Returns the number of elements in the list.
  ```java
  int size = list.size();  // Returns the size of the ArrayList
  ```

- **`remove(int index)`**: Removes the element at the specified index.
  ```java
  list.remove(1);  // Removes the element at index 1
  ```

- **`clear()`**: Removes all elements from the list.
  ```java
  list.clear();  // Clears all elements from the ArrayList
  ```

---

## **Unit Testing**

### **What is Unit Testing?**
- **Unit testing** is testing individual units (like methods or classes) to ensure they work as expected.

### **Testbenches**
- A **testbench** is a program designed to test another program or part of it, usually with predefined test cases (inputs and expected outputs).

### **Regression Testing**
- **Regression testing** is the process of re-running tests after a program has been modified to ensure that no new bugs have been introduced.

