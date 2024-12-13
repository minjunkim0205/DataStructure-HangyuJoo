package Queue;

public class Queue {
    /* Field */
    private final int MAX = 100;
    private String[] data;
    private int front;
    private int rear;

    /* Construct */
    Queue() {
        this.data = new String[this.MAX];
        this.front = 0;
        this.rear = 0;
        return;
    }

    /* Method */
    public int size() {
        return (this.rear - this.front);
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public void enqueue(String x) {
        if (this.rear != this.MAX - 1) { // data에 빈 공간이 있을때
            this.data[this.rear] = x;
            this.rear++;
        }
        return;
    }

    public String dequeue() {
        if (!this.isEmpty()) { // data에 값이 있을때
            String rollback_data = this.data[this.front];
            this.front++;
            return (rollback_data);
        }
        return (null);
    }
}