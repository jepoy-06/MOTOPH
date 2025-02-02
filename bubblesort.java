public class BubbleSort {
    
  // Method to perform Bubble Sort on the array
  /**
   * @param array
   */
  public static void bubbleSort(int[] array) {
      int n = array.length; // Get the length of the array
      
      // Outer loop to go through each element
      for (int i = 0; i < n; i++) {
          // Inner loop to compare adjacent elements and swap if necessary
          for (int j = 0; j < n - i - 1; j++) {
              // If the current element is greater than the next element, swap them
              if (array[j] > array[j + 1]) {
                  // Swap array[j] and array[j + 1]
                  int temp = array[j];
                  array[j] = array[j + 1];
                  array[j + 1] = temp;
              }
          }
      }
  }

  // Main method to test the Bubble Sort implementation
  public static void main(String[] args) {
      // Example array to be sorted
      int[] array = {64, 34, 25, 12, 22, 11, 90};
      
      // Print the original array
      System.out.println("Original Array:");
      for (int num : array) {
          System.out.print(num + " ");
      }
      System.out.println();
      
      // Apply the Bubble Sort
      bubbleSort(array);
      
      // Print the sorted array
      System.out.println("Sorted Array:");
      for (int num : array) {
          System.out.print(num + " ");
      }
  }
}
