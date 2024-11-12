package list_2;

public class LinkedListMain {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.addFirst("Kim");
		list1.addFirst("Choi");
		list1.addFirst("Joo");
		list1.deleteLastNode();

		
		LinkedList list2 = new LinkedList();
		list2.addFirst("1");
		list2.addFirst("2");
		list2.addFirst("3");

		
		LinkedList.concatList(list1, list2).print();

	}
}

