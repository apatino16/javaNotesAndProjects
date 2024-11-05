import java.util.Scanner;

public class outputNumbersInReverse {
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    int[] userList = new int[20]; // Array to store up to 20 integers specified by the user
    int numElements;              // Variable to store the number of integers in user's list
    int i;                        // Loop index variable

    // Read the first input as the number of integers that will follow
    numElements = scnr.nextInt();

    // Read numElements integers into the userList array
    for (i = 0; i < numElements; i++){
      userList[i] = scnr.nextInt();  // Store each integer input in the array
    }

    // Output the array elements in reverse order, seperated by commas
    for (i = numElements - 1; i >= 0, --i){
      System.out.print(userList[i] + ",");
    }

    // Print a newLine at the end of the output
    System.out.println();
  }
}
