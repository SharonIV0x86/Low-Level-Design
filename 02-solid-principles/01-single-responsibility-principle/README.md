# Single Responsibility Principle (SRP)

Part of the [SOLID principles](../README.md). The **S** in SOLID stands for the Single Responsibility Principle.

## Definition

A class should have only one reason to change. In other words, a class should only have one job, one responsibility, and one purpose.

If a class takes more than one responsibility, it becomes coupled. This means that if one responsibility changes, the other responsibilities may also be affected, leading to a ripple effect of changes throughout the codebase.

## Real-life Analogy

Imagine a chef who is responsible for cooking, cleaning, serving food and ordering groceries. If the chef is busy cleaning, they can't focus on cooking, and the quality of the food may suffer.

Instead, different people should handle each task: one person cooks (chef), another cleans (cleaner), a third serves (waiter) and another orders groceries (manager). This way, each person can focus on their specific responsibility, leading to better results overall.

## Significance of SRP

Let us understand this with the example of an online compiler. Currently, the compiler does the following things:

- Adds driver code
- Performs syntax check
- Runs code with already fed test cases
- Stores the output in a database
- Returns the necessary output to the user

Implementing all the above functionalities in a single `Compiler` class would violate the Single Responsibility Principle (SRP).

Instead, we can break it down into smaller classes, each with a single responsibility:

- `DriverCodeGenerator` — responsible for adding driver code.
- `SyntaxChecker` — responsible for performing syntax checks.
- `TestRunner` — responsible for running code with test cases.
- `DatabaseManager` — responsible for storing output in the database.
- `UserOutputHandler` — responsible for returning output to the user.

Another class named `Coordinator` can be added to coordinate between all these classes/modules.

By following the Single Responsibility Principle, we can make the code more modular, easier to maintain, and less prone to bugs. Each class can be modified or replaced independently without affecting the others.

## Code Examples

### Bad: one class doing everything

`Compiler` owns driver code, syntax checking, test running, database storage, and user output. Changing any one concern means touching this single class and risks breaking the others.

```java
class Compiler {
    public void addDriverCode() { System.out.println("Adding driver code..."); }
    public void syntaxCheck()   { System.out.println("Performing syntax check..."); }
    public void runTests()      { System.out.println("Running test cases..."); }
    public void storeInDB()     { System.out.println("Storing output in database..."); }
    public void sendToUser()    { System.out.println("Returning output to user..."); }

    public void compile() {
        addDriverCode();
        syntaxCheck();
        runTests();
        storeInDB();
        sendToUser();
    }
}

public class BadExample {
    public static void main(String[] args) {
        Compiler compiler = new Compiler();
        compiler.compile();
    }
}
```

Full file: [`BadExample.java`](BadExample.java)

### Good: one class per responsibility

Each concern lives in its own small class, and a `CompilerCoordinator` simply orchestrates them. Any module can now be replaced or modified in isolation.

```java
class DriverCodeGenerator {
    public void addDriverCode() { System.out.println("Adding driver code..."); }
}

class SyntaxChecker {
    public void syntaxCheck() { System.out.println("Performing syntax check..."); }
}

class TestRunner {
    public void runTests() { System.out.println("Running test cases..."); }
}

class DatabaseManager {
    public void storeInDB() { System.out.println("Storing output in database..."); }
}

class UserOutputHandler {
    public void sendToUser() { System.out.println("Returning output to user..."); }
}

class CompilerCoordinator {
    public void compile() {
        DriverCodeGenerator driverCode = new DriverCodeGenerator();
        SyntaxChecker syntaxChecker = new SyntaxChecker();
        TestRunner testRunner = new TestRunner();
        DatabaseManager databaseManager = new DatabaseManager();
        UserOutputHandler userOutputHandler = new UserOutputHandler();

        driverCode.addDriverCode();
        syntaxChecker.syntaxCheck();
        testRunner.runTests();
        databaseManager.storeInDB();
        userOutputHandler.sendToUser();
    }
}

public class GoodExample {
    public static void main(String[] args) {
        CompilerCoordinator coordinator = new CompilerCoordinator();
        coordinator.compile();
    }
}
```

Full file: [`GoodExample.java`](GoodExample.java)

## Advantages of SRP

- **Improved Maintainability:** changes in one part of the system won't affect other parts, making it easier to maintain and update.
- **Enhanced Readability:** smaller, focused classes are easier to read and understand.
- **Better Reusability:** classes with a single responsibility can be reused in different contexts without bringing unnecessary dependencies.
- **Facilitates Testing:** smaller classes are easier to test, as they have fewer dependencies and responsibilities.
- **Lower Risk in Changes:** since each class handles only one concern, changes made to it are less likely to cause unintended side effects in other parts of the system.

## Common Mistakes When Violating SRP

- **Mixing Database Logic with Business Logic:** putting both data access (e.g., SQL, JDBC) and core business rules in the same class. This makes it hard to change the database layer without affecting business logic.
- **Coupling UI Code with Business Logic:** embedding application logic directly in the UI layer. This makes it tedious to change the UI without affecting the underlying logic.

## Note

An important question to ask is: "Is SRP just for classes?"

The answer is no. SRP can be applied to methods, modules, microservices and even entire systems. The key is to ensure that each component has a single responsibility and that changes in one area do not affect others unnecessarily.

Hence, SRP is not just for classes. It's a mindset you can apply from the smallest method to the largest system design.