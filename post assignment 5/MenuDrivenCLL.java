
	package addon_dsa;

	import java.util.Scanner;

	class CircleSNode {
	    int data;
	    CircleSNode next;

	    public CircleSNode(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class CircularSinglyList {
	    private CircleSNode tail;

	    public void insert(int data) {
	        CircleSNode newNode = new CircleSNode(data);
	        if (tail == null) {
	            tail = newNode;
	            tail.next = tail; // point to self
	        } else {
	            newNode.next = tail.next;
	            tail.next = newNode;
	            tail = newNode;
	        }
	    }

	    public void delete(int data) {
	        if (tail == null) return;

	        CircleSNode current = tail.next;
	        CircleSNode prev = tail;
	        boolean found = false;

	        do {
	            if (current.data == data) {
	                found = true;
	                break;
	            }
	            prev = current;
	            current = current.next;
	        } while (current != tail.next);

	        if (!found) return;

	        if (current == current.next) {
	            tail = null;
	        } else {
	            prev.next = current.next;
	            if (current == tail) {
	                tail = prev;
	            }
	        }
	    }

	    public void traverse() {
	        if (tail == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        CircleSNode current = tail.next;
	        do {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        } while (current != tail.next);
	        System.out.println("(back to head)");
	    }
	}

	public class MenuDrivenCLL {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        CircularSinglyList list = new CircularSinglyList();
	        int choice, data;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Insert");
	            System.out.println("2. Delete");
	            System.out.println("3. Traverse");
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
	                    list.traverse();
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



