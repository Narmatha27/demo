package addon_dsa;

import java.util.Arrays;
import java.util.Scanner;

public class mainprg6 {
	
	 
		int[]queue=new int[5];
		int rear;
		int front;
		public mainprg6()
		{
			rear=-1;
			front=-1;
		}
		public void enqueue(int num)
		{
			if(rear==4)
			{
				System.out.println("Queue speedout");
			}
			else
			{
				queue[++rear]=num;
			}
		}
		public void dequeue()
		{
			if(front==4)
			{
				System.out.println("empty queue");
			}
			else
			{
				queue[++front]=0;
			}
		}
		public void peek() {
	        if (front == -1 || front > rear) {
	            System.out.println("Queue is empty");
	        } else {
	            System.out.println("Front element is " + queue[front]);
	        }
	    }
		public void display()
		{
			System.out.println(Arrays.toString(queue));
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			mainprg6 q=new mainprg6();
			 while (true)
			 {
		            System.out.println("\nMenu:");
		            System.out.println("1. Enqueue");
		            System.out.println("2. Dequeue");
		            System.out.println("3. Peek");
		            System.out.println("4. Display");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");

		            int choice = sc.nextInt();

		            switch (choice) 
		            {
		                case 1:
		                    System.out.print("Enter element to enqueue: ");
		                    int item = sc.nextInt();
		                    q.enqueue(item);
		                    break;
		                case 2:
		                    q.dequeue();
		                    break;
		                case 3:
		                    q.peek();
		                    break;
		                case 4:
		                    q.display();
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
	


