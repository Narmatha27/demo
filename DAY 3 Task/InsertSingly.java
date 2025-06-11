package addon_dsa;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
    }
}

public class InsertSingly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating the linked list with user input
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        System.out.println("Original list:");
        print(head);

        // Insertion operation
        System.out.print("\nEnter data to insert: ");
        int insertData = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int insertPos = sc.nextInt();
        head = insert(head, insertData, insertPos);
        System.out.println("\nAfter inserting " + insertData + " at position " + insertPos + ":");
        print(head);

        sc.close();
    }

    static Node insert(Node head, int data, int pos) {
        Node n = new Node(data);
        if (pos == 1) {
            n.next = head;
            return n;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;
        if (temp == null) return head;
        n.next = temp.next;
        temp.next = n;
        return head;
    }

    static void print(Node h) {
        while (h != null) {
            System.out.print(h.data + " ");
            h = h.next;
        }
        System.out.println();
    }
}
