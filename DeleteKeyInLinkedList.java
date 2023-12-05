class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void deleteKey(int key) {
        Node current = head;
        Node prev = null;

        // Check if the key is present at the head
        if (current != null && current.data == key) {
            head = current.next;
            return;
        }

        // Search for the key in the linked list
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key is not present
        if (current == null) {
            System.out.println("Key not found in the linked list.");
            return;
        }

        // Delete the first occurrence of the key
        prev.next = current.next;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class DeleteKeyInLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements into the linked list
        linkedList.insert(5);
        linkedList.insert(3);
        linkedList.insert(7);
        linkedList.insert(2);
        linkedList.insert(8);

        System.out.println("Original Linked List:");
        linkedList.display();

        // Delete the first occurrence of the key
        int keyToDelete = 7;
        linkedList.deleteKey(keyToDelete);

        System.out.println("Linked List after deleting key " + keyToDelete + ":");
        linkedList.display();
    }

}



