# Interfaces
- Java provides interfaces as another mechanism for programmers to state that a class adheres to rules defined by the interface.
- An interface can specify a set of abstract methods that an implementing class must override and define.
- In an interface, an abstract method does not need the abstract keyword in front of the method signature.
- To create an interface, a programmer uses the keyword `interface`.

- Any class that implements an interface must:

1. List the interface name after the keyword `implements`
2. Override and implement the interface's abstract methods

- A class can implement multiple interfaces using a comma separated list. Each Interface a class implements means the class will adhere to the rules defined by the interface.
- Interfaces can declare public static final fields and don't restrict a class' inheritance.
- An interface does not restrict future inheritance, so is the best choice if no other code is provided.

- UML diagrams denote interfaces using the keyword interface, inside double angle brackets, above the interface name. Classes that implement the interface have a dashed line with an unfilled arrow pointing at the interface.
