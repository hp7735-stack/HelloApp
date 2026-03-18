public class HelloApp {

    public static void main(String[] args) {

        // Assign name using ternary operator (default = "World")
        String name = (args.length > 0) ? args[0] : "World";

        // Display greeting
        System.out.println("Hello, " + name + "!");
    }

}