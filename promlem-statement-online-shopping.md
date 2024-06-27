**Case Study: Online Shopping System**

Create a simplified online shopping system in Java, incorporating fundamental concepts such as classes, inheritance, and exception handling.

**Requirements:**

1. **Create a `Product` Class:**
    - Implement a `Product` class with attributes `productName` (String), `productId` (int), `price` (double), and `quantityInStock` (int).
    - Include a method `displayDetails` to print details of the product.

2. **Derived Classes - `Electronics` and `Clothing`:**
    - Create two classes, `Electronics` and `Clothing`, that inherit from the `Product` class.
    - Add attributes specific to each type (e.g., `brand` and `warrantyPeriod` for electronics, `size` and `material` for clothing).
    - Override the `displayDetails` method in each derived class to include information about the specific attributes.

3. **Shopping Cart:**
    - Create a `ShoppingCart` class to manage the user's shopping cart.
    - Include methods to add products to the cart, display the cart contents, and calculate the total price.

4. **User Input and Exception Handling:**
    - In the testing phase, simulate user input for adding electronics and clothing to the shopping cart.
    - Implement exception handling to ensure valid inputs for product creation (e.g., non-empty product name, positive product ID).
    - Throw DuplicateProductIDException when user tries to add product with similar id
    - Add deleteProduct(int id) and throw an exception ProductNotFoundException if the product is not available;
