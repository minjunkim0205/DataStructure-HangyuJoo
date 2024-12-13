package LinkedQueue;

public class QTest {
    public static void main(String args[]) {
        LinkedQueue q = new LinkedQueue();
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
