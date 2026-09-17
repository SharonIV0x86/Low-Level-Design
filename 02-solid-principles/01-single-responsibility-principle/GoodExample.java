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