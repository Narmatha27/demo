package addon_dsa;

class CircleNode {
    int data;
    CircleNode next;

    public CircleNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private CircleNode tail;

    public void insert(int data) {
        CircleNode newNode = new CircleNode(data);
        if (tail == null) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void traverse() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        CircleNode current = tail.next;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != tail.next);
        System.out.println();
    }
}

public class CLLTraversal {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);

        cll.traverse();
    }
}
