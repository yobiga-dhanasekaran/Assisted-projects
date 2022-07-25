package array;

public class doublylist {
    class Node{  
        int data;  
        Node previous;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
    Node head, tail = null;  
  
      
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
     
        if(head == null) {  
             
            head = tail = newNode;  
             
            head.previous = null;  
            
            tail.next = null;  
        }  
        else {  
             
            tail.next = newNode;  
            //newNode's previous will point to tail  
            newNode.previous = tail;  
            //newNode will become new tail  
            tail = newNode;  
            //As it is last node, tail's next will point to null  
            tail.next = null;  
        }  
    }  
  
    //display() will print out the nodes of the list  
    public void display() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Prints each node by incrementing the pointer.  
  
            System.out.print(current.data + " ");  
            current = current.next;  
        }  
    }  
  
    public static void main(String[] args) {  
  
        doublylist dList = new doublylist();  
        //Add nodes to the list  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
  
        //Displays the nodes present in the list  
        dList.display();  
    }  
}  