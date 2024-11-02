# Inheritance - Derived classes
- Inheritance is when you have a derived class (subclass) that inherits properties from a base class (superclass).
- All non-private instance fields and methods are inherited. Note: Constructors are not inherited.

- In other words, creating an independet class that has the same members as an existing class creates duplicate code. Creating duplicate code should generally be avoided. In this case, a derived class only needs to implement members that add additional functionality.

- a derived class is declared by placing the keyword `extends` after the derived class name, followed by the base class name.

```java
class DerivedClass extends BaseClass{....}
```
- A derived class can serve as a base class for another class
- A class can serve as a base class for multiple derived classes.
- A class can only be derived from one base class directly.

## Access by members of derived classes
### Member access
- The members of a derived class have access to the public members of the base class, but not to the private members of the base class.
### Protected member access
- The class specifier `protected` provides access to derived classes and all classes in the same package but not by anyone else.

| Specifier	| Description|
|-----------|------------|
| private	| Accessible by self. |
| protected |	Accessible by self, derived classes, and other classes in the same package. |
| public |	Accessible by self, derived classes, and everyone else. |
| no specifier |	Accessible by self and other classes in the same package.|

## Overriding members methods
### Overriding
- A derived class overrides a base class's method by using the same name and parameters as a base class's method
- The `@Override` annotation is placed above a method that overrides a base class method so the compiler verifies that an identical base class method exists.

### Calling a base class method
- An overriding method can call the overridden method by using the `super` keyword.
- The `super` keyword is a reference variable used to call the parent class's methods or constructors.

## The Object class
- The built-in `Object class` serves as the base class for all other classes and does not have a base class. All classes, including user-defined classes, are derived from Object and implement Object's methods.
- Two common methods defined within the Object class are `toString()` and `equals()`.

- The `toString()` method returns a String representation of the Object. By default, toString() returns a String containing the object's class name followed by the object's hash code in hexadecimal form. Ex: `java.lang.Object@372f7a8d`.

- The `equals(otherObject)` method compares an Object to otherObject and returns true if both variables reference the same object. Otherwise, equals() returns false. By default, equals() tests the equality of the two Object references, not the equality of the Objects' contents.

## Polymorphism
- `Polymorphism` refers to determining which program behavior to execute depending on data types.
- Method overloading is a form of `compile-time polymorphism` wherein the compiler determines which of several identically-named methods to call based on the method's arguments.
- Another form is `runtime polymorphism` wherein the compiler cannot make the determination but instead the determination is made while the program is running.
- The JVM automatically performs runtime polymorphism to determine the correct method to call based on the object's type.
- The program uses a Java feature relating to derived/base class reference conversion wherein a reference to a derived class can be converted to a reference to the base class (without explicit casting).

## ArrayLists of Objects
- Because all classes are derived from the Object class, programmers can take advantage of runtime polymorphism in order to create a collection (e.g., ArrayList) of objects of various class types and perform operations on the elements.
- Note that a method operating on a collection of Object elements may only invoke the methods defined by the base class (e.g., the Object class).
- An item of any class type may be added to an ArrayList of type `ArrayList<Object>`


