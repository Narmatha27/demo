package addon_dsa;


	class DLLNode {
	    int data;
	    DLLNode next;
	    DLLNode prev;

	    public DLLNode(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyLinkedList {
	    DLLNode head;

	    public void insert(int data) {
	        DLLNode newNode = new DLLNode(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            DLLNode tail = head;
	            while (tail.next != null) {
	                tail = tail.next;
	            }
	            tail.next = newNode;
	            newNode.prev = tail;
	        }
	    }

	    public void traverseForward() {
	        DLLNode current = head;
	        System.out.print("Forward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            if (current.next == null) break; // Save last node for reverse
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public void traverseBackward() {
	        DLLNode current = head;
	        if (current == null) {
	            System.out.println("Backward: List is empty.");
	            return;
	        }

	        // Move to tail
	        while (current.next != null) {
	            current = current.next;
	        }

	        System.out.print("Backward: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.prev;
	        }
	        System.out.println();
	    }
	}

	public class DLLTraversal {
	    public static void main(String[] args) {
	        DoublyLinkedList dll = new DoublyLinkedList();
	        dll.insert(10);
	        dll.insert(20);
	        dll.insert(30);
	        dll.insert(40);

	        dll.traverseForward();
	        dll.traverseBackward();
	    }
	}



