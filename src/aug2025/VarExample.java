package aug2025;

public class VarExample {

        public static void main(String[] args) {
            // Type inference with 'var'
            int age = 25;          // Inferred as 'int'
            String name = "Bob";      // Inferred as 'String'
            float salary = 75000.0f;  // Inferred as 'double'

            System.out.println(name + " is " + age + " years old and earns $" + salary);
        }
    }

