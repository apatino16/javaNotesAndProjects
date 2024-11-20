# Collections
## Enhanced for loop
- The enhanced for loop is a for loop that iterates through each element in an array or Collection.
- The enhanced for loop declares a new variable and assigns the variable with each successive element of the container object.
  -  Pros:
    - Compared to a regular for loop, an enhanced for loop decreases the amount of code needed to iterate through containers, thus enhancing code readability and clearly demonstrating the loop's purpose.
  - An enhanced for loop also prevents a programmer from writing code that incorrectly accesses elements outside of the container's range.
---
## List: LinkedList
- The List interface defined within the Java Collections Framework defines a Collection of ordered elements, i.e., a sequence. The List interface supports methods for adding, modifying, and removing elements.
- The LinkedList type is an ADT implemented as a generic class that supports different types of elements.
- A LinkedList can be declared and created as `LinkedList<T> linkedList = new LinkedList<T>(); ` where `T` represents the LinkedList's type, such as Integer or String.
- The statement `import java.util.LinkedList;` enables use of a LinkedList within a program.
- LinkedList: `add(index, newElement)` method adds elements to end of list or at specified index.
- LinkedList: `get(index)` returns elements at specified location
- LinkedList: `set(index, newElement)` replaces element at specified location.
- LinkedList: `remove(index)` method removes element from specified position.
- LinkedList: `size()` method returns the number of elements in the List.
---
### Common ListIterator methods
- LinkedList's `listIterator()` method returns a ListIterator object for traversing a list. The statement`import java.util.ListIterator;` enables use of a ListIterator in a program.
| next() | Returns the next element in the List and moves the ListIterator after that element.|
| nextIndex() | Returns the index of the next element.|
| previous() | Returns the previous element in the List and moves the ListIterator before that element. |
| previousIndex() | Returns the index of the previous element. |
| hasNext() | Returns true if ListIterator has a next element. Otherwise, returns false. |
| hasPrevious() | Returns true if ListIterator has a previous element. Otherwise, returns false. |
| add(newElement) | Adds the newElement between the next and previous elements and moves the ListIterator after newElement.|
| remove() | Removes the element returned by the prior call to next() or previous(). Fails if used more than once per call to next() or previous(). Fails if add() has already been called since the last call to next() or previous(). |
| set(newElement) | Replaces the element returned by the prior call next() or previous() with newElement.|

---
### LinkedList vs. ArrayListLinkedList vs. ArrayList
- LinkedList and ArrayList are ADTs implementing the List interface. Although both LinkedList and ArrayList implement a List, a programmer should select the implementation that is appropriate for the intended task. A LinkedList typically provides faster element insertion and removal at the list's ends (and middle if using ListIterator), whereas an ArrayList offers faster positional access with indices.

---
## Map: HashMap

## Set: HashSet
## Queue Interface
## Deque Interface
