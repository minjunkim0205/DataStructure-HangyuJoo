package SinglyLinkedList;

public class Node {
    /*Field */
    private Object data;
    public Node next_node;
    /*Construct */
    Node(){
        this.data = null;
        this.next_node = null;
    }
    Node(Object data){
        this.data = data;
        this.next_node = null;
    }
    /*Method */
    public Object getData() {
        return data;
    }
}
