## Introduction and Usage of Generics in Java:

**Notes:**

- Generics in Java provide a way to create classes, interfaces, and methods that operate with unspecified types, allowing for increased type safety and code reusability.
- Generics enable you to define classes and methods with placeholder types, which are replaced by specific types at compile time.
- They help in writing code that is more flexible, reusable, and easier to read and maintain.

**Examples:**

```java
// Example of a generic class
class Box<T> {
    private T item;
  
    public void setItem(T item) {
        this.item = item;
    }
  
    public T getItem() {
        return item;
    }
}

// Using the generic class
Box<String> stringBox = new Box<>();
stringBox.setItem("Hello");
String message = stringBox.getItem();
System.out.println(message); // Output: Hello

```

### Types of Generics:

**1. Type Parameters in Generics:**

- Type parameters are placeholders for types used in generic classes, interfaces, and methods.
- They are declared within angle brackets `< >` after the class/interface/method name.

**2. Wildcards in Generics:**

- Wildcards in generics allow for greater flexibility when working with unknown types.

#### a. Unbounded Wildcards:

- Represented by `?`, it denotes an unknown type.
- Unbounded wildcards are useful when the code doesn't depend on the type of elements in the collection.

**Example:**
```java
List<?> myList = new ArrayList<>();
```

#### b. Upper Bounded Wildcards:

- Denoted by `<? extends T>`, where `T` is a type parameter or a concrete class.
- Restricts the type to be a subtype of `T`.

**Example:**

```java
public static double sum(List<? extends Number> numbers) {
    double total = 0;
    for (Number n : numbers) {
        total += n.doubleValue();
    }
    return total;
}
```

#### c. Lower Bounded Wildcards:

- Denoted by `<? super T>`, where `T` is a type parameter or a concrete class.
- Restricts the type to be a supertype of `T`.

**Example:**

```java
public static void addNumbers(List<? super Integer> numbers) {
    numbers.add(10);
    numbers.add(20);
}
```

```

```
