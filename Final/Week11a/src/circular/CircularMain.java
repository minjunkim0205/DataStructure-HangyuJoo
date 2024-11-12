package circular;

public class CircularMain {

	public static void main(String[] args) {
		CircularList cl = new CircularList();
		cl.addFirst("3");
		cl.addFirst("2");
		cl.addFirst("1");
		cl.print();
		cl.delete(cl.listSearch("1"));
		cl.print();
	}

}
