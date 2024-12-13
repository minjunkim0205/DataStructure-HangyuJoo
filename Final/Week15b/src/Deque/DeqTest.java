package Deque;

public class DeqTest {
    public static void main(String args[]) {
        Deq q = new Deq();
        q.insertLast("a");
        q.insertLast("b");
        System.out.println(q.deleteFirst());
        q.insertLast("c");
        q.insertLast("d");
        System.out.println(q.deleteFirst());
        System.out.println(q.deleteFirst());
        q.insertLast("e");
        System.out.println(q.deleteFirst());
        q.insertLast("f");
        q.insertLast("g");
        q.insertLast("h");
        System.out.println(q.deleteFirst());
        System.out.println(q.deleteFirst());
        q.insertLast("i");
        System.out.println(q.deleteFirst());
        System.out.println(q.deleteFirst());
        System.out.println(q.deleteFirst());
    }
}