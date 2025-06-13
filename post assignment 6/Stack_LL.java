package addon_dsa;

import java.util.Scanner;

public class Stack_LL {
	class SNode {
	    int data;
	    Node next;

	    SNode(int d) {
	        data = d;
	    }
	}
	
	    int stack[] = new int[5];
	    int top = -1;

	    public void push(int num) {
	        if (top == stack.length - 1)
	        { 
	            System.out.println("Stack Overflow");
	        } else {
	            stack[++top] = num;
	            System.out.println(num + " pushed into stack.");
	        }
	    }

	    public void pop() {
	        if (top == -1) {
	            System.out.println("Stack Underflow");
	        } else {
	            System.out.println(stack[top] + " popped out");
	            --top;
	        }
	    }

	    public void peek() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.println("Top element is " + stack[top]);
	        }
	    }

	    public void display() {
	        if (top == -1) {
	            System.out.println("Stack is empty.");
	        } else {
	            System.out.println("Stack elements are:");
	            for (int i = 0; i <= top; i++) {
	                System.out.println(stack[i]);
	            }
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Stack_LL s = new   Stack_LL();

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Push");
	            System.out.println("2. Pop");
	            System.out.println("3. Peek");
	            System.out.println("4. Display");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter item to push: ");
	                    int item = sc.nextInt();
	                    s.push(item);
	                    break;
	                case 2:
	                    s.pop();
	                    break;
	                case 3:
	                    s.peek();
	                    break;
	                case 4:
	                    s.display();
	                    break;
	                case 5:
	                    System.out.println("Exiting program.");
	                    sc.close();
	                    return;
	                default:
	                    System.out.println("Invalid option");
	            }
	        }
	    }
	}



