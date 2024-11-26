public class GenList {
	/* Field */
	private ListNode head; // 리스트의 첫번째 ListNode에 대한 참조를 저장

	/* Construct */
	GenList() {
		head = null;
	}

	/* Method */
	public GenList copy() {
		GenList gn = new GenList();
		gn.head = theCopy(head);
		return gn;
	}

	public boolean equal(GenList T) {
		return theEqual(this.head, T.head);
	}

	public int depth() {
		return theDepth(head);
	}

	void printGL() {
		System.out.print("(");
		ListNode p = head;
		while (p != null) {
			if (p.data instanceof GenList) {
				((GenList) p.data).printGL(); // 재귀 호출
			} else {
				System.out.print(p.data);
			}
			if ((p = p.link) != null) {
				System.out.print(", ");
			}
		}
		System.out.print(")");
	}

	// 구현
	private ListNode theCopy(ListNode h) {
		if (h == null)
			return null;
		ListNode newNode = new ListNode(h.data);
		newNode.link = theCopy(h.link);
		return newNode;
	}

	private boolean theEqual(ListNode s, ListNode t) {
		if (s == null && t == null)
			return true;
		if (s == null || t == null)
			return false;

		if (s.data instanceof GenList && t.data instanceof GenList) {
			return ((GenList) s.data).equal((GenList) t.data) && theEqual(s.link, t.link);
		} else if (s.data != null && t.data != null && s.data.equals(t.data)) {
			return theEqual(s.link, t.link);
		}
		return false;
	}

	private int theDepth(ListNode h) {
		if (h == null)
			return 0;

		int depth = 0;

		if (h.data instanceof GenList) {
			depth = 1 + ((GenList) h.data).depth();
		} else {
			depth = 1;
		}
		return Math.max(depth, theDepth(h.link));
	}

	void insertData(Object x) {
		ListNode newNode = new ListNode(x);
		newNode.link = head;
		head = newNode;
	}
}