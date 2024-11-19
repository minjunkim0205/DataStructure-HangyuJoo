package doublelist;

public class DList {
    /* Field */
    DNode first;

    /* Construct */
    DList() {
        this.first = null;
    }

    /* Method */
    public void addFirst(String name) {
        DNode new_node = new DNode(name);
        if (this.first == null) { // 빈 상태의 list 일때
            this.first = new_node;
        } else {
            new_node.setRightLink(this.first);
            this.first.setLeftLink(new_node);
            this.first = new_node;
        }
    }

    public void insert(DNode target, String name) {
        if (target == null) {
            return;
        }
    
        DNode new_node = new DNode(name);
        new_node.setLeftLink(target);
        new_node.setRightLink(target.getRightLink());
    
        if (target.getRightLink() != null) {
            target.getRightLink().setLeftLink(new_node);
        }
        target.setRightLink(new_node);
    }
    

    public DNode search(String name) {
        // 이중 연결리스트에서 name을 가진 Node 리턴
        DNode current_node = this.first;
        while(current_node != null) { // Move left to right (->)
            if(current_node.getName().equals(name)){ // 해당 name 의 Node를 찾았을때
                return current_node;
            }
            current_node = current_node.getRightLink();
        }
        // 해당 name 의 Node를 찾을수 없음
        return null;
    }

    public void delete(DNode target) {
        if (target.getLeftLink() == null && target.getRightLink() == null) {
            first = null;
        } else if (target.getLeftLink() == null) {
            target.getRightLink().setLeftLink(target.getLeftLink());
            first = target.getRightLink();
        } else if (target.getRightLink() == null) {
            target.getLeftLink().setRightLink(target.getRightLink());
        } else {
            target.getRightLink().setLeftLink(target.getLeftLink());
            target.getLeftLink().setRightLink(target.getRightLink());
        }
    }

    public void print() {
        DNode target = first;
        while (target != null) {
            if (target.getRightLink() == null) {
                System.out.println(target.getName());
                break;
            }
            System.out.print(target.getName() + ", ");
            target = target.getRightLink();
        }
    }
}
