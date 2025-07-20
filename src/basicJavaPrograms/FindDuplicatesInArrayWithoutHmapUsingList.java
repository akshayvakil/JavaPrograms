package basicJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicatesInArrayWithoutHmapUsingList {

    public static void main(String[] args) {

        int array[] = {1, 1, 2, 4, 5, 6, 7, 7, 8};

        // Step 1: Declare a List to store unique values from the array.
        List<Integer> uniqueList = new ArrayList<>();

        /**
         * Q: why we are using list?
         * Arrays have a fixed size in Java, and we don’t know how many unique elements
         * will be present. Using a List (like ArrayList) allows us to store elements
         * dynamically. It grows as needed, making it ideal for collecting only unique values.
         * Later, we can convert it back to an array if required.
         */

      

        // Step 2: Use Two  for-loops to compare each element and identify duplicates.
        // Outer loop iterates through the input array.
        // Inner loop checks if the element is already in uniqueList.
        // A boolean flag helps track whether the current element is a duplicate.

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueList.size(); j++) {
                // Use .get(index) method to access elements in the list

                /**
                 * Q: Why doesn't this line throw an error when the list is empty?
                 * A: If uniqueList is empty (size == 0), the loop condition j < uniqueList.size()
                 * becomes j < 0, which is false. Hence, the loop body isn't executed,
                 * and get(j) is never called, so no IndexOutOfBoundsException occurs.
                 */

                if (array[i] == uniqueList.get(j).intValue()) {
                    // We must declare the list as List<Integer> to use intValue().
                    // Without generics, get(j) returns Object, and calling intValue() would cause a compile error.

                    isDuplicate = true;
                    break; // Break the inner loop if a duplicate is found.
                }
            }

            if (!isDuplicate) {
                // If not a duplicate, add the element to the unique list.
                uniqueList.add(array[i]);
            }
        }

        // Step 3: Convert the List back into an array.
        // First, define the size of the new array using the size of the unique list.

        int uniqueValuesinArray = uniqueList.size();
        int uniqueValueArray[] = new int[uniqueValuesinArray]; // Creates an array with the exact number of unique elements.

        // Copy elements from the list into the array.
        for (int i = 0; i < uniqueValuesinArray; i++) {
            uniqueValueArray[i] = uniqueList.get(i);
        }

        // Step 4: Print the final array containing only unique values.

        System.out.print("Unique values: ");
        for (int val : uniqueValueArray) {
            System.out.print(val + "  ");
        }

        /*
        // Alternate way to print the array using a traditional for-loop
        System.out.println("\nNew array is:");
        for (int i = 0; i < uniqueValueArray.length; i++) {
            System.out.println("Unique Value: " + uniqueValueArray[i]);
        }
        */
    }
}
