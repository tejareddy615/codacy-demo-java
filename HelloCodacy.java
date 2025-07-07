import java.util.*;

public class HelloCodacy {

    public static void main(String[] args) {
        int unusedVariable = 5; // Codacy should flag this
        System.out.println("Hello from Codacy Demo!");

        // Bad practice: empty if block
        if (true) {
        }

        // Magic number usage
        int result = add(10, 42); 
        System.out.println("Result: " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // Unused method
    public static void doNothing() {
        // does nothing
    }
}
