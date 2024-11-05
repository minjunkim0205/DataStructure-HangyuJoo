package list;

public class LinkedList {
    private ListNode first;

    public LinkedList() {
        this.first = null;
    }

    public void addFirst(String name) {
        ListNode new_node = new ListNode(name);
        new_node.setLink(this.first);
        this.first = new_node;
    }

    public void insert(String name, ListNode target) {
        if (this.first == null) {
            this.first = new ListNode(name);
            return;
        }

        ListNode cur_node = this.first;
        while (cur_node != null) {
            if (cur_node.getName().equals(target.getName())) {
                ListNode new_node = new ListNode(name);
                new_node.setLink(cur_node.getLink());
                cur_node.setLink(new_node);
                return;
            }
            cur_node = cur_node.getLink();
        }
    }

    public ListNode searchNode(String name) {
        ListNode cur_node = this.first;
        while (cur_node != null) {
            if (cur_node.getName().equals(name)) {
                return cur_node;
            }
            cur_node = cur_node.getLink();
        }
        return null;
    }

    public void delete(ListNode p) {
        // 전달받은 노드 p 뒤의 노드를 삭제
        if (p != null && p.getLink() != null) {
            p.setLink(p.getLink().getLink());
        }
    }

    public void print() {
        ListNode cur_node = this.first;
        while (cur_node != null) {
            System.out.print(cur_node.getName() + "\n");
            cur_node = cur_node.getLink();
        }
    }
}
