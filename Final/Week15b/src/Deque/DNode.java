package Deque;

class DNode {
    /* Field */
    public Object data;
    public DNode llink;
    public DNode rlink;

    /* Construct */
    DNode() {
        this.data = null;
        this.llink = null;
        this.rlink = null;
    }

    DNode(Object d) {
        this.data = d;
        this.llink = null;
        this.rlink = null;
    }

    DNode(Object d, DNode l, DNode r) {
        this.data = d;
        this.llink = l;
        this.rlink = r;
    }
}