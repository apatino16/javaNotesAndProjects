# **Arrays in Java**

## **Introduction to Arrays**
- An **array** is a collection of data items, all of the **same type**, stored in **contiguous memory locations**.
- Unlike regular variables that store **one** data item, arrays allow you to store **multiple** data items using a **single variable**.
- Each item in the array is known as an **element** and is accessed by its **index** (which starts at **0**).

### **Example Use Case**
Imagine storing **365** temperatures, one for each day of the year. Instead of creating **365 separate variables**, you can store them all in an array.

---

## **Creating an Array**
1. **Declaration**: Define the type of elements the array will store.
   ```java
   dataType[] myArray;
   ```
   *Example*:
   ```java
   int[] numbers;
   ```

2. **Instantiation**: Allocate memory for the array using the `new` keyword and specify the **size** (number of elements).
   ```java
   myArray = new dataType[size];
   ```
   *Example*:
   ```java
   numbers = new int[5]; // Creates an array of 5 integers
   ```

3. **Initialization**: You can initialize the array elements during or after instantiation.
   ```java
   int[] numbers = {10, 20, 30, 40, 50}; // Array with 5 elements
   ```

### **Accessing Array Elements**
- Access elements using their **index** (e.g., `myArray[0]` for the first element).
   ```java
   System.out.println(numbers[2]); // Outputs: 30
   ```
- **Note**: The array size is fixed once created, and the last index is `length - 1`.

---

## **Array Index and Length**
- Arrays have indices starting at **0**. So, for an array of size 5, valid indices are 0 to 4.
- Accessing an index outside this range throws an `ArrayIndexOutOfBoundsException`.

- **Array length**: The length of an array is accessed via `.length`, which returns the number of elements in the array.

---

## **Iterating Through Arrays**
- Use a **`for` loop** to access each element of the array.
   ```java
   for (int i = 0; i < numbers.length; i++) {
       System.out.println(numbers[i]);
   }
   ```
- **Array length** is accessed via the `.length` property.

### **Enhanced `for` Loop (for-each)**
- An **enhanced `for` loop** provides a simpler way to iterate over arrays.
   ```java
   for (int num : numbers) {
       System.out.println(num);
   }
   ```

---

## **String Arrays**
- Arrays are not limited to primitive types; they can store **objects**, such as `String`.
   ```java
   String[] fruits = {"Apple", "Banana", "Cherry"};
   ```

- You can perform **String operations** on each element.
   ```java
   for (String fruit : fruits) {
       System.out.println(fruit.toUpperCase()); // Outputs: APPLE, BANANA, CHERRY
   }
   ```
- **Note**: `.length` for arrays gives the number of elements, while `.length()` for strings gives the length of the string.

---

## **Modifying Arrays**
- Arrays are **mutable**, meaning you can change the value of any element after initialization.
   ```java
   numbers[0] = 100;
   ```

---


## **Common Array Bugs**
- **`ArrayIndexOutOfBoundsException`**: Occurs when trying to access an element outside the array's bounds.
   ```java
   int[] arr = {1, 2, 3};
   System.out.println(arr[3]); // Error: Index 3 out of bounds
   ```
- **Off-by-One Errors**: Loop iterates **one too many** or **one too few** times. Always ensure loops iterate through `i < array.length`.

---

## **Copying Arrays**
- Simply assigning one array to another **does not copy** the array; it copies the **reference**.
   ```java
   int[] original = {1, 2, 3};
   int[] copy = original; // `copy` points to the same array as `original`
   ```

### **Correct Ways to Copy an Array**
1. **Using `clone()` method**:
   ```java
   int[] copy = original.clone();
   ```

2. **Manual Copy with Loop**:
   ```java
   int[] copy = new int[original.length];
   for (int i = 0; i < original.length; i++) {
       copy[i] = original[i];
   }
   ```

---

## **Comparing Arrays**
- **`==` operator** checks if **two arrays** point to the **same memory** location (reference comparison).
  
### **Correct Way to Compare Arrays**
1. **Check lengths**:
   ```java
   if (arr1.length == arr2.length) { /* proceed */ }
   ```

2. **Compare elements**:
   ```java
   boolean isEqual = true;
   for (int i = 0; i < arr1.length; i++) {
       if (arr1[i] != arr2[i]) {
           isEqual = false;
           break;
       }
   }
   ```

---

## **2D Arrays (Multidimensional Arrays)**
- A **2D array** is an array of arrays (think of it as a **table** with rows and columns).
   ```java
   int[][] matrix = {
       {1, 2, 3},
       {4, 5, 6},
       {7, 8, 9}
   };
   ```

### **Iterating Through 2D Arrays**
- **Nested loops** are typically used to iterate over elements.
   ```java
   for (int i = 0; i < matrix.length; i++) {
       for (int j = 0; j < matrix[i].length; j++) {
           System.out.print(matrix[i][j] + " ");
       }
       System.out.println();
   }
   ```
**Output**:
```
1 2 3 
4 5 6 
7 8 9 
```

---

## **Input Validation with Loops and Arrays**
- Validate input while populating an array.
   ```java
   int[] scores = new int[5];
   Scanner scanner = new Scanner(System.in);

   for (int i = 0; i < scores.length; i++) {
       do {
           System.out.print("Enter a valid score (0-100): ");
           scores[i] = scanner.nextInt();
       } while (scores[i] < 0 || scores[i] > 100);
   }
   ```

---

## **Using Arrays with Methods**
- Arrays can be **passed to** and **returned from** methods.
   ```java
   public static void printArray(int[] arr) {
       for (int num : arr) {
           System.out.println(num);
       }
   }
   ```

---

## **Key Points to Remember**
- Arrays have **fixed sizes**.
- Access elements using their **index**.
- Use **loops** (standard or enhanced) to iterate over arrays.
- Handle **copying** and **comparing** arrays carefully.
- Use **2D arrays** for table-like data structures.
- Validate input when populating arrays.

