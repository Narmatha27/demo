package addon_dsa;
import java.util.Scanner;

class ListNode {
    int data;
    ListNode next;
    
    ListNode(int d) {
        data = d;
    }
}


public class deletesingly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        
        System.out.print("\nEnter position to delete: ");
        int deletePos = sc.nextInt();
        head = delete(head, deletePos);
        System.out.println("\nAfter deleting node at position " + deletePos + ":");
        print(head);

        sc.close();
    }

    static Node delete(Node head, int pos) {
        if (head == null) return null; 

        if (pos == 1) return head.next; 

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp.next != null; i++)
            temp = temp.next;

        if (temp.next == null) return head; 

        temp.next = temp.next.next;

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
