package Queue;

public class QTest1 {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue("a");
        q.enqueue("b");
        System.out.println(q.dequeue());
        q.enqueue("c");
        q.enqueue("d");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("e");
        System.out.println(q.dequeue());
        q.enqueue("f");
        q.enqueue("g");
        q.enqueue("h");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        q.enqueue("i");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}
