package list_2;

public class LinkedList {
	private ListNode first;

	public LinkedList() {
		first = null;
	}

	// 첫 번째 위치에 노드를 추가하는 메서드
	public void addFirst(String name) {
		ListNode newNode = new ListNode();
		newNode.setName(name);
		newNode.setLink(first);
		first = newNode;
	}

	// 지정된 위치에 노드를 삽입하는 메서드
	public void insert(String name, ListNode target) {
		ListNode newNode = new ListNode();
		newNode.setName(name);
		if (target == null) {
			newNode.setLink(first);
			first = newNode;
		} else {
			newNode.setLink(target.getLink());
			target.setLink(newNode);
		}
	}

	// 노드를 검색하는 메서드
	public ListNode searchNode(String name) {
		ListNode target = first;
		while (target != null) {
			if (name.equals(target.getName()))
				return target;
			target = target.getLink();
		}
		return null;
	}

	// 특정 노드를 삭제하는 메서드
	public void delete(ListNode p) {
		if (p == null) {
			first = first.getLink();
		} else {
			ListNode q = p.getLink();
			if (q == null)
				return;
			p.setLink(q.getLink());
		}
	}

	// 리스트를 출력하는 메서드
	public void print() {
		ListNode target = first;
		while (target != null) {
			System.out.println(target.getName());
			target = target.getLink();
		}
	}

	// 전달받은 두 리스트를 연결하는 메서드
	public static LinkedList concatList(LinkedList list1, LinkedList list2) {
		if (list1.first == null) return list2; // list1이 비어 있는 경우
		if (list2.first == null) return list1; // list2가 비어 있는 경우

		ListNode current = list1.first;
		while (current.getLink() != null) {
			current = current.getLink();
		}
		current.setLink(list2.first); // list1 끝에 list2를 연결
		return list1;
	}

	// 리스트의 맨 뒤에 새 노드를 추가하는 메서드
	public void append(String name) {
		ListNode newNode = new ListNode();
		newNode.setName(name);
		newNode.setLink(null);

		if (first == null) {
			first = newNode;
		} else {
			ListNode current = first;
			while (current.getLink() != null) {
				current = current.getLink();
			}
			current.setLink(newNode);
		}
	}

	// 리스트의 마지막 노드를 삭제하는 메서드
	public void deleteLastNode() {
		if (first == null) return; // 리스트가 비어 있는 경우
		if (first.getLink() == null) { // 노드가 하나만 있는 경우
			first = null;
			return;
		}
		
		ListNode current = first;
		while (current.getLink().getLink() != null) {
			current = current.getLink();
		}
		current.setLink(null); // 마지막 노드의 이전 노드의 링크를 null로 설정
	}
}
