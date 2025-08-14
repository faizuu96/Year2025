package aug2025;

public class VaraibaleWithArrayExample {
    public static void main(String[] args) {
        // Integer array
        int[] numbers = {10, 20, 30, 40, 50};

        // String array
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Loop through arrays
        System.out.println("Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nFruits:");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
    }
}
