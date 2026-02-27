import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();   // Number of items
        scanner.nextLine();          // Consume newline

        ArrayList<String> items = new ArrayList<>();

        // Read items
        String[] inputItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            items.add(inputItems[i]);
        }

        // Sort alphabetically
        Collections.sort(items);

        // Read search item
        String searchItem = scanner.nextLine();

        // Print sorted list
        System.out.println("Sorted Items: " + items);

        // Check existence
        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
