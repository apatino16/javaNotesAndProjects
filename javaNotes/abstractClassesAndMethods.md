# Abstract Classes and Methods
## Abstract Classes
- An **abstract class** is a class that guides the design of subclasses but cannot itself be instantiated as an object. An abstract class is denoted by the keyword `abstract` in front of the class definition. Any class with one or more abstract methods must be abstract.
- An **abstract method** is a method that is not implemented in the base class, thus all derived classes must override the function. An abstract method is denoted by the keyword `abstract` in front of the method signature. A **method signature** defines the method's name and parameters.
- A **concrete class** is a class that is not abstract, and hence can be instantiated. To be concrete, all abstract methods from the superclass, Shape, must be implemented.

## UML class diagrams
- The **Unified Modeling Language (UML)** is a language for software design that uses different types of diagrams to visualize the structure and behavior of programs.
- A **structural diagram** visualizes static elements of software, such as the attributes (variables) and operations (methods) used in the program.
- A **behavioral diagram** visualizes dynamic behavior of software, such as the flow of an algorithm.

- A UML class diagram is a structural diagram that can be used to visually model the classes of a computer program, including member variables and methods.
  
- Programmers commonly draw class inheritance relationships using [Unified Modeling Language (UML)](https://developer.ibm.com/articles/an-introduction-to-uml/) notation![UML](https://github.com/user-attachments/assets/a710fc63-e5b3-4739-a601-2efa11347f43)
- UML uses an arrow with a solid line and an unfilled arrow head to indicate that one class inherits from another. The arrow points toward the superclass.
- UML uses italics to denote abstract classes. In particular, UML uses italics for the abstract class' name, and for each abstract method in the class.
