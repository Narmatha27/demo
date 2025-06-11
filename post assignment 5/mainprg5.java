package addon_dsa;

class TwinNode {
    int data;
    TwinNode next;
    TwinNode prev;

    public TwinNode(int data) {
        this.data = data;
        this.next = this.prev = null;
    }
}

class TwinCircularList {
    private TwinNode head;

    public void insert(int data) {
        TwinNode newNode = new TwinNode(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            TwinNode tail = head.prev;

            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void reverse() {
        if (head == null || head.next == head) return;

        TwinNode current = head;
        TwinNode temp = null;

        do {
          
            temp = current.next;
            current.next = current.prev;
            current.prev = temp;
            current = temp;
        } while (current != head);

        
        head = head.next;

        System.out.println("Circular Doubly Linked List reversed!");
    }

    public void traverse() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        TwinNode current = head;
        do {
            System.out.print(current.data + " <-> ");
            current = current.next;
        } while (current != head);
        System.out.println("(head)");
    }
}

public class mainprg5 {
    public static void main(String[] args) {
        TwinCircularList list = new TwinCircularList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.print("Original Circular Doubly Linked List: ");
        list.traverse();

        list.reverse();

        System.out.print("Reversed Circular Doubly Linked List: ");
        list.traverse();
    }
}
