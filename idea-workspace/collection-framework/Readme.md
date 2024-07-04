**Java Collections Framework:**

* The Java Collections Framework provides a set of classes and interfaces to represent and manipulate collections of objects.
* Collections are used to store, retrieve, and manipulate data in various ways.
* The framework includes interfaces and classes for Lists, Sets, Queues, and Maps.

![Collection Framework](https://techvidvan.com/tutorials/wp-content/uploads/sites/2/2020/03/collection-framework-hierarchy-in-java.jpg)

**1. List Interface:**

- **Description:** An ordered collection that allows duplicate elements. Common implementations include `ArrayList` and `LinkedList`.

  ```java
  List<String> myList = new ArrayList<>();
  myList.add("Java");
  myList.add("Python");
  myList.add("C++");
  ```

**2. Set Interface:**

- **Description:** An unordered collection that does not allow duplicate elements. Common implementations include `HashSet` and `TreeSet`.

  ```java
  Set<Integer> mySet = new HashSet<>();
  mySet.add(1);
  mySet.add(2);
  mySet.add(3);
  ```

**3. Queue Interface:**

- **Description:** A collection designed for holding elements prior to processing. Common implementations include `LinkedList` and `PriorityQueue`.

  ```java
  Queue<String> myQueue = new LinkedList<>();
  myQueue.offer("Task 1");
  myQueue.offer("Task 2");
  myQueue.offer("Task 3");
  ```

**4. Map Interface:**

- **Description:** An object that maps keys to values. Common implementations include `HashMap` and `TreeMap`.

  ```java
  Map<String, Integer> myMap = new HashMap<>();
  myMap.put("Java", 1);
  myMap.put("Python", 2);
  myMap.put("C++", 3);
  ```

**5. Deque Interface:**

- **Description:** A double-ended queue that supports element insertion and removal at both ends. Common implementations include `ArrayDeque`.

  ```java
  Deque<String> myDeque = new ArrayDeque<>();
  myDeque.addFirst("First");
  myDeque.addLast("Last");
  ```

**6. Collections Class (Utility methods):**

- **Description:** The `Collections` class provides utility methods for collections, such as sorting and searching.

  ```java
  List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);
  Collections.sort(numbers);
  ```

**7. Iterator Interface:**

- **Description:** The `Iterator` interface provides methods to iterate over a collection. Used for sequential access.

  ```java
  List<String> myList = Arrays.asList("A", "B", "C");
  Iterator<String> iterator = myList.iterator();
  while (iterator.hasNext()) {
      String element = iterator.next();
  }
  ```

**8. Iterable Interface:**

- **Description:** The `Iterable` interface allows an object to be the target of the "for-each loop."

  ```java
  List<String> myList = Arrays.asList("X", "Y", "Z");
  for (String element : myList) {
      // Process each element
  }
  ```

**9. ConcurrentHashMap:**

- **Description:** A thread-safe version of `HashMap` in which all operations are performed atomically.

  ```java
  Map<String, Integer> concurrentMap = new ConcurrentHashMap<>();
  concurrentMap.put("Java", 1);
  concurrentMap.put("Python", 2);
  ```

**10. LinkedHashMap:**

- **Description:** Extends `HashMap` to allow predictable iteration order based on the order of insertion.

  ```java
  Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
  linkedHashMap.put("Java", 1);
  linkedHashMap.put("Python", 2);
  ```

### More Collections

**HashSet:**

- **Description:** Implements the Set interface, backed by a hash table. It does not allow duplicate elements.

  ```java
  Set<String> hashSet = new HashSet<>();
  hashSet.add("Apple");
  hashSet.add("Banana");
  hashSet.add("Apple"); // Ignored, as it is a duplicate
  ```

**TreeSet:**

- **Description:** Implements the SortedSet interface and uses a Red-Black tree for storage. Provides ordered iteration over elements.

  ```java
  Set<String> treeSet = new TreeSet<>();
  treeSet.add("Banana");
  treeSet.add("Apple");
  treeSet.add("Orange");
  ```

**LinkedHashSet:**

- **Description:** Extends HashSet and maintains the order of insertion. Provides ordered iteration over elements.

  ```java
  Set<String> linkedHashSet = new LinkedHashSet<>();
  linkedHashSet.add("Banana");
  linkedHashSet.add("Apple");
  linkedHashSet.add("Orange");
  ```

**ArrayList:**

- **Description:** Implements the List interface and uses a dynamic array to store elements. Allows fast random access but may be slower for insertions and deletions.

  ```java
  List<String> arrayList = new ArrayList<>();
  arrayList.add("Java");
  arrayList.add("Python");
  arrayList.add("C++");
  ```

**LinkedList:**

- **Description:** Implements the List interface and uses a doubly-linked list to store elements. Provides efficient insertions and deletions but slower random access.

  ```java
  List<String> linkedList = new LinkedList<>();
  linkedList.add("Java");
  linkedList.add("Python");
  linkedList.add("C++");
  ```

**HashMap:**

- **Description:** Implements the Map interface using a hash table. Allows key-value pairs, and keys must be unique.

  ```java
  Map<String, Integer> hashMap = new HashMap<>();
  hashMap.put("Java", 1);
  hashMap.put("Python", 2);
  ```

**LinkedHashMap:**

- **Description:** Extends HashMap and maintains the order of insertion. Provides ordered iteration over key-value pairs.

  ```java
  Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
  linkedHashMap.put("Java", 1);
  linkedHashMap.put("Python", 2);
  ```

**TreeMap:**

- **Description:** Implements the SortedMap interface and uses a Red-Black tree for storage. Provides ordered iteration over key-value pairs.

  ```java
  Map<String, Integer> treeMap = new TreeMap<>();
  treeMap.put("Banana", 3);
  treeMap.put("Apple", 1);
  ```

**Iterator:**

- **Description:** The `Iterator` interface provides methods to iterate over a collection. Used for sequential access.

  ```java
  List<String> myList = Arrays.asList("A", "B", "C");
  Iterator<String> iterator = myList.iterator();
  while (iterator.hasNext()) {
      String element = iterator.next();
  }
  ```

**Enumeration:**

- **Description:** The `Enumeration` interface is an older interface for iterating elements. It is less powerful than Iterator but is still used in some legacy classes.

  ```java
  Vector<String> vector = new Vector<>();
  vector.add("X");
  vector.add("Y");

  Enumeration<String> enumeration = vector.elements();
  while (enumeration.hasMoreElements()) {
      String element = enumeration.nextElement();
  }
  ```

### Generics

**Description:**

* Generics in Java allow you to create classes, interfaces, and methods that operate with types as parameters.
* Generics provide a way to write code that is type-safe and can work with different data types without sacrificing type safety.

**1. Generic Classes:**

- **Description:** You can create a generic class by introducing a type parameter within angle brackets (`<>`).

  ```java
  public class Box<T> {
      private T content;

      public void put(T item) {
          this.content = item;
      }

      public T get() {
          return content;
      }
  }

  // Usage
  Box<String> stringBox = new Box<>();
  stringBox.put("Hello");
  String value = stringBox.get();  // Type safety is maintained
  ```

**2. Generic Methods:**

- **Description:** You can also create generic methods within non-generic classes or interfaces.

  ```java
  public class Utils {
      public <T> T processItem(T item) {
          // Process item
          return item;
      }
  }

  // Usage
  Utils utils = new Utils();
  String processedString = utils.processItem("Hello");
  Integer processedInteger = utils.processItem(42);
  ```

**3. Bounded Type Parameters:**

- **Description:** You can restrict the types that can be used as type parameters using bounded type parameters.

  ```java
  public class NumberBox<T extends Number> {
      private T value;

      public void setValue(T value) {
          this.value = value;
      }

      public T getValue() {
          return value;
      }
  }

  // Usage
  NumberBox<Integer> integerBox = new NumberBox<>();
  integerBox.setValue(42);
  Integer integerValue = integerBox.getValue();
  ```

**4. Wildcards:**

- **Description:** Wildcards (`?`) allow you to represent an unknown type. There are upper-bounded, lower-bounded, and unbounded wildcards.

  ```java
  public class WildcardExample {
      public static double sumOfList(List<? extends Number> list) {
          double sum = 0.0;
          for (Number number : list) {
              sum += number.doubleValue();
          }
          return sum;
      }
  }

  // Usage
  List<Integer> integers = Arrays.asList(1, 2, 3);
  double result = WildcardExample.sumOfList(integers);
  ```
