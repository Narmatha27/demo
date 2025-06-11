package addon_dsa;
import java.util.Scanner;

class SLLNode {
    int data;
    SLLNode next;

    public SLLNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyList {
    private SLLNode head;

    public void insert(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SLLNode current = head;
            while (current.next != null)
                current = current.next;
            current.next = newNode;
        }
    }

    public void delete(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        SLLNode current = head;
        while (current.next != null && current.next.data != data)
            current = current.next;

        if (current.next != null)
            current.next = current.next.next;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        SLLNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class MenuDrivenSLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinglyList list = new SinglyList();
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
