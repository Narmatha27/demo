package addon_dsa;

class BiNode {
    int data;
    BiNode next;
    BiNode prev;

    public BiNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class BiLinkedList {
    private BiNode head;

    public void insert(int data) {
        BiNode newNode = new BiNode(data);
        if (head == null) {
            head = newNode;
        } else {
            BiNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void reverse() {
        BiNode current = head;
        BiNode temp = null;

        while (current != null) {
            // Swap next and prev
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            // Move backward (which is forward in the reversed list)
            current = current.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        System.out.println("Doubly Linked List reversed!");
    }

    public void traverse() {
        BiNode current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class mainprg4 {
    public static void main(String[] args) {
        BiLinkedList list = new BiLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Original Doubly Linked List: ");
        list.traverse();

        list.reverse();

        System.out.print("Reversed Doubly Linked List: ");
        list.traverse();
    }
}
