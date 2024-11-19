package poly3;

public class PolyNode {
	/* Field */
	public int coef;
	public int exp;
	public PolyNode link;

	/* Construct */
	PolyNode(int coef, int exp) {
		this.coef = coef;
		this.exp = exp;
	}
}
