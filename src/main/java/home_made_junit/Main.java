package home_made_junit;

/**
 * @author Evgeny Borisov
 */
public class Main {
    public static void main(String[] args) {
        TestRunner testRunner = new TestRunner();
        testRunner.runAllTestsForClassByName("home_made_junit.TestClass");
    }
}

