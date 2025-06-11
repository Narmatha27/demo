package addon_dsa;

class ListNode {  
    int data;
    ListNode next;

    public ListNode(int data) {  
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    ListNode head;

    public void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void traverse() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class traversal {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Linked List: ");
        list.traverse();
    }
}
