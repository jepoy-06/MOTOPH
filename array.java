import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    public static void main(String[] args) {
        // Create an ArrayList (similar to a Python list)
        ArrayList<String> inventory = new ArrayList<>();
        
        // Add initial stock
        inventory.add("Toyota");
        inventory.add("Honda");
        inventory.add("BMW");
        inventory.add("Ford");
        
        // Add a new stock (appending to the end of the list)
        inventory.add("Chevrolet");
        
        // Delete incorrect stock (removing an item by value)
        inventory.remove("Ford");
        
        // Search for a stock (check if an item exists in the list)
        String stockToSearch = "Honda";
        if (inventory.contains(stockToSearch)) {
            System.out.println(stockToSearch + " found in inventory.");
        }
        
        // Sort stocks by brand (alphabetical sorting)
        Collections.sort(inventory);
        
        // Display the inventory
        System.out.println("Sorted Inventory: " + inventory);
    }
}
