package addon_dsa;

public class Stack {
	int mystack[]=new int[5];
	int top=-1;
	public void push(int num)
	{
		if(top==4)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			mystack[++top]=num;
		}
	}
   public void pop()
   {
	   if(top<1)
	   {
		   System.out.println("underflow");
	   }
	   else
	   {
		   System.out.println(mystack[top]+"popped out");
		   --top;
	   }
	    
	   }
   public void display()
   {
	   for(int i=1;i<mystack.length;i++)
	   {
		   System.out.println(mystack[i]+"");
	   }
   }
 public static void main(String args[])
 {
	 Stack s=new Stack();
	 s.push(15);
	 s.push(30);
	 s.push(45);
	 s.pop();
	 s.push(60);
	 s.pop();
	 s.push(75);
	 
	 s.display();


 }
}

