public class InsertionSort {
    
  // Method to perform Insertion Sort on the array
  public static void insertionSort(int[] array) {
      // Loop through each element starting from the second element (index 1)
      for (int i = 1; i < array.length; i++) {
          // Store the current element (current_value) to be inserted
          int currentValue = array[i];
          
          // Initialize j to the index just before i
          int j = i - 1;
          
          // Shift elements to the right while they are greater than currentValue
          while (j >= 0 && array[j] > currentValue) {
              array[j + 1] = array[j]; // Move the element one position to the right
              j--;
          }
          
          // Insert currentValue into the correct position in the sorted portion of the array
          array[j + 1] = currentValue;
      }
  }
  
  // Main method to test the Insertion Sort implementation
  public static void main(String[] args) {
      // Example array to be sorted
      int[] array = {12, 11, 13, 5, 6};
      
      // Display the original array
      System.out.println("Original Array: ");
      for (int num : array) {
          System.out.print(num + " ");
      }
      System.out.println();
      
      // Apply the Insertion Sort to the array
      insertionSort(array);
      
      // Display the sorted array
      System.out.println("Sorted Array: ");
      for (int num : array) {
          System.out.print(num + " ");
      }
  }
}
