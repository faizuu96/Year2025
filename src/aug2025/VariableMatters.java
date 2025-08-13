package aug2025;

public class VariableMatters {

        // Class variable (static variable) - shared among all instances
        private static int classCounter = 0;

        // Instance variables - each object has its own copy
        private String instanceName;
        private double instanceValue;

        // Constants (final variables)
        public static final double PI = 3.14159;
        public final int MAX_RETRIES = 3;

        public VariableMatters(String name, double value) {
            this.instanceName = name;
            this.instanceValue = value;
            classCounter++; // Increment class counter with each new instance
        }

        // Method demonstrating local variables
        public void processData(int input) {
            // Local variables - exist only within this method
            int localCounter = 0;
            double result = 0.0;
            final String PROCESS_NAME = "DataProcessing";

            System.out.println("\n--- Processing Data ---");
            System.out.println("Process: " + PROCESS_NAME);
            System.out.println("Input received: " + input);

            // Modify instance variable
            this.instanceValue += input;

            // Perform calculations with local variables
            for (int i = 0; i < input; i++) {
                localCounter++;
                result += Math.sqrt(i) * this.instanceValue;
            }

            System.out.println("Local counter: " + localCounter);
            System.out.println("Calculation result: " + result);
            System.out.println("Updated instance value: " + this.instanceValue);
        }

        public void displayInfo() {
            System.out.println("\n--- Object Information ---");
            System.out.println("Instance Name: " + this.instanceName);
            System.out.println("Instance Value: " + this.instanceValue);
            System.out.println("Class Counter: " + classCounter);
            System.out.println("PI Constant: " + PI);
            System.out.println("Max Retries: " + MAX_RETRIES);
        }

        public static void main(String[] args) {
            // Demonstrating primitive data types
            byte smallNumber = 100;          // 8-bit integer
            short mediumNumber = 1000;       // 16-bit integer
            int count = 10;                  // 32-bit integer
            long bigNumber = 1000000000L;    // 64-bit integer
            float price = 19.99f;            // 32-bit floating point
            double preciseValue = 3.14159265;// 64-bit floating point
            boolean isActive = true;        // true/false
            char grade = 'A';               // 16-bit Unicode character

            // Demonstrating object/reference types
            String message = "Hello, Java Backend Developer!";
            Integer counterObject = Integer.valueOf(count);

            System.out.println("Primitive Types:");
            System.out.println("byte: " + smallNumber);
            System.out.println("short: " + mediumNumber);
            System.out.println("int: " + count);
            System.out.println("long: " + bigNumber);
            System.out.println("float: " + price);
            System.out.println("double: " + preciseValue);
            System.out.println("boolean: " + isActive);
            System.out.println("char: " + grade);

            System.out.println("\nReference Types:");
            System.out.println("String: " + message);
            System.out.println("Integer: " + counterObject);

            // Working with our VariableMastery class
            VariableMatters obj1 = new VariableMatters("First Object", 10.5);
            obj1.displayInfo();
            obj1.processData(5);

            VariableMatters obj2 = new VariableMatters("Second Object", 20.0);
            obj2.displayInfo();
            obj2.processData(3);

            // Showing class variable is shared
            System.out.println("\nFinal Class Counter: " + VariableMatters.classCounter);

            // Showing constants
            System.out.println("\nCircle Area with radius 5: " + (VariableMatters.PI * 5 * 5));
        }
    }

