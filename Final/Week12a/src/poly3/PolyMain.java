package poly3;

public class PolyMain {

	public static void main(String[] args) {
		Polynomial poly1 = new Polynomial();
		poly1.addTerm(5, 0);
		poly1.addTerm(2, 1);
		poly1.addTerm(3, 2);
		poly1.addTerm(7, 3);
		poly1.addTerm(4, 4);
		poly1.addTerm(9, 5);

		System.out.print("Poly 1 : ");
		poly1.print();

		poly1.delTerm(2);
		System.out.print("Poly 1 : ");
		poly1.print();

		poly1.delTerm(0);
		System.out.print("Poly 1 : ");
		poly1.print();

		System.out.print("Poly1 * 2x^1 = ");
		poly1.sMult(2, 1).print();

		System.out.print("Poly1 * 3x^4 = ");
		poly1.sMult(3, 4).print();
		System.out.print("\n\n");

		// Assin
		Polynomial poly2 = new Polynomial();
		poly2.addTerm(-1, 0);
		poly2.addTerm(2, 1);
		poly2.addTerm(-3, 2);
		System.out.print("Poly 2 : ");
		poly2.print();

		System.out.print("Poly1 * Poly2 = ");
		poly1.polyMult(poly2).print();

		System.out.print("Poly1 + Poly2 = ");
		poly1.polyAdd(poly2).print();
	}
}
