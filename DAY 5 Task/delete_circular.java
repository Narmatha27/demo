
	package addon_dsa;

	import java.util.Scanner;

	class CDNode {
	    int data;
	    CDNode next, prev;

	    CDNode(int d) {
	        data = d;
	        next = prev = null;
	    }
	}

	public class delete_circular{
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	       
	        System.out.print("Enter number of nodes: ");
	        int n = sc.nextInt();
	        CDNode head = null, tail = null;

	        System.out.println("Enter node values:");
	        for (int i = 0; i < n; i++) {
	            int data = sc.nextInt();
	            CDNode newNode = new CDNode(data);
	            if (head == null) {
	                head = tail = newNode;
	                head.next = head.prev = head; 
	            } else {
	                newNode.prev = tail;
	                newNode.next = head;
	                tail.next = newNode;
	                head.prev = newNode;
	                tail = newNode;
	            }
	        }

	        System.out.println("Original circular doubly linked list:");
	        print(head);

	       
	        System.out.print("\nEnter position to delete: ");
	        int pos = sc.nextInt();
	        head = delete(head, pos);

	        System.out.println("\nList after deleting position " + pos + ":");
	        print(head);

	        sc.close();
	    }

	    static CDNode delete(CDNode head, int pos) {
	        if (head == null || pos <= 0) return head;

	       
	        if (head.next == head && pos == 1) return null;

	        if (pos == 1) {
	            CDNode tail = head.prev;
	            head = head.next;
	            tail.next = head;
	            head.prev = tail;
	            return head;
	        }

	        CDNode temp = head;
	        for (int i = 1; i < pos && temp.next != head; i++) {
	            temp = temp.next;
	        }

	        if (temp == head) return head;
	        temp.prev.next = temp.next;
	        temp.next.prev = temp.prev;

	        return head;
	    }

	    static void print(CDNode head) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        CDNode temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }
	}



