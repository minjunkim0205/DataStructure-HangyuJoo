package list;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		list1.insert("Kim", null);
		list1.addFirst("Park");
		list1.addFirst("Joo");
		list1.insert("Kang", list1.searchNode("Joo")); // Joo 뒤에 Kang 삽입
		list1.print();
		System.out.println("---------------------------");
		list1.delete(list1.searchNode("Park")); // Park 뒤에 노드(Kim) 삭제 
		list1.print();
	}

}