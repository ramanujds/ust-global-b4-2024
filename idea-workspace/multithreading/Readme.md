## Multithreading in Java

1. **Understanding Threads:**

   - **Notes:** Threads are the smallest unit of execution in Java. They allow concurrent execution of tasks.
   - **Example:**
     ```java
     class MyThread extends Thread {
         public void run() {
             // thread execution logic
         }
     }

     public class Main {
         public static void main(String[] args) {
             MyThread thread = new MyThread();
             thread.start();
         }
     }
     ```
2. **Need for Multi-Threaded Programming:**

   - **Notes:** Multi-threading is essential for maximizing CPU utilization and achieving concurrent execution.
   - **Example:** Any application requiring parallelism, such as a web server handling multiple client requests simultaneously.
3. **Thread Class API:**

   - **Notes:** The `Thread` class in `java.lang` provides methods to create and control threads.
   - **Example:**
     ```java
     class MyThread extends Thread {
         public void run() {
             // thread execution logic
         }
     }
     ```
4. **Runnable Interface:**

   - **Notes:** The `Runnable` interface offers an alternative to extending the `Thread` class, defining the `run()` method.
   - **Example:**
     ```java
     class MyRunnable implements Runnable {
         public void run() {
             // thread execution logic
         }
     }
     ```
5. **Thread Life-Cycle:**

   - **Notes:** Threads go through states like `NEW`, `RUNNABLE`, `BLOCKED`, `WAITING`, `TIMED_WAITING`, and `TERMINATED`.
   - **Example:** The life cycle transitions when a thread is created, started, waits, and eventually terminates.
6. **Thread Methods:**

   - **Notes:**
     - `start()`: Initiates thread execution.
     - `run()`: Contains the thread's code.
     - `sleep()`: Pauses a thread.
     - `interrupted()`: Checks if a thread is interrupted.
     - `isAlive()`: Tests if a thread is alive.
     - `stop()`: Deprecated, stops a thread abruptly.
     - `wait()`, `notify()`, `join()`: Methods for synchronization.
   - **Example:**
     ```java
     Thread thread = new Thread(() -> {
         // thread logic
     });
     thread.start();
     ```
7. **Thread Priorities:**

   - **Notes:** Thread priorities range from `MIN_PRIORITY` to `MAX_PRIORITY`.
   - **Example:**
     ```java

     Thread thread = new Thread(() -> {
         // thread logic
     });
     thread.setPriority(Thread.MAX_PRIORITY);

     ```
8. **Synchronizing Threads:**

   - **Notes:** Synchronization is crucial for preventing data corruption and ensuring thread safety.
   - **Example:**
     ```java
     class SharedResource {
         private int count = 0;

         public synchronized void increment() {
             count++;
         }
     }
     ```

## Example to demonstrate thread synchronization using a shared resource.

* In this example, two threads will perform a deposit operation on a bank account concurrently.
* Without synchronization, there might be inconsistencies in the account balance, but with synchronization, we ensure that the deposit operation is atomic.

```java
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Synchronized method to perform a deposit
    public synchronized void deposit(double amount) {
        double newBalance = balance + amount;
        // Simulate some processing time
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = newBalance;
    }

    public double getBalance() {
        return balance;
    }
}

class DepositThread extends Thread {
    private BankAccount account;
    private double depositAmount;

    public DepositThread(BankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            account.deposit(depositAmount);
        }
    }
}

public class ThreadSynchronizationBankExample {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(0);

        // Create two threads that deposit money into the same account
        DepositThread thread1 = new DepositThread(account, 10);
        DepositThread thread2 = new DepositThread(account, 5);

        // Start the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        thread1.join();
        thread2.join();

        // Display the final balance
        System.out.println("Final Balance: $" + account.getBalance());
    }
}
```

In this example:

- The `BankAccount` class has a private balance and a synchronized `deposit()` method.
- The `DepositThread` class represents a thread that deposits a specified amount into the bank account.
- In the `ThreadSynchronizationBankExample` class, two threads (`thread1` and `thread2`) are created, both depositing money into the same `BankAccount`.
- The `deposit()` method of the `BankAccount` is synchronized, ensuring that only one thread can perform the deposit operation at a time.
- The `join()` method is used to wait for both threads to complete before displaying the final balance.

By synchronizing the `deposit()` method, we avoid race conditions, and the final balance will be the expected sum of the deposits.

### Advanced Threads Example

A example demonstrating the use of `ExecutorService` with the `newFixedThreadPool` method to create and manage multiple threads:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyTask implements Runnable {
    private int taskId;

    public MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
    }
}

public class ExecutorServiceWithThreadsExample {
    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool of 4 threads
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        // Submit tasks to the ExecutorService
        for (int i = 1; i <= 6; i++) {
            MyTask task = new MyTask(i);
            executorService.submit(task);
        }

        // Shutdown the ExecutorService
        executorService.shutdown();
    }
}
```

In this example:

- The `MyTask` class implements the `Runnable` interface and represents a simple task that prints a message.
- The `ExecutorServiceWithThreadsExample` class creates an `ExecutorService` with a fixed thread pool of 4 threads using `Executors.newFixedThreadPool(4)`.
- Six tasks are submitted to the `ExecutorService` using the `submit()` method.
- The `shutdown()` method is called on the `ExecutorService` to gracefully shut it down.

This example creates a fixed thread pool of 4 threads and submits 6 tasks to the pool. The `ExecutorService` manages the thread pool, and tasks are executed concurrently on the available threads. The output will show the tasks running on different threads from the pool.
