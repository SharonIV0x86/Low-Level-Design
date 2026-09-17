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