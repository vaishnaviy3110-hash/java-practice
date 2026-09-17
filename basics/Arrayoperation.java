import java.util.Scanner;

public class ArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int n, choice;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        do {
            System.out.println("\n--- Array Operations ---");
            System.out.println("1. Display");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Update");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Display
                    System.out.println("Array elements:");
                    for (int i = 0; i < n; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    // Insert
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();

                    System.out.print("Enter value: ");
                    int value = sc.nextInt();

                    if (pos < 0 || pos > n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = n; i > pos; i--) {
                            arr[i] = arr[i - 1];
                        }

                        arr[pos] = value;
                        n++;

                        System.out.println("Element inserted successfully.");
                    }
                    break;

                case 3:
                    // Delete
                    System.out.print("Enter position to delete: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position!");
                    } else {
                        for (int i = pos; i < n - 1; i++) {
                            arr[i] = arr[i + 1];
                        }

                        n--;

                        System.out.println("Element deleted successfully.");
                    }
                    break;

                case 4:
                    // Search
                    System.out.print("Enter value to search: ");
                    value = sc.nextInt();

                    int found = -1;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == value) {
                            found = i;
                            break;
                        }
                    }

                    if (found != -1) {
                        System.out.println("Element found at position: " + found);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 5:
                    // Update
                    System.out.print("Enter position to update: ");
                    pos = sc.nextInt();

                    if (pos < 0 || pos >= n) {
                        System.out.println("Invalid position!");
                    } else {
                        System.out.print("Enter new value: ");
                        value = sc.nextInt();

                        arr[pos] = value;

                        System.out.println("Element updated successfully.");
                    }
                    break;

                case 6:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
