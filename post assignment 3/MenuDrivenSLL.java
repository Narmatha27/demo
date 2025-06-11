package addon_dsa;
import java.util.Scanner;

public class MenuDrivenSLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListNode list = new ListNode(0);  // Changed LinkedList to Listed
        int choice, data;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Traverse");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to insert: ");
                    data = scanner.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    System.out.print("Enter data to delete: ");
                    data = scanner.nextInt();
                    list.delete(data);
                    break;
                case 3:
                    list.traverse();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
