# Create an array (list in Python)
inventory = ["Toyota", "Honda", "BMW", "Ford"]

# Add a new stock (appending to the end of the array)
inventory.append("Chevrolet")

# Delete incorrect stock (removing an item by value)
inventory.remove("Ford")

# Search for a stock (check if an item exists in the array)
stock_to_search = "Honda"
if stock_to_search in inventory:
    print(f"{stock_to_search} found in inventory.")

# Sort stocks by brand (alphabetical sorting)
inventory.sort()

# Display the inventory
print("Sorted Inventory:", inventory)
