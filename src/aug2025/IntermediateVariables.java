package aug2025;

public class IntermediateVariables {
    // Instance variable
    String language = "Java";

    // Static variable
    static String creator = "James Gosling";

    public static void main(String[] args) {
        // Local variable
        int version = 17; // Inferred as int

        System.out.println("Language: " + new IntermediateVariables().language);
        System.out.println("Creator: " + creator);
        System.out.println("Version: " + version);

        // Type casting example
        double salary = 50000.75;
        int intSalary = (int) salary; // Explicit cast (loses decimal)
        System.out.println("Salary (int): " + intSalary);
    }
}