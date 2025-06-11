package addon_dsa;

import java.util.Scanner;

class DLNode {
    int data;
    DLNode next;
    DLNode prev;

    DLNode(int d) {
        data = d;
    }
}

public class insert_doubly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create the doubly linked list
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        DLNode head = null, tail = null;

        System.out.println("Enter node values:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            DLNode newNode = new DLNode(data);
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

        System.out.print("\nEnter data to insert: ");
        int insertData = sc.nextInt();
        System.out.print("Enter position to insert: ");
        int insertPos = sc.nextInt();

        head = insert(head, insertData, insertPos);

        System.out.println("\nAfter inserting " + insertData + " at position " + insertPos + ":");
        print(head);

        sc.close();
    }

    static DLNode insert(DLNode head, int data, int pos) {
        DLNode newNode = new DLNode(data);

        if (pos == 1) {
            newNode.next = head;
            if (head != null) head.prev = newNode;
            return newNode;
        }

        DLNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null) return head;

        newNode.next = temp.next;
        newNode.prev = temp;
        if (temp.next != null)
            temp.next.prev = newNode;
        temp.next = newNode;

        return head;
    }

    static void print(DLNode node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}
