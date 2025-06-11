package addon_dsa;
	import java.util.Scanner;

	class DoubleNode {
	    int data;
	    DoubleNode next;
	    DoubleNode prev;

	    public DoubleNode(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}

	class DoublyList {
	    private DoubleNode head;

	    public void insert(int data) {
	        DoubleNode newNode = new DoubleNode(data);
	        if (head == null) {
	            head = newNode;
	        } else {
	            DoubleNode current = head;
	            while (current.next != null)
	                current = current.next;
	            current.next = newNode;
	            newNode.prev = current;
	        }
	    }

	    public void delete(int data) {
	        if (head == null) return;

	        // Deleting head
	        if (head.data == data) {
	            head = head.next;
	            if (head != null)
	                head.prev = null;
	            return;
	        }

	        DoubleNode current = head;
	        while (current != null && current.data != data)
	            current = current.next;

	        if (current == null) return;

	        if (current.prev != null)
	            current.prev.next = current.next;
	        if (current.next != null)
	            current.next.prev = current.prev;
	    }

	    public void traverseForward() {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        DoubleNode current = head;
	        while (current != null) {
	            System.out.print(current.data + " <-> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

	public class MenuDrivenDLL {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        DoublyList list = new DoublyList();
	        int choice, data;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Traverse Forward");
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
	                    list.traverseForward();
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



