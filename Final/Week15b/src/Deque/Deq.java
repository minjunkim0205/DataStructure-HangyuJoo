package Deque;

class Deq {
    /* Field */

    private DNode front;
    private DNode rear;
    private int count;

    /* Construct */
    Deq() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    /* Method */
    public boolean isEmpty() {
        return (this.count == 0);
    }

    public void insertFirst(Object x) {
        DNode new_dnode = new DNode(x);
        if(this.isEmpty()){ // Deq가 비어 있을때
            this.rear = new_dnode;
        }
        else{
            this.front.llink = new_dnode;
            new_dnode.rlink = this.front;
        }
        this.front = new_dnode;
        this.count++;
        return;
    }

    public void insertLast(Object x) {
        DNode new_dnode = new DNode(x);
        if(this.isEmpty()){ // Deq가 비어 있을때
            this.front = new_dnode;
        }
        else{
            this.rear.rlink = new_dnode;
            new_dnode.llink = this.rear;
        }
        this.rear = new_dnode;
        this.count++;
        return;
    }

    public Object deleteFirst() {
        if(!this.isEmpty()){
            Object rollback_data = this.front.data;
            this.front = this.front.rlink;
            this.count--;
            return (rollback_data);
        }
        return (null);
    }

    public Object deleteLast() {
        if(!this.isEmpty()){
            Object rollback_data = this.rear.data;
            this.rear = this.rear.llink;
            this.count--;
            return (rollback_data);
        }
        return (null);
    }
}
