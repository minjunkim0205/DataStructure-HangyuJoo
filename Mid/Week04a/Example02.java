public class Example02 {
    public static void main(String[] args) {
        Example02Complex c1 = new Example02Complex(3.0, 2.0);
        Example02Complex c2 = new Example02Complex(1.0, -7.0);
        Example02Complex r1 = c1.add(c2);
        Example02Complex r2 = c1.multiply(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
    }
}