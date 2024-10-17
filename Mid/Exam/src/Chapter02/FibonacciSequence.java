package Chapter02;

public class FibonacciSequence {
    /*Function */
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }

    public static long fibonacciIter(int n) {
        if (n <= 1) {
            return n;
        }
        
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    /*Main */
    public static void main(String[] args) {
        System.out.print(fibonacci(10)+"\n");
        System.out.print(fibonacciIter(10)+"\n");
    }
}
