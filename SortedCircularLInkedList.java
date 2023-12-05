class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedCircularLinkedList {
    Node head;

    public SortedCircularLinkedList() {
        this.head = null;
    }

    // Function to insert a new element in a sorted circular linked list
    public void insert(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself for circularity
        } else if (newData < head.data) {
            // Insert at the beginning
            newNode.next = head;
            Node last = getLastNode();
            last.next = newNode; // Update last node's next to the new node
            head = newNode; // Update head
        } else {
            // Insert in the middle or at the end
            Node current = head;
            while (current.next != head && current.next.data < newData) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // Helper function to get the last node in the circular linked list
    private Node getLastNode() {
        Node current = head;
        while (current.next != head) {
            current = current.next;
        }
        return current;
    }

    // Function to display the elements of the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    public static void main(String[] args) {
        SortedCircularLinkedList list = new SortedCircularLinkedList();
        list.insert(3);
        list.insert(5);
        list.insert(8);
        list.insert(1);

        System.out.println("Sorted Circular Linked List:");
        list.display();
        
    }
    
}