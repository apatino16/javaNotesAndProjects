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

