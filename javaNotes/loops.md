# **Loops in Java**

Loops allow for **repeated execution** of a block of code until a specified condition is met or becomes false.

---

## **While Loop**

- A **`while` loop** is a **pre-test** loop that executes its body repeatedly **while** the loop's expression evaluates to **`true`**.
- Once the expression becomes **`false`**, the loop ends and the program continues with the next statement.

### **Example**
```java
int count = 0;

while (count < 5) {
    System.out.println("Count is: " + count); // prints count from 0 to 4
    count++; // incrementing the count variable
}
```
**Output:**
```
Count is: 0
Count is: 1
Count is: 2
Count is: 3
Count is: 4
```

---

## **Infinite Loop**

- An **infinite loop** executes indefinitely because the loop's expression is always **`true`**.
- **Common mistake**: Forgetting to modify the loop expression.
  
### **Example of an Infinite Loop**
```java
while (true) {
    System.out.println("This will run forever unless stopped manually!");
}
```

**Real-world Use Case**: Monitoring a system continuously until a stop signal is received.

**Avoid Infinite Loops by** ensuring there is logic in the loop to eventually make its expression **`false`**.

---

## **Sentinel Values in Loops**

- **Sentinel values** signal the end of input when the **exact count** of iterations is unknown.
- A specific input value tells the loop to **stop** collecting data.

### **Example**
```java
Scanner scanner = new Scanner(System.in);
int number;

do {
    System.out.println("Enter a positive number (-1 to stop): ");
    number = scanner.nextInt();
} while (number != -1);
```
In this example, entering **`-1`** stops the loop.

---

## **Do-While Loop**

- A **`do-while` loop** is a **post-test** loop that executes its body **at least once**, then checks the loop's condition.
- Unlike a `while` loop, the condition is tested **after** the loop body executes.

### **Example**
```java
int count = 0;

do {
    System.out.println("Count is: " + count);
    count++;
} while (count < 5);
```
**Output**:
```
Count is: 0
Count is: 1
Count is: 2
Count is: 3
Count is: 4
```
Note the **semicolon** (`;`) at the end of the `while` condition.

---

## **For Loops**

- A **`for` loop** is a **pre-test** loop designed to **initialize**, **test**, and **modify** a control variable in **one line**.
  
### **Syntax**
```java
for (initialization; condition; modification) {
    // Loop body
}
```

### **Example**
```java
for (int i = 0; i < 5; i++) {
    System.out.println("i is: " + i); // prints 0 to 4
}
```

---

## **Increment and Decrement Operators**

- `++` (**increment**) adds **1**.
- `--` (**decrement**) subtracts **1**.
  
### **Example**
```java
int i = 0; // initialize variable
i++; // increment i by 1 (i becomes 1)
i--; // decrement i by 1 (i becomes 0)
```
- **Prefix (`++i`) vs. Postfix (`i++`)**: If the increment/decrement is the **only operation** in the statement, both behave the same.

---

## **Nested Loops**

- A **nested loop** is a loop inside another loop.
- **Outer loop**: Executes the **inner loop** multiple times.

### **Example**
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```
**Output:**
```
i: 1, j: 1
i: 1, j: 2
i: 2, j: 1
i: 2, j: 2
i: 3, j: 1
i: 3, j: 2
```

---

## **Which Loop to Use?**

- **`while` loop**: Use when the number of iterations is **unknown** and depends on a **condition**.
- **`do-while` loop**: Use when you need to execute the body of the loop **at least once**.
- **`for` loop**: Use when you know the **exact number** of iterations.

---

## **Input Validation with Loops**

- Loops are often used for **input validation**.
  
### **Example**
```java
Scanner scanner = new Scanner(System.in);
int age;

System.out.println("Enter your age (1-120): ");
age = scanner.nextInt();

while (age < 1 || age > 120) {
    System.out.println("Invalid age. Enter again: ");
    age = scanner.nextInt();
}
```

---

## **Break and Continue Statements**

- **`break`**: Exits the **entire loop** immediately.
- **`continue`**: Skips to the **next iteration** of the loop.

### **Example**
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break; // exits loop when i is 5
    }
    System.out.println(i);
}

for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue; // skips even numbers
    }
    System.out.println(i);
}
```

---

## **Enumerations**

- **Enumerations (enums)** define a data type with a fixed set of constant values.
  
### **Syntax**
```java
public enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY
}
```

### **Usage**
```java
Day today = Day.MONDAY;

if (today == Day.MONDAY) {
    System.out.println("It's Monday!");
}
```

Enums are often used to represent **state machines** where program behavior changes based on the current **state**.

---
