package SinglyLinkedList;

public class LinkedList {
    /* Field */
    private Node head;

    /* Construct */
    LinkedList() {
        this.head = null;
    }

    /* Method */
    public Node search(Object data) {
        if(this.head == null){
            return null;
        }
    
        if(this.head.getData().equals(data)){
            return this.head;
        }

        Node current_node = this.head;
        while (current_node.next_node != null) {
            if (current_node.next_node.getData().equals(data)) {
                return current_node.next_node;
            }
            current_node = current_node.next_node;
        }
        return null;
    }

    public void insert(Object data) {
        if (this.head == null) {
            this.head = new Node(data);
            return;
        }

        Node current_node = this.head;
        while (current_node.next_node != null) {
            current_node = current_node.next_node;
        }
        current_node.next_node = new Node(data);
    }

    public void insert(Object data, Node target_node) {
        if(this.head == null){
            return;
        }

        Node current_node = this.head;
        while (current_node.next_node != null) {
            
        }
    }

    public void delete() {
        if (this.head == null) {
            return;
        }

        if (this.head.next_node == null) {
            this.head = null;
            return;
        }

        Node current_node = this.head;
        while (current_node.next_node.next_node != null) {
            current_node = current_node.next_node;
        }
        current_node.next_node = null;
    }

    public void delete(Object data) {
        if (this.head == null) {
            return;
        }

        if (this.head.getData().equals(data)) {
            this.head = this.head.next_node;
            return;
        }

        Node current_node = this.head;
        while (current_node.next_node != null) {
            if (current_node.next_node.getData().equals(data)) {
                current_node.next_node = current_node.next_node.next_node;
                return;
            }
            current_node = current_node.next_node;
        }
    }

    public void print() {
        Node current_node = this.head;
        System.out.print("[ ");
        while (current_node != null) {
            System.out.print(current_node.getData() + " ");
            current_node = current_node.next_node;
        }
        System.out.print("]");
    }

    public void println() {
        this.print();
        System.out.print("\n");
    }
}
