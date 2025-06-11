package addon_dsa;  

class Node {    
    int data;    
    Node next;     

    public Node(int data) {        
        this.data = data;        
        this.next = null;    
    } 
}  

class Listed {    
    Node head;     

    public void insert(int data) {        
        Node newNode = new Node(data);        
        if (head == null) {            
            head = newNode;        
        } else {            
            Node current = head;            
            while (current.next != null) {                
                current = current.next;            
            }            
            current.next = newNode;        
        }    
    }     

    public void reverse() {        
        Node prev = null;        
        Node current = head;        
        Node next;         

        while (current != null) {            
            next = current.next;               
            current.next = prev;               
            prev = current;                    
            current = next;                
        }        
        head = prev;         

        System.out.println("Linked List reversed!");    
    }     

    public void traverse() {        
        Node current = head;        
        while (current != null) {            
            System.out.print(current.data + " -> ");            
            current = current.next;        
        }        
        System.out.println("null");    
    } 
}  

public class mainprg3 {    
    public static void main(String[] args) {        
        Listed list = new Listed();  // Correct class name usage        
        list.insert(1);        
        list.insert(2);        
        list.insert(3);        
        list.insert(4);         

        System.out.print("Original Linked List: ");        
        list.traverse();         

        list.reverse();  // Reverse the list        

        System.out.print("Reversed Linked List: ");        
        list.traverse();  // Print reversed list    
    } 
}
