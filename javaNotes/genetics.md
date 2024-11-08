# Genetics
## Comparable Interface: Sorting an ArrayList
- Remember, an interface provides method declarations, which only consist of the method's return type, name, and parameters. Since an interface only declares methods, and does not provide complete method definintions, it cannot be instantiated.
- Methods declared by an interface nust be defined by any implementing classes.
  
- The **Comparable Interface** imposes a natural ordering on the objects of each class that implements it.
- The class must define a method called `compareTo` that determines the order of the object.

- `compareTo` Method: You need to override this method to specify how to compare two objecrs of a class.
  - Return values:
    - Negative integer: The current object (this) is less than the object being compared (other)
    - Zero: The current object is equal to the objcet being compared
    - Positive integer: The current object is greater than the object being compared.
   
### Sorting Collections
-   `Collections.sort(): Once your class implements `Comparable` you can use `Collections.sort()` to automatically sort lists of your objects
-   `sort()` is a static method. Therefore, both the Collections class name and a dot should be appended before the method call.

- The `implements` keyword tells the compiler that a class implements, instead of extends, a particular interface
- A class can both extend and implement an interface

## Genetic Methods
- A generic method is a method definition having a special type parameter that may be used in place of types in the method.

- It uses a **type parameter** that can be used throughout the method for any parameter types, return types, or local variable types. The identifier is known as a template parameter, and may be various reference types or even another template parameter.
- A type parameter may be associated with a **type bound** to specify the class types for which a type parameter is valid. Type bounds are specified using the extends keyword and appear after the corresponding type parameter. 
```
modifiers <Type1 extends BoundType1, Type2 extends BoundType2>
ReturnType methodName (parameters){
// ...
}
```

## Class Genetics
- A generic class is a class definition having a special type parameter that may be used in place of types in the class. A variable declared of that generic class type must indicate a specific type.
- Type-independent code can significantly improve code reuse. The ArrayList generic class is a great example -- the same code handles numerous different types, like Integers, Strings, and even user-defined classes.
- Genetic class template with multiple parameters
```
public class ClassName <Type1 extends BoundType1, Type2 extends BoundType2> {
// ...
}
```
- Importantly, type arguments cannot be primitive types such as int, char, and double. Instead, the type arguments must be reference types. If primitive types are desired, a programmer should use the corresponding primitive wrapper classes (e.g., Integer, Char, Double, etc.), discussed elsewhere.

