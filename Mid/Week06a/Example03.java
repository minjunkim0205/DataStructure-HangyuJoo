public class Example03 {
    public static final int MAX_N = 10;

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2); 
    }

    public static long fibIter(int n) {
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

    public static void main(String[] args) {
        for (int i = 0; i <= MAX_N; i++) {
            System.out.println(fib(i));    
        }
        System.out.println("---------------------------------");
        for (int i = 0; i <= MAX_N; i++) {
            System.out.println(fibIter(i));    
        }
    }
}
