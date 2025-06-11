package addon_dsa;

	import java.util.Scanner;


	

	class CLNode {
	    int data;
	    CLNode next;

	    CLNode(int d) {
	        data = d;
	    }
	}

	public class insert_circular {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of nodes: ");
	        int n = sc.nextInt();
	        CLNode head = null, tail = null;

	        System.out.println("Enter node values:");
	        for (int i = 0; i < n; i++) {
	            int data = sc.nextInt();
	            CLNode newNode = new CLNode(data);
	            if (head == null) {
	                head = tail = newNode;
	                head.next = head;
	                tail.next = newNode;
	                tail = newNode;
	                tail.next = head;
	            }
	        }

	        System.out.println("Original circular list:");
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

	    static CLNode insert(CLNode head, int data, int pos) {
	        CLNode newNode = new CLNode(data);

	        if (head == null) {
	            newNode.next = newNode;
	            return newNode;
	        }

	        if (pos == 1) {
	            CLNode tail = head;
	            while (tail.next != head)
	                tail = tail.next;

	            newNode.next = head;
	            tail.next = newNode;
	            return newNode; // new head
	        }

	        CLNode temp = head;
	        for (int i = 1; i < pos - 1 && temp.next != head; i++)
	            temp = temp.next;

	        newNode.next = temp.next;
	        temp.next = newNode;
	        return head;
	    }

	    static void print(CLNode head) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }

	        CLNode temp = head;
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != head);
	        System.out.println();
	    }
	}



