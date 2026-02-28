import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> items = new ArrayList<>();

        String[] inputItems = scanner.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            items.add(inputItems[i]);
        }

        Collections.sort(items);

        String searchItem = scanner.nextLine();

        System.out.println("Sorted Items: " + items);

        if (items.contains(searchItem)) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }
}
