package addon_dsa;

class SLNode {    
    int data;    
    SLNode next;     

    public SLNode(int data) {        
        this.data = data;        
        this.next = null;    
    } 
}  

class Listed {    
    SLNode head;     

    public void insert(int data) {        
        SLNode newNode = new SLNode(data);        
        if (head == null) {            
            head = newNode;        
        } else {            
            SLNode current = head;            
            while (current.next != null) {                
                current = current.next;            
            }            
            current.next = newNode;        
        }    
    }     

    public void reverse() {        
        SLNode prev = null;        
        SLNode current = head;        
        SLNode next;         

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
        SLNode current = head;        
        while (current != null) {            
            System.out.print(current.data + " -> ");            
            current = current.next;        
        }        
        System.out.println("null");    
    } 
}  

public class mainprg3 {    
    public static void main(String[] args) {        
        Listed list = new Listed();        
        list.insert(1);        
        list.insert(2);        
        list.insert(3);        
        list.insert(4);         

        System.out.print("Original Linked List: ");        
        list.traverse();         

        list.reverse();        

        System.out.print("Reversed Linked List: ");        
        list.traverse();    
    } 
}
