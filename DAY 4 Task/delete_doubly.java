package addon_dsa;
import java.util.Scanner;

class DoublyNode {
    int data;
    DoublyNode next, prev;

    DoublyNode(int d) {
        data = d;
    }
}

public class delete_doubly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Build the doubly linked list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        DoublyNode head = null, tail = null;

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            DoublyNode newNode = new DoublyNode(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        System.out.println("Original list:");
        print(head);

        // Step 2: Delete a node by position
        System.out.print("\nEnter position to delete: ");
        int deletePos = sc.nextInt();
        head = delete(head, deletePos);

        System.out.println("\nAfter deleting node at position " + deletePos + ":");
        print(head);

        sc.close();
    }

    static DoublyNode delete(DoublyNode head, int pos) {
        if (head == null || pos <= 0) return head;

        if (pos == 1) {
            DoublyNode nextNode = head.next;
            if (nextNode != null) nextNode.prev = null;
            return nextNode;
        }

        DoublyNode temp = head;
        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return head;

        if (temp.prev != null) temp.prev.next = temp.next;
        if (temp.next != null) temp.next.prev = temp.prev;

        return head;
    }

    static void print(DoublyNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
