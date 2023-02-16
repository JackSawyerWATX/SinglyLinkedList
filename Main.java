public class Main {
    //Represent a node of the singly linked list
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list 
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {

        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If it is empty, bothe head and tail will point to a new node
            head = newNode;
            tail = newNode;
        } else {
             //newNode will be added after tail and next will point to newNode  
            tail.next = newNode;
            //newNode will becomes the new tail of the list
            tail = newNode;
        }
    }

    //display() displays all nodes in the list
    public void display() {
        //Node current points to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of the Singly Linked List are: ");
        while(current != null) {
            //prints each node by incrimenting pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Main sList = new Main();

        //adding nodes to the list
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);
        sList.addNode(5);
        
        //displays nodes from the list
        sList.display();
    }
}
