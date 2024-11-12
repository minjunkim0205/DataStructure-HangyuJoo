package circular;

public class CircularList {
	private ListNode tail;
	
	public CircularList() {
		tail = null;
	}
	
	// 리스트의 길이를 반환하는 메서드
	public int size() {
		if (tail == null) return 0;
		int len = 1;
		ListNode p = tail.getLink();
		while (p != tail) {
			len++;
			p = p.getLink();
		}
		return len;
	}

	// 리스트의 맨 앞에 새로운 노드를 추가하는 메서드
	public void addFirst(String name) {
		ListNode newNode = new ListNode();
		newNode.setName(name);

		if (tail == null) { // 리스트가 비어 있을 경우
			tail = newNode;
			tail.setLink(tail); // 원형으로 연결
		} else { 
			newNode.setLink(tail.getLink());
			tail.setLink(newNode);
		}
	}

	// 리스트에서 targetName을 가진 노드를 검색하는 메서드
	public ListNode listSearch(String targetName) {
		if (tail == null) return null; // 리스트가 비어 있는 경우

		ListNode p = tail.getLink();
		do {
			if (p.getName().equals(targetName)) return p;
			p = p.getLink();
		} while (p != tail.getLink()); // 한 바퀴 돌 때까지 반복

		return null; // 찾지 못한 경우
	}

	// target 노드 뒤의 노드를 삭제하는 메서드
	public void delete(ListNode target) {
		if (tail == null || target == null) return;

		ListNode current = target.getLink();
		if (current == target) { // 리스트에 노드가 하나뿐인 경우
			tail = null;
		} else {
			if (current == tail) { // 삭제할 노드가 tail일 경우
				tail = target;
			}
			target.setLink(current.getLink()); // target의 다음 노드를 연결하여 current 삭제
		}
	}

	// 리스트의 모든 노드를 출력하는 메서드
	public void print() {
		if (tail == null) return; // 리스트가 비어 있는 경우

		ListNode target = tail.getLink();
		do {
			System.out.print(target.getName() + ", ");
			target = target.getLink();
		} while (target != tail.getLink());
		System.out.println();
	}
}
