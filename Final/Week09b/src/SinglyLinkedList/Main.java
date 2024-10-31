package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        // Make linked list
        LinkedList linked_list = new LinkedList();
        char[] data_set = {'@', 'A', 'B', 'D', 'F', 'H', '#', 'I', 'J', 'K'};
        // Insert test
        for (char c : data_set) {
            linked_list.insert(c);
        }
        linked_list.println();
        // Delete test
        linked_list.delete();
        linked_list.delete();
        linked_list.println();
        // Delete element test
        linked_list.delete('@');
        linked_list.delete('#');
        linked_list.println();
    }
}
