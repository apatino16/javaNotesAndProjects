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
