package ar.com.algoritmos.powermock;

public class SimpleClass {

    public SimpleClass() {
        // Do something.
        System.out.println("SimpleClass called!");
    }

    public final String helloWorld() {
        return "Hello World!";
    }

    public static String helloName(String name) {
        return "Hello " + name;
    }

    public static String firstMethod() {
        return "firstMethod";
    }

    public static String secondMethod() {
        return "secondMethod";
    }

    private String thirdMethod() {
        return "thirdMethod";
    }

    public String thirdMethodCaller() {
        return thirdMethod() + " thirdMethodCaller";
    }
}
