package LinkedQueue;

class LinkedQueue {
    /* Field */
    private Node front;
    private Node rear;
    private int count;

    /* Construct */
    LinkedQueue() {
        this.count = 0;
        this.rear = null;
        this.front = this.rear;
    }

    /* Method */
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public int size() {
        return (this.count);
    }

    public void enqueue(String x) {
        Node new_node = new Node();
        new_node.data = x;
        new_node.link = null;
        if(this.isEmpty()){ // LinkedQueue가 비어 있을때
            this.front = new_node;
        }else{
            this.rear.link = new_node;
        }
        this.rear = new_node;
        this.count++;
        return;
    }

    public String dequeue() {
        if(!this.isEmpty()){
            String rollback_data = this.front.data;
            this.front = this.front.link;
            this.count--;
            return (rollback_data);
        }
        return (null);
    }
}